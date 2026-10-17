package d3c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 CANCELLED;
    public static final g0 COMPLETED;
    public static final g0 DELIVERING;
    public static final g0 PENDING;
    public static final g0 PROCESSING;
    public static final g0 REFUNDED;
    public static final g0 UNKNOWN;

    static {
        g0 g0Var = new g0("UNKNOWN", 0);
        UNKNOWN = g0Var;
        g0 g0Var2 = new g0("PENDING", 1);
        PENDING = g0Var2;
        g0 g0Var3 = new g0("PROCESSING", 2);
        PROCESSING = g0Var3;
        g0 g0Var4 = new g0("DELIVERING", 3);
        DELIVERING = g0Var4;
        g0 g0Var5 = new g0("COMPLETED", 4);
        COMPLETED = g0Var5;
        g0 g0Var6 = new g0("CANCELLED", 5);
        CANCELLED = g0Var6;
        g0 g0Var7 = new g0("REFUNDED", 6);
        REFUNDED = g0Var7;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7};
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
