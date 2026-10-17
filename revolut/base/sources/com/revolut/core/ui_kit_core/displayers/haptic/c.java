package com.revolut.core.ui_kit_core.displayers.haptic;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DEEP;
    public static final c PULSE;
    public static final c SHORT;

    static {
        c cVar = new c("SHORT", 0);
        SHORT = cVar;
        c cVar2 = new c("PULSE", 1);
        PULSE = cVar2;
        c cVar3 = new c("DEEP", 2);
        DEEP = cVar3;
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
