package iha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCIDENTAL_UPGRADE;
    public static final a NON_AVAILABLE_FEATURES;
    public static final a NON_USEFUL_BENEFITS;
    public static final a NON_WORKING_FEATURES;
    public static final a NO_LONGER_NEEDED_BENEFITS;
    public static final a OTHER;
    public static final a TRAVEL_INSURANCE_REMOVAL;
    public static final a UNFAIR_PRICE;
    public static final a UNHAPPY_WITH_CUSTOMER_SUPPORT;
    public static final a UNHAPPY_WITH_PLAN_CHANGES;

    static {
        a aVar = new a("NON_USEFUL_BENEFITS", 0);
        NON_USEFUL_BENEFITS = aVar;
        a aVar2 = new a("UNFAIR_PRICE", 1);
        UNFAIR_PRICE = aVar2;
        a aVar3 = new a("UNHAPPY_WITH_CUSTOMER_SUPPORT", 2);
        UNHAPPY_WITH_CUSTOMER_SUPPORT = aVar3;
        a aVar4 = new a("UNHAPPY_WITH_PLAN_CHANGES", 3);
        UNHAPPY_WITH_PLAN_CHANGES = aVar4;
        a aVar5 = new a("NON_WORKING_FEATURES", 4);
        NON_WORKING_FEATURES = aVar5;
        a aVar6 = new a("NON_AVAILABLE_FEATURES", 5);
        NON_AVAILABLE_FEATURES = aVar6;
        a aVar7 = new a("ACCIDENTAL_UPGRADE", 6);
        ACCIDENTAL_UPGRADE = aVar7;
        a aVar8 = new a("NO_LONGER_NEEDED_BENEFITS", 7);
        NO_LONGER_NEEDED_BENEFITS = aVar8;
        a aVar9 = new a("TRAVEL_INSURANCE_REMOVAL", 8);
        TRAVEL_INSURANCE_REMOVAL = aVar9;
        a aVar10 = new a("OTHER", 9);
        OTHER = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
