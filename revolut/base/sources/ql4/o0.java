package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;
    public static final o0 CC_EXCEEDED_BALANCE_UTILIZATION;
    public static final o0 CC_EXCEEDED_MAX_TDPD;
    public static final o0 CC_HAS_ACTIVE_FORBEARANCE;
    public static final o0 CC_IS_DEACTIVATING;
    public static final o0 CC_IS_LATE;
    public static final o0 CURRENT_DATE_OUTSIDE_GRACE_PERIOD;
    public static final o0 CYCLE_IS_FULLY_REPAID;
    public static final o0 INSUFFICIENT_REMAINING_STATEMENT_BALANCE;
    public static final o0 UNKNOWN;

    static {
        o0 o0Var = new o0("CC_HAS_ACTIVE_FORBEARANCE", 0);
        CC_HAS_ACTIVE_FORBEARANCE = o0Var;
        o0 o0Var2 = new o0("CC_IS_LATE", 1);
        CC_IS_LATE = o0Var2;
        o0 o0Var3 = new o0("CC_EXCEEDED_MAX_TDPD", 2);
        CC_EXCEEDED_MAX_TDPD = o0Var3;
        o0 o0Var4 = new o0("CC_EXCEEDED_BALANCE_UTILIZATION", 3);
        CC_EXCEEDED_BALANCE_UTILIZATION = o0Var4;
        o0 o0Var5 = new o0("CC_IS_DEACTIVATING", 4);
        CC_IS_DEACTIVATING = o0Var5;
        o0 o0Var6 = new o0("CURRENT_DATE_OUTSIDE_GRACE_PERIOD", 5);
        CURRENT_DATE_OUTSIDE_GRACE_PERIOD = o0Var6;
        o0 o0Var7 = new o0("INSUFFICIENT_REMAINING_STATEMENT_BALANCE", 6);
        INSUFFICIENT_REMAINING_STATEMENT_BALANCE = o0Var7;
        o0 o0Var8 = new o0("CYCLE_IS_FULLY_REPAID", 7);
        CYCLE_IS_FULLY_REPAID = o0Var8;
        o0 o0Var9 = new o0("UNKNOWN", 8);
        UNKNOWN = o0Var9;
        o0[] o0VarArr = {o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9};
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
