package dfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 FREE_STOCKS_REWARD;
    public static final a0 INVEST_WITHOUT_LOSSES_REIMBURSEMENT;
    public static final a0 REFERRAL_REWARD;
    public static final a0 REWARD;
    public static final a0 TRADING_PRO_FEE_REFUND;
    public static final a0 UNKNOWN;

    static {
        a0 a0Var = new a0("INVEST_WITHOUT_LOSSES_REIMBURSEMENT", 0);
        INVEST_WITHOUT_LOSSES_REIMBURSEMENT = a0Var;
        a0 a0Var2 = new a0("TRADING_PRO_FEE_REFUND", 1);
        TRADING_PRO_FEE_REFUND = a0Var2;
        a0 a0Var3 = new a0("REWARD", 2);
        REWARD = a0Var3;
        a0 a0Var4 = new a0("REFERRAL_REWARD", 3);
        REFERRAL_REWARD = a0Var4;
        a0 a0Var5 = new a0("FREE_STOCKS_REWARD", 4);
        FREE_STOCKS_REWARD = a0Var5;
        a0 a0Var6 = new a0("UNKNOWN", 5);
        UNKNOWN = a0Var6;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
