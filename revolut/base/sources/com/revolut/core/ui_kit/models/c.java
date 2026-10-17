package com.revolut.core.ui_kit.models;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BL_TR;
    public static final c BOTTOM_TOP;
    public static final c BR_TL;
    public static final c LEFT_RIGHT;
    public static final c RIGHT_LEFT;
    public static final c TL_BR;
    public static final c TOP_BOTTOM;
    public static final c TR_BL;

    static {
        c cVar = new c("TL_BR", 0);
        TL_BR = cVar;
        c cVar2 = new c("TOP_BOTTOM", 1);
        TOP_BOTTOM = cVar2;
        c cVar3 = new c("TR_BL", 2);
        TR_BL = cVar3;
        c cVar4 = new c("RIGHT_LEFT", 3);
        RIGHT_LEFT = cVar4;
        c cVar5 = new c("BR_TL", 4);
        BR_TL = cVar5;
        c cVar6 = new c("BOTTOM_TOP", 5);
        BOTTOM_TOP = cVar6;
        c cVar7 = new c("BL_TR", 6);
        BL_TR = cVar7;
        c cVar8 = new c("LEFT_RIGHT", 7);
        LEFT_RIGHT = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
