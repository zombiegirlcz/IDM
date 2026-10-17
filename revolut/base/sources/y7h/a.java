package y7h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALL;
    public static final a FIVE_YEAR;
    public static final a ONE_DAY;
    public static final a ONE_MONTH;
    public static final a ONE_WEEK;
    public static final a ONE_YEAR;
    public static final a SIX_MONTHS;
    public static final a TEN_YEARS;

    @NotNull
    private final String value;

    static {
        a aVar = new a("ONE_DAY", 0, "1D");
        ONE_DAY = aVar;
        a aVar2 = new a("ONE_WEEK", 1, "1W");
        ONE_WEEK = aVar2;
        a aVar3 = new a("ONE_MONTH", 2, "1M");
        ONE_MONTH = aVar3;
        a aVar4 = new a("SIX_MONTHS", 3, "6M");
        SIX_MONTHS = aVar4;
        a aVar5 = new a("ONE_YEAR", 4, "1Y");
        ONE_YEAR = aVar5;
        a aVar6 = new a("FIVE_YEAR", 5, "5Y");
        FIVE_YEAR = aVar6;
        a aVar7 = new a("TEN_YEARS", 6, "10Y");
        TEN_YEARS = aVar7;
        a aVar8 = new a("ALL", 7, "MAX");
        ALL = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
