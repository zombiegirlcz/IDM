package oei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACCESSIBILITY;
    public static final b BATHROOM;
    public static final b BEDROOM;
    public static final b BUSINESS_SERVICES;
    public static final b CHILDREN_AND_EXTRA_BEDS;
    public static final b CLEANING;
    public static final b ENTERTAINMENT;
    public static final b FAMILY_AND_CHILDREN;
    public static final b FITNESS;
    public static final b FOOD_AND_DRINK;
    public static final b INTERNET;
    public static final b LANGUAGES_SPOKEN;
    public static final b MORE;
    public static final b OUTDOOR_AREAS;
    public static final b PARKING;
    public static final b PAYMENT_TYPES;
    public static final b PETS;
    public static final b POOLS_AND_SPA_TREATMENTS;
    public static final b SAFETY;
    public static final b SAFETY_AND_CLEANING;
    public static final b SERVICES_AND_CONVENIENCES;
    public static final b THINGS_TO_DO;
    public static final b TRANSPORT;
    public static final b UNDEFINED;
    public static final b VIEW;

    static {
        b bVar = new b("INTERNET", 0);
        INTERNET = bVar;
        b bVar2 = new b("TRANSPORT", 1);
        TRANSPORT = bVar2;
        b bVar3 = new b("FOOD_AND_DRINK", 2);
        FOOD_AND_DRINK = bVar3;
        b bVar4 = new b("THINGS_TO_DO", 3);
        THINGS_TO_DO = bVar4;
        b bVar5 = new b("FAMILY_AND_CHILDREN", 4);
        FAMILY_AND_CHILDREN = bVar5;
        b bVar6 = new b("SERVICES_AND_CONVENIENCES", 5);
        SERVICES_AND_CONVENIENCES = bVar6;
        b bVar7 = new b("LANGUAGES_SPOKEN", 6);
        LANGUAGES_SPOKEN = bVar7;
        b bVar8 = new b("BUSINESS_SERVICES", 7);
        BUSINESS_SERVICES = bVar8;
        b bVar9 = new b("ACCESSIBILITY", 8);
        ACCESSIBILITY = bVar9;
        b bVar10 = new b("PETS", 9);
        PETS = bVar10;
        b bVar11 = new b("BEDROOM", 10);
        BEDROOM = bVar11;
        b bVar12 = new b("BATHROOM", 11);
        BATHROOM = bVar12;
        b bVar13 = new b("ENTERTAINMENT", 12);
        ENTERTAINMENT = bVar13;
        b bVar14 = new b("OUTDOOR_AREAS", 13);
        OUTDOOR_AREAS = bVar14;
        b bVar15 = new b("PARKING", 14);
        PARKING = bVar15;
        b bVar16 = new b("SAFETY", 15);
        SAFETY = bVar16;
        b bVar17 = new b("CLEANING", 16);
        CLEANING = bVar17;
        b bVar18 = new b("CHILDREN_AND_EXTRA_BEDS", 17);
        CHILDREN_AND_EXTRA_BEDS = bVar18;
        b bVar19 = new b("PAYMENT_TYPES", 18);
        PAYMENT_TYPES = bVar19;
        b bVar20 = new b("POOLS_AND_SPA_TREATMENTS", 19);
        POOLS_AND_SPA_TREATMENTS = bVar20;
        b bVar21 = new b("FITNESS", 20);
        FITNESS = bVar21;
        b bVar22 = new b("SAFETY_AND_CLEANING", 21);
        SAFETY_AND_CLEANING = bVar22;
        b bVar23 = new b("MORE", 22);
        MORE = bVar23;
        b bVar24 = new b("VIEW", 23);
        VIEW = bVar24;
        b bVar25 = new b("UNDEFINED", 24);
        UNDEFINED = bVar25;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
