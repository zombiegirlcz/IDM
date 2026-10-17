package hha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 EMPLOYEE_DISCOUNT;
    public static final h0 MINIMUM_BALANCE;
    public static final h0 PARTNER_SALARY_DISCOUNT;
    public static final h0 PLAN_REFERRAL;
    public static final h0 SALARY_HUB_DISCOUNT;

    static {
        h0 h0Var = new h0("EMPLOYEE_DISCOUNT", 0);
        EMPLOYEE_DISCOUNT = h0Var;
        h0 h0Var2 = new h0("PARTNER_SALARY_DISCOUNT", 1);
        PARTNER_SALARY_DISCOUNT = h0Var2;
        h0 h0Var3 = new h0("SALARY_HUB_DISCOUNT", 2);
        SALARY_HUB_DISCOUNT = h0Var3;
        h0 h0Var4 = new h0("PLAN_REFERRAL", 3);
        PLAN_REFERRAL = h0Var4;
        h0 h0Var5 = new h0("MINIMUM_BALANCE", 4);
        MINIMUM_BALANCE = h0Var5;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4, h0Var5};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
