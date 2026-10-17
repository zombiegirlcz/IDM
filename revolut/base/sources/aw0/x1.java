package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class x1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x1[] $VALUES;
    public static final x1 MATCH_PARENT;
    public static final x1 REGULAR;
    public static final x1 TALL;

    static {
        x1 x1Var = new x1("REGULAR", 0);
        REGULAR = x1Var;
        x1 x1Var2 = new x1("TALL", 1);
        TALL = x1Var2;
        x1 x1Var3 = new x1("MATCH_PARENT", 2);
        MATCH_PARENT = x1Var3;
        x1[] x1VarArr = {x1Var, x1Var2, x1Var3};
        $VALUES = x1VarArr;
        $ENTRIES = vc.s.n(x1VarArr);
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) $VALUES.clone();
    }
}
