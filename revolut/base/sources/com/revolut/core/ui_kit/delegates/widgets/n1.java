package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n1[] $VALUES;
    public static final n1 Accent;
    public static final n1 Danger;
    public static final n1 Inactive;
    public static final n1 Success;
    public static final n1 Warning;
    private final int colorRes;

    static {
        n1 n1Var = new n1("Accent", 0, R$attr.uikit_colorAccent);
        Accent = n1Var;
        n1 n1Var2 = new n1("Danger", 1, R$attr.uikit_colorStatusDanger);
        Danger = n1Var2;
        n1 n1Var3 = new n1("Inactive", 2, R$attr.uikit_colorStatusInactive);
        Inactive = n1Var3;
        n1 n1Var4 = new n1("Success", 3, R$attr.uikit_colorStatusSuccess);
        Success = n1Var4;
        n1 n1Var5 = new n1("Warning", 4, R$attr.uikit_colorStatusWarning);
        Warning = n1Var5;
        n1[] n1VarArr = {n1Var, n1Var2, n1Var3, n1Var4, n1Var5};
        $VALUES = n1VarArr;
        $ENTRIES = vc.s.n(n1VarArr);
    }

    public n1(String str, int i, int i2) {
        this.colorRes = i2;
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) $VALUES.clone();
    }

    public final int a() {
        return this.colorRes;
    }
}
