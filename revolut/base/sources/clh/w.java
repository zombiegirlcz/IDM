package clh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w ALL_ETFS;
    public static final w ALL_ETPS;
    public static final w ALL_STOCKS;
    public static final w BONDS;
    public static final w CFDS;
    public static final w ETFS;
    public static final w ETPS;
    public static final w FUNDS;
    public static final w INDEXES;
    public static final w IPOS;
    public static final w MUTUAL_FUNDS;
    public static final w STOCKS;

    static {
        w wVar = new w("IPOS", 0);
        IPOS = wVar;
        w wVar2 = new w("STOCKS", 1);
        STOCKS = wVar2;
        w wVar3 = new w("ETFS", 2);
        ETFS = wVar3;
        w wVar4 = new w("ALL_STOCKS", 3);
        ALL_STOCKS = wVar4;
        w wVar5 = new w("ALL_ETFS", 4);
        ALL_ETFS = wVar5;
        w wVar6 = new w("ALL_ETPS", 5);
        ALL_ETPS = wVar6;
        w wVar7 = new w("ETPS", 6);
        ETPS = wVar7;
        w wVar8 = new w("BONDS", 7);
        BONDS = wVar8;
        w wVar9 = new w("FUNDS", 8);
        FUNDS = wVar9;
        w wVar10 = new w("MUTUAL_FUNDS", 9);
        MUTUAL_FUNDS = wVar10;
        w wVar11 = new w("CFDS", 10);
        CFDS = wVar11;
        w wVar12 = new w("INDEXES", 11);
        INDEXES = wVar12;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
