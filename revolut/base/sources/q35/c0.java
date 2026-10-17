package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 DIRECT_DEBIT;
    public static final c0 EXTERNAL_ACCOUNT;
    public static final c0 LOAN_REPAYMENTS_POCKET;
    public static final c0 REFINANCING;
    public static final c0 WALLET;
    public static final c0 WRITE_OFF;

    static {
        c0 c0Var = new c0("WALLET", 0);
        WALLET = c0Var;
        c0 c0Var2 = new c0("DIRECT_DEBIT", 1);
        DIRECT_DEBIT = c0Var2;
        c0 c0Var3 = new c0("EXTERNAL_ACCOUNT", 2);
        EXTERNAL_ACCOUNT = c0Var3;
        c0 c0Var4 = new c0("LOAN_REPAYMENTS_POCKET", 3);
        LOAN_REPAYMENTS_POCKET = c0Var4;
        c0 c0Var5 = new c0("REFINANCING", 4);
        REFINANCING = c0Var5;
        c0 c0Var6 = new c0("WRITE_OFF", 5);
        WRITE_OFF = c0Var6;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
