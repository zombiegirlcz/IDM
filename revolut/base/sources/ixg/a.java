package ixg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lixg/a;", "", "PERFORMANCE", "PNL", "TOTAL_VALUE", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @lg.b("complex_analytics_analytics_tabs_performance")
    public static final a PERFORMANCE;

    @lg.b("complex_analytics_analytics_tabs_pnl")
    public static final a PNL;

    @lg.b("complex_analytics_analytics_tabs_total_value")
    public static final a TOTAL_VALUE;

    static {
        a aVar = new a("PERFORMANCE", 0);
        PERFORMANCE = aVar;
        a aVar2 = new a("PNL", 1);
        PNL = aVar2;
        a aVar3 = new a("TOTAL_VALUE", 2);
        TOTAL_VALUE = aVar3;
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
