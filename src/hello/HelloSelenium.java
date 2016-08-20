package hello;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HelloSelenium {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","F:\\SeleniumDrivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","F:\\SeleniumDrivers\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver","F:\\SeleniumDrivers\\IEDriverServer.exe");
		System.setProperty("webdriver.opera.driver","F:\\SeleniumDrivers\\operadriver.exe");
		System.out.println("Hello Selenium");
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new InternetExplorerDriver();
		WebDriver driver=new OperaDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MICROSECONDS);
		driver.navigate().to("http://amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Laptop", Keys.ENTER);
		
	}
}
