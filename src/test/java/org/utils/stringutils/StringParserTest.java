package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    // methodBeingTested_inputGiven_expectedOutcome
    // Input, one separator, two parts - Happy path (positive test case)
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        // Setup lalala
        String inputString = "Hello|world";
        StringParser sp = new StringParser();
        String separator = "\\|";
        ArrayList<String> stringParts = sp.splitString(inputString, separator);

        // Comparing actual and expected output
        assertEquals(2, stringParts.size());
    }

    // Failure (negative) test case
    // null input, expect exception
    @Test
    void splitString_nullInput_expectException() {
        // Setup
        String inputString = null;
        StringParser sp = new StringParser();
        String separator = "\\|";
        // ArrayList<String> stringParts = sp.splitString(inputString, separator);

        // Comparing actual and expected output
        assertThrows(InvalidStringInputException.class,
                ()-> sp.splitString(inputString, separator));
        // assertEquals(0, stringParts.size());
    }
}