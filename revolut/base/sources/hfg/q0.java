package hfg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 LOYALTY_ORIGIN_ID;
    public static final q0 TRANSACTION_ID;
    public static final q0 UNKNOWN;

    static {
        q0 q0Var = new q0("TRANSACTION_ID", 0);
        TRANSACTION_ID = q0Var;
        q0 q0Var2 = new q0("LOYALTY_ORIGIN_ID", 1);
        LOYALTY_ORIGIN_ID = q0Var2;
        q0 q0Var3 = new q0("UNKNOWN", 2);
        UNKNOWN = q0Var3;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
