package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g FULLY_EXCLUDED;
    public static final g INCLUDED;
    public static final g PARTIALLY_EXCLUDED;

    static {
        g gVar = new g("FULLY_EXCLUDED", 0);
        FULLY_EXCLUDED = gVar;
        g gVar2 = new g("PARTIALLY_EXCLUDED", 1);
        PARTIALLY_EXCLUDED = gVar2;
        g gVar3 = new g("INCLUDED", 2);
        INCLUDED = gVar3;
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
