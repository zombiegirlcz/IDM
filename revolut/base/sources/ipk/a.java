package ipk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lipk/a;", "", "DAY", "WEEK", "MONTH", "THREE_MONTH", "SIX_MONTH", "YEAR", "FIVE_YEARS", "ALL", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @lg.b("ALL")
    public static final a ALL;

    @lg.b("DAY")
    public static final a DAY;

    @lg.b("FIVE_YEARS")
    public static final a FIVE_YEARS;

    @lg.b("MONTH")
    public static final a MONTH;

    @lg.b("SIX_MONTH")
    public static final a SIX_MONTH;

    @lg.b("THREE_MONTH")
    public static final a THREE_MONTH;

    @lg.b("WEEK")
    public static final a WEEK;

    @lg.b("YEAR")
    public static final a YEAR;

    static {
        a aVar = new a("DAY", 0);
        DAY = aVar;
        a aVar2 = new a("WEEK", 1);
        WEEK = aVar2;
        a aVar3 = new a("MONTH", 2);
        MONTH = aVar3;
        a aVar4 = new a("THREE_MONTH", 3);
        THREE_MONTH = aVar4;
        a aVar5 = new a("SIX_MONTH", 4);
        SIX_MONTH = aVar5;
        a aVar6 = new a("YEAR", 5);
        YEAR = aVar6;
        a aVar7 = new a("FIVE_YEARS", 6);
        FIVE_YEARS = aVar7;
        a aVar8 = new a("ALL", 7);
        ALL = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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
