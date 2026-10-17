package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 CHARGEBACK;
    public static final l0 CHARGEBACK_REVERSAL;
    public static final l0 EXCHANGE;
    public static final l0 FEE;
    public static final l0 FEE_REVERSAL;
    public static final l0 PAYMENT;
    public static final l0 REFUND;
    public static final l0 REFUND_REVERSAL;
    public static final l0 RESERVE;
    public static final l0 REV_PAYMENT;
    public static final l0 REV_PAYMENT_REFUND;
    public static final l0 TRANSFER;

    static {
        l0 l0Var = new l0("CHARGEBACK", 0);
        CHARGEBACK = l0Var;
        l0 l0Var2 = new l0("CHARGEBACK_REVERSAL", 1);
        CHARGEBACK_REVERSAL = l0Var2;
        l0 l0Var3 = new l0("EXCHANGE", 2);
        EXCHANGE = l0Var3;
        l0 l0Var4 = new l0("FEE", 3);
        FEE = l0Var4;
        l0 l0Var5 = new l0("FEE_REVERSAL", 4);
        FEE_REVERSAL = l0Var5;
        l0 l0Var6 = new l0("PAYMENT", 5);
        PAYMENT = l0Var6;
        l0 l0Var7 = new l0("REFUND", 6);
        REFUND = l0Var7;
        l0 l0Var8 = new l0("REFUND_REVERSAL", 7);
        REFUND_REVERSAL = l0Var8;
        l0 l0Var9 = new l0("REV_PAYMENT", 8);
        REV_PAYMENT = l0Var9;
        l0 l0Var10 = new l0("REV_PAYMENT_REFUND", 9);
        REV_PAYMENT_REFUND = l0Var10;
        l0 l0Var11 = new l0("RESERVE", 10);
        RESERVE = l0Var11;
        l0 l0Var12 = new l0("TRANSFER", 11);
        TRANSFER = l0Var12;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8, l0Var9, l0Var10, l0Var11, l0Var12};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
