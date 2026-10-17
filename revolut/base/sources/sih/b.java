package sih;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BONDS;
    public static final b COMMODITIES;
    public static final b ETFs;
    public static final b FX;
    public static final b MANAGED_PORTFOLIOS;
    public static final b MARGIN;
    public static final b MUTUAL_FUNDS;
    public static final b PRIVATE_MARKETS;
    public static final b STOCKS;

    static {
        b bVar = new b("STOCKS", 0);
        STOCKS = bVar;
        b bVar2 = new b("COMMODITIES", 1);
        COMMODITIES = bVar2;
        b bVar3 = new b("BONDS", 2);
        BONDS = bVar3;
        b bVar4 = new b("MARGIN", 3);
        MARGIN = bVar4;
        b bVar5 = new b("FX", 4);
        FX = bVar5;
        b bVar6 = new b("ETFs", 5);
        ETFs = bVar6;
        b bVar7 = new b("PRIVATE_MARKETS", 6);
        PRIVATE_MARKETS = bVar7;
        b bVar8 = new b("MUTUAL_FUNDS", 7);
        MUTUAL_FUNDS = bVar8;
        b bVar9 = new b("MANAGED_PORTFOLIOS", 8);
        MANAGED_PORTFOLIOS = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
