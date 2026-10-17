package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class x9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x9[] $VALUES;
    public static final x9 DP_24;
    public static final x9 DP_40;
    public static final x9 DP_56;

    static {
        x9 x9Var = new x9("DP_24", 0);
        DP_24 = x9Var;
        x9 x9Var2 = new x9("DP_40", 1);
        DP_40 = x9Var2;
        x9 x9Var3 = new x9("DP_56", 2);
        DP_56 = x9Var3;
        x9[] x9VarArr = {x9Var, x9Var2, x9Var3};
        $VALUES = x9VarArr;
        $ENTRIES = vc.s.n(x9VarArr);
    }

    public static x9 valueOf(String str) {
        return (x9) Enum.valueOf(x9.class, str);
    }

    public static x9[] values() {
        return (x9[]) $VALUES.clone();
    }
}
