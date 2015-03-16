package iOs_Appium_Config;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class TestAppiumNew {
	//testing added
	//WebDriver driver;
	AppiumDriver driver;
	@Test(enabled=true)
	public void testTest(){
		System.out.println("I'm here");
		System.out.println("now there");
		System.out.println("added from sublime");
	}
	@Test (enabled=false)
	public void appTest() throws MalformedURLException{
		/*
		driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		*/
		/*
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformVersion", "8.1"); //simu
		capabilities.setCapability("deviceName", "iPhone 6"); //simu
		File app = new File("/Users/shahi/Desktop/temp/UICatalog.app"); //simu
		capabilities.setCapability("app",app.getAbsolutePath()); //simu
		driver = new IOSDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Testing Here");
		*/
	}
	@Test(enabled=false)
	public void realDevice() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("device", "iPhone");
		capabilities.setCapability("deviceName", "sunesh shahi’s iPhone");
		//capabilities.setCapability("version", "8.1");
		//capabilities.setCapability("udid", "311a7791116373de886087b40071809af9655bba");
		//capabilities.setCapability("bundleID", "com.example.apple-samplecode.UICatalog");
		//File app = new File("/Users/shahi/Desktop/temp/UICatalog.app"); //simu
		//capabilities.setCapability("app",app.getAbsolutePath()); //simu
		driver = new IOSDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
	}
	@Test(enabled=false)
	public void clickLink(){
		System.out.println(driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAImage[1]")).isDisplayed());
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("tapCount", 1);
		hm.put("touchCount", 1);
		hm.put("duration", 1);
		hm.put("x", 71);
		hm.put("y", 51);
		((JavascriptExecutor)driver).executeScript("mobile: tap",  hm);
		
		//(JavascriptExecutor)driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", 1); put("touchCount", 1); put("duration", 0.5); put("x", 71); put("y", 51); }});

		/*
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAImage[1]")).click();
		driver.findElement(By.id("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAImage[1]")).click();
		System.out.println(driver.findElement(By.name("GRAY")).getText());
		*/
		
	}
	@AfterTest (enabled=false)
	public void closeSession(){
		if(driver != null){
			driver.quit();
		}
	}

}
