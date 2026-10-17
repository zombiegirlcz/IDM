package my3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g implements ht3.a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ADD_DEBT;
    public static final g OPEN_DEBTS_LIST;
    public static final g SKIP;

    static {
        g gVar = new g("ADD_DEBT", 0);
        ADD_DEBT = gVar;
        g gVar2 = new g("OPEN_DEBTS_LIST", 1);
        OPEN_DEBTS_LIST = gVar2;
        g gVar3 = new g("SKIP", 2);
        SKIP = gVar3;
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
