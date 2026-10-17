package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ld {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ld[] $VALUES;
    public static final ld CAPTION;
    public static final ld PRIMARY;

    static {
        ld ldVar = new ld("PRIMARY", 0);
        PRIMARY = ldVar;
        ld ldVar2 = new ld("CAPTION", 1);
        CAPTION = ldVar2;
        ld[] ldVarArr = {ldVar, ldVar2};
        $VALUES = ldVarArr;
        $ENTRIES = vc.s.n(ldVarArr);
    }

    public static ld valueOf(String str) {
        return (ld) Enum.valueOf(ld.class, str);
    }

    public static ld[] values() {
        return (ld[]) $VALUES.clone();
    }
}
