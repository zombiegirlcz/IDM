package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class wa {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ wa[] $VALUES;
    public static final wa ACTIVE;
    public static final wa DANGER;
    public static final wa DEFAULT;
    public static final wa INACTIVE;
    public static final wa WARNING;

    static {
        wa waVar = new wa("DEFAULT", 0);
        DEFAULT = waVar;
        wa waVar2 = new wa("ACTIVE", 1);
        ACTIVE = waVar2;
        wa waVar3 = new wa("INACTIVE", 2);
        INACTIVE = waVar3;
        wa waVar4 = new wa("WARNING", 3);
        WARNING = waVar4;
        wa waVar5 = new wa("DANGER", 4);
        DANGER = waVar5;
        wa[] waVarArr = {waVar, waVar2, waVar3, waVar4, waVar5};
        $VALUES = waVarArr;
        $ENTRIES = vc.s.n(waVarArr);
    }

    public static wa valueOf(String str) {
        return (wa) Enum.valueOf(wa.class, str);
    }

    public static wa[] values() {
        return (wa[]) $VALUES.clone();
    }
}
