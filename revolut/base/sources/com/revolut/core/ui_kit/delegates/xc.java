package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class xc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ xc[] $VALUES;
    public static final xc HORIZONTAL;
    public static final xc VERTICAL;

    static {
        xc xcVar = new xc("VERTICAL", 0);
        VERTICAL = xcVar;
        xc xcVar2 = new xc("HORIZONTAL", 1);
        HORIZONTAL = xcVar2;
        xc[] xcVarArr = {xcVar, xcVar2};
        $VALUES = xcVarArr;
        $ENTRIES = vc.s.n(xcVarArr);
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) $VALUES.clone();
    }
}
