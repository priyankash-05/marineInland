package com.mineinland.testcases.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\webDriverBinaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedtitle="Facebook-log in or sign up";
		String actualTitle = driver.getTitle();
		if(expectedtitle.equals(actualTitle)) {
		System.out.println("title is an expected");
		}else {
			System.out.println(String.format("this is not matching..actualTitle.expected is:%s but actual is:%s",expectedtitle,actualTitle));
		}
		//driver.quit();
		

	}
		

}
