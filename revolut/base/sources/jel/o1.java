package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class o1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 CALL_ACCUMULATING_RETURN;
    public static final o1 CAPITAL_PROTECTION_BARRIER;
    public static final o1 CAPITAL_PROTECTION_PERFORMANCE_BASIS;
    public static final o1 CAPITAL_PROTECTION_PROTECTED_AMOUNT;
    public static final o1 COUPON_RATE;
    public static final o1 FINAL_PAYOUT_LOSS_MULTIPLIER;
    public static final o1 FINAL_PAYOUT_PERFORMANCE_BASIS;
    public static final o1 FINAL_PAYOUT_PROFIT_MULTIPLIER;
    public static final o1 MAX_RETURN_PERCENT;
    public static final o1 NOTES_TERM;

    static {
        o1 o1Var = new o1("COUPON_RATE", 0);
        COUPON_RATE = o1Var;
        o1 o1Var2 = new o1("CALL_ACCUMULATING_RETURN", 1);
        CALL_ACCUMULATING_RETURN = o1Var2;
        o1 o1Var3 = new o1("MAX_RETURN_PERCENT", 2);
        MAX_RETURN_PERCENT = o1Var3;
        o1 o1Var4 = new o1("FINAL_PAYOUT_PROFIT_MULTIPLIER", 3);
        FINAL_PAYOUT_PROFIT_MULTIPLIER = o1Var4;
        o1 o1Var5 = new o1("CAPITAL_PROTECTION_PERFORMANCE_BASIS", 4);
        CAPITAL_PROTECTION_PERFORMANCE_BASIS = o1Var5;
        o1 o1Var6 = new o1("FINAL_PAYOUT_PERFORMANCE_BASIS", 5);
        FINAL_PAYOUT_PERFORMANCE_BASIS = o1Var6;
        o1 o1Var7 = new o1("CAPITAL_PROTECTION_BARRIER", 6);
        CAPITAL_PROTECTION_BARRIER = o1Var7;
        o1 o1Var8 = new o1("CAPITAL_PROTECTION_PROTECTED_AMOUNT", 7);
        CAPITAL_PROTECTION_PROTECTED_AMOUNT = o1Var8;
        o1 o1Var9 = new o1("FINAL_PAYOUT_LOSS_MULTIPLIER", 8);
        FINAL_PAYOUT_LOSS_MULTIPLIER = o1Var9;
        o1 o1Var10 = new o1("NOTES_TERM", 9);
        NOTES_TERM = o1Var10;
        o1[] o1VarArr = {o1Var, o1Var2, o1Var3, o1Var4, o1Var5, o1Var6, o1Var7, o1Var8, o1Var9, o1Var10};
        $VALUES = o1VarArr;
        $ENTRIES = vc.s.n(o1VarArr);
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }
}
