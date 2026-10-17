package com.revolut.core.ui_kit.models;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 DEFAULT;
    public static final n0 HIDE_CURRENT_YEAR;

    static {
        n0 n0Var = new n0("DEFAULT", 0);
        DEFAULT = n0Var;
        n0 n0Var2 = new n0("HIDE_CURRENT_YEAR", 1);
        HIDE_CURRENT_YEAR = n0Var2;
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
