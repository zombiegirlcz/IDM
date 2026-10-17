package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hb {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hb[] $VALUES;
    public static final hb Fill;
    public static final hb Scrollable;

    static {
        hb hbVar = new hb("Scrollable", 0);
        Scrollable = hbVar;
        hb hbVar2 = new hb("Fill", 1);
        Fill = hbVar2;
        hb[] hbVarArr = {hbVar, hbVar2};
        $VALUES = hbVarArr;
        $ENTRIES = vc.s.n(hbVarArr);
    }

    public static hb valueOf(String str) {
        return (hb) Enum.valueOf(hb.class, str);
    }

    public static hb[] values() {
        return (hb[]) $VALUES.clone();
    }
}
