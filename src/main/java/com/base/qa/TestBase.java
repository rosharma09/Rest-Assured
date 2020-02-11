package com.base.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestBase {

	public static Properties propObj;
	public static RequestSpecification httpRequestObj;
	public static Response responseObj;

	// Base class constructor
	public TestBase() {
		try {
			propObj = new Properties();
			FileInputStream fileInputObj = new FileInputStream(
					"C:\\Users\\rosharma\\eclipse-workspace\\RestAssuredMavenProject\\src\\main\\java\\com\\base\\qa\\EmployeeAPI.properties");
			propObj.load(fileInputObj);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void intialization() {
		
	}

}
