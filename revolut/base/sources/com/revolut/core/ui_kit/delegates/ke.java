package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ke {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ke[] $VALUES;
    public static final ke MATCH_PARENT;
    public static final ke WRAP_CONTENT;

    static {
        ke keVar = new ke("WRAP_CONTENT", 0);
        WRAP_CONTENT = keVar;
        ke keVar2 = new ke("MATCH_PARENT", 1);
        MATCH_PARENT = keVar2;
        ke[] keVarArr = {keVar, keVar2};
        $VALUES = keVarArr;
        $ENTRIES = vc.s.n(keVarArr);
    }

    public static ke valueOf(String str) {
        return (ke) Enum.valueOf(ke.class, str);
    }

    public static ke[] values() {
        return (ke[]) $VALUES.clone();
    }
}
