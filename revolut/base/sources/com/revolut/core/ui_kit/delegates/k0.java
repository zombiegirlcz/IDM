package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 ACTION_BACKGROUND_NEUTRAL;
    public static final k0 NESTED;
    private final int colorAttr;

    static {
        k0 k0Var = new k0("ACTION_BACKGROUND_NEUTRAL", 0, R$attr.uikit_colorActionBackgroundNeutral);
        ACTION_BACKGROUND_NEUTRAL = k0Var;
        k0 k0Var2 = new k0("NESTED", 1, R$attr.uikit_colorNestedBackground);
        NESTED = k0Var2;
        k0[] k0VarArr = {k0Var, k0Var2};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public k0(String str, int i, int i2) {
        this.colorAttr = i2;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorAttr;
    }
}
