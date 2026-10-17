package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w7[] $VALUES;
    public static final w7 MEDIUM;
    public static final w7 SMALL;

    static {
        w7 w7Var = new w7("SMALL", 0);
        SMALL = w7Var;
        w7 w7Var2 = new w7("MEDIUM", 1);
        MEDIUM = w7Var2;
        w7[] w7VarArr = {w7Var, w7Var2};
        $VALUES = w7VarArr;
        $ENTRIES = vc.s.n(w7VarArr);
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) $VALUES.clone();
    }
}
