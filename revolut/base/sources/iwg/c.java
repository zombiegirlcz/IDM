package iwg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Liwg/c;", "", "TIME_WEIGHTED", "MONEY_WEIGHTED", "SIMPLE", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("complex_analytics_calculation_method_money_weighted")
    public static final c MONEY_WEIGHTED;

    @lg.b("complex_analytics_calculation_method_simple")
    public static final c SIMPLE;

    @lg.b("complex_analytics_calculation_method_time_weighted")
    public static final c TIME_WEIGHTED;

    static {
        c cVar = new c("TIME_WEIGHTED", 0);
        TIME_WEIGHTED = cVar;
        c cVar2 = new c("MONEY_WEIGHTED", 1);
        MONEY_WEIGHTED = cVar2;
        c cVar3 = new c("SIMPLE", 2);
        SIMPLE = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
