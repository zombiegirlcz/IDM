package ox4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g SEARCH_BY_ATTRIBUTES;
    public static final g SEARCH_BY_ID;

    static {
        g gVar = new g("SEARCH_BY_ID", 0);
        SEARCH_BY_ID = gVar;
        g gVar2 = new g("SEARCH_BY_ATTRIBUTES", 1);
        SEARCH_BY_ATTRIBUTES = gVar2;
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
