package wxd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y CURRENT_DATE;
    public static final y CURRENT_MONTH;
    public static final y CURRENT_YEAR;
    public static final y PREVIOUS_MONTH;

    static {
        y yVar = new y("CURRENT_DATE", 0);
        CURRENT_DATE = yVar;
        y yVar2 = new y("PREVIOUS_MONTH", 1);
        PREVIOUS_MONTH = yVar2;
        y yVar3 = new y("CURRENT_MONTH", 2);
        CURRENT_MONTH = yVar3;
        y yVar4 = new y("CURRENT_YEAR", 3);
        CURRENT_YEAR = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
