package com.revolut.feature.shared.savings.models.product;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e EVERY_DAY;
    public static final e EVERY_MONTH;
    public static final e EVERY_WORKING_DAY;
    public static final e ONCE;
    public static final e UNKNOWN;

    static {
        e eVar = new e("EVERY_DAY", 0);
        EVERY_DAY = eVar;
        e eVar2 = new e("EVERY_WORKING_DAY", 1);
        EVERY_WORKING_DAY = eVar2;
        e eVar3 = new e("EVERY_MONTH", 2);
        EVERY_MONTH = eVar3;
        e eVar4 = new e("ONCE", 3);
        ONCE = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
