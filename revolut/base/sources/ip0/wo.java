package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class wo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ wo[] $VALUES;
    public static final wo LANDSCAPE;
    public static final wo PORTRAIT;
    public static final wo SQUARE;

    static {
        wo woVar = new wo("PORTRAIT", 0);
        PORTRAIT = woVar;
        wo woVar2 = new wo("SQUARE", 1);
        SQUARE = woVar2;
        wo woVar3 = new wo("LANDSCAPE", 2);
        LANDSCAPE = woVar3;
        wo[] woVarArr = {woVar, woVar2, woVar3};
        $VALUES = woVarArr;
        $ENTRIES = vc.s.n(woVarArr);
    }

    public static wo valueOf(String str) {
        return (wo) Enum.valueOf(wo.class, str);
    }

    public static wo[] values() {
        return (wo[]) $VALUES.clone();
    }
}
