package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a6[] $VALUES;
    public static final a6 DEFAULT;
    public static final a6 SMALL;

    static {
        a6 a6Var = new a6("DEFAULT", 0);
        DEFAULT = a6Var;
        a6 a6Var2 = new a6("SMALL", 1);
        SMALL = a6Var2;
        a6[] a6VarArr = {a6Var, a6Var2};
        $VALUES = a6VarArr;
        $ENTRIES = vc.s.n(a6VarArr);
    }

    public static a6 valueOf(String str) {
        return (a6) Enum.valueOf(a6.class, str);
    }

    public static a6[] values() {
        return (a6[]) $VALUES.clone();
    }
}
