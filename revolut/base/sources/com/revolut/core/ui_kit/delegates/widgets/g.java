package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DEFAULT;
    public static final g REV_POINTS;
    public static final g REV_POINTS_LOCKED;

    static {
        g gVar = new g("REV_POINTS", 0);
        REV_POINTS = gVar;
        g gVar2 = new g("REV_POINTS_LOCKED", 1);
        REV_POINTS_LOCKED = gVar2;
        g gVar3 = new g("DEFAULT", 2);
        DEFAULT = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
