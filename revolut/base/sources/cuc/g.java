package cuc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DAILY;
    public static final g DAY;
    public static final g NIGHT;
    public static final g OTHER;

    static {
        g gVar = new g("DAY", 0);
        DAY = gVar;
        g gVar2 = new g("NIGHT", 1);
        NIGHT = gVar2;
        g gVar3 = new g("DAILY", 2);
        DAILY = gVar3;
        g gVar4 = new g("OTHER", 3);
        OTHER = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
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
