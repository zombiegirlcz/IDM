package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y FUND_INVESTMENT;
    public static final y MAJORITY;
    public static final y MINORITY;
    public static final y MIXED;

    static {
        y yVar = new y("MINORITY", 0);
        MINORITY = yVar;
        y yVar2 = new y("MAJORITY", 1);
        MAJORITY = yVar2;
        y yVar3 = new y("MIXED", 2);
        MIXED = yVar3;
        y yVar4 = new y("FUND_INVESTMENT", 3);
        FUND_INVESTMENT = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
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
