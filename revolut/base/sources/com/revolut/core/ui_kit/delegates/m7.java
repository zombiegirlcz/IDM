package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class m7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m7[] $VALUES;
    public static final m7 CENTER;
    public static final m7 START;

    static {
        m7 m7Var = new m7("START", 0);
        START = m7Var;
        m7 m7Var2 = new m7("CENTER", 1);
        CENTER = m7Var2;
        m7[] m7VarArr = {m7Var, m7Var2};
        $VALUES = m7VarArr;
        $ENTRIES = vc.s.n(m7VarArr);
    }

    public static m7 valueOf(String str) {
        return (m7) Enum.valueOf(m7.class, str);
    }

    public static m7[] values() {
        return (m7[]) $VALUES.clone();
    }
}
