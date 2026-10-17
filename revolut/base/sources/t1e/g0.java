package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 ALREADY_BOUGHT;
    public static final g0 LIMIT_REACHED;
    public static final g0 SOLD_OUT;
    public static final g0 UNKNOWN;

    static {
        g0 g0Var = new g0("SOLD_OUT", 0);
        SOLD_OUT = g0Var;
        g0 g0Var2 = new g0("ALREADY_BOUGHT", 1);
        ALREADY_BOUGHT = g0Var2;
        g0 g0Var3 = new g0("LIMIT_REACHED", 2);
        LIMIT_REACHED = g0Var3;
        g0 g0Var4 = new g0("UNKNOWN", 3);
        UNKNOWN = g0Var4;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
