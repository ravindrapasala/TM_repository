package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class HRM_Login {
    
	static WebDriver driver;
	@BeforeSuite
	
	public void loginhrm()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veerendra\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		String actTitle = driver.getTitle();
		
		if(actTitle.equals("Google"))
			System.out.println("Google page displayed, passed");
		else
			System.out.println("Google page not displayed, failed");
	
	}
	
	@AfterSuite
	public void close()
	{
		driver.close();
	}
}
