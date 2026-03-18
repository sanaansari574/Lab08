package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        //This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.deleteCity(city);

        //this will fail initially because deleteCity doesn't exist -> city still in list
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testCountCities(){
        CustomList list = new CustomList();
        //fail initially
        assertEquals(0, list.countCities());

        City city = new City("Toronto", "AB");
        list.addCity(city);
        assertEquals(1, list.countCities());

        list.deleteCity(city);
        assertEquals(0, list.countCities());
    }
}
