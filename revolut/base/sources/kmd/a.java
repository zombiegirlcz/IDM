package kmd;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkmd/a;", "", "BAR_CHART", "LINE_CHART", "PIE_CHART", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @lg.b("BAR_CHART")
    public static final a BAR_CHART;

    @lg.b("LINE_CHART")
    public static final a LINE_CHART;

    @lg.b("PIE_CHART")
    public static final a PIE_CHART;

    static {
        a aVar = new a("BAR_CHART", 0);
        BAR_CHART = aVar;
        a aVar2 = new a("LINE_CHART", 1);
        LINE_CHART = aVar2;
        a aVar3 = new a("PIE_CHART", 2);
        PIE_CHART = aVar3;
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
