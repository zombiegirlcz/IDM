package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y ALREADY_OWNED;
    public static final y SOLD_OUT;
    public static final y UNKNOWN;

    static {
        y yVar = new y("SOLD_OUT", 0);
        SOLD_OUT = yVar;
        y yVar2 = new y("ALREADY_OWNED", 1);
        ALREADY_OWNED = yVar2;
        y yVar3 = new y("UNKNOWN", 2);
        UNKNOWN = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
