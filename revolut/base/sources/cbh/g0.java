package cbh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 INIT;
    public static final g0 LOAD_DOWN;
    public static final g0 LOAD_UP;
    public static final g0 RETRY;

    static {
        g0 g0Var = new g0("INIT", 0);
        INIT = g0Var;
        g0 g0Var2 = new g0("LOAD_UP", 1);
        LOAD_UP = g0Var2;
        g0 g0Var3 = new g0("LOAD_DOWN", 2);
        LOAD_DOWN = g0Var3;
        g0 g0Var4 = new g0("RETRY", 3);
        RETRY = g0Var4;
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
