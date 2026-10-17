package hs3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 POP_UP;
    public static final j1 REJECTED_DETAILED;

    static {
        j1 j1Var = new j1("POP_UP", 0);
        POP_UP = j1Var;
        j1 j1Var2 = new j1("REJECTED_DETAILED", 1);
        REJECTED_DETAILED = j1Var2;
        j1[] j1VarArr = {j1Var, j1Var2};
        $VALUES = j1VarArr;
        $ENTRIES = vc.s.n(j1VarArr);
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
