package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class of {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ of[] $VALUES;
    public static final of DEFAULT;
    public static final of SMALL;

    static {
        of ofVar = new of("DEFAULT", 0);
        DEFAULT = ofVar;
        of ofVar2 = new of("SMALL", 1);
        SMALL = ofVar2;
        of[] ofVarArr = {ofVar, ofVar2};
        $VALUES = ofVarArr;
        $ENTRIES = vc.s.n(ofVarArr);
    }

    public static of valueOf(String str) {
        return (of) Enum.valueOf(of.class, str);
    }

    public static of[] values() {
        return (of[]) $VALUES.clone();
    }
}
