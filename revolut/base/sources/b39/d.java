package b39;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AIRPORT_SECURITY_FAST_TRACK;
    public static final d AIRPORT_TRANSFERS;
    public static final d COBRANDS;
    public static final d DONATIONS;
    public static final d DONATIONS_REV_POINTS;
    public static final d ESIM;
    public static final d ESIM_REV_POINTS;
    public static final d EXPERIENCES;
    public static final d FLIGHTS;
    public static final d INSURANCE;
    public static final d LOUNGES;
    public static final d LOUNGES_REV_POINTS;
    public static final d LUGGAGE_STORAGE;
    public static final d MEGA_SHOPS;
    public static final d MILES;
    public static final d MOBILE_PLANS;
    public static final d POINTS_BUYING_ONE_OFF;
    public static final d POINTS_BUYING_RECURRING;
    public static final d PREMIUM_PARTNERSHIPS;
    public static final d REVERYWHERE;
    public static final d REVOLUT_PAY_REV_POINTS;
    public static final d REVPOINTS_CONSENT_FREE_TARGETING;
    public static final d REV_POINTS;
    public static final d REV_POINTS_EXCLUSIVE_STORE;
    public static final d REV_POINTS_GIFT_CARDS;
    public static final d REV_POINTS_HOME;
    public static final d REV_POINTS_POCKETS;
    public static final d SHOPS;
    public static final d SHOPS_REV_POINTS;
    public static final d SPARE_CHANGE_FOR_REV_POINTS;
    public static final d STATIONS;
    public static final d STAYS;
    public static final d TRANSPORT;

    static {
        d dVar = new d("STAYS", 0);
        STAYS = dVar;
        d dVar2 = new d("EXPERIENCES", 1);
        EXPERIENCES = dVar2;
        d dVar3 = new d("LOUNGES", 2);
        LOUNGES = dVar3;
        d dVar4 = new d("LOUNGES_REV_POINTS", 3);
        LOUNGES_REV_POINTS = dVar4;
        d dVar5 = new d("SHOPS", 4);
        SHOPS = dVar5;
        d dVar6 = new d("SHOPS_REV_POINTS", 5);
        SHOPS_REV_POINTS = dVar6;
        d dVar7 = new d("DONATIONS", 6);
        DONATIONS = dVar7;
        d dVar8 = new d("DONATIONS_REV_POINTS", 7);
        DONATIONS_REV_POINTS = dVar8;
        d dVar9 = new d("INSURANCE", 8);
        INSURANCE = dVar9;
        d dVar10 = new d("ESIM", 9);
        ESIM = dVar10;
        d dVar11 = new d("ESIM_REV_POINTS", 10);
        ESIM_REV_POINTS = dVar11;
        d dVar12 = new d("MILES", 11);
        MILES = dVar12;
        d dVar13 = new d("REV_POINTS", 12);
        REV_POINTS = dVar13;
        d dVar14 = new d("REV_POINTS_HOME", 13);
        REV_POINTS_HOME = dVar14;
        d dVar15 = new d("REV_POINTS_POCKETS", 14);
        REV_POINTS_POCKETS = dVar15;
        d dVar16 = new d("REV_POINTS_GIFT_CARDS", 15);
        REV_POINTS_GIFT_CARDS = dVar16;
        d dVar17 = new d("REV_POINTS_EXCLUSIVE_STORE", 16);
        REV_POINTS_EXCLUSIVE_STORE = dVar17;
        d dVar18 = new d("TRANSPORT", 17);
        TRANSPORT = dVar18;
        d dVar19 = new d("SPARE_CHANGE_FOR_REV_POINTS", 18);
        SPARE_CHANGE_FOR_REV_POINTS = dVar19;
        d dVar20 = new d("AIRPORT_SECURITY_FAST_TRACK", 19);
        AIRPORT_SECURITY_FAST_TRACK = dVar20;
        d dVar21 = new d("COBRANDS", 20);
        COBRANDS = dVar21;
        d dVar22 = new d("PREMIUM_PARTNERSHIPS", 21);
        PREMIUM_PARTNERSHIPS = dVar22;
        d dVar23 = new d("MOBILE_PLANS", 22);
        MOBILE_PLANS = dVar23;
        d dVar24 = new d("REVOLUT_PAY_REV_POINTS", 23);
        REVOLUT_PAY_REV_POINTS = dVar24;
        d dVar25 = new d("POINTS_BUYING_ONE_OFF", 24);
        POINTS_BUYING_ONE_OFF = dVar25;
        d dVar26 = new d("POINTS_BUYING_RECURRING", 25);
        POINTS_BUYING_RECURRING = dVar26;
        d dVar27 = new d("REVERYWHERE", 26);
        REVERYWHERE = dVar27;
        d dVar28 = new d("REVPOINTS_CONSENT_FREE_TARGETING", 27);
        REVPOINTS_CONSENT_FREE_TARGETING = dVar28;
        d dVar29 = new d("AIRPORT_TRANSFERS", 28);
        AIRPORT_TRANSFERS = dVar29;
        d dVar30 = new d("FLIGHTS", 29);
        FLIGHTS = dVar30;
        d dVar31 = new d("MEGA_SHOPS", 30);
        MEGA_SHOPS = dVar31;
        d dVar32 = new d("STATIONS", 31);
        STATIONS = dVar32;
        d dVar33 = new d("LUGGAGE_STORAGE", 32);
        LUGGAGE_STORAGE = dVar33;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, dVar25, dVar26, dVar27, dVar28, dVar29, dVar30, dVar31, dVar32, dVar33};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
