package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CUSTOM;
    public static final k NEXT_TRADING_DAY;
    public static final k NINETY_DAYS;
    public static final k ONE_WEEK;
    public static final k SIX_MONTHS;
    public static final k TODAY;

    static {
        k kVar = new k("TODAY", 0);
        TODAY = kVar;
        k kVar2 = new k("NEXT_TRADING_DAY", 1);
        NEXT_TRADING_DAY = kVar2;
        k kVar3 = new k("ONE_WEEK", 2);
        ONE_WEEK = kVar3;
        k kVar4 = new k("NINETY_DAYS", 3);
        NINETY_DAYS = kVar4;
        k kVar5 = new k("SIX_MONTHS", 4);
        SIX_MONTHS = kVar5;
        k kVar6 = new k("CUSTOM", 5);
        CUSTOM = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
