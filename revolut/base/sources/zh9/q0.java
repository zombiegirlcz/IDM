package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 ACTIVE;
    public static final q0 CANCELLED;
    public static final q0 OUTSTANDING;
    public static final q0 OVERDUE;
    public static final q0 REPAID;

    static {
        q0 q0Var = new q0("ACTIVE", 0);
        ACTIVE = q0Var;
        q0 q0Var2 = new q0("CANCELLED", 1);
        CANCELLED = q0Var2;
        q0 q0Var3 = new q0("OVERDUE", 2);
        OVERDUE = q0Var3;
        q0 q0Var4 = new q0("OUTSTANDING", 3);
        OUTSTANDING = q0Var4;
        q0 q0Var5 = new q0("REPAID", 4);
        REPAID = q0Var5;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, q0Var5};
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
