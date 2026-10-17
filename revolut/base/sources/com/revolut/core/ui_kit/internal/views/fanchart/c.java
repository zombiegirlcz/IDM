package com.revolut.core.ui_kit.internal.views.fanchart;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INCREASE;
    public static final c NEUTRAL;
    public static final c REDUCTION;

    static {
        c cVar = new c("INCREASE", 0);
        INCREASE = cVar;
        c cVar2 = new c("REDUCTION", 1);
        REDUCTION = cVar2;
        c cVar3 = new c("NEUTRAL", 2);
        NEUTRAL = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
