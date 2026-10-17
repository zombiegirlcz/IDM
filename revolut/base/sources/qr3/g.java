package qr3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lqr3/g;", "", "INFORMATIVE", "REMEDIABLE", "NON_REMEDIABLE", "PENDING", "COMPLETED", "UNKNOWN", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @lg.b("COMPLETED")
    public static final g COMPLETED;

    @lg.b("INFORMATIVE")
    public static final g INFORMATIVE;

    @lg.b("NON_REMEDIABLE")
    public static final g NON_REMEDIABLE;

    @lg.b("IN_PROGRESS")
    public static final g PENDING;

    @lg.b("REMEDIABLE")
    public static final g REMEDIABLE;

    @he0.b
    public static final g UNKNOWN;

    static {
        g gVar = new g("INFORMATIVE", 0);
        INFORMATIVE = gVar;
        g gVar2 = new g("REMEDIABLE", 1);
        REMEDIABLE = gVar2;
        g gVar3 = new g("NON_REMEDIABLE", 2);
        NON_REMEDIABLE = gVar3;
        g gVar4 = new g("PENDING", 3);
        PENDING = gVar4;
        g gVar5 = new g("COMPLETED", 4);
        COMPLETED = gVar5;
        g gVar6 = new g("UNKNOWN", 5);
        UNKNOWN = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
