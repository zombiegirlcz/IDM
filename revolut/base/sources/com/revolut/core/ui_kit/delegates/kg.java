package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class kg {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ kg[] $VALUES;
    public static final kg LARGE;
    public static final kg SMALL;

    static {
        kg kgVar = new kg("SMALL", 0);
        SMALL = kgVar;
        kg kgVar2 = new kg("LARGE", 1);
        LARGE = kgVar2;
        kg[] kgVarArr = {kgVar, kgVar2};
        $VALUES = kgVarArr;
        $ENTRIES = vc.s.n(kgVarArr);
    }

    public static kg valueOf(String str) {
        return (kg) Enum.valueOf(kg.class, str);
    }

    public static kg[] values() {
        return (kg[]) $VALUES.clone();
    }
}
