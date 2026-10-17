package imh;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i COMMODITY_EXPOSURE_ETC;
    public static final i CORPORATE_BONDS;
    public static final i CRYPTO_EXPOSURE_ETNS;
    public static final i ETPS_LEVERAGED;
    public static final i GOVERNMENT_BONDS;
    public static final i HIGH_DIVIDEND_YIELD;
    public static final i NO_COMMISSION_ETPS;
    public static final i POPULAR_BONDS;
    public static final i POPULAR_CFDS;
    public static final i POPULAR_ETPS;
    public static final i POPULAR_STOCKS;
    public static final i RECENTLY_ADDED_BONDS;
    public static final i RECENTLY_ADDED_CFDS;
    public static final i RECENTLY_ADDED_ETPS;
    public static final i RECENTLY_ADDED_STOCKS;
    public static final i TECHNOLOGY_ETFS;

    @NotNull
    private final String tradeDiscoveryKey;

    static {
        i iVar = new i("HIGH_DIVIDEND_YIELD", 0, "HIGH_DIVIDEND_YIELD");
        HIGH_DIVIDEND_YIELD = iVar;
        i iVar2 = new i("TECHNOLOGY_ETFS", 1, "TECHNOLOGY_ETFS");
        TECHNOLOGY_ETFS = iVar2;
        i iVar3 = new i("COMMODITY_EXPOSURE_ETC", 2, "COMMODITY_EXPOSURE_ETC");
        COMMODITY_EXPOSURE_ETC = iVar3;
        i iVar4 = new i("CRYPTO_EXPOSURE_ETNS", 3, "CRYPTO_EXPOSURE_ETNS");
        CRYPTO_EXPOSURE_ETNS = iVar4;
        i iVar5 = new i("GOVERNMENT_BONDS", 4, "GOVERNMENT_BONDS");
        GOVERNMENT_BONDS = iVar5;
        i iVar6 = new i("CORPORATE_BONDS", 5, "CORPORATE_BONDS");
        CORPORATE_BONDS = iVar6;
        i iVar7 = new i("NO_COMMISSION_ETPS", 6, "NO_COMMISSION_ETPS");
        NO_COMMISSION_ETPS = iVar7;
        i iVar8 = new i("RECENTLY_ADDED_ETPS", 7, "RECENTLY_ADDED_ETPS");
        RECENTLY_ADDED_ETPS = iVar8;
        i iVar9 = new i("RECENTLY_ADDED_STOCKS", 8, "RECENTLY_ADDED_STOCKS");
        RECENTLY_ADDED_STOCKS = iVar9;
        i iVar10 = new i("RECENTLY_ADDED_BONDS", 9, "RECENTLY_ADDED_BONDS");
        RECENTLY_ADDED_BONDS = iVar10;
        i iVar11 = new i("RECENTLY_ADDED_CFDS", 10, "RECENTLY_ADDED_CFDS");
        RECENTLY_ADDED_CFDS = iVar11;
        i iVar12 = new i("ETPS_LEVERAGED", 11, "ETPS_LEVERAGED");
        ETPS_LEVERAGED = iVar12;
        i iVar13 = new i("POPULAR_STOCKS", 12, "POPULAR_STOCKS");
        POPULAR_STOCKS = iVar13;
        i iVar14 = new i("POPULAR_ETPS", 13, "POPULAR_ETPS");
        POPULAR_ETPS = iVar14;
        i iVar15 = new i("POPULAR_BONDS", 14, "POPULAR_BONDS");
        POPULAR_BONDS = iVar15;
        i iVar16 = new i("POPULAR_CFDS", 15, "POPULAR_CFDS");
        POPULAR_CFDS = iVar16;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public i(String str, int i, String str2) {
        this.tradeDiscoveryKey = str2;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final String a() {
        return this.tradeDiscoveryKey;
    }
}
