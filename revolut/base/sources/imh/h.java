package imh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CFDS_PNL_DRIVERS;
    public static final h CORPORATE_BONDS;
    public static final h DIVIDEND_LEADERS;
    public static final h ETCS_COMMODITY_EXPOSURE;
    public static final h ETNS_CRYPTO_EXPOSURE;
    public static final h ETPS_LEVERAGED;
    public static final h GOVERNMENT_BONDS;
    public static final h INDEX_ETFS;
    public static final h MOST_SHORTED_CFDS;
    public static final h MOST_TRADED_BONDS;
    public static final h MOST_TRADED_CFDS;
    public static final h MOST_TRADED_ETFS;
    public static final h MOST_TRADED_STOCKS;
    public static final h POPULAR_BONDS;
    public static final h POPULAR_CFD;
    public static final h POPULAR_COMMODITIES;
    public static final h POPULAR_ETFS;
    public static final h POPULAR_STOCKS;
    public static final h PRECIOUS_METALS_ETCS;
    public static final h RECENTLY_VIEWED;
    public static final h TECHNOLOGY_ETFS;
    public static final h TOP_MOVERS;

    static {
        h hVar = new h("POPULAR_STOCKS", 0);
        POPULAR_STOCKS = hVar;
        h hVar2 = new h("POPULAR_ETFS", 1);
        POPULAR_ETFS = hVar2;
        h hVar3 = new h("POPULAR_BONDS", 2);
        POPULAR_BONDS = hVar3;
        h hVar4 = new h("POPULAR_CFD", 3);
        POPULAR_CFD = hVar4;
        h hVar5 = new h("POPULAR_COMMODITIES", 4);
        POPULAR_COMMODITIES = hVar5;
        h hVar6 = new h("TOP_MOVERS", 5);
        TOP_MOVERS = hVar6;
        h hVar7 = new h("GOVERNMENT_BONDS", 6);
        GOVERNMENT_BONDS = hVar7;
        h hVar8 = new h("CORPORATE_BONDS", 7);
        CORPORATE_BONDS = hVar8;
        h hVar9 = new h("MOST_SHORTED_CFDS", 8);
        MOST_SHORTED_CFDS = hVar9;
        h hVar10 = new h("MOST_TRADED_STOCKS", 9);
        MOST_TRADED_STOCKS = hVar10;
        h hVar11 = new h("MOST_TRADED_ETFS", 10);
        MOST_TRADED_ETFS = hVar11;
        h hVar12 = new h("MOST_TRADED_BONDS", 11);
        MOST_TRADED_BONDS = hVar12;
        h hVar13 = new h("MOST_TRADED_CFDS", 12);
        MOST_TRADED_CFDS = hVar13;
        h hVar14 = new h("CFDS_PNL_DRIVERS", 13);
        CFDS_PNL_DRIVERS = hVar14;
        h hVar15 = new h("INDEX_ETFS", 14);
        INDEX_ETFS = hVar15;
        h hVar16 = new h("TECHNOLOGY_ETFS", 15);
        TECHNOLOGY_ETFS = hVar16;
        h hVar17 = new h("ETNS_CRYPTO_EXPOSURE", 16);
        ETNS_CRYPTO_EXPOSURE = hVar17;
        h hVar18 = new h("ETCS_COMMODITY_EXPOSURE", 17);
        ETCS_COMMODITY_EXPOSURE = hVar18;
        h hVar19 = new h("ETPS_LEVERAGED", 18);
        ETPS_LEVERAGED = hVar19;
        h hVar20 = new h("RECENTLY_VIEWED", 19);
        RECENTLY_VIEWED = hVar20;
        h hVar21 = new h("DIVIDEND_LEADERS", 20);
        DIVIDEND_LEADERS = hVar21;
        h hVar22 = new h("PRECIOUS_METALS_ETCS", 21);
        PRECIOUS_METALS_ETCS = hVar22;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
