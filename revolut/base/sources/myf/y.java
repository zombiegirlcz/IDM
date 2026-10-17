package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y CANCELLATION;
    public static final y CATEGORY;

    static {
        y yVar = new y("CANCELLATION", 0);
        CANCELLATION = yVar;
        y yVar2 = new y("CATEGORY", 1);
        CATEGORY = yVar2;
        y[] yVarArr = {yVar, yVar2};
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
