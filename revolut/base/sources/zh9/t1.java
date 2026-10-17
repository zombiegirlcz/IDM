package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 InsufficientFundsCurrentBalance;
    public static final t1 MaxPurchaseLessThanMin;
    public static final t1 NotAvailable;
    public static final t1 PurchaseBiggerThanMax;
    public static final t1 PurchaseLessThanMin;

    static {
        t1 t1Var = new t1("NotAvailable", 0);
        NotAvailable = t1Var;
        t1 t1Var2 = new t1("MaxPurchaseLessThanMin", 1);
        MaxPurchaseLessThanMin = t1Var2;
        t1 t1Var3 = new t1("PurchaseLessThanMin", 2);
        PurchaseLessThanMin = t1Var3;
        t1 t1Var4 = new t1("PurchaseBiggerThanMax", 3);
        PurchaseBiggerThanMax = t1Var4;
        t1 t1Var5 = new t1("InsufficientFundsCurrentBalance", 4);
        InsufficientFundsCurrentBalance = t1Var5;
        t1[] t1VarArr = {t1Var, t1Var2, t1Var3, t1Var4, t1Var5};
        $VALUES = t1VarArr;
        $ENTRIES = vc.s.n(t1VarArr);
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}
