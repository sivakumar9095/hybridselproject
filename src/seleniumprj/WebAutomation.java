package seleniumprj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ramku\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/newtours/";
	    driver.get(baseUrl);
	    driver.close();
}
}
