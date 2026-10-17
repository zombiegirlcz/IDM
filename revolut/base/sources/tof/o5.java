package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class o5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o5[] $VALUES;
    public static final o5 CHARGEBACK;
    public static final o5 CHARGEBACK_REVERSAL;
    public static final o5 CREDIT_REIMBURSEMENT;
    public static final o5 PAYMENT;
    public static final o5 PAYMENT_REQUEST;
    public static final o5 REFUND;
    public static final o5 UNKNOWN;

    static {
        o5 o5Var = new o5("PAYMENT", 0);
        PAYMENT = o5Var;
        o5 o5Var2 = new o5("PAYMENT_REQUEST", 1);
        PAYMENT_REQUEST = o5Var2;
        o5 o5Var3 = new o5("REFUND", 2);
        REFUND = o5Var3;
        o5 o5Var4 = new o5("CHARGEBACK", 3);
        CHARGEBACK = o5Var4;
        o5 o5Var5 = new o5("CHARGEBACK_REVERSAL", 4);
        CHARGEBACK_REVERSAL = o5Var5;
        o5 o5Var6 = new o5("CREDIT_REIMBURSEMENT", 5);
        CREDIT_REIMBURSEMENT = o5Var6;
        o5 o5Var7 = new o5("UNKNOWN", 6);
        UNKNOWN = o5Var7;
        o5[] o5VarArr = {o5Var, o5Var2, o5Var3, o5Var4, o5Var5, o5Var6, o5Var7};
        $VALUES = o5VarArr;
        $ENTRIES = vc.s.n(o5VarArr);
    }

    public static o5 valueOf(String str) {
        return (o5) Enum.valueOf(o5.class, str);
    }

    public static o5[] values() {
        return (o5[]) $VALUES.clone();
    }
}
