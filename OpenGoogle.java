package seleniumSamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/thirumalaivasanperumal/Downloads/chromedriver_mac64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guvi.in/code-kata/");
	}

}
