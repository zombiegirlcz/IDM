package p35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 ACTIVE;
    public static final g0 INACTIVE;
    public static final g0 PLANNED;
    public static final g0 RENOUNCED;

    static {
        g0 g0Var = new g0("INACTIVE", 0);
        INACTIVE = g0Var;
        g0 g0Var2 = new g0("ACTIVE", 1);
        ACTIVE = g0Var2;
        g0 g0Var3 = new g0("PLANNED", 2);
        PLANNED = g0Var3;
        g0 g0Var4 = new g0("RENOUNCED", 3);
        RENOUNCED = g0Var4;
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
