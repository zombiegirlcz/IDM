package zz9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w FOOTER;
    public static final w NEGATIVE;
    public static final w POSITIVE;

    static {
        w wVar = new w("FOOTER", 0);
        FOOTER = wVar;
        w wVar2 = new w("POSITIVE", 1);
        POSITIVE = wVar2;
        w wVar3 = new w("NEGATIVE", 2);
        NEGATIVE = wVar3;
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
