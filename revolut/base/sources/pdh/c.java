package pdh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALL;
    public static final c FIVE_YEARS;
    public static final c ONE_DAY;
    public static final c ONE_MONTH;
    public static final c ONE_WEEK;
    public static final c ONE_YEAR;
    public static final c SIX_MONTHS;
    public static final c TEN_YEARS;
    public static final c THREE_YEARS;
    public static final c YEAR_TO_DATE;

    static {
        c cVar = new c("ONE_DAY", 0);
        ONE_DAY = cVar;
        c cVar2 = new c("ONE_WEEK", 1);
        ONE_WEEK = cVar2;
        c cVar3 = new c("ONE_MONTH", 2);
        ONE_MONTH = cVar3;
        c cVar4 = new c("SIX_MONTHS", 3);
        SIX_MONTHS = cVar4;
        c cVar5 = new c("YEAR_TO_DATE", 4);
        YEAR_TO_DATE = cVar5;
        c cVar6 = new c("ONE_YEAR", 5);
        ONE_YEAR = cVar6;
        c cVar7 = new c("THREE_YEARS", 6);
        THREE_YEARS = cVar7;
        c cVar8 = new c("FIVE_YEARS", 7);
        FIVE_YEARS = cVar8;
        c cVar9 = new c("TEN_YEARS", 8);
        TEN_YEARS = cVar9;
        c cVar10 = new c("ALL", 9);
        ALL = cVar10;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
