import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {
    public static void main(String[] args) {
        try(Playwright playwright = Playwright.create()){
//            Browser browser = playwright.chromium().launch();
//            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            BrowserType.LaunchOptions lp = new BrowserType.LaunchOptions();
            lp.setChannel("chrome");
            lp.setHeadless(false);

            Browser browser = playwright.chromium().launch(lp);

            Page page = browser.newPage();

            page.navigate("https://www.google.co.in");

            System.out.println(page.title());
        }
    }
}
