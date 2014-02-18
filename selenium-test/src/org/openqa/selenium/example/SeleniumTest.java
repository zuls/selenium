package org.openqa.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		String baseurl = "http://jsbin.com/usidix/1";
		//String expectedTitle = "Welcome: Mercury Tours";
		//String tagName = ""; 
		//String actualTitle ="";
		
		driver.get(baseurl);
		
		//actualTitle = driver.getTitle();
		
		//tagName = driver.findElement(By.id("email")).getTagName();
		
		//driver.findElement(By.id("email")).sendKeys("ratan512@aol.com");
		//driver.findElement(By.id("pass")).sendKeys("gjmptw");
		//driver.findElement(By.id("loginbutton")).click();
		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("Tree")).click();
		//driver.findElement(By.linkText("Deprecated")).click();
		//System.out.print(tagName);
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		driver.switchTo().alert().accept();
		
		//driver.navigate().to("www.google.com");
		//driver.navigate().back();
		
		//driver.close();
		System.exit(0);
		
	}

}
