package hw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w DASH;
    public static final w GRADIENT;
    public static final w HAIRLINE;
    public static final w HAIRLINE_DASH;

    static {
        w wVar = new w("DASH", 0);
        DASH = wVar;
        w wVar2 = new w("GRADIENT", 1);
        GRADIENT = wVar2;
        w wVar3 = new w("HAIRLINE", 2);
        HAIRLINE = wVar3;
        w wVar4 = new w("HAIRLINE_DASH", 3);
        HAIRLINE_DASH = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
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
