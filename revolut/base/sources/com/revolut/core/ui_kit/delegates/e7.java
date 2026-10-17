package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e7[] $VALUES;
    public static final e7 MATCH_PARENT;
    public static final e7 WRAP_CONTENT;

    static {
        e7 e7Var = new e7("MATCH_PARENT", 0);
        MATCH_PARENT = e7Var;
        e7 e7Var2 = new e7("WRAP_CONTENT", 1);
        WRAP_CONTENT = e7Var2;
        e7[] e7VarArr = {e7Var, e7Var2};
        $VALUES = e7VarArr;
        $ENTRIES = vc.s.n(e7VarArr);
    }

    public static e7 valueOf(String str) {
        return (e7) Enum.valueOf(e7.class, str);
    }

    public static e7[] values() {
        return (e7[]) $VALUES.clone();
    }
}
