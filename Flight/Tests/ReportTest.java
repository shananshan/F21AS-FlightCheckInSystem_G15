public class ReportTest {
@Test
	public void testReport() {
        
        Report report = new Report();

        String filePath = "path/to/test_report.txt";

       
        report.generateReport(filePath);

    }
}
