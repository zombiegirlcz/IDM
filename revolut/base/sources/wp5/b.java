package wp5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AmountFitsInLimits;
    public static final b DailyAddressLimitExceeded;
    public static final b DailyLimitExceeded;
    public static final b LowBalance;
    public static final b MonthlyAddressLimitExceeded;
    public static final b MonthlyLimitExceeded;

    static {
        b bVar = new b("DailyLimitExceeded", 0);
        DailyLimitExceeded = bVar;
        b bVar2 = new b("MonthlyLimitExceeded", 1);
        MonthlyLimitExceeded = bVar2;
        b bVar3 = new b("DailyAddressLimitExceeded", 2);
        DailyAddressLimitExceeded = bVar3;
        b bVar4 = new b("MonthlyAddressLimitExceeded", 3);
        MonthlyAddressLimitExceeded = bVar4;
        b bVar5 = new b("AmountFitsInLimits", 4);
        AmountFitsInLimits = bVar5;
        b bVar6 = new b("LowBalance", 5);
        LowBalance = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
