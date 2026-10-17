package uz;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 PIN_TO_BOTTOM;
    public static final g0 PIN_TO_MASK;

    static {
        g0 g0Var = new g0("PIN_TO_BOTTOM", 0);
        PIN_TO_BOTTOM = g0Var;
        g0 g0Var2 = new g0("PIN_TO_MASK", 1);
        PIN_TO_MASK = g0Var2;
        g0[] g0VarArr = {g0Var, g0Var2};
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
