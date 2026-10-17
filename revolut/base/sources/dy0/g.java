package dy0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT;
    public static final g SUGGESTIONS;
    public static final g WITH_GLOW;

    static {
        g gVar = new g("DEFAULT", 0);
        DEFAULT = gVar;
        g gVar2 = new g("WITH_GLOW", 1);
        WITH_GLOW = gVar2;
        g gVar3 = new g("SUGGESTIONS", 2);
        SUGGESTIONS = gVar3;
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
