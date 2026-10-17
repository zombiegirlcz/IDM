package ds6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BI_MONTHLY;
    public static final a FOUR_MONTHLY;
    public static final a HALF_YEARLY;
    public static final a MONTHLY;
    public static final a QUARTERLY;
    public static final a SINGLE_INSTALMENT;
    public static final a TWO_INSTALMENTS;
    public static final a UNKNOWN;
    public static final a YEARLY;

    static {
        a aVar = new a("MONTHLY", 0);
        MONTHLY = aVar;
        a aVar2 = new a("BI_MONTHLY", 1);
        BI_MONTHLY = aVar2;
        a aVar3 = new a("QUARTERLY", 2);
        QUARTERLY = aVar3;
        a aVar4 = new a("FOUR_MONTHLY", 3);
        FOUR_MONTHLY = aVar4;
        a aVar5 = new a("HALF_YEARLY", 4);
        HALF_YEARLY = aVar5;
        a aVar6 = new a("YEARLY", 5);
        YEARLY = aVar6;
        a aVar7 = new a("SINGLE_INSTALMENT", 6);
        SINGLE_INSTALMENT = aVar7;
        a aVar8 = new a("TWO_INSTALMENTS", 7);
        TWO_INSTALMENTS = aVar8;
        a aVar9 = new a("UNKNOWN", 8);
        UNKNOWN = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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
