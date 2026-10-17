package a3f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g LARGE_CAP;
    public static final g MEGA_CAP;
    public static final g MID_CAP;
    public static final g SMALL_CAP;

    static {
        g gVar = new g("SMALL_CAP", 0);
        SMALL_CAP = gVar;
        g gVar2 = new g("MID_CAP", 1);
        MID_CAP = gVar2;
        g gVar3 = new g("LARGE_CAP", 2);
        LARGE_CAP = gVar3;
        g gVar4 = new g("MEGA_CAP", 3);
        MEGA_CAP = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
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
