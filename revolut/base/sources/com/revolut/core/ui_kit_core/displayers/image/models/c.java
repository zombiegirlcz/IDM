package com.revolut.core.ui_kit_core.displayers.image.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CENTER;
    public static final c CENTER_CROP;
    public static final c CENTER_INSIDE;
    public static final c FIT_WIDTH_TOP;

    static {
        c cVar = new c("CENTER", 0);
        CENTER = cVar;
        c cVar2 = new c("CENTER_INSIDE", 1);
        CENTER_INSIDE = cVar2;
        c cVar3 = new c("CENTER_CROP", 2);
        CENTER_CROP = cVar3;
        c cVar4 = new c("FIT_WIDTH_TOP", 3);
        FIT_WIDTH_TOP = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
