package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 ADDRESS_NOT_SUPPORTED;
    public static final l1 NONE;
    public static final l1 PAYMENT_OVERDUE;

    static {
        l1 l1Var = new l1("NONE", 0);
        NONE = l1Var;
        l1 l1Var2 = new l1("PAYMENT_OVERDUE", 1);
        PAYMENT_OVERDUE = l1Var2;
        l1 l1Var3 = new l1("ADDRESS_NOT_SUPPORTED", 2);
        ADDRESS_NOT_SUPPORTED = l1Var3;
        l1[] l1VarArr = {l1Var, l1Var2, l1Var3};
        $VALUES = l1VarArr;
        $ENTRIES = vc.s.n(l1VarArr);
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
