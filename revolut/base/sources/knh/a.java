package knh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOND;
    public static final a CFD;
    public static final a COMMODITY;
    public static final a ETF;
    public static final a STOCKS;

    static {
        a aVar = new a("STOCKS", 0);
        STOCKS = aVar;
        a aVar2 = new a("ETF", 1);
        ETF = aVar2;
        a aVar3 = new a("BOND", 2);
        BOND = aVar3;
        a aVar4 = new a("COMMODITY", 3);
        COMMODITY = aVar4;
        a aVar5 = new a("CFD", 4);
        CFD = aVar5;
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
