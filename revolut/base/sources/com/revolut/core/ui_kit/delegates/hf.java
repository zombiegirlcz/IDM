package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hf[] $VALUES;
    public static final hf ARROW_RIGHT;
    public static final hf ARROW_UP;

    static {
        hf hfVar = new hf("ARROW_RIGHT", 0);
        ARROW_RIGHT = hfVar;
        hf hfVar2 = new hf("ARROW_UP", 1);
        ARROW_UP = hfVar2;
        hf[] hfVarArr = {hfVar, hfVar2};
        $VALUES = hfVarArr;
        $ENTRIES = vc.s.n(hfVarArr);
    }

    public static hf valueOf(String str) {
        return (hf) Enum.valueOf(hf.class, str);
    }

    public static hf[] values() {
        return (hf[]) $VALUES.clone();
    }
}
