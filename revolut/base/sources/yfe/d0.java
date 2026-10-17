package yfe;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 CC;
    public static final d0 CC_LOAN_MORTGAGE;
    public static final d0 DEFAULT;
    public static final d0 LOAN;

    static {
        d0 d0Var = new d0("CC_LOAN_MORTGAGE", 0);
        CC_LOAN_MORTGAGE = d0Var;
        d0 d0Var2 = new d0("DEFAULT", 1);
        DEFAULT = d0Var2;
        d0 d0Var3 = new d0("CC", 2);
        CC = d0Var3;
        d0 d0Var4 = new d0("LOAN", 3);
        LOAN = d0Var4;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4};
        $VALUES = d0VarArr;
        $ENTRIES = vc.s.n(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
