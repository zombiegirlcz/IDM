package bu7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o ANONYMOUS;
    public static final o CARD;
    public static final o CAR_HIRE_EXCESS;
    public static final o CONNECTION_DELAY;
    public static final o DAMAGED_BAGGAGE;
    public static final o DAMAGED_SPORTS_EQUIPMENT;
    public static final o DECLINE;
    public static final o DELAYED_BAGGAGE;
    public static final o DELAYED_FLIGHT;
    public static final o DENTAL_TREATMENT;
    public static final o EXPENSES;
    public static final o GLOBAL_MEDICAL_CENTRES;
    public static final o INFO;
    public static final o MEDICAL_ASSISTANCE;
    public static final o PEOPLE;
    public static final o PERSONAL_LIABILITY;
    public static final o PURCHASE_PROTECTION;
    public static final o SMARTPHONE_BROKEN;
    public static final o SNOWFLAKE;
    public static final o TRAVEL_AND_ACCOMMODATION;
    public static final o TRAVEL_ASSISTANCE;
    public static final o TRIP_CANCELLATION;
    public static final o UNKNOWN;
    public static final o VOUCHER;

    static {
        o oVar = new o("MEDICAL_ASSISTANCE", 0);
        MEDICAL_ASSISTANCE = oVar;
        o oVar2 = new o("DENTAL_TREATMENT", 1);
        DENTAL_TREATMENT = oVar2;
        o oVar3 = new o("TRAVEL_AND_ACCOMMODATION", 2);
        TRAVEL_AND_ACCOMMODATION = oVar3;
        o oVar4 = new o("GLOBAL_MEDICAL_CENTRES", 3);
        GLOBAL_MEDICAL_CENTRES = oVar4;
        o oVar5 = new o("EXPENSES", 4);
        EXPENSES = oVar5;
        o oVar6 = new o("DELAYED_FLIGHT", 5);
        DELAYED_FLIGHT = oVar6;
        o oVar7 = new o("DELAYED_BAGGAGE", 6);
        DELAYED_BAGGAGE = oVar7;
        o oVar8 = new o("DAMAGED_BAGGAGE", 7);
        DAMAGED_BAGGAGE = oVar8;
        o oVar9 = new o("TRAVEL_ASSISTANCE", 8);
        TRAVEL_ASSISTANCE = oVar9;
        o oVar10 = new o("TRIP_CANCELLATION", 9);
        TRIP_CANCELLATION = oVar10;
        o oVar11 = new o("PERSONAL_LIABILITY", 10);
        PERSONAL_LIABILITY = oVar11;
        o oVar12 = new o("PURCHASE_PROTECTION", 11);
        PURCHASE_PROTECTION = oVar12;
        o oVar13 = new o("CAR_HIRE_EXCESS", 12);
        CAR_HIRE_EXCESS = oVar13;
        o oVar14 = new o("DAMAGED_SPORTS_EQUIPMENT", 13);
        DAMAGED_SPORTS_EQUIPMENT = oVar14;
        o oVar15 = new o("CONNECTION_DELAY", 14);
        CONNECTION_DELAY = oVar15;
        o oVar16 = new o("INFO", 15);
        INFO = oVar16;
        o oVar17 = new o("PEOPLE", 16);
        PEOPLE = oVar17;
        o oVar18 = new o("SMARTPHONE_BROKEN", 17);
        SMARTPHONE_BROKEN = oVar18;
        o oVar19 = new o("ANONYMOUS", 18);
        ANONYMOUS = oVar19;
        o oVar20 = new o("DECLINE", 19);
        DECLINE = oVar20;
        o oVar21 = new o("SNOWFLAKE", 20);
        SNOWFLAKE = oVar21;
        o oVar22 = new o("VOUCHER", 21);
        VOUCHER = oVar22;
        o oVar23 = new o("CARD", 22);
        CARD = oVar23;
        o oVar24 = new o("UNKNOWN", 23);
        UNKNOWN = oVar24;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12, oVar13, oVar14, oVar15, oVar16, oVar17, oVar18, oVar19, oVar20, oVar21, oVar22, oVar23, oVar24};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
