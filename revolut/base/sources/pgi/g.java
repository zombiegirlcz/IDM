package pgi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DIRECT_NAVIGATION;
    public static final g IDLE;
    public static final g PROCESSING;

    static {
        g gVar = new g("IDLE", 0);
        IDLE = gVar;
        g gVar2 = new g("PROCESSING", 1);
        PROCESSING = gVar2;
        g gVar3 = new g("DIRECT_NAVIGATION", 2);
        DIRECT_NAVIGATION = gVar3;
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
