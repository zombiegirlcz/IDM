package dl7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CAR_HIRE_EXCESS;
    public static final a EVENT_CANCELLATION;
    public static final a FREE_INSURANCE;
    public static final a PERSONAL_LIABILITY;
    public static final a PURCHASE_PROTECTION_METAL;
    public static final a PURCHASE_PROTECTION_PLUS;
    public static final a PURCHASE_PROTECTION_PREMIUM;
    public static final a REFUND_PROTECTION;
    public static final a TICKET_CANCELLATION;
    public static final a TRIP_CANCELLATION;
    public static final a UNKNOWN;
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
