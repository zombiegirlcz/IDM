package qmd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CASHFLOW;
    public static final a EARNINGS;
    public static final a INCOME;
    public static final a NET_BALANCE;
    public static final a NET_WORTH;
    public static final a SALES;
    public static final a SPENDING;

    @NotNull
    private final yld.c defaultChartStyle;

    @NotNull
    private final String storageKey;

    static {
        yld.c cVar = yld.c.LINE_CHART;
        a aVar = new a("SPENDING", 0, "KEY_SPENDING_CHART_STYLE", cVar);
        SPENDING = aVar;
        yld.c cVar2 = yld.c.BAR_CHART;
        a aVar2 = new a("INCOME", 1, "KEY_INCOME_CHART_STYLE", cVar2);
        INCOME = aVar2;
        a aVar3 = new a("CASHFLOW", 2, "KEY_CASHFLOW_CHART_STYLE", cVar2);
        CASHFLOW = aVar3;
        a aVar4 = new a("NET_BALANCE", 3, "KEY_NET_BALANCE_CHART_STYLE", cVar);
        NET_BALANCE = aVar4;
        a aVar5 = new a("EARNINGS", 4, "KEY_EARNINGS_CHART_STYLE", cVar);
        EARNINGS = aVar5;
        a aVar6 = new a("SALES", 5, "KEY_SALES_CHART_STYLE", cVar);
        SALES = aVar6;
        a aVar7 = new a("NET_WORTH", 6, "KEY_NET_WORTH_CHART_STYLE", yld.c.PIE_CHART);
        NET_WORTH = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2, yld.c cVar) {
        this.storageKey = str2;
        this.defaultChartStyle = cVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final yld.c a() {
        return this.defaultChartStyle;
    }

    public final String b() {
        return this.storageKey;
    }
}
