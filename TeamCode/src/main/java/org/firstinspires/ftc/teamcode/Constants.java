package org.firstinspires.ftc.teamcode;


import com.acmerobotics.dashboard.config.Config;

@Config
public final class Constants {
    public static final int slideGroundLevelTicks = 0;
    public static final int lowSlideTicks = 1500;
    public static final int highSlideTicks = 2500;
    public static final int highJunctionSlideTicks = 1200;
    public static final int coneBaseHeightTicks = 42;


    public static final double PI         = Math.PI;
    public static final double TAU        = 2 * PI;
    public static final double twoPI        = 2 * PI;
    public static final double PI_OVER_2  = PI / 2;
    public static final double PI_OVER_4  = PI / 4;

    public static final double SIN_60 = Math.sqrt(3) / 2;
    public static final double COS_30 = Math.sqrt(3) / 2;
    public static final double SIN_45 = Math.sqrt(2) / 2;
    public static final double COS_45 = Math.sqrt(2) / 2;
    public static final double SIN_30 = 0.5;
    public static final double COS_60 = 0.5;

    public static final double E   = Math.E;
    public static final double E_1 = E;
    public static final double E_2 = E * E;
    public static final double E_3 = E * E * E;
    public static final double E_4 = E * E * E * E;
    public static final double E_5 = E * E * E * E * E;

    public static final double nanometerToMillimeter  = 10E-6;
    public static final double micrometerToMillimeter = 10E-3;
    public static final double millimeterToMillimeter = 10E00;
    public static final double centimeterToMillimeter = 10E01;
    public static final double decimeterToMillimeter  = 10E02;
    public static final double meterToMillimeter      = 10E03;
    public static final double dekameterToMillimeter  = 10E04;
    public static final double hectometerToMillimeter = 10E05;
    public static final double kilometerToMillimeter  = 10E06;

    public static final double inchToMillimeter = 25.4;
    public static final double footToMillimeter = 304.8;
    public static final double yardToMillimeter = 914.4;
    public static final double mileToMillimeter = 4828032;

    public static final double inchesToEncoderTicks = 0.0;

    public static String position = "Middle";

    //rgbs for red element
    public static int redSide_red_min = 45; // 60   45
    public static int redSide_red_max = 155; // 155   155
    public static int redSide_green_min = 0; // 0
    public static int redSide_green_max = 195; // 205   195
    public static int redSide_blue_min = 90; // 0
    public static int redSide_blue_max = 125; // 115   135

    public static int blueSide_red_min = 50; // 50 old
    public static int blueSide_red_max = 150; //150 old
    public static int blueSide_green_min = 0; // 0 old
    public static int blueSide_green_max = 100; //100 old
    public static int blueSide_blue_min = 0; // 0 old
    public static int blueSide_blue_max = 205; //160 old


    public static final double ARMSERVO_HOMEPOSITION = 0;

    public static final int CAMERA_WIDTH = 320;



}
