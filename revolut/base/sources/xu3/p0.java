package xu3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 DOCUMENTS;
    public static final p0 LINKED_ACCOUNTS;
    public static final p0 REVOLUT_TRANSACTIONS;

    static {
        p0 p0Var = new p0("LINKED_ACCOUNTS", 0);
        LINKED_ACCOUNTS = p0Var;
        p0 p0Var2 = new p0("DOCUMENTS", 1);
        DOCUMENTS = p0Var2;
        p0 p0Var3 = new p0("REVOLUT_TRANSACTIONS", 2);
        REVOLUT_TRANSACTIONS = p0Var3;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }
}
