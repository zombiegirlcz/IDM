package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s1[] $VALUES;
    public static final s1 CYAN;
    public static final s1 DEEP_PURPLE;
    public static final s1 GREEN;
    public static final s1 NESTED_BACKGROUND;
    public static final s1 ORANGE;
    public static final s1 PINK;
    public static final s1 RED;
    public static final s1 YELLOW;
    private final int colorValue;

    static {
        s1 s1Var = new s1("NESTED_BACKGROUND", 0, R$attr.uikit_colorNestedBackground);
        NESTED_BACKGROUND = s1Var;
        s1 s1Var2 = new s1("GREEN", 1, R$attr.uikit_colorGreen_20);
        GREEN = s1Var2;
        s1 s1Var3 = new s1("PINK", 2, R$attr.uikit_colorPink_20);
        PINK = s1Var3;
        s1 s1Var4 = new s1("ORANGE", 3, R$attr.uikit_colorOrange_20);
        ORANGE = s1Var4;
        s1 s1Var5 = new s1("CYAN", 4, R$attr.uikit_colorCyan_20);
        CYAN = s1Var5;
        s1 s1Var6 = new s1("YELLOW", 5, R$attr.uikit_colorYellow_20);
        YELLOW = s1Var6;
        s1 s1Var7 = new s1("DEEP_PURPLE", 6, R$attr.uikit_colorDeepPurple_20);
        DEEP_PURPLE = s1Var7;
        s1 s1Var8 = new s1("RED", 7, R$attr.uikit_colorRed_20);
        RED = s1Var8;
        s1[] s1VarArr = {s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8};
        $VALUES = s1VarArr;
        $ENTRIES = vc.s.n(s1VarArr);
    }

    public s1(String str, int i, int i2) {
        this.colorValue = i2;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorValue;
    }
}
