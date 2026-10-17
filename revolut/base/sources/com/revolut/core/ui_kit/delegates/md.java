package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class md {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ md[] $VALUES;
    public static final md ABOVE_BUTTONS;
    public static final md BELOW_BUTTONS;

    static {
        md mdVar = new md("ABOVE_BUTTONS", 0);
        ABOVE_BUTTONS = mdVar;
        md mdVar2 = new md("BELOW_BUTTONS", 1);
        BELOW_BUTTONS = mdVar2;
        md[] mdVarArr = {mdVar, mdVar2};
        $VALUES = mdVarArr;
        $ENTRIES = vc.s.n(mdVarArr);
    }

    public static md valueOf(String str) {
        return (md) Enum.valueOf(md.class, str);
    }

    public static md[] values() {
        return (md[]) $VALUES.clone();
    }
}
