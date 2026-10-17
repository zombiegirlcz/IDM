package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 OUTSTANDING_PARTIAL_REPAYMENT;
    public static final d1 OVERDUE_REPAYMENT;
    public static final d1 PARTIAL_REPAYMENT;
    public static final d1 PAY_OFF;
    public static final d1 PENALTY_REPAYMENT;
    public static final d1 REPAYMENT;

    static {
        d1 d1Var = new d1("PAY_OFF", 0);
        PAY_OFF = d1Var;
        d1 d1Var2 = new d1("REPAYMENT", 1);
        REPAYMENT = d1Var2;
        d1 d1Var3 = new d1("PARTIAL_REPAYMENT", 2);
        PARTIAL_REPAYMENT = d1Var3;
        d1 d1Var4 = new d1("OVERDUE_REPAYMENT", 3);
        OVERDUE_REPAYMENT = d1Var4;
        d1 d1Var5 = new d1("OUTSTANDING_PARTIAL_REPAYMENT", 4);
        OUTSTANDING_PARTIAL_REPAYMENT = d1Var5;
        d1 d1Var6 = new d1("PENALTY_REPAYMENT", 5);
        PENALTY_REPAYMENT = d1Var6;
        d1[] d1VarArr = {d1Var, d1Var2, d1Var3, d1Var4, d1Var5, d1Var6};
        $VALUES = d1VarArr;
        $ENTRIES = vc.s.n(d1VarArr);
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
