package amd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MAX;
    public static final a MONTH;
    public static final a SIX_MONTHS;
    public static final a WEEK;
    public static final a YEAR;

    static {
        a aVar = new a("WEEK", 0);
        WEEK = aVar;
        a aVar2 = new a("MONTH", 1);
        MONTH = aVar2;
        a aVar3 = new a("SIX_MONTHS", 2);
        SIX_MONTHS = aVar3;
        a aVar4 = new a("YEAR", 3);
        YEAR = aVar4;
        a aVar5 = new a("MAX", 4);
        MAX = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
