package m1i;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 BRL_UPPER_LIMIT_ERROR;
    public static final o0 BRL_USAGE_LIMIT_ERROR;
    public static final o0 CRYPTO_UPPER_LIMIT_ERROR;
    public static final o0 FEE_INFO;
    public static final o0 MX_BALANCE_LIMIT_ERROR;
    public static final o0 NOT_DEALABLE_CURRENCIES;
    public static final o0 RECURRING_ESTIMATED_INFO;

    static {
        o0 o0Var = new o0("CRYPTO_UPPER_LIMIT_ERROR", 0);
        CRYPTO_UPPER_LIMIT_ERROR = o0Var;
        o0 o0Var2 = new o0("RECURRING_ESTIMATED_INFO", 1);
        RECURRING_ESTIMATED_INFO = o0Var2;
        o0 o0Var3 = new o0("FEE_INFO", 2);
        FEE_INFO = o0Var3;
        o0 o0Var4 = new o0("BRL_USAGE_LIMIT_ERROR", 3);
        BRL_USAGE_LIMIT_ERROR = o0Var4;
        o0 o0Var5 = new o0("BRL_UPPER_LIMIT_ERROR", 4);
        BRL_UPPER_LIMIT_ERROR = o0Var5;
        o0 o0Var6 = new o0("MX_BALANCE_LIMIT_ERROR", 5);
        MX_BALANCE_LIMIT_ERROR = o0Var6;
        o0 o0Var7 = new o0("NOT_DEALABLE_CURRENCIES", 6);
        NOT_DEALABLE_CURRENCIES = o0Var7;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7};
        $VALUES = o0VarArr;
        $ENTRIES = vc.s.n(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
