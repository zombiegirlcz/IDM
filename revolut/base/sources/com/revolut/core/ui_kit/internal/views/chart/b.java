package com.revolut.core.ui_kit.internal.views.chart;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NEGATIVE;
    public static final b NEUTRAL;
    public static final b POSITIVE;

    static {
        b bVar = new b("POSITIVE", 0);
        POSITIVE = bVar;
        b bVar2 = new b("NEGATIVE", 1);
        NEGATIVE = bVar2;
        b bVar3 = new b("NEUTRAL", 2);
        NEUTRAL = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
