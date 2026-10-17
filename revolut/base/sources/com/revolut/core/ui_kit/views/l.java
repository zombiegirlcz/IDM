package com.revolut.core.ui_kit.views;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l GONE;
    public static final l VISIBLE_DISABLED;
    public static final l VISIBLE_ENABLED;

    static {
        l lVar = new l("GONE", 0);
        GONE = lVar;
        l lVar2 = new l("VISIBLE_ENABLED", 1);
        VISIBLE_ENABLED = lVar2;
        l lVar3 = new l("VISIBLE_DISABLED", 2);
        VISIBLE_DISABLED = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
