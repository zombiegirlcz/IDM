package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g5[] $VALUES;
    public static final g5 P2P_TRANSFER;
    public static final g5 TASK_REWARD;
    public static final g5 WITHDRAWAL;

    static {
        g5 g5Var = new g5("WITHDRAWAL", 0);
        WITHDRAWAL = g5Var;
        g5 g5Var2 = new g5("TASK_REWARD", 1);
        TASK_REWARD = g5Var2;
        g5 g5Var3 = new g5("P2P_TRANSFER", 2);
        P2P_TRANSFER = g5Var3;
        g5[] g5VarArr = {g5Var, g5Var2, g5Var3};
        $VALUES = g5VarArr;
        $ENTRIES = vc.s.n(g5VarArr);
    }

    public static g5 valueOf(String str) {
        return (g5) Enum.valueOf(g5.class, str);
    }

    public static g5[] values() {
        return (g5[]) $VALUES.clone();
    }
}
