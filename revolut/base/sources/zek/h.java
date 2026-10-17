package zek;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lzek/h;", "", "EVERYDAY_BENEFITS", "TRAVEL_BENEFITS", "INSURANCE_BENEFITS", "INVESTMENTS", "TRAVEL_SAVINGS_AND_PROTECTION", "FEATURES_FOR_YOU", "UNKNOWN", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @lg.b("everyday")
    public static final h EVERYDAY_BENEFITS;

    @lg.b("features_for_you")
    public static final h FEATURES_FOR_YOU;

    @lg.b("insurance")
    public static final h INSURANCE_BENEFITS;

    @lg.b("investments")
    public static final h INVESTMENTS;

    @lg.b("travel")
    public static final h TRAVEL_BENEFITS;

    @lg.b("travel_savings_and_protection")
    public static final h TRAVEL_SAVINGS_AND_PROTECTION;

    @lg.b("unknown")
    public static final h UNKNOWN;

    static {
        h hVar = new h("EVERYDAY_BENEFITS", 0);
        EVERYDAY_BENEFITS = hVar;
        h hVar2 = new h("TRAVEL_BENEFITS", 1);
        TRAVEL_BENEFITS = hVar2;
        h hVar3 = new h("INSURANCE_BENEFITS", 2);
        INSURANCE_BENEFITS = hVar3;
        h hVar4 = new h("INVESTMENTS", 3);
        INVESTMENTS = hVar4;
        h hVar5 = new h("TRAVEL_SAVINGS_AND_PROTECTION", 4);
        TRAVEL_SAVINGS_AND_PROTECTION = hVar5;
        h hVar6 = new h("FEATURES_FOR_YOU", 5);
        FEATURES_FOR_YOU = hVar6;
        h hVar7 = new h("UNKNOWN", 6);
        UNKNOWN = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
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
