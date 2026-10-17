package nel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ACCUMULATING;
    public static final g DISTRIBUTING;
    public static final g UNKNOWN;

    static {
        g gVar = new g("ACCUMULATING", 0);
        ACCUMULATING = gVar;
        g gVar2 = new g("DISTRIBUTING", 1);
        DISTRIBUTING = gVar2;
        g gVar3 = new g("UNKNOWN", 2);
        UNKNOWN = gVar3;
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
