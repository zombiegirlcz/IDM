package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class w1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;
    public static final w1 CUSTOMER;
    public static final w1 MERCHANT;

    static {
        w1 w1Var = new w1("CUSTOMER", 0);
        CUSTOMER = w1Var;
        w1 w1Var2 = new w1("MERCHANT", 1);
        MERCHANT = w1Var2;
        w1[] w1VarArr = {w1Var, w1Var2};
        $VALUES = w1VarArr;
        $ENTRIES = vc.s.n(w1VarArr);
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }
}
