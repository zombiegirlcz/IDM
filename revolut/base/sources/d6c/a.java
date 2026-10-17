package d6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOMMODATION;
    public static final a ADVERTISING;
    public static final a AIRLINES;
    public static final a CASH;
    public static final a EDUCATION;
    public static final a ENTERTAINMENT;
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
    public static final a TRANSPORT;
    public static final a UNKNOWN;
    public static final a UTILITIES;

    static {
        a aVar = new a("HEALTH", 0);
        HEALTH = aVar;
        a aVar2 = new a("GENERAL", 1);
        GENERAL = aVar2;
        a aVar3 = new a("SERVICES", 2);
        SERVICES = aVar3;
        a aVar4 = new a("AIRLINES", 3);
        AIRLINES = aVar4;
        a aVar5 = new a("TRANSPORT", 4);
        TRANSPORT = aVar5;
        a aVar6 = new a("ACCOMMODATION", 5);
        ACCOMMODATION = aVar6;
        a aVar7 = new a("UTILITIES", 6);
        UTILITIES = aVar7;
        a aVar8 = new a("SHOPPING", 7);
        SHOPPING = aVar8;
        a aVar9 = new a("FINANCIAL", 8);
        FINANCIAL = aVar9;
        a aVar10 = new a("FURNITURE", 9);
        FURNITURE = aVar10;
        a aVar11 = new a("HARDWARE", 10);
        HARDWARE = aVar11;
        a aVar12 = new a("GROCERIES", 11);
        GROCERIES = aVar12;
        a aVar13 = new a("FUEL", 12);
        FUEL = aVar13;
        a aVar14 = new a("ENTERTAINMENT", 13);
        ENTERTAINMENT = aVar14;
        a aVar15 = new a("SOFTWARE", 14);
        SOFTWARE = aVar15;
        a aVar16 = new a("RESTAURANTS", 15);
        RESTAURANTS = aVar16;
        a aVar17 = new a("ADVERTISING", 16);
        ADVERTISING = aVar17;
        a aVar18 = new a("CASH", 17);
        CASH = aVar18;
        a aVar19 = new a("EDUCATION", 18);
        EDUCATION = aVar19;
        a aVar20 = new a("GOVERNMENT", 19);
        GOVERNMENT = aVar20;
        a aVar21 = new a("UNKNOWN", 20);
        UNKNOWN = aVar21;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21};
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
