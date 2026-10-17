package ph7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALL_BONDS;
    public static final c CFDS_LOSS_DRIVERS;
    public static final c CFDS_MOST_SHORTED;
    public static final c CFDS_PNL_DRIVERS;
    public static final c CFDS_PROFIT_DRIVERS;
    public static final c DIV_YLD;
    public static final c ETCS_COMMODITY_EXPOSURE;
    public static final c ETNS_CRYPTO_EXPOSURE;
    public static final c ETPS_LEVERAGED;
    public static final c FREE_STOCKS;
    public static final c INDEX_ETFS;
    public static final c MOST_BOUGHT;
    public static final c MOST_SOLD;
    public static final c MOST_TRADED;
    public static final c POPULAR_FIRST_TIME_BUYS_CFDS;
    public static final c PRECIOUS_METALS_ETCS;
    public static final c RECOMMENDED_BUY;
    public static final c TECHNOLOGY_ETFS;

    @NotNull
    private final String key;

    static {
        c cVar = new c("MOST_TRADED", 0, "most-traded");
        MOST_TRADED = cVar;
        c cVar2 = new c("MOST_BOUGHT", 1, "most-bought");
        MOST_BOUGHT = cVar2;
        c cVar3 = new c("MOST_SOLD", 2, "most-sold");
        MOST_SOLD = cVar3;
        c cVar4 = new c("POPULAR_FIRST_TIME_BUYS_CFDS", 3, "popular-first-time-buys-cfds");
        POPULAR_FIRST_TIME_BUYS_CFDS = cVar4;
        c cVar5 = new c("CFDS_MOST_SHORTED", 4, "cfds-most-shorted");
        CFDS_MOST_SHORTED = cVar5;
        c cVar6 = new c("CFDS_PNL_DRIVERS", 5, "cfds-pnl-drivers");
        CFDS_PNL_DRIVERS = cVar6;
        c cVar7 = new c("CFDS_PROFIT_DRIVERS", 6, "cfds-profit-drivers");
        CFDS_PROFIT_DRIVERS = cVar7;
        c cVar8 = new c("CFDS_LOSS_DRIVERS", 7, "cfds-loss-drivers");
        CFDS_LOSS_DRIVERS = cVar8;
        c cVar9 = new c("ALL_BONDS", 8, "all-bonds");
        ALL_BONDS = cVar9;
        c cVar10 = new c("INDEX_ETFS", 9, "index-etfs");
        INDEX_ETFS = cVar10;
        c cVar11 = new c("TECHNOLOGY_ETFS", 10, "etfs-technology");
        TECHNOLOGY_ETFS = cVar11;
        c cVar12 = new c("ETNS_CRYPTO_EXPOSURE", 11, "etns-crypto-exposure");
        ETNS_CRYPTO_EXPOSURE = cVar12;
        c cVar13 = new c("ETCS_COMMODITY_EXPOSURE", 12, "etcs-commodity-exposure");
        ETCS_COMMODITY_EXPOSURE = cVar13;
        c cVar14 = new c("PRECIOUS_METALS_ETCS", 13, "precious-metals-etcs");
        PRECIOUS_METALS_ETCS = cVar14;
        c cVar15 = new c("ETPS_LEVERAGED", 14, "etps-leveraged");
        ETPS_LEVERAGED = cVar15;
        c cVar16 = new c("DIV_YLD", 15, "DIV_YLD");
        DIV_YLD = cVar16;
        c cVar17 = new c("RECOMMENDED_BUY", 16, "recommended-buy-stocks");
        RECOMMENDED_BUY = cVar17;
        c cVar18 = new c("FREE_STOCKS", 17, "free-stocks");
        FREE_STOCKS = cVar18;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
