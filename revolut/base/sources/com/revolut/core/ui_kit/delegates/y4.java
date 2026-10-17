package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class y4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y4[] $VALUES;
    public static final y4 Large;
    public static final y4 Small;
    private final float sizeDp;

    static {
        y4 y4Var = new y4(56.0f, 0, "Small");
        Small = y4Var;
        y4 y4Var2 = new y4(72.0f, 1, "Large");
        Large = y4Var2;
        y4[] y4VarArr = {y4Var, y4Var2};
        $VALUES = y4VarArr;
        $ENTRIES = vc.s.n(y4VarArr);
    }

    public y4(float f, int i, String str) {
        this.sizeDp = f;
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) $VALUES.clone();
    }

    public final float a() {
        return this.sizeDp;
    }
}
