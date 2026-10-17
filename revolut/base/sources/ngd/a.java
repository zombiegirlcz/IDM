package ngd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ONE_DAY;
    public static final a ONE_MONTH;
    public static final a ONE_WEEK;
    public static final a ONE_YEAR;
    public static final a SIX_MONTHS;
    public static final a THREE_MONTHS;

    static {
        a aVar = new a("ONE_DAY", 0);
        ONE_DAY = aVar;
        a aVar2 = new a("ONE_WEEK", 1);
        ONE_WEEK = aVar2;
        a aVar3 = new a("ONE_MONTH", 2);
        ONE_MONTH = aVar3;
        a aVar4 = new a("THREE_MONTHS", 3);
        THREE_MONTHS = aVar4;
        a aVar5 = new a("SIX_MONTHS", 4);
        SIX_MONTHS = aVar5;
        a aVar6 = new a("ONE_YEAR", 5);
        ONE_YEAR = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
