package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ei {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ei[] $VALUES;
    public static final ei DARK;
    public static final ei LIGHT;
    public static final ei SYSTEM;

    static {
        ei eiVar = new ei("SYSTEM", 0);
        SYSTEM = eiVar;
        ei eiVar2 = new ei("DARK", 1);
        DARK = eiVar2;
        ei eiVar3 = new ei("LIGHT", 2);
        LIGHT = eiVar3;
        ei[] eiVarArr = {eiVar, eiVar2, eiVar3};
        $VALUES = eiVarArr;
        $ENTRIES = vc.s.n(eiVarArr);
    }

    public static ei valueOf(String str) {
        return (ei) Enum.valueOf(ei.class, str);
    }

    public static ei[] values() {
        return (ei[]) $VALUES.clone();
    }
}
