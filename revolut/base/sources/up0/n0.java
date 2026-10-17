package up0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 FROM_BLACK_HOLE;
    public static final n0 TO_BLACK_HOLE;

    static {
        n0 n0Var = new n0("TO_BLACK_HOLE", 0);
        TO_BLACK_HOLE = n0Var;
        n0 n0Var2 = new n0("FROM_BLACK_HOLE", 1);
        FROM_BLACK_HOLE = n0Var2;
        n0[] n0VarArr = {n0Var, n0Var2};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
