package com.revolut.core.ui_kit.models;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 DATETIME;
    public static final q0 DATETIME_WITH_SECONDS;
    public static final q0 ONLY_DATE;
    public static final q0 ONLY_DATE_FULL_MONTH;
    public static final q0 ONLY_TIME;

    static {
        q0 q0Var = new q0("DATETIME", 0);
        DATETIME = q0Var;
        q0 q0Var2 = new q0("ONLY_DATE", 1);
        ONLY_DATE = q0Var2;
        q0 q0Var3 = new q0("ONLY_DATE_FULL_MONTH", 2);
        ONLY_DATE_FULL_MONTH = q0Var3;
        q0 q0Var4 = new q0("ONLY_TIME", 3);
        ONLY_TIME = q0Var4;
        q0 q0Var5 = new q0("DATETIME_WITH_SECONDS", 4);
        DATETIME_WITH_SECONDS = q0Var5;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, q0Var5};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
