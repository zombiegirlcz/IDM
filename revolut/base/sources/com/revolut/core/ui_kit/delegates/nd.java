package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class nd {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ nd[] $VALUES;
    public static final nd LINEAR_REVEAL;

    static {
        nd ndVar = new nd("LINEAR_REVEAL", 0);
        LINEAR_REVEAL = ndVar;
        nd[] ndVarArr = {ndVar};
        $VALUES = ndVarArr;
        $ENTRIES = vc.s.n(ndVarArr);
    }

    public static nd valueOf(String str) {
        return (nd) Enum.valueOf(nd.class, str);
    }

    public static nd[] values() {
        return (nd[]) $VALUES.clone();
    }
}
