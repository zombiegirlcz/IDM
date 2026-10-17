package ggc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w DIGITAL;
    public static final w PHYSICAL;
    public static final w UNKNOWN;

    static {
        w wVar = new w("DIGITAL", 0);
        DIGITAL = wVar;
        w wVar2 = new w("PHYSICAL", 1);
        PHYSICAL = wVar2;
        w wVar3 = new w("UNKNOWN", 2);
        UNKNOWN = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
