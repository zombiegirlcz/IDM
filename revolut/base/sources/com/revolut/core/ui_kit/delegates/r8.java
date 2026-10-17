package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r8 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r8[] $VALUES;
    public static final r8 FillCrop;
    public static final r8 FitTopAlignToTitle;

    static {
        r8 r8Var = new r8("FillCrop", 0);
        FillCrop = r8Var;
        r8 r8Var2 = new r8("FitTopAlignToTitle", 1);
        FitTopAlignToTitle = r8Var2;
        r8[] r8VarArr = {r8Var, r8Var2};
        $VALUES = r8VarArr;
        $ENTRIES = vc.s.n(r8VarArr);
    }

    public static r8 valueOf(String str) {
        return (r8) Enum.valueOf(r8.class, str);
    }

    public static r8[] values() {
        return (r8[]) $VALUES.clone();
    }
}
