package yld;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CASHFLOW;
    public static final d EARNINGS;
    public static final d INCOME;
    public static final d NET_BALANCE;
    public static final d SALES;
    public static final d SPENDING;

    static {
        d dVar = new d("SPENDING", 0);
        SPENDING = dVar;
        d dVar2 = new d("INCOME", 1);
        INCOME = dVar2;
        d dVar3 = new d("NET_BALANCE", 2);
        NET_BALANCE = dVar3;
        d dVar4 = new d("EARNINGS", 3);
        EARNINGS = dVar4;
        d dVar5 = new d("CASHFLOW", 4);
        CASHFLOW = dVar5;
        d dVar6 = new d("SALES", 5);
        SALES = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
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
