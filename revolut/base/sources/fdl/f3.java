package fdl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lfdl/f3;", "", "REGULAR", "SUBSTANTIAL", "SELL_ALL", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f3[] $VALUES;

    @lg.b("REGULAR")
    public static final f3 REGULAR;

    @lg.b("SELL_ALL")
    public static final f3 SELL_ALL;

    @lg.b("SUBSTANTIAL")
    public static final f3 SUBSTANTIAL;

    static {
        f3 f3Var = new f3("REGULAR", 0);
        REGULAR = f3Var;
        f3 f3Var2 = new f3("SUBSTANTIAL", 1);
        SUBSTANTIAL = f3Var2;
        f3 f3Var3 = new f3("SELL_ALL", 2);
        SELL_ALL = f3Var3;
        f3[] f3VarArr = {f3Var, f3Var2, f3Var3};
        $VALUES = f3VarArr;
        $ENTRIES = vc.s.n(f3VarArr);
    }

    public static f3 valueOf(String str) {
        return (f3) Enum.valueOf(f3.class, str);
    }

    public static f3[] values() {
        return (f3[]) $VALUES.clone();
    }
}
