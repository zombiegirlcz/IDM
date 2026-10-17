package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 CRITICAL;
    public static final d1 HEALTHY;
    public static final d1 WARNING;

    static {
        d1 d1Var = new d1("HEALTHY", 0);
        HEALTHY = d1Var;
        d1 d1Var2 = new d1("WARNING", 1);
        WARNING = d1Var2;
        d1 d1Var3 = new d1("CRITICAL", 2);
        CRITICAL = d1Var3;
        d1[] d1VarArr = {d1Var, d1Var2, d1Var3};
        $VALUES = d1VarArr;
        $ENTRIES = vc.s.n(d1VarArr);
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
