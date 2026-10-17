package nb5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ACH_ROUTING;
    public static final g CLABE;
    public static final g SORT_CODE;

    static {
        g gVar = new g("CLABE", 0);
        CLABE = gVar;
        g gVar2 = new g("ACH_ROUTING", 1);
        ACH_ROUTING = gVar2;
        g gVar3 = new g("SORT_CODE", 2);
        SORT_CODE = gVar3;
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
