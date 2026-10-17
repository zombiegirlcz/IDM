package xmd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AVERAGE_SPENDING;
    public static final a RECURRING_EXPENSES;
    public static final a ROUNDED_AMOUNT;

    static {
        a aVar = new a("AVERAGE_SPENDING", 0);
        AVERAGE_SPENDING = aVar;
        a aVar2 = new a("RECURRING_EXPENSES", 1);
        RECURRING_EXPENSES = aVar2;
        a aVar3 = new a("ROUNDED_AMOUNT", 2);
        ROUNDED_AMOUNT = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
