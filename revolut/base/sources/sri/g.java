package sri;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FIT_RETAIL_ACTIVITY;
    public static final g FULLSCREEN;

    static {
        g gVar = new g("FIT_RETAIL_ACTIVITY", 0);
        FIT_RETAIL_ACTIVITY = gVar;
        g gVar2 = new g("FULLSCREEN", 1);
        FULLSCREEN = gVar2;
        g[] gVarArr = {gVar, gVar2};
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
