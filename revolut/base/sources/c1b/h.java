package c1b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FIFTEEN_MINUTES;
    public static final h FIVE_MINUTES;
    public static final h FIVE_WEEKS;
    public static final h FOUR_DAYS;
    public static final h FOUR_HOURS;
    public static final h ONE_DAY;
    public static final h ONE_HOUR;
    public static final h ONE_MINUTE;
    public static final h ONE_MONTH;
    public static final h ONE_WEEK;
    public static final h TEN_MINUTES;
    public static final h THIRTY_MINUTES;
    public static final h TWELVE_HOURS;
    public static final h TWO_DAYS;
    public static final h TWO_MINUTES;

    static {
        h hVar = new h("ONE_MINUTE", 0);
        ONE_MINUTE = hVar;
        h hVar2 = new h("TWO_MINUTES", 1);
        TWO_MINUTES = hVar2;
        h hVar3 = new h("FIVE_MINUTES", 2);
        FIVE_MINUTES = hVar3;
        h hVar4 = new h("TEN_MINUTES", 3);
        TEN_MINUTES = hVar4;
        h hVar5 = new h("FIFTEEN_MINUTES", 4);
        FIFTEEN_MINUTES = hVar5;
        h hVar6 = new h("THIRTY_MINUTES", 5);
        THIRTY_MINUTES = hVar6;
        h hVar7 = new h("ONE_HOUR", 6);
        ONE_HOUR = hVar7;
        h hVar8 = new h("FOUR_HOURS", 7);
        FOUR_HOURS = hVar8;
        h hVar9 = new h("TWELVE_HOURS", 8);
        TWELVE_HOURS = hVar9;
        h hVar10 = new h("ONE_DAY", 9);
        ONE_DAY = hVar10;
        h hVar11 = new h("TWO_DAYS", 10);
        TWO_DAYS = hVar11;
        h hVar12 = new h("FOUR_DAYS", 11);
        FOUR_DAYS = hVar12;
        h hVar13 = new h("ONE_WEEK", 12);
        ONE_WEEK = hVar13;
        h hVar14 = new h("FIVE_WEEKS", 13);
        FIVE_WEEKS = hVar14;
        h hVar15 = new h("ONE_MONTH", 14);
        ONE_MONTH = hVar15;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
