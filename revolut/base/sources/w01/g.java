package w01;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CENTER_IN;
    public static final g CENTER_OUT;
    public static final g FIT_XY;

    static {
        g gVar = new g("FIT_XY", 0);
        FIT_XY = gVar;
        g gVar2 = new g("CENTER_IN", 1);
        CENTER_IN = gVar2;
        g gVar3 = new g("CENTER_OUT", 2);
        CENTER_OUT = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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
