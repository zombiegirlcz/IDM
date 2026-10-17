package zvl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOMMODATION;
    public static final a ADVERTISING;
    public static final a CARD;
    public static final a CASH;
    public static final a CASHBACK;
    public static final a EDUCATION;
    public static final a ENTERTAINMENT;
    public static final a FEE;
    public static final a FINANCIAL;
    public static final a FUEL;
    public static final a FURNITURE;
    public static final a GENERAL;
    public static final a GOVERNMENT;
    public static final a GROCERIES;
    public static final a HARDWARE;
    public static final a HEALTH;
    public static final a RESTAURANTS;
    public static final a SERVICES;
    public static final a SHOPPING;
    public static final a SOFTWARE;
    public static final a TRANSFER;
    public static final a TRANSPORT;
    public static final a TRAVEL;
    public static final a UTILITIES;

    static {
        a aVar = new a("FEE", 0);
        FEE = aVar;
        a aVar2 = new a("CASHBACK", 1);
        CASHBACK = aVar2;
        a aVar3 = new a("CASH", 2);
        CASH = aVar3;
        a aVar4 = new a("TRANSFER", 3);
        TRANSFER = aVar4;
        a aVar5 = new a("CARD", 4);
        CARD = aVar5;
        a aVar6 = new a("HEALTH", 5);
        HEALTH = aVar6;
        a aVar7 = new a("GENERAL", 6);
        GENERAL = aVar7;
        a aVar8 = new a("SERVICES", 7);
        SERVICES = aVar8;
        a aVar9 = new a("TRAVEL", 8);
        TRAVEL = aVar9;
        a aVar10 = new a("TRANSPORT", 9);
        TRANSPORT = aVar10;
        a aVar11 = new a("ACCOMMODATION", 10);
        ACCOMMODATION = aVar11;
        a aVar12 = new a("UTILITIES", 11);
        UTILITIES = aVar12;
        a aVar13 = new a("SHOPPING", 12);
        SHOPPING = aVar13;
        a aVar14 = new a("FINANCIAL", 13);
        FINANCIAL = aVar14;
        a aVar15 = new a("FURNITURE", 14);
        FURNITURE = aVar15;
        a aVar16 = new a("HARDWARE", 15);
        HARDWARE = aVar16;
        a aVar17 = new a("GROCERIES", 16);
        GROCERIES = aVar17;
        a aVar18 = new a("FUEL", 17);
        FUEL = aVar18;
        a aVar19 = new a("ENTERTAINMENT", 18);
        ENTERTAINMENT = aVar19;
        a aVar20 = new a("SOFTWARE", 19);
        SOFTWARE = aVar20;
        a aVar21 = new a("RESTAURANTS", 20);
        RESTAURANTS = aVar21;
        a aVar22 = new a("ADVERTISING", 21);
        ADVERTISING = aVar22;
        a aVar23 = new a("EDUCATION", 22);
        EDUCATION = aVar23;
        a aVar24 = new a("GOVERNMENT", 23);
        GOVERNMENT = aVar24;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
