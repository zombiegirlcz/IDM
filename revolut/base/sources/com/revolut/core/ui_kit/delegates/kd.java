package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class kd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ kd[] $VALUES;
    public static final kd DEFAULT;
    public static final kd HIGH_CONTRAST;

    static {
        kd kdVar = new kd("DEFAULT", 0);
        DEFAULT = kdVar;
        kd kdVar2 = new kd("HIGH_CONTRAST", 1);
        HIGH_CONTRAST = kdVar2;
        kd[] kdVarArr = {kdVar, kdVar2};
        $VALUES = kdVarArr;
        $ENTRIES = vc.s.n(kdVarArr);
    }

    public static kd valueOf(String str) {
        return (kd) Enum.valueOf(kd.class, str);
    }

    public static kd[] values() {
        return (kd[]) $VALUES.clone();
    }
}
