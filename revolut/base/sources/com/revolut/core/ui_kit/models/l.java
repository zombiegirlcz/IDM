package com.revolut.core.ui_kit.models;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CONTEXTUAL;
    public static final l INVERTED_PRIMARY;
    public static final l PRIMARY_NEUTRAL;
    public static final l WHITE_OR_BLACK_INVERTED;

    static {
        l lVar = new l("CONTEXTUAL", 0);
        CONTEXTUAL = lVar;
        l lVar2 = new l("INVERTED_PRIMARY", 1);
        INVERTED_PRIMARY = lVar2;
        l lVar3 = new l("PRIMARY_NEUTRAL", 2);
        PRIMARY_NEUTRAL = lVar3;
        l lVar4 = new l("WHITE_OR_BLACK_INVERTED", 3);
        WHITE_OR_BLACK_INVERTED = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
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
