package h93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DELIVERED;
    public static final g NONE;
    public static final g ORDERED;
    public static final g POSTED;
    public static final g PRINTED;

    static {
        g gVar = new g("NONE", 0);
        NONE = gVar;
        g gVar2 = new g("ORDERED", 1);
        ORDERED = gVar2;
        g gVar3 = new g("PRINTED", 2);
        PRINTED = gVar3;
        g gVar4 = new g("POSTED", 3);
        POSTED = gVar4;
        g gVar5 = new g("DELIVERED", 4);
        DELIVERED = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
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
