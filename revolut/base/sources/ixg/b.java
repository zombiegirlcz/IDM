package ixg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lixg/b;", "", "STOCKS", "ISA", "JISA", "PEA", "CRYPTO", "COMMODITY", "CRYPTO_VAULT", "ROBO", "COMBINED", "CFD", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @lg.b("complex_analytics_product_type_value_cfd")
    public static final b CFD;

    @lg.b("complex_analytics_product_type_value_combined")
    public static final b COMBINED;

    @lg.b("complex_analytics_asset_type_value_commodity")
    public static final b COMMODITY;

    @lg.b("complex_analytics_asset_type_value_crypto")
    public static final b CRYPTO;

    @lg.b("complex_analytics_asset_type_value_crypto_vault")
    public static final b CRYPTO_VAULT;

    @lg.b("complex_analytics_asset_type_value_isa")
    public static final b ISA;

    @lg.b("complex_analytics_asset_type_value_jisa")
    public static final b JISA;

    @lg.b("complext_analytics_asset_type_value_pea")
    public static final b PEA;

    @lg.b("complex_analytics_asset_type_value_robo")
    public static final b ROBO;

    @lg.b("complex_analytics_asset_type_value_stocks")
    public static final b STOCKS;

    static {
        b bVar = new b("STOCKS", 0);
        STOCKS = bVar;
        b bVar2 = new b("ISA", 1);
        ISA = bVar2;
        b bVar3 = new b("JISA", 2);
        JISA = bVar3;
        b bVar4 = new b("PEA", 3);
        PEA = bVar4;
        b bVar5 = new b("CRYPTO", 4);
        CRYPTO = bVar5;
        b bVar6 = new b("COMMODITY", 5);
        COMMODITY = bVar6;
        b bVar7 = new b("CRYPTO_VAULT", 6);
        CRYPTO_VAULT = bVar7;
        b bVar8 = new b("ROBO", 7);
        ROBO = bVar8;
        b bVar9 = new b("COMBINED", 8);
        COMBINED = bVar9;
        b bVar10 = new b("CFD", 9);
        CFD = bVar10;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
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
