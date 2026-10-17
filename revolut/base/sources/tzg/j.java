package tzg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ALL;
    public static final j FIVE_YEARS;
    public static final j ONE_DAY;
    public static final j ONE_MONTH;
    public static final j ONE_WEEK;
    public static final j ONE_YEAR;
    public static final j SIX_MONTHS;
    public static final j THREE_MONTHS;

    static {
        j jVar = new j("ONE_DAY", 0);
        ONE_DAY = jVar;
        j jVar2 = new j("ONE_WEEK", 1);
        ONE_WEEK = jVar2;
        j jVar3 = new j("ONE_MONTH", 2);
        ONE_MONTH = jVar3;
        j jVar4 = new j("THREE_MONTHS", 3);
        THREE_MONTHS = jVar4;
        j jVar5 = new j("SIX_MONTHS", 4);
        SIX_MONTHS = jVar5;
        j jVar6 = new j("ONE_YEAR", 5);
        ONE_YEAR = jVar6;
        j jVar7 = new j("FIVE_YEARS", 6);
        FIVE_YEARS = jVar7;
        j jVar8 = new j("ALL", 7);
        ALL = jVar8;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
