package iwg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Liwg/a;", "", "SECURITY", "CRYPTO", "COMMODITY", "ROBO", "ISA", "JISA", "PEA", "CFD", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @lg.b("complex_analytics_asset_type_cfd")
    public static final a CFD;

    @lg.b("complex_analytics_asset_type_commodity")
    public static final a COMMODITY;

    @lg.b("complex_analytics_asset_type_crypto")
    public static final a CRYPTO;

    @lg.b("complex_analytics_asset_type_ISA")
    public static final a ISA;

    @lg.b("complex_analytics_asset_type_JISA")
    public static final a JISA;

    @lg.b("complex_analytics_asset_type_PEA")
    public static final a PEA;

    @lg.b("complex_analytics_asset_type_ROBO")
    public static final a ROBO;

    @lg.b("complex_analytics_asset_type_security")
    public static final a SECURITY;

    static {
        a aVar = new a("SECURITY", 0);
        SECURITY = aVar;
        a aVar2 = new a("CRYPTO", 1);
        CRYPTO = aVar2;
        a aVar3 = new a("COMMODITY", 2);
        COMMODITY = aVar3;
        a aVar4 = new a("ROBO", 3);
        ROBO = aVar4;
        a aVar5 = new a("ISA", 4);
        ISA = aVar5;
        a aVar6 = new a("JISA", 5);
        JISA = aVar6;
        a aVar7 = new a("PEA", 6);
        PEA = aVar7;
        a aVar8 = new a("CFD", 7);
        CFD = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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
