package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g2[] $VALUES;
    public static final g2 BOTTOM;
    public static final g2 CENTER;

    static {
        g2 g2Var = new g2("BOTTOM", 0);
        BOTTOM = g2Var;
        g2 g2Var2 = new g2("CENTER", 1);
        CENTER = g2Var2;
        g2[] g2VarArr = {g2Var, g2Var2};
        $VALUES = g2VarArr;
        $ENTRIES = vc.s.n(g2VarArr);
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) $VALUES.clone();
    }
}
