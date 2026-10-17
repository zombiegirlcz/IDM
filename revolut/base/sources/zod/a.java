package zod;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CASHFLOW;
    public static final a EXPENSES;
    public static final a INCOME;
    public static final a NET_BALANCE;
    public static final a SALES;
    public static final a SPENDING;

    static {
        a aVar = new a("SPENDING", 0);
        SPENDING = aVar;
        a aVar2 = new a("EXPENSES", 1);
        EXPENSES = aVar2;
        a aVar3 = new a("NET_BALANCE", 2);
        NET_BALANCE = aVar3;
        a aVar4 = new a("INCOME", 3);
        INCOME = aVar4;
        a aVar5 = new a("CASHFLOW", 4);
        CASHFLOW = aVar5;
        a aVar6 = new a("SALES", 5);
        SALES = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
