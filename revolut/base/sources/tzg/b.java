package tzg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALL;
    public static final b FIVE_YEARS;
    public static final b ONE_DAY;
    public static final b ONE_MONTH;
    public static final b ONE_WEEK;
    public static final b ONE_YEAR;
    public static final b SIX_MONTHS;
    public static final b THREE_MONTHS;

    static {
        b bVar = new b("ONE_DAY", 0);
        ONE_DAY = bVar;
        b bVar2 = new b("ONE_WEEK", 1);
        ONE_WEEK = bVar2;
        b bVar3 = new b("ONE_MONTH", 2);
        ONE_MONTH = bVar3;
        b bVar4 = new b("THREE_MONTHS", 3);
        THREE_MONTHS = bVar4;
        b bVar5 = new b("SIX_MONTHS", 4);
        SIX_MONTHS = bVar5;
        b bVar6 = new b("ONE_YEAR", 5);
        ONE_YEAR = bVar6;
        b bVar7 = new b("FIVE_YEARS", 6);
        FIVE_YEARS = bVar7;
        b bVar8 = new b("ALL", 7);
        ALL = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
