package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r7[] $VALUES;
    public static final r7 MULTIPLE;
    public static final r7 SINGLE;

    static {
        r7 r7Var = new r7("MULTIPLE", 0);
        MULTIPLE = r7Var;
        r7 r7Var2 = new r7("SINGLE", 1);
        SINGLE = r7Var2;
        r7[] r7VarArr = {r7Var, r7Var2};
        $VALUES = r7VarArr;
        $ENTRIES = vc.s.n(r7VarArr);
    }

    public static r7 valueOf(String str) {
        return (r7) Enum.valueOf(r7.class, str);
    }

    public static r7[] values() {
        return (r7[]) $VALUES.clone();
    }
}
