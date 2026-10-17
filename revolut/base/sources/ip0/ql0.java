package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ql0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ql0[] $VALUES;
    public static final ql0 CONTENT;
    public static final ql0 TRANSACTION;

    static {
        ql0 ql0Var = new ql0("TRANSACTION", 0);
        TRANSACTION = ql0Var;
        ql0 ql0Var2 = new ql0("CONTENT", 1);
        CONTENT = ql0Var2;
        ql0[] ql0VarArr = {ql0Var, ql0Var2};
        $VALUES = ql0VarArr;
        $ENTRIES = vc.s.n(ql0VarArr);
    }

    public static ql0 valueOf(String str) {
        return (ql0) Enum.valueOf(ql0.class, str);
    }

    public static ql0[] values() {
        return (ql0[]) $VALUES.clone();
    }
}
