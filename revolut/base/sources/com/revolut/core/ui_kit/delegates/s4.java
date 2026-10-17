package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s4[] $VALUES;
    public static final s4 AUTO_SIZE;
    public static final s4 FIXED_LARGE;
    public static final s4 FIXED_SMALL;

    static {
        s4 s4Var = new s4("AUTO_SIZE", 0);
        AUTO_SIZE = s4Var;
        s4 s4Var2 = new s4("FIXED_LARGE", 1);
        FIXED_LARGE = s4Var2;
        s4 s4Var3 = new s4("FIXED_SMALL", 2);
        FIXED_SMALL = s4Var3;
        s4[] s4VarArr = {s4Var, s4Var2, s4Var3};
        $VALUES = s4VarArr;
        $ENTRIES = vc.s.n(s4VarArr);
    }

    public static s4 valueOf(String str) {
        return (s4) Enum.valueOf(s4.class, str);
    }

    public static s4[] values() {
        return (s4[]) $VALUES.clone();
    }
}
