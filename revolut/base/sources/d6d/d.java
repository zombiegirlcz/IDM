package d6d;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ld6d/d;", "", "SPARE_CHANGE", "DAILY_SAVINGS", "SPENDING_PERCENTAGE", "BALANCE_ROUNDING", "UNKNOWN", "feature_shared_autoinvest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @lg.b("BALANCE_ROUNDING")
    public static final d BALANCE_ROUNDING;

    @lg.b("DAILY_SAVINGS")
    public static final d DAILY_SAVINGS;

    @lg.b("SPARE_CHANGE")
    public static final d SPARE_CHANGE;

    @lg.b("SPENDING_PERCENTAGE")
    public static final d SPENDING_PERCENTAGE;
    public static final d UNKNOWN;

    static {
        d dVar = new d("SPARE_CHANGE", 0);
        SPARE_CHANGE = dVar;
        d dVar2 = new d("DAILY_SAVINGS", 1);
        DAILY_SAVINGS = dVar2;
        d dVar3 = new d("SPENDING_PERCENTAGE", 2);
        SPENDING_PERCENTAGE = dVar3;
        d dVar4 = new d("BALANCE_ROUNDING", 3);
        BALANCE_ROUNDING = dVar4;
        d dVar5 = new d("UNKNOWN", 4);
        UNKNOWN = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
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
