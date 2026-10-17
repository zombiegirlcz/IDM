package ggc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 CASHBACK;
    public static final d0 MERCHANT_REWARD;
    public static final d0 UNKNOWN;

    static {
        d0 d0Var = new d0("CASHBACK", 0);
        CASHBACK = d0Var;
        d0 d0Var2 = new d0("MERCHANT_REWARD", 1);
        MERCHANT_REWARD = d0Var2;
        d0 d0Var3 = new d0("UNKNOWN", 2);
        UNKNOWN = d0Var3;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3};
        $VALUES = d0VarArr;
        $ENTRIES = vc.s.n(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
