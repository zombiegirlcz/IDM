package lqa;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Llqa/g;", "", "SELF", "LINKED", "OTHER", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @lg.b("LINKED")
    public static final g LINKED;

    @lg.b("OTHER")
    public static final g OTHER;

    @lg.b("SELF")
    public static final g SELF;

    static {
        g gVar = new g("SELF", 0);
        SELF = gVar;
        g gVar2 = new g("LINKED", 1);
        LINKED = gVar2;
        g gVar3 = new g("OTHER", 2);
        OTHER = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
