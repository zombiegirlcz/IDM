package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 DEFAULT;
    public static final n1 LARGE;

    static {
        n1 n1Var = new n1("DEFAULT", 0);
        DEFAULT = n1Var;
        n1 n1Var2 = new n1("LARGE", 1);
        LARGE = n1Var2;
        n1[] n1VarArr = {n1Var, n1Var2};
        $VALUES = n1VarArr;
        $ENTRIES = vc.s.n(n1VarArr);
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }
}
