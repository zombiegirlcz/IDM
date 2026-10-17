package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class kf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ kf[] $VALUES;
    public static final kf MEDIUM;
    public static final kf SMALL;

    static {
        kf kfVar = new kf("SMALL", 0);
        SMALL = kfVar;
        kf kfVar2 = new kf("MEDIUM", 1);
        MEDIUM = kfVar2;
        kf[] kfVarArr = {kfVar, kfVar2};
        $VALUES = kfVarArr;
        $ENTRIES = vc.s.n(kfVarArr);
    }

    public static kf valueOf(String str) {
        return (kf) Enum.valueOf(kf.class, str);
    }

    public static kf[] values() {
        return (kf[]) $VALUES.clone();
    }
}
