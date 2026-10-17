package tsd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CFDS;
    public static final a COMMODITIES;
    public static final a ROBO;
    public static final a STOCKS;
    public static final a TAA;

    static {
        a aVar = new a("STOCKS", 0);
        STOCKS = aVar;
        a aVar2 = new a("TAA", 1);
        TAA = aVar2;
        a aVar3 = new a("COMMODITIES", 2);
        COMMODITIES = aVar3;
        a aVar4 = new a("ROBO", 3);
        ROBO = aVar4;
        a aVar5 = new a("CFDS", 4);
        CFDS = aVar5;
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
