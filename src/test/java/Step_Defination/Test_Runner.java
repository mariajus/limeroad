package Step_Defination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\balra\\eclipse-workspace\\LIME_ROAD1\\src\\test\\resources\\feature\\Lime_Road.feature", glue = {
		"Step_Defination" }, plugin = { "pretty", "junit:target/JunitReports/report.xml",
				"json:target/JSONRports/report.json", "html:target/HtmlReports" })

public class Test_Runner {

}
