package el7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lel7/a;", "", "PURCHASE_PROTECTION_PLUS", "PURCHASE_PROTECTION_PREMIUM", "PURCHASE_PROTECTION_METAL", "REFUND_PROTECTION", "TICKET_CANCELLATION", "CAR_HIRE_EXCESS", "PERSONAL_LIABILITY", "FREE_INSURANCE", "WINTER_SPORTS_COVER", "EVENT_CANCELLATION", "TRIP_CANCELLATION", "UNKNOWN", "feature_insurance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @lg.b("CAR_HIRE_EXCESS")
    public static final a CAR_HIRE_EXCESS;

    @lg.b("EVENT_CANCELLATION")
    public static final a EVENT_CANCELLATION;

    @lg.b("FREE_INSURANCE")
    public static final a FREE_INSURANCE;

    @lg.b("PERSONAL_LIABILITY")
    public static final a PERSONAL_LIABILITY;

    @lg.b("PURCHASE_PROTECTION_VARIANT_3")
    public static final a PURCHASE_PROTECTION_METAL;

    @lg.b("PURCHASE_PROTECTION_VARIANT_1")
    public static final a PURCHASE_PROTECTION_PLUS;

    @lg.b("PURCHASE_PROTECTION_VARIANT_2")
    public static final a PURCHASE_PROTECTION_PREMIUM;

    @lg.b("REFUND_PROTECTION")
    public static final a REFUND_PROTECTION;

    @lg.b("TICKET_CANCELLATION")
    public static final a TICKET_CANCELLATION;

    @lg.b("TRIP_CANCELLATION")
    public static final a TRIP_CANCELLATION;

    @lg.b("UNKNOWN")
    public static final a UNKNOWN;

    @lg.b("WINTER_SPORTS_COVER")
    public static final a WINTER_SPORTS_COVER;

    static {
        a aVar = new a("PURCHASE_PROTECTION_PLUS", 0);
        PURCHASE_PROTECTION_PLUS = aVar;
        a aVar2 = new a("PURCHASE_PROTECTION_PREMIUM", 1);
        PURCHASE_PROTECTION_PREMIUM = aVar2;
        a aVar3 = new a("PURCHASE_PROTECTION_METAL", 2);
        PURCHASE_PROTECTION_METAL = aVar3;
        a aVar4 = new a("REFUND_PROTECTION", 3);
        REFUND_PROTECTION = aVar4;
        a aVar5 = new a("TICKET_CANCELLATION", 4);
        TICKET_CANCELLATION = aVar5;
        a aVar6 = new a("CAR_HIRE_EXCESS", 5);
        CAR_HIRE_EXCESS = aVar6;
        a aVar7 = new a("PERSONAL_LIABILITY", 6);
        PERSONAL_LIABILITY = aVar7;
        a aVar8 = new a("FREE_INSURANCE", 7);
        FREE_INSURANCE = aVar8;
        a aVar9 = new a("WINTER_SPORTS_COVER", 8);
        WINTER_SPORTS_COVER = aVar9;
        a aVar10 = new a("EVENT_CANCELLATION", 9);
        EVENT_CANCELLATION = aVar10;
        a aVar11 = new a("TRIP_CANCELLATION", 10);
        TRIP_CANCELLATION = aVar11;
        a aVar12 = new a("UNKNOWN", 11);
        UNKNOWN = aVar12;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
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
