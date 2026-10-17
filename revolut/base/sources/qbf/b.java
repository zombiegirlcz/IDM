package qbf;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lqbf/b;", "", "ANNUAL", "MONTHLY", "UNKNOWN", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @lg.b("ANNUAL")
    public static final b ANNUAL;

    @lg.b("MONTHLY")
    public static final b MONTHLY;

    @lg.b("UNKNOWN")
    @he0.b
    public static final b UNKNOWN;

    static {
        b bVar = new b("ANNUAL", 0);
        ANNUAL = bVar;
        b bVar2 = new b("MONTHLY", 1);
        MONTHLY = bVar2;
        b bVar3 = new b("UNKNOWN", 2);
        UNKNOWN = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
