package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class r5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r5[] $VALUES;
    public static final r5 CHARGEBACK;
    public static final r5 CHARGEBACK_REVERSAL;
    public static final r5 CREDIT_REIMBURSEMENT;
    public static final r5 PAYMENT;
    public static final r5 REFUND;
    public static final r5 UNKNOWN;

    static {
        r5 r5Var = new r5("PAYMENT", 0);
        PAYMENT = r5Var;
        r5 r5Var2 = new r5("REFUND", 1);
        REFUND = r5Var2;
        r5 r5Var3 = new r5("CHARGEBACK", 2);
        CHARGEBACK = r5Var3;
        r5 r5Var4 = new r5("CHARGEBACK_REVERSAL", 3);
        CHARGEBACK_REVERSAL = r5Var4;
        r5 r5Var5 = new r5("CREDIT_REIMBURSEMENT", 4);
        CREDIT_REIMBURSEMENT = r5Var5;
        r5 r5Var6 = new r5("UNKNOWN", 5);
        UNKNOWN = r5Var6;
        r5[] r5VarArr = {r5Var, r5Var2, r5Var3, r5Var4, r5Var5, r5Var6};
        $VALUES = r5VarArr;
        $ENTRIES = vc.s.n(r5VarArr);
    }

    public static r5 valueOf(String str) {
        return (r5) Enum.valueOf(r5.class, str);
    }

    public static r5[] values() {
        return (r5[]) $VALUES.clone();
    }
}
