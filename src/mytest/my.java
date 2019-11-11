package mytest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class my {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users/mssil/OneDrive/Documents/silpa/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qatechhub.com");
		System.out.println("Hi");
		System.out.println("Hello text");
		driver.close();
	}

}



