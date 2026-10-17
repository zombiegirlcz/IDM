package com.revolut.core.ui_kit.views.navbar;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ACTIVE;
    public static final r ERROR;
    public static final r LOADING;

    static {
        r rVar = new r("ERROR", 0);
        ERROR = rVar;
        r rVar2 = new r("LOADING", 1);
        LOADING = rVar2;
        r rVar3 = new r("ACTIVE", 2);
        ACTIVE = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
