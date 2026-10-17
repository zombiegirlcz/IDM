package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g8[] $VALUES;
    public static final g8 DEFAULT;
    public static final g8 SMALL;

    static {
        g8 g8Var = new g8("DEFAULT", 0);
        DEFAULT = g8Var;
        g8 g8Var2 = new g8("SMALL", 1);
        SMALL = g8Var2;
        g8[] g8VarArr = {g8Var, g8Var2};
        $VALUES = g8VarArr;
        $ENTRIES = vc.s.n(g8VarArr);
    }

    public static g8 valueOf(String str) {
        return (g8) Enum.valueOf(g8.class, str);
    }

    public static g8[] values() {
        return (g8[]) $VALUES.clone();
    }
}
