package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 DISABLED;
    public static final h0 NORMAL;
    public static final h0 SELECTED;

    static {
        h0 h0Var = new h0("NORMAL", 0);
        NORMAL = h0Var;
        h0 h0Var2 = new h0("DISABLED", 1);
        DISABLED = h0Var2;
        h0 h0Var3 = new h0("SELECTED", 2);
        SELECTED = h0Var3;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
