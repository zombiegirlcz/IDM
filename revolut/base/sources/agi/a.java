package agi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCESSIBILITY;
    public static final a BATH;
    public static final a BED;
    public static final a CALENDAR;
    public static final a CARD;
    public static final a CHILDREN;
    public static final a CLEANING;
    public static final a CLOCK;
    public static final a FOOD;
    public static final a KEY;
    public static final a MORE;
    public static final a PARKING;
    public static final a PERSON;
    public static final a PETS;
    public static final a SAFETY;

    static {
        a aVar = new a("ACCESSIBILITY", 0);
        ACCESSIBILITY = aVar;
        a aVar2 = new a("CLEANING", 1);
        CLEANING = aVar2;
        a aVar3 = new a("SAFETY", 2);
        SAFETY = aVar3;
        a aVar4 = new a("CLOCK", 3);
        CLOCK = aVar4;
        a aVar5 = new a("FOOD", 4);
        FOOD = aVar5;
        a aVar6 = new a("BED", 5);
        BED = aVar6;
        a aVar7 = new a("BATH", 6);
        BATH = aVar7;
        a aVar8 = new a("CALENDAR", 7);
        CALENDAR = aVar8;
        a aVar9 = new a("KEY", 8);
        KEY = aVar9;
        a aVar10 = new a("PETS", 9);
        PETS = aVar10;
        a aVar11 = new a("CHILDREN", 10);
        CHILDREN = aVar11;
        a aVar12 = new a("CARD", 11);
        CARD = aVar12;
        a aVar13 = new a("PARKING", 12);
        PARKING = aVar13;
        a aVar14 = new a("PERSON", 13);
        PERSON = aVar14;
        a aVar15 = new a("MORE", 14);
        MORE = aVar15;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
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
