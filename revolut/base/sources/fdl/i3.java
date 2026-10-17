package fdl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lfdl/i3;", "", "BUY", "SELL", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i3[] $VALUES;

    @lg.b("BUY")
    public static final i3 BUY;

    @lg.b("SELL")
    public static final i3 SELL;

    static {
        i3 i3Var = new i3("BUY", 0);
        BUY = i3Var;
        i3 i3Var2 = new i3("SELL", 1);
        SELL = i3Var2;
        i3[] i3VarArr = {i3Var, i3Var2};
        $VALUES = i3VarArr;
        $ENTRIES = vc.s.n(i3VarArr);
    }

    public static i3 valueOf(String str) {
        return (i3) Enum.valueOf(i3.class, str);
    }

    public static i3[] values() {
        return (i3[]) $VALUES.clone();
    }
}
