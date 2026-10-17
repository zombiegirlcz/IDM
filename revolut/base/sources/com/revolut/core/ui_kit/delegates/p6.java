package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p6[] $VALUES;
    public static final p6 EMPHASIS1;
    public static final p6 HEADING2;
    private final int textAppearanceAttr;

    static {
        p6 p6Var = new p6("EMPHASIS1", 0, R$attr.internal_textAppearanceEmphasis1);
        EMPHASIS1 = p6Var;
        p6 p6Var2 = new p6("HEADING2", 1, R$attr.internal_textAppearanceHeading2);
        HEADING2 = p6Var2;
        p6[] p6VarArr = {p6Var, p6Var2};
        $VALUES = p6VarArr;
        $ENTRIES = vc.s.n(p6VarArr);
    }

    public p6(String str, int i, int i2) {
        this.textAppearanceAttr = i2;
    }

    public static p6 valueOf(String str) {
        return (p6) Enum.valueOf(p6.class, str);
    }

    public static p6[] values() {
        return (p6[]) $VALUES.clone();
    }

    public final int a() {
        return this.textAppearanceAttr;
    }
}
