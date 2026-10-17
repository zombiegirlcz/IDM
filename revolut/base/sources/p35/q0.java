package p35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 CLAIM_REPAYMENT;
    public static final q0 OUTSTANDING_PARTIAL_REPAYMENT;
    public static final q0 OVERDUE_REPAYMENT;
    public static final q0 PARTIAL_REPAYMENT;
    public static final q0 PAY_OFF;
    public static final q0 PENALTY;
    public static final q0 SCHEDULED;
    public static final q0 SCHEDULED_LAC;
    public static final q0 SCHEDULED_RESTRUCTURED;
    public static final q0 TERMINATION_REPAYMENT;
    public static final q0 UNKNOWN;

    static {
        q0 q0Var = new q0("PARTIAL_REPAYMENT", 0);
        PARTIAL_REPAYMENT = q0Var;
        q0 q0Var2 = new q0("OVERDUE_REPAYMENT", 1);
        OVERDUE_REPAYMENT = q0Var2;
        q0 q0Var3 = new q0("SCHEDULED", 2);
        SCHEDULED = q0Var3;
        q0 q0Var4 = new q0("SCHEDULED_RESTRUCTURED", 3);
        SCHEDULED_RESTRUCTURED = q0Var4;
        q0 q0Var5 = new q0("PAY_OFF", 4);
        PAY_OFF = q0Var5;
        q0 q0Var6 = new q0("PENALTY", 5);
        PENALTY = q0Var6;
        q0 q0Var7 = new q0("TERMINATION_REPAYMENT", 6);
        TERMINATION_REPAYMENT = q0Var7;
        q0 q0Var8 = new q0("SCHEDULED_LAC", 7);
        SCHEDULED_LAC = q0Var8;
        q0 q0Var9 = new q0("OUTSTANDING_PARTIAL_REPAYMENT", 8);
        OUTSTANDING_PARTIAL_REPAYMENT = q0Var9;
        q0 q0Var10 = new q0("CLAIM_REPAYMENT", 9);
        CLAIM_REPAYMENT = q0Var10;
        q0 q0Var11 = new q0("UNKNOWN", 10);
        UNKNOWN = q0Var11;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9, q0Var10, q0Var11};
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
