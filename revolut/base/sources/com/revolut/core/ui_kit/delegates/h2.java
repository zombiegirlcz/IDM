package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class h2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h2[] $VALUES;
    public static final h2 END;
    public static final h2 START;

    static {
        h2 h2Var = new h2("START", 0);
        START = h2Var;
        h2 h2Var2 = new h2("END", 1);
        END = h2Var2;
        h2[] h2VarArr = {h2Var, h2Var2};
        $VALUES = h2VarArr;
        $ENTRIES = vc.s.n(h2VarArr);
    }

    public static h2 valueOf(String str) {
        return (h2) Enum.valueOf(h2.class, str);
    }

    public static h2[] values() {
        return (h2[]) $VALUES.clone();
    }
}
