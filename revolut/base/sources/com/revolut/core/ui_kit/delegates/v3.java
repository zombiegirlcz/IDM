package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class v3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v3[] $VALUES;
    public static final v3 SIZE_48;
    public static final v3 SIZE_56;

    static {
        v3 v3Var = new v3("SIZE_48", 0);
        SIZE_48 = v3Var;
        v3 v3Var2 = new v3("SIZE_56", 1);
        SIZE_56 = v3Var2;
        v3[] v3VarArr = {v3Var, v3Var2};
        $VALUES = v3VarArr;
        $ENTRIES = vc.s.n(v3VarArr);
    }

    public static v3 valueOf(String str) {
        return (v3) Enum.valueOf(v3.class, str);
    }

    public static v3[] values() {
        return (v3[]) $VALUES.clone();
    }
}
