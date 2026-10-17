package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 ANNUAL_ONE_TIME_PAYMENT;
    public static final c1 MONTHLY_PRO_RATED_PAYMENT;
    public static final c1 TEMPORARY_MTA_FEE;

    static {
        c1 c1Var = new c1("ANNUAL_ONE_TIME_PAYMENT", 0);
        ANNUAL_ONE_TIME_PAYMENT = c1Var;
        c1 c1Var2 = new c1("MONTHLY_PRO_RATED_PAYMENT", 1);
        MONTHLY_PRO_RATED_PAYMENT = c1Var2;
        c1 c1Var3 = new c1("TEMPORARY_MTA_FEE", 2);
        TEMPORARY_MTA_FEE = c1Var3;
        c1[] c1VarArr = {c1Var, c1Var2, c1Var3};
        $VALUES = c1VarArr;
        $ENTRIES = vc.s.n(c1VarArr);
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
