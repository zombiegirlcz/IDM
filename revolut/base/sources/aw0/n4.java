package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n4[] $VALUES;
    public static final n4 ASCENDING;
    public static final n4 DESCENDING;
    public static final n4 NO_SORT;

    static {
        n4 n4Var = new n4("ASCENDING", 0);
        ASCENDING = n4Var;
        n4 n4Var2 = new n4("DESCENDING", 1);
        DESCENDING = n4Var2;
        n4 n4Var3 = new n4("NO_SORT", 2);
        NO_SORT = n4Var3;
        n4[] n4VarArr = {n4Var, n4Var2, n4Var3};
        $VALUES = n4VarArr;
        $ENTRIES = vc.s.n(n4VarArr);
    }

    public static n4 valueOf(String str) {
        return (n4) Enum.valueOf(n4.class, str);
    }

    public static n4[] values() {
        return (n4[]) $VALUES.clone();
    }
}
