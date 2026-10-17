package ylh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w ALL_TIME;
    public static final w CUSTOM;
    public static final w MONTH;
    public static final w TAX_YEAR;

    static {
        w wVar = new w("TAX_YEAR", 0);
        TAX_YEAR = wVar;
        w wVar2 = new w("CUSTOM", 1);
        CUSTOM = wVar2;
        w wVar3 = new w("MONTH", 2);
        MONTH = wVar3;
        w wVar4 = new w("ALL_TIME", 3);
        ALL_TIME = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
