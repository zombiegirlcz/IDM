package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class sf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sf[] $VALUES;
    public static final sf CENTER;
    public static final sf TOP;

    static {
        sf sfVar = new sf("CENTER", 0);
        CENTER = sfVar;
        sf sfVar2 = new sf("TOP", 1);
        TOP = sfVar2;
        sf[] sfVarArr = {sfVar, sfVar2};
        $VALUES = sfVarArr;
        $ENTRIES = vc.s.n(sfVarArr);
    }

    public static sf valueOf(String str) {
        return (sf) Enum.valueOf(sf.class, str);
    }

    public static sf[] values() {
        return (sf[]) $VALUES.clone();
    }
}
