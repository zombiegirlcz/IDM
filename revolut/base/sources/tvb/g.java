package tvb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CODE;
    public static final g CODE_AND_PIN;
    public static final g UNKNOWN;

    static {
        g gVar = new g("CODE", 0);
        CODE = gVar;
        g gVar2 = new g("CODE_AND_PIN", 1);
        CODE_AND_PIN = gVar2;
        g gVar3 = new g("UNKNOWN", 2);
        UNKNOWN = gVar3;
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
