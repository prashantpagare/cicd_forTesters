package com.CICDTester.CICD_For_Tester;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {

	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test1 title is" + driver.getTitle());
	}

	@Test
	public void test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test2 title is" + driver.getTitle());
	}

	@Test
	public void test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test3 title is" + driver.getTitle());
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
