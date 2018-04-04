package com.example.steven.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ricky on 3/11/2018.
 */

public class DatabaseHelperClass extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Plant_List.db";
    public static final String TABLE_NAME = "PlantTable.db";
    public static final String PLANT_ID = "PLANT_ID";
    public static final String COMMON_NAME = "COMMON_NAME";
    public static final String SPECIES_NAME = "SPECIES_NAME";
    public static final String ORIGIN = "ORIGIN";
    public static final String FLOWER_COLOR = "FLOWER_COLOR";
    public static final String BLOOM_SEASONS = "BLOOM_SEASONS";
    public static final String HEIGHT = "HEIGHT";
    public static final String WIDTH = "WIDTH";
    public static final String DROUGHT_TOLERANCE = "DROUGHT_TOLERANCE";
    public static final String LOCATIONS = "LOCATIONS";
    public static final String GPS_COORDINATES = "GPS_COORDINATES";
    public static final String PICTURE_ID = "PICTURE_ID";

    public DatabaseHelperClass(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, PLANTNAME TEXT, SPECIESNAME TEXT, FLOWERCOLOR TEXT, SIZE TEXT, NAVITITY TEXT, DROUGHT TEXT, LOCATION TEXT, GPS TEXT ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
