package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class q8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q8[] $VALUES;
    public static final q8 AddNew;
    public static final q8 Default;

    static {
        q8 q8Var = new q8("Default", 0);
        Default = q8Var;
        q8 q8Var2 = new q8("AddNew", 1);
        AddNew = q8Var2;
        q8[] q8VarArr = {q8Var, q8Var2};
        $VALUES = q8VarArr;
        $ENTRIES = vc.s.n(q8VarArr);
    }

    public static q8 valueOf(String str) {
        return (q8) Enum.valueOf(q8.class, str);
    }

    public static q8[] values() {
        return (q8[]) $VALUES.clone();
    }
}
