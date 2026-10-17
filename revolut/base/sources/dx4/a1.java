package dx4;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a1 implements c1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 ALL_TIME;
    public static final a1 ARROW_DOWNGRADE;
    public static final a1 ARROW_EXCHANGE;
    public static final a1 ARROW_NAVIGATION;
    public static final a1 ARROW_RATES;
    public static final a1 ARROW_RIGHT_LEFT;
    public static final a1 BAG;
    public static final a1 BALANCE_SHEET;
    public static final a1 BANK;
    public static final a1 BAR_CHART;
    public static final a1 BELL;
    public static final a1 BNPL;
    public static final a1 BROKEN_HEART;
    public static final a1 BULB;
    public static final a1 BULLET_1;
    public static final a1 BULLET_10;
    public static final a1 BULLET_2;
    public static final a1 BULLET_3;
    public static final a1 BULLET_4;
    public static final a1 BULLET_5;
    public static final a1 BULLET_6;
    public static final a1 BULLET_7;
    public static final a1 BULLET_8;
    public static final a1 BULLET_9;
    public static final a1 BULLET_A;
    public static final a1 BULLET_B;
    public static final a1 BULLET_C;
    public static final a1 BULLET_D;
    public static final a1 CALENDAR;
    public static final a1 CALENDARQUARTER;
    public static final a1 CALENDAR_COINS;
    public static final a1 CALENDAR_DATE;
    public static final a1 CALENDAR_RECURRING;
    public static final a1 CALL;
    public static final a1 CAMERA;
    public static final a1 CAR;
    public static final a1 CARD;
    public static final a1 CARD_EXPIRED;
    public static final a1 CARD_SHIELD;
    public static final a1 CASH;
    public static final a1 CASHBACK;
    public static final a1 CASH_INCOME;
    public static final a1 CHECK;
    public static final a1 CHECK_SUCCESS;
    public static final a1 CHECK_VERIFICATION;
    public static final a1 CHEQUE;
    public static final a1 CHEVRON_RIGHT;
    public static final a1 CLAIM;
    public static final a1 CLEANING;
    public static final a1 CLIP;
    public static final a1 COINS;
    public static final a1 COINS_EARNING;
    public static final a1 COINS_SEARCH;
    public static final a1 COMPANY_FILLED;
    public static final a1 CREDIT;
    public static final a1 CREDIT_CARD;
    public static final a1 CREDIT_PART;
    public static final a1 CROSS;
    public static final a1 CROSS_CIRCLE;
    public static final a1 CRUTCH;

    @NotNull
    public static final y0 Companion;
    public static final a1 DATA_LIMIT;
    public static final a1 DATA_LIMIT_HALF;
    public static final a1 DATA_LIMIT_LOW;
    public static final a1 DECREASING;
    public static final a1 DELIVERY_CAR;
    public static final a1 DEPOSIT_PROTECTION;
    public static final a1 DESKTOP_SHOP;
    public static final a1 DOCUMENT;
    public static final a1 DOCUMENTS_PAIR;
    public static final a1 DOCUMENT_SEARCH;
    public static final a1 DOWNLOAD;
    public static final a1 DOXGETY;
    public static final a1 DRAW_PARALLEL_CHANNEL;
    public static final a1 ENVELOPE;
    public static final a1 EQUAL;
    public static final a1 EXCLAMATION_MARK;
    public static final a1 EXCLAMATION_TRIANGLE;
    public static final a1 EYE_SHOW;
    public static final a1 FEES;
    public static final a1 FORM;
    public static final a1 GIFT;
    public static final a1 GLOBE;
    public static final a1 HAMMER;
    public static final a1 HANDLE;
    public static final a1 HELP_CHAT;
    public static final a1 HOME;
    public static final a1 HOTEL;
    public static final a1 IMAGE;
    public static final a1 INFO;
    public static final a1 INFO_OUTLINE;
    public static final a1 INSURANCE;
    public static final a1 INVEST;
    public static final a1 ISSUE;
    public static final a1 KEY;
    public static final a1 LIGHTNING;
    public static final a1 LIMIT;
    public static final a1 LINK;
    public static final a1 LINK_EXTERNAL;
    public static final a1 LOCATION_PIN;
    public static final a1 LOCK;
    public static final a1 LOGO_ANDROID;
    public static final a1 LOGO_MC;
    public static final a1 LOGO_REVOLUT;
    public static final a1 LOGO_VISA;
    public static final a1 LOUNGES;
    public static final a1 MARKET_ORDER;
    public static final a1 MEDICAL_BED;
    public static final a1 MEDICAL_CROSS;
    public static final a1 MEDKIT;
    public static final a1 MORTGAGE;
    public static final a1 NATIONAL_ID;
    public static final a1 OVERDRAFT;
    public static final a1 PARKING;
    public static final a1 PAY_LATER;
    public static final a1 PENCIL;
    public static final a1 PEOPLE;
    public static final a1 PERCENT;
    public static final a1 PLUS;
    public static final a1 PREMIUM;
    public static final a1 PRESENT;
    public static final a1 PRICE_TAG;
    public static final a1 PROFILE;
    public static final a1 QUESTION;
    public static final a1 QUESTION_SIGN;
    public static final a1 REFINANCING_HOME;
    public static final a1 REPAIR_TOOL;
    public static final a1 REPAYMENT;
    public static final a1 RESTAURANTS;
    public static final a1 REVERTED;
    public static final a1 REVPOINTS;
    public static final a1 SALARY;
    public static final a1 SERVICES;
    public static final a1 SHIELD;
    public static final a1 SHOPPING;
    public static final a1 SHOWER;
    public static final a1 SMARTPHONE;
    public static final a1 SNOWFLAKE;
    public static final a1 STATEMENT;
    public static final a1 SUN;
    public static final a1 TECH;
    public static final a1 TICK;
    public static final a1 TIME;
    public static final a1 TRASH;
    public static final a1 TRAVEL;
    public static final a1 TURBO_TRANSFER;
    public static final a1 UPLOAD;
    public static final a1 USERS_SEARCH;
    public static final a1 UTILITIES;
    public static final a1 VAULT;
    public static final a1 VEGAN;

    static {
        a1 a1Var = new a1("ALL_TIME", 0);
        ALL_TIME = a1Var;
        a1 a1Var2 = new a1("ARROW_DOWNGRADE", 1);
        ARROW_DOWNGRADE = a1Var2;
        a1 a1Var3 = new a1("ARROW_EXCHANGE", 2);
        ARROW_EXCHANGE = a1Var3;
        a1 a1Var4 = new a1("ARROW_NAVIGATION", 3);
        ARROW_NAVIGATION = a1Var4;
        a1 a1Var5 = new a1("ARROW_RATES", 4);
        ARROW_RATES = a1Var5;
        a1 a1Var6 = new a1("ARROW_RIGHT_LEFT", 5);
        ARROW_RIGHT_LEFT = a1Var6;
        a1 a1Var7 = new a1("BAG", 6);
        BAG = a1Var7;
        a1 a1Var8 = new a1("BALANCE_SHEET", 7);
        BALANCE_SHEET = a1Var8;
        a1 a1Var9 = new a1("BANK", 8);
        BANK = a1Var9;
        a1 a1Var10 = new a1("BAR_CHART", 9);
        BAR_CHART = a1Var10;
        a1 a1Var11 = new a1("BELL", 10);
        BELL = a1Var11;
        a1 a1Var12 = new a1("BNPL", 11);
        BNPL = a1Var12;
        a1 a1Var13 = new a1("BROKEN_HEART", 12);
        BROKEN_HEART = a1Var13;
        a1 a1Var14 = new a1("BULB", 13);
        BULB = a1Var14;
        a1 a1Var15 = new a1("BULLET_1", 14);
        BULLET_1 = a1Var15;
        a1 a1Var16 = new a1("BULLET_10", 15);
        BULLET_10 = a1Var16;
        a1 a1Var17 = new a1("BULLET_2", 16);
        BULLET_2 = a1Var17;
        a1 a1Var18 = new a1("BULLET_3", 17);
        BULLET_3 = a1Var18;
        a1 a1Var19 = new a1("BULLET_4", 18);
        BULLET_4 = a1Var19;
        a1 a1Var20 = new a1("BULLET_5", 19);
        BULLET_5 = a1Var20;
        a1 a1Var21 = new a1("BULLET_6", 20);
        BULLET_6 = a1Var21;
        a1 a1Var22 = new a1("BULLET_7", 21);
        BULLET_7 = a1Var22;
        a1 a1Var23 = new a1("BULLET_8", 22);
        BULLET_8 = a1Var23;
        a1 a1Var24 = new a1("BULLET_9", 23);
        BULLET_9 = a1Var24;
        a1 a1Var25 = new a1("BULLET_A", 24);
        BULLET_A = a1Var25;
        a1 a1Var26 = new a1("BULLET_B", 25);
        BULLET_B = a1Var26;
        a1 a1Var27 = new a1("BULLET_C", 26);
        BULLET_C = a1Var27;
        a1 a1Var28 = new a1("BULLET_D", 27);
        BULLET_D = a1Var28;
        a1 a1Var29 = new a1("CALENDAR", 28);
        CALENDAR = a1Var29;
        a1 a1Var30 = new a1("CALENDARQUARTER", 29);
        CALENDARQUARTER = a1Var30;
        a1 a1Var31 = new a1("CALENDAR_COINS", 30);
        CALENDAR_COINS = a1Var31;
        a1 a1Var32 = new a1("CALENDAR_DATE", 31);
        CALENDAR_DATE = a1Var32;
        a1 a1Var33 = new a1("CALENDAR_RECURRING", 32);
        CALENDAR_RECURRING = a1Var33;
        a1 a1Var34 = new a1("CALL", 33);
        CALL = a1Var34;
        a1 a1Var35 = new a1("CAMERA", 34);
        CAMERA = a1Var35;
        a1 a1Var36 = new a1("CAR", 35);
        CAR = a1Var36;
        a1 a1Var37 = new a1("CARD", 36);
        CARD = a1Var37;
        a1 a1Var38 = new a1("CARD_EXPIRED", 37);
        CARD_EXPIRED = a1Var38;
        a1 a1Var39 = new a1("CARD_SHIELD", 38);
        CARD_SHIELD = a1Var39;
        a1 a1Var40 = new a1("CASH", 39);
        CASH = a1Var40;
        a1 a1Var41 = new a1("CASHBACK", 40);
        CASHBACK = a1Var41;
        a1 a1Var42 = new a1("CASH_INCOME", 41);
        CASH_INCOME = a1Var42;
        a1 a1Var43 = new a1("CHECK", 42);
        CHECK = a1Var43;
        a1 a1Var44 = new a1("CHECK_SUCCESS", 43);
        CHECK_SUCCESS = a1Var44;
        a1 a1Var45 = new a1("CHECK_VERIFICATION", 44);
        CHECK_VERIFICATION = a1Var45;
        a1 a1Var46 = new a1("CHEQUE", 45);
        CHEQUE = a1Var46;
        a1 a1Var47 = new a1("CHEVRON_RIGHT", 46);
        CHEVRON_RIGHT = a1Var47;
        a1 a1Var48 = new a1("CLAIM", 47);
        CLAIM = a1Var48;
        a1 a1Var49 = new a1("CLEANING", 48);
        CLEANING = a1Var49;
        a1 a1Var50 = new a1("CLIP", 49);
        CLIP = a1Var50;
        a1 a1Var51 = new a1("COINS", 50);
        COINS = a1Var51;
        a1 a1Var52 = new a1("COINS_EARNING", 51);
        COINS_EARNING = a1Var52;
        a1 a1Var53 = new a1("COINS_SEARCH", 52);
        COINS_SEARCH = a1Var53;
        a1 a1Var54 = new a1("COMPANY_FILLED", 53);
        COMPANY_FILLED = a1Var54;
        a1 a1Var55 = new a1("CREDIT", 54);
        CREDIT = a1Var55;
        a1 a1Var56 = new a1("CREDIT_CARD", 55);
        CREDIT_CARD = a1Var56;
        a1 a1Var57 = new a1("CREDIT_PART", 56);
        CREDIT_PART = a1Var57;
        a1 a1Var58 = new a1("CROSS", 57);
        CROSS = a1Var58;
        a1 a1Var59 = new a1("CROSS_CIRCLE", 58);
        CROSS_CIRCLE = a1Var59;
        a1 a1Var60 = new a1("CRUTCH", 59);
        CRUTCH = a1Var60;
        a1 a1Var61 = new a1("DATA_LIMIT", 60);
        DATA_LIMIT = a1Var61;
        a1 a1Var62 = new a1("DATA_LIMIT_HALF", 61);
        DATA_LIMIT_HALF = a1Var62;
        a1 a1Var63 = new a1("DATA_LIMIT_LOW", 62);
        DATA_LIMIT_LOW = a1Var63;
        a1 a1Var64 = new a1("DECREASING", 63);
        DECREASING = a1Var64;
        a1 a1Var65 = new a1("DELIVERY_CAR", 64);
        DELIVERY_CAR = a1Var65;
        a1 a1Var66 = new a1("DEPOSIT_PROTECTION", 65);
        DEPOSIT_PROTECTION = a1Var66;
        a1 a1Var67 = new a1("DESKTOP_SHOP", 66);
        DESKTOP_SHOP = a1Var67;
        a1 a1Var68 = new a1("DOCUMENT", 67);
        DOCUMENT = a1Var68;
        a1 a1Var69 = new a1("DOCUMENTS_PAIR", 68);
        DOCUMENTS_PAIR = a1Var69;
        a1 a1Var70 = new a1("DOCUMENT_SEARCH", 69);
        DOCUMENT_SEARCH = a1Var70;
        a1 a1Var71 = new a1("DOWNLOAD", 70);
        DOWNLOAD = a1Var71;
        a1 a1Var72 = new a1("DOXGETY", 71);
        DOXGETY = a1Var72;
        a1 a1Var73 = new a1("DRAW_PARALLEL_CHANNEL", 72);
        DRAW_PARALLEL_CHANNEL = a1Var73;
        a1 a1Var74 = new a1("ENVELOPE", 73);
        ENVELOPE = a1Var74;
        a1 a1Var75 = new a1("EQUAL", 74);
        EQUAL = a1Var75;
        a1 a1Var76 = new a1("EXCLAMATION_MARK", 75);
        EXCLAMATION_MARK = a1Var76;
        a1 a1Var77 = new a1("EXCLAMATION_TRIANGLE", 76);
        EXCLAMATION_TRIANGLE = a1Var77;
        a1 a1Var78 = new a1("EYE_SHOW", 77);
        EYE_SHOW = a1Var78;
        a1 a1Var79 = new a1("FEES", 78);
        FEES = a1Var79;
        a1 a1Var80 = new a1("FORM", 79);
        FORM = a1Var80;
        a1 a1Var81 = new a1("GIFT", 80);
        GIFT = a1Var81;
        a1 a1Var82 = new a1("GLOBE", 81);
        GLOBE = a1Var82;
        a1 a1Var83 = new a1("HAMMER", 82);
        HAMMER = a1Var83;
        a1 a1Var84 = new a1("HANDLE", 83);
        HANDLE = a1Var84;
        a1 a1Var85 = new a1("HELP_CHAT", 84);
        HELP_CHAT = a1Var85;
        a1 a1Var86 = new a1("HOME", 85);
        HOME = a1Var86;
        a1 a1Var87 = new a1("HOTEL", 86);
        HOTEL = a1Var87;
        a1 a1Var88 = new a1("IMAGE", 87);
        IMAGE = a1Var88;
        a1 a1Var89 = new a1("INFO", 88);
        INFO = a1Var89;
        a1 a1Var90 = new a1("INFO_OUTLINE", 89);
        INFO_OUTLINE = a1Var90;
        a1 a1Var91 = new a1("INSURANCE", 90);
        INSURANCE = a1Var91;
        a1 a1Var92 = new a1("INVEST", 91);
        INVEST = a1Var92;
        a1 a1Var93 = new a1("ISSUE", 92);
        ISSUE = a1Var93;
        a1 a1Var94 = new a1("KEY", 93);
        KEY = a1Var94;
        a1 a1Var95 = new a1("LIGHTNING", 94);
        LIGHTNING = a1Var95;
        a1 a1Var96 = new a1("LIMIT", 95);
        LIMIT = a1Var96;
        a1 a1Var97 = new a1("LINK", 96);
        LINK = a1Var97;
        a1 a1Var98 = new a1("LINK_EXTERNAL", 97);
        LINK_EXTERNAL = a1Var98;
        a1 a1Var99 = new a1("LOCATION_PIN", 98);
        LOCATION_PIN = a1Var99;
        a1 a1Var100 = new a1("LOCK", 99);
        LOCK = a1Var100;
        a1 a1Var101 = new a1("LOGO_ANDROID", 100);
        LOGO_ANDROID = a1Var101;
        a1 a1Var102 = new a1("LOGO_MC", 101);
        LOGO_MC = a1Var102;
        a1 a1Var103 = new a1("LOGO_REVOLUT", 102);
        LOGO_REVOLUT = a1Var103;
        a1 a1Var104 = new a1("LOGO_VISA", 103);
        LOGO_VISA = a1Var104;
        a1 a1Var105 = new a1("LOUNGES", 104);
        LOUNGES = a1Var105;
        a1 a1Var106 = new a1("MARKET_ORDER", 105);
        MARKET_ORDER = a1Var106;
        a1 a1Var107 = new a1("MEDICAL_BED", 106);
        MEDICAL_BED = a1Var107;
        a1 a1Var108 = new a1("MEDICAL_CROSS", 107);
        MEDICAL_CROSS = a1Var108;
        a1 a1Var109 = new a1("MEDKIT", LDSFile.EF_DG12_TAG);
        MEDKIT = a1Var109;
        a1 a1Var110 = new a1("MORTGAGE", LDSFile.EF_DG13_TAG);
        MORTGAGE = a1Var110;
        a1 a1Var111 = new a1("NATIONAL_ID", LDSFile.EF_DG14_TAG);
        NATIONAL_ID = a1Var111;
        a1 a1Var112 = new a1("OVERDRAFT", LDSFile.EF_DG15_TAG);
        OVERDRAFT = a1Var112;
        a1 a1Var113 = new a1("PARKING", 112);
        PARKING = a1Var113;
        a1 a1Var114 = new a1("PAY_LATER", 113);
        PAY_LATER = a1Var114;
        a1 a1Var115 = new a1("PENCIL", 114);
        PENCIL = a1Var115;
        a1 a1Var116 = new a1("PEOPLE", ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
        PEOPLE = a1Var116;
        a1 a1Var117 = new a1("PERCENT", 116);
        PERCENT = a1Var117;
        a1 a1Var118 = new a1("PLUS", LDSFile.EF_DG2_TAG);
        PLUS = a1Var118;
        a1 a1Var119 = new a1("PREMIUM", LDSFile.EF_DG4_TAG);
        PREMIUM = a1Var119;
        a1 a1Var120 = new a1("PRESENT", LDSFile.EF_SOD_TAG);
        PRESENT = a1Var120;
        a1 a1Var121 = new a1("PRICE_TAG", SyslogConstants.LOG_CLOCK);
        PRICE_TAG = a1Var121;
        a1 a1Var122 = new a1("PROFILE", 121);
        PROFILE = a1Var122;
        a1 a1Var123 = new a1("QUESTION", 122);
        QUESTION = a1Var123;
        a1 a1Var124 = new a1("QUESTION_SIGN", 123);
        QUESTION_SIGN = a1Var124;
        a1 a1Var125 = new a1("REFINANCING_HOME", 124);
        REFINANCING_HOME = a1Var125;
        a1 a1Var126 = new a1("REPAIR_TOOL", ISO781611.SMT_TAG);
        REPAIR_TOOL = a1Var126;
        a1 a1Var127 = new a1("REPAYMENT", 126);
        REPAYMENT = a1Var127;
        a1 a1Var128 = new a1("RESTAURANTS", CertificateBody.profileType);
        RESTAURANTS = a1Var128;
        a1 a1Var129 = new a1("REVERTED", 128);
        REVERTED = a1Var129;
        a1 a1Var130 = new a1("REVPOINTS", 129);
        REVPOINTS = a1Var130;
        a1 a1Var131 = new a1("SALARY", 130);
        SALARY = a1Var131;
        a1 a1Var132 = new a1("SERVICES", ISO781611.CREATION_DATE_AND_TIME_TAG);
        SERVICES = a1Var132;
        a1 a1Var133 = new a1("SHIELD", 132);
        SHIELD = a1Var133;
        a1 a1Var134 = new a1("SHOPPING", 133);
        SHOPPING = a1Var134;
        a1 a1Var135 = new a1("SHOWER", ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
        SHOWER = a1Var135;
        a1 a1Var136 = new a1("SMARTPHONE", 135);
        SMARTPHONE = a1Var136;
        a1 a1Var137 = new a1("SNOWFLAKE", 136);
        SNOWFLAKE = a1Var137;
        a1 a1Var138 = new a1("STATEMENT", 137);
        STATEMENT = a1Var138;
        a1 a1Var139 = new a1("SUN", 138);
        SUN = a1Var139;
        a1 a1Var140 = new a1("TECH", 139);
        TECH = a1Var140;
        a1 a1Var141 = new a1("TICK", 140);
        TICK = a1Var141;
        a1 a1Var142 = new a1("TIME", ModuleDescriptor.MODULE_VERSION);
        TIME = a1Var142;
        a1 a1Var143 = new a1("TRASH", 142);
        TRASH = a1Var143;
        a1 a1Var144 = new a1("TRAVEL", 143);
        TRAVEL = a1Var144;
        a1 a1Var145 = new a1("TURBO_TRANSFER", SyslogConstants.LOG_LOCAL2);
        TURBO_TRANSFER = a1Var145;
        a1 a1Var146 = new a1("UPLOAD", 145);
        UPLOAD = a1Var146;
        a1 a1Var147 = new a1("USERS_SEARCH", 146);
        USERS_SEARCH = a1Var147;
        a1 a1Var148 = new a1("UTILITIES", 147);
        UTILITIES = a1Var148;
        a1 a1Var149 = new a1("VAULT", 148);
        VAULT = a1Var149;
        a1 a1Var150 = new a1("VEGAN", 149);
        VEGAN = a1Var150;
        a1[] a1VarArr = {a1Var, a1Var2, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8, a1Var9, a1Var10, a1Var11, a1Var12, a1Var13, a1Var14, a1Var15, a1Var16, a1Var17, a1Var18, a1Var19, a1Var20, a1Var21, a1Var22, a1Var23, a1Var24, a1Var25, a1Var26, a1Var27, a1Var28, a1Var29, a1Var30, a1Var31, a1Var32, a1Var33, a1Var34, a1Var35, a1Var36, a1Var37, a1Var38, a1Var39, a1Var40, a1Var41, a1Var42, a1Var43, a1Var44, a1Var45, a1Var46, a1Var47, a1Var48, a1Var49, a1Var50, a1Var51, a1Var52, a1Var53, a1Var54, a1Var55, a1Var56, a1Var57, a1Var58, a1Var59, a1Var60, a1Var61, a1Var62, a1Var63, a1Var64, a1Var65, a1Var66, a1Var67, a1Var68, a1Var69, a1Var70, a1Var71, a1Var72, a1Var73, a1Var74, a1Var75, a1Var76, a1Var77, a1Var78, a1Var79, a1Var80, a1Var81, a1Var82, a1Var83, a1Var84, a1Var85, a1Var86, a1Var87, a1Var88, a1Var89, a1Var90, a1Var91, a1Var92, a1Var93, a1Var94, a1Var95, a1Var96, a1Var97, a1Var98, a1Var99, a1Var100, a1Var101, a1Var102, a1Var103, a1Var104, a1Var105, a1Var106, a1Var107, a1Var108, a1Var109, a1Var110, a1Var111, a1Var112, a1Var113, a1Var114, a1Var115, a1Var116, a1Var117, a1Var118, a1Var119, a1Var120, a1Var121, a1Var122, a1Var123, a1Var124, a1Var125, a1Var126, a1Var127, a1Var128, a1Var129, a1Var130, a1Var131, a1Var132, a1Var133, a1Var134, a1Var135, a1Var136, a1Var137, a1Var138, a1Var139, a1Var140, a1Var141, a1Var142, a1Var143, a1Var144, a1Var145, a1Var146, a1Var147, a1Var148, a1Var149, a1Var150};
        $VALUES = a1VarArr;
        $ENTRIES = vc.s.n(a1VarArr);
        Companion = new y0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }

    @Override // dx4.c1
    public final Image T1() {
        return new ResourceImage(c(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
    }

    public final String b() {
        return this + "_24";
    }

    public final int c() {
        switch (z0.f120859c[ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_all_time;
            case 2:
                return R$drawable.uikit_icn_24_arrow_downgrade;
            case 3:
                return R$drawable.uikit_icn_24_arrow_exchange;
            case 4:
                return R$drawable.uikit_icn_24_arrow_navigation;
            case 5:
                return R$drawable.uikit_icn_24_arrow_rates;
            case 6:
                return R$drawable.uikit_icn_24_arrow_right_left;
            case 7:
                return R$drawable.uikit_icn_24_credit_bag;
            case 8:
                return R$drawable.uikit_icn_24_balance_sheet;
            case 9:
                return R$drawable.uikit_icn_24_bank;
            case 10:
                return R$drawable.uikit_icn_24_bar_chart;
            case 11:
                return R$drawable.uikit_icn_24_bell;
            case 12:
                return R$drawable.uikit_icn_24_bnpl;
            case 13:
                return R$drawable.uikit_icn_24_broken_heart;
            case 14:
                return R$drawable.uikit_icn_24_lightbulb;
            case 15:
                return R$drawable.uikit_icn_24_bullet_1;
            case 16:
                return R$drawable.uikit_icn_24_bullet_10;
            case 17:
                return R$drawable.uikit_icn_24_bullet_2;
            case 18:
                return R$drawable.uikit_icn_24_bullet_3;
            case 19:
                return R$drawable.uikit_icn_24_bullet_4;
            case 20:
                return R$drawable.uikit_icn_24_bullet_5;
            case 21:
                return R$drawable.uikit_icn_24_bullet_6;
            case 22:
                return R$drawable.uikit_icn_24_bullet_7;
            case 23:
                return R$drawable.uikit_icn_24_bullet_8;
            case 24:
                return R$drawable.uikit_icn_24_bullet_9;
            case 25:
                return R$drawable.uikit_icn_24_bullet_a;
            case 26:
                return R$drawable.uikit_icn_24_bullet_b;
            case 27:
                return R$drawable.uikit_icn_24_bullet_c;
            case 28:
                return R$drawable.uikit_icn_24_bullet_d;
            case 29:
                return R$drawable.uikit_icn_24_calendar;
            case 30:
                return R$drawable.uikit_icn_24_calendar_quarter;
            case 31:
                return R$drawable.uikit_icn_24_calendar_coins;
            case 32:
                return R$drawable.uikit_icn_24_calendar_date;
            case 33:
                return R$drawable.uikit_icn_24_calendar_recurring;
            case 34:
                return R$drawable.uikit_icn_24_call;
            case 35:
                return R$drawable.uikit_icn_24_camera;
            case 36:
                return R$drawable.uikit_icn_24_driving_licence;
            case 37:
                return R$drawable.uikit_icn_24_card;
            case 38:
                return R$drawable.uikit_icn_24_card_expired;
            case 39:
                return R$drawable.uikit_icn_24_card_shield;
            case 40:
                return R$drawable.uikit_icn_24_cash;
            case 41:
                return R$drawable.uikit_icn_24_cashback;
            case 42:
                return R$drawable.uikit_icn_24_cash_income;
            case 43:
                return R$drawable.uikit_icn_24_check;
            case 44:
                return R$drawable.uikit_icn_24_check_success;
            case 45:
                return R$drawable.uikit_icn_24_check_verification;
            case 46:
                return R$drawable.uikit_icn_24_cheque;
            case 47:
                return R$drawable.uikit_icn_24_chevron_right;
            case 48:
                return R$drawable.uikit_icn_24_claim;
            case 49:
                return R$drawable.uikit_icn_24_cleaning;
            case 50:
                return R$drawable.uikit_icn_24_clip;
            case 51:
                return R$drawable.uikit_icn_24_coins;
            case 52:
                return R$drawable.uikit_icn_24_coins_earning;
            case 53:
                return R$drawable.uikit_icn_24_coins_search;
            case 54:
                return R$drawable.uikit_icn_24_company_filled;
            case 55:
                return R$drawable.uikit_icn_24_credit;
            case 56:
                return R$drawable.uikit_icn_24_credit_card;
            case 57:
                return R$drawable.uikit_icn_24_credit_part;
            case 58:
                return R$drawable.uikit_icn_24_cross;
            case 59:
                return R$drawable.uikit_icn_24_cross_circle;
            case 60:
                return R$drawable.uikit_icn_24_crutch;
            case 61:
                return R$drawable.uikit_icn_24_data_limit;
            case 62:
                return R$drawable.uikit_icn_24_data_limit_half;
            case 63:
                return R$drawable.uikit_icn_24_data_limit_low;
            case 64:
                return R$drawable.uikit_icn_24_arrow_rates_down;
            case 65:
                return R$drawable.uikit_icn_24_delivery_car;
            case 66:
                return R$drawable.uikit_icn_24_deposit_protection;
            case 67:
                return R$drawable.uikit_icn_24_desktop_shop;
            case 68:
                return R$drawable.uikit_icn_24_document;
            case 69:
                return R$drawable.uikit_icn_24_documents_pair;
            case 70:
                return R$drawable.uikit_icn_24_document_search;
            case 71:
                return R$drawable.uikit_icn_24_download;
            case 72:
                return R$drawable.uikit_icn_24_doxgety;
            case 73:
                return R$drawable.uikit_icn_24_draw_parallel_channel;
            case 74:
                return R$drawable.uikit_icn_24_envelope;
            case 75:
                return R$drawable.uikit_icn_24_drag;
            case 76:
                return R$drawable.uikit_icn_24_exclamation_mark;
            case 77:
                return R$drawable.uikit_icn_24_exclamation_triangle;
            case 78:
                return R$drawable.uikit_icn_24_eye_show;
            case 79:
                return R$drawable.uikit_icn_24_fees;
            case 80:
                return R$drawable.uikit_icn_24_form;
            case 81:
                return R$drawable.uikit_icn_24_gift;
            case 82:
                return R$drawable.uikit_icn_24_globe;
            case 83:
                return R$drawable.uikit_icn_24_hammer;
            case 84:
                return R$drawable.uikit_icn_24_handle;
            case 85:
                return R$drawable.uikit_icn_24_help_chat;
            case 86:
                return R$drawable.uikit_icn_24_utilities;
            case 87:
                return R$drawable.uikit_icn_24_hotel;
            case 88:
                return R$drawable.uikit_icn_24_image;
            case 89:
                return R$drawable.uikit_icn_24_info;
            case 90:
                return R$drawable.uikit_icn_24_info_outline;
            case 91:
                return R$drawable.uikit_icn_24_insurance;
            case 92:
                return R$drawable.uikit_icn_24_invest;
            case 93:
                return R$drawable.uikit_icn_24_issue;
            case 94:
                return R$drawable.uikit_icn_24_key;
            case 95:
                return R$drawable.uikit_icn_24_lightning;
            case 96:
                return R$drawable.uikit_icn_24_limit;
            case 97:
                return R$drawable.uikit_icn_24_link;
            case 98:
                return R$drawable.uikit_icn_24_link_external;
            case 99:
                return R$drawable.uikit_icn_24_location_pin;
            case 100:
                return R$drawable.uikit_icn_24_lock;
            case 101:
                return R$drawable.uikit_icn_24_logo_android;
            case 102:
                return R$drawable.uikit_icn_24_logo_mc;
            case 103:
                return R$drawable.uikit_icn_24_logo_revolut;
            case 104:
                return R$drawable.uikit_icn_24_logo_visa;
            case 105:
                return R$drawable.uikit_icn_24_lounges;
            case 106:
                return R$drawable.uikit_icn_24_market_order;
            case 107:
                return R$drawable.uikit_icn_24_medical_bed;
            case LDSFile.EF_DG12_TAG /* 108 */:
                return R$drawable.uikit_icn_24_medical_cross;
            case LDSFile.EF_DG13_TAG /* 109 */:
                return R$drawable.uikit_icn_24_medkit;
            case LDSFile.EF_DG14_TAG /* 110 */:
                return R$drawable.uikit_icn_24_mortgage;
            case LDSFile.EF_DG15_TAG /* 111 */:
                return R$drawable.uikit_icn_24_national_id;
            case 112:
                return R$drawable.uikit_icn_24_overdraft;
            case 113:
                return R$drawable.uikit_icn_24_parking;
            case 114:
                return R$drawable.uikit_icn_24_time_and_money;
            case ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG /* 115 */:
                return R$drawable.uikit_icn_24_pencil;
            case 116:
                return R$drawable.uikit_icn_24_people;
            case LDSFile.EF_DG2_TAG /* 117 */:
                return R$drawable.uikit_icn_24_percent;
            case LDSFile.EF_DG4_TAG /* 118 */:
                return R$drawable.uikit_icn_24_plus;
            case LDSFile.EF_SOD_TAG /* 119 */:
                return R$drawable.uikit_icn_24_premium;
            case SyslogConstants.LOG_CLOCK /* 120 */:
                return R$drawable.uikit_icn_24_present;
            case 121:
                return R$drawable.uikit_icn_24_price_tag;
            case 122:
                return R$drawable.uikit_icn_24_profile;
            case 123:
                return R$drawable.uikit_icn_24_question;
            case 124:
                return R$drawable.uikit_icn_24_question_sign;
            case ISO781611.SMT_TAG /* 125 */:
                return R$drawable.uikit_icn_24_refinancing_home;
            case 126:
                return R$drawable.uikit_icn_24_repair_tool;
            case CertificateBody.profileType /* 127 */:
                return R$drawable.uikit_icn_24_repayment;
            case 128:
                return R$drawable.uikit_icn_24_restaurants;
            case 129:
                return R$drawable.uikit_icn_24_reverted;
            case 130:
                return R$drawable.uikit_icn_24_revpoints;
            case ISO781611.CREATION_DATE_AND_TIME_TAG /* 131 */:
                return R$drawable.uikit_icn_24_salary;
            case 132:
                return R$drawable.uikit_icn_24_services;
            case 133:
                return R$drawable.uikit_icn_24_shield;
            case ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA /* 134 */:
                return R$drawable.uikit_icn_24_shopping;
            case 135:
                return R$drawable.uikit_icn_24_shower;
            case 136:
                return R$drawable.uikit_icn_24_smartphone;
            case 137:
                return R$drawable.uikit_icn_24_snowflake;
            case 138:
                return R$drawable.uikit_icn_24_statement;
            case 139:
                return R$drawable.uikit_icn_24_sun;
            case 140:
                return R$drawable.uikit_icn_24_tech;
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                return R$drawable.uikit_icn_24_check;
            case 142:
                return R$drawable.uikit_icn_24_time;
            case 143:
                return R$drawable.uikit_icn_24_trash;
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
                return R$drawable.uikit_icn_24_travel;
            case 145:
                return R$drawable.uikit_icn_24_turbo_transfer;
            case 146:
                return R$drawable.uikit_icn_24_upload;
            case 147:
                return R$drawable.uikit_icn_24_users_search;
            case 148:
                return R$drawable.uikit_icn_24_utilities;
            case 149:
                return R$drawable.uikit_icn_24_vault;
            case 150:
                return R$drawable.uikit_icn_24_vegan;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GlyphImage d() {
        return new GlyphImage(c(), null, 0 == true ? 1 : 0, 6);
    }
}
