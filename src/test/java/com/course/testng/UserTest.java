package com.course.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest {


    @Test
    public void shouldBeEqualUsers() {
        //given
        User piotr = new User();
        piotr.setAge(19l);
        piotr.setName("Piotr");


        User piotr2 = new User();
        piotr2.setName("Piotr");
        piotr2.setAge(19l);

        //when
        boolean result = piotr.equals(piotr2);
        boolean result2 = piotr2.equals(piotr);

        //then
        Assert.assertTrue(result);
        Assert.assertTrue(result2);
    }

}
