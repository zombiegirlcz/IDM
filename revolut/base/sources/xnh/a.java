package xnh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BONDS;
    public static final a CFD;
    public static final a COMMODITY;
    public static final a ETFS;
    public static final a MUTUAL_FUNDS;
    public static final a PRIVATE_MARKETS;
    public static final a STOCKS;
    public static final a STRATEGIES;
    public static final a STRUCTURED_NOTES;

    static {
        a aVar = new a("STOCKS", 0);
        STOCKS = aVar;
        a aVar2 = new a("ETFS", 1);
        ETFS = aVar2;
        a aVar3 = new a("BONDS", 2);
        BONDS = aVar3;
        a aVar4 = new a("CFD", 3);
        CFD = aVar4;
        a aVar5 = new a("COMMODITY", 4);
        COMMODITY = aVar5;
        a aVar6 = new a("PRIVATE_MARKETS", 5);
        PRIVATE_MARKETS = aVar6;
        a aVar7 = new a("MUTUAL_FUNDS", 6);
        MUTUAL_FUNDS = aVar7;
        a aVar8 = new a("STRUCTURED_NOTES", 7);
        STRUCTURED_NOTES = aVar8;
        a aVar9 = new a("STRATEGIES", 8);
        STRATEGIES = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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
