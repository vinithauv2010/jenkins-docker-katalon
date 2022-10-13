import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Prabhakar\\Downloads\\Aulas.apk', true)
Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - UPDATE NOW (2)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - RESTART AULAS (3)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (42)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText - Mobile Number (8)'), '9399613815')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - CONTINUE (8)'), 0)

Mobile.hideKeyboard()
Mobile.hideKeyboard()
Mobile.sendKeys(findTestObject('Object Repository/testcase/android.widget.EditText (11)'), '592726')
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - VERIFY (12)'), 0)
Mobile.hideKeyboard()

Mobile.scrollToText('Production testing.')

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Production testing (5)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Next (9)'), 0)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - Schedule (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (58)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (59)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - (60)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (40)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Class (3)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (41)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.EditText - Select Teacher (3)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (42)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (43)'), 0)

//Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (44)'), 0)

//Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (45)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (7)'), 0)

Mobile.scrollToText('Last Date')

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (46)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.RadialTimePickerViewRadialPickerTouchHelper (5)'), 
    0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (8)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.view.ViewGroup (47)'), 0)

//Mobile.tap(findTestObject(''), 0)

//Mobile.tap(findTestObject(''), 0)
Mobile.tap(findTestObject('Object Repository/testcase/android.widget.Button - OK (8)'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - T'), 0)

Mobile.tap(findTestObject('Object Repository/testcase/android.widget.TextView - SAVE (2)'), 0)

Mobile.closeApplication()

