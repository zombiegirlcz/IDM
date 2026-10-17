package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 ADDRESS_CHANGE;
    public static final e0 ADDRESS_NOT_SUPPORTED;
    public static final e0 PAYMENT_OVERDUE;
    public static final e0 PET_PLAN_RENEWAL;
    public static final e0 PET_PLAN_RENEWAL_OPTED_OUT;
    public static final e0 PURCHASE_REMINDER;

    static {
        e0 e0Var = new e0("PAYMENT_OVERDUE", 0);
        PAYMENT_OVERDUE = e0Var;
        e0 e0Var2 = new e0("ADDRESS_CHANGE", 1);
        ADDRESS_CHANGE = e0Var2;
        e0 e0Var3 = new e0("ADDRESS_NOT_SUPPORTED", 2);
        ADDRESS_NOT_SUPPORTED = e0Var3;
        e0 e0Var4 = new e0("PURCHASE_REMINDER", 3);
        PURCHASE_REMINDER = e0Var4;
        e0 e0Var5 = new e0("PET_PLAN_RENEWAL", 4);
        PET_PLAN_RENEWAL = e0Var5;
        e0 e0Var6 = new e0("PET_PLAN_RENEWAL_OPTED_OUT", 5);
        PET_PLAN_RENEWAL_OPTED_OUT = e0Var6;
        e0[] e0VarArr = {e0Var, e0Var2, e0Var3, e0Var4, e0Var5, e0Var6};
        $VALUES = e0VarArr;
        $ENTRIES = vc.s.n(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
