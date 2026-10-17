package iuk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANALYST_RATINGS;
    public static final a FUNDAMENTALS;
    public static final a INSIGHTS;
    public static final a SENTIMENT;
    public static final a TECHNICALS;

    static {
        a aVar = new a("INSIGHTS", 0);
        INSIGHTS = aVar;
        a aVar2 = new a("TECHNICALS", 1);
        TECHNICALS = aVar2;
        a aVar3 = new a("SENTIMENT", 2);
        SENTIMENT = aVar3;
        a aVar4 = new a("FUNDAMENTALS", 3);
        FUNDAMENTALS = aVar4;
        a aVar5 = new a("ANALYST_RATINGS", 4);
        ANALYST_RATINGS = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
