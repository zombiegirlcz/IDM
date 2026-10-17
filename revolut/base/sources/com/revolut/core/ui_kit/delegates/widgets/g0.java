package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 PRIMARY;
    public static final g0 SECONDARY;
    public static final g0 SUCCESS;
    public static final g0 WARNING;
    private final int colorAttr;

    static {
        g0 g0Var = new g0("WARNING", 0, R$attr.uikit_colorStatusWarning);
        WARNING = g0Var;
        g0 g0Var2 = new g0("SUCCESS", 1, R$attr.uikit_colorStatusSuccess);
        SUCCESS = g0Var2;
        g0 g0Var3 = new g0("PRIMARY", 2, R$attr.uikit_colorForeground);
        PRIMARY = g0Var3;
        g0 g0Var4 = new g0("SECONDARY", 3, R$attr.uikit_colorGreyTone50);
        SECONDARY = g0Var4;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
    }

    public g0(String str, int i, int i2) {
        this.colorAttr = i2;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorAttr;
    }
}
