package hl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g AUTO;
    public static final g MANUAL;

    static {
        g gVar = new g("AUTO", 0);
        AUTO = gVar;
        g gVar2 = new g("MANUAL", 1);
        MANUAL = gVar2;
        g[] gVarArr = {gVar, gVar2};
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
