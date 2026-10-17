package com.revolut.core.ui_kit.delegates;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ff {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ff[] $VALUES;
    public static final ff DP_24;
    public static final ff DP_40;

    static {
        ff ffVar = new ff("DP_24", 0);
        DP_24 = ffVar;
        ff ffVar2 = new ff("DP_40", 1);
        DP_40 = ffVar2;
        ff[] ffVarArr = {ffVar, ffVar2};
        $VALUES = ffVarArr;
        $ENTRIES = vc.s.n(ffVarArr);
    }

    public static ff valueOf(String str) {
        return (ff) Enum.valueOf(ff.class, str);
    }

    public static ff[] values() {
        return (ff[]) $VALUES.clone();
    }
}
