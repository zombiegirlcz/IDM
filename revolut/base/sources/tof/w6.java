package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class w6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w6[] $VALUES;
    public static final w6 CASH_DEPOSIT;
    public static final w6 CHEQUE_DEPOSIT;
    public static final w6 CRYPTO_WALLET;
    public static final w6 DIRECT_DEBIT;
    public static final w6 EXTERNAL_ACCOUNT;
    public static final w6 EXTERNAL_CARD;
    public static final w6 INVESTMENT_WALLET;
    public static final w6 OPEN_BANKING;

    static {
        w6 w6Var = new w6("CASH_DEPOSIT", 0);
        CASH_DEPOSIT = w6Var;
        w6 w6Var2 = new w6("CHEQUE_DEPOSIT", 1);
        CHEQUE_DEPOSIT = w6Var2;
        w6 w6Var3 = new w6("CRYPTO_WALLET", 2);
        CRYPTO_WALLET = w6Var3;
        w6 w6Var4 = new w6("DIRECT_DEBIT", 3);
        DIRECT_DEBIT = w6Var4;
        w6 w6Var5 = new w6("EXTERNAL_ACCOUNT", 4);
        EXTERNAL_ACCOUNT = w6Var5;
        w6 w6Var6 = new w6("EXTERNAL_CARD", 5);
        EXTERNAL_CARD = w6Var6;
        w6 w6Var7 = new w6("INVESTMENT_WALLET", 6);
        INVESTMENT_WALLET = w6Var7;
        w6 w6Var8 = new w6("OPEN_BANKING", 7);
        OPEN_BANKING = w6Var8;
        w6[] w6VarArr = {w6Var, w6Var2, w6Var3, w6Var4, w6Var5, w6Var6, w6Var7, w6Var8};
        $VALUES = w6VarArr;
        $ENTRIES = vc.s.n(w6VarArr);
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) $VALUES.clone();
    }
}
