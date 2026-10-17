package hoc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a HISTORICAL_PORTFOLIO_PERFORMANCE;
    public static final a HISTORICAL_TEMPLATE_PERFORMANCE;
    public static final a SIMULATED_PORTFOLIO_PERFORMANCE;

    static {
        a aVar = new a("SIMULATED_PORTFOLIO_PERFORMANCE", 0);
        SIMULATED_PORTFOLIO_PERFORMANCE = aVar;
        a aVar2 = new a("HISTORICAL_PORTFOLIO_PERFORMANCE", 1);
        HISTORICAL_PORTFOLIO_PERFORMANCE = aVar2;
        a aVar3 = new a("HISTORICAL_TEMPLATE_PERFORMANCE", 2);
        HISTORICAL_TEMPLATE_PERFORMANCE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
