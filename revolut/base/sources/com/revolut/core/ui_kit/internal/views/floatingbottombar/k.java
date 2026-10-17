package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CONTENT;
    public static final k CONTENT_AND_EXPAND;
    public static final k EXPAND;

    static {
        k kVar = new k("CONTENT", 0);
        CONTENT = kVar;
        k kVar2 = new k("EXPAND", 1);
        EXPAND = kVar2;
        k kVar3 = new k("CONTENT_AND_EXPAND", 2);
        CONTENT_AND_EXPAND = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
