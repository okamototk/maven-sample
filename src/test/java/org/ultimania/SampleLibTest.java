package org.ultimania;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple SampleLibTest.
 */
public class SampleLibTest {
	/**
	 * Create the test case
	 * 
	 * @param testName
	 *            name of the test case
	 */
	public SampleLibTest(String testName) {
	}

	/**
	 * Rigourous Test :-)
	 */
        @Test
	public void testDetectLangType() {
		System.out.println(
				"==========\n"
				+ java.util.ResourceBundle.getBundle("msg").getString("message")
				+"\n==========\n");
		SampleLib lib = new SampleLib();
		assertEquals(lib.detectLangType("ruby"), SampleLib.RUBY);
		assertEquals(lib.detectLangType("pyton"), SampleLib.PYTHON);
		assertEquals(lib.detectLangType("perl"), SampleLib.PERL);
	}
}
