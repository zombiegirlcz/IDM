package ec5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g RDAEL;
    public static final g REVOLUT_LTD;
    public static final g RPAPL;
    public static final g RTSPL;
    public static final g UNKNOWN;

    static {
        g gVar = new g("REVOLUT_LTD", 0);
        REVOLUT_LTD = gVar;
        g gVar2 = new g("RDAEL", 1);
        RDAEL = gVar2;
        g gVar3 = new g("RPAPL", 2);
        RPAPL = gVar3;
        g gVar4 = new g("RTSPL", 3);
        RTSPL = gVar4;
        g gVar5 = new g("UNKNOWN", 4);
        UNKNOWN = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
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
