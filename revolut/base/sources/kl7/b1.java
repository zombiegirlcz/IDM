package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;
    public static final b1 PAYMENT;
    public static final b1 REFUND;

    static {
        b1 b1Var = new b1("PAYMENT", 0);
        PAYMENT = b1Var;
        b1 b1Var2 = new b1("REFUND", 1);
        REFUND = b1Var2;
        b1[] b1VarArr = {b1Var, b1Var2};
        $VALUES = b1VarArr;
        $ENTRIES = vc.s.n(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
