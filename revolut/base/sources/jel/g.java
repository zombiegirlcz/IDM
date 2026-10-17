package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FIXED;
    public static final g FLOATING;
    public static final g STEP_UP_STEP_DOWN;

    static {
        g gVar = new g("FIXED", 0);
        FIXED = gVar;
        g gVar2 = new g("FLOATING", 1);
        FLOATING = gVar2;
        g gVar3 = new g("STEP_UP_STEP_DOWN", 2);
        STEP_UP_STEP_DOWN = gVar3;
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
