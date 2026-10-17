package c1b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k FIVE_DAYS;
    public static final k ONE_DAY;
    public static final k ONE_MONTH;
    public static final k SIX_MONTHS;
    public static final k THREE_MONTHS;
    public static final k YEAR_TO_DATE;

    static {
        k kVar = new k("ONE_DAY", 0);
        ONE_DAY = kVar;
        k kVar2 = new k("FIVE_DAYS", 1);
        FIVE_DAYS = kVar2;
        k kVar3 = new k("ONE_MONTH", 2);
        ONE_MONTH = kVar3;
        k kVar4 = new k("THREE_MONTHS", 3);
        THREE_MONTHS = kVar4;
        k kVar5 = new k("SIX_MONTHS", 4);
        SIX_MONTHS = kVar5;
        k kVar6 = new k("YEAR_TO_DATE", 5);
        YEAR_TO_DATE = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
