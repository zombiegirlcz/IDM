package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a1[] $VALUES;
    public static final a1 CORE_LEDGER;
    public static final a1 EXCHANGE_LEDGER;

    static {
        a1 a1Var = new a1("CORE_LEDGER", 0);
        CORE_LEDGER = a1Var;
        a1 a1Var2 = new a1("EXCHANGE_LEDGER", 1);
        EXCHANGE_LEDGER = a1Var2;
        a1[] a1VarArr = {a1Var, a1Var2};
        $VALUES = a1VarArr;
        $ENTRIES = vc.s.n(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) $VALUES.clone();
    }
}
