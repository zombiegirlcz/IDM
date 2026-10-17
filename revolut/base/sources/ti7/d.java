package ti7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CAR_HIRE_EXCESS_LIMIT;
    public static final d EVENT_CANCELLATION_ANNUAL_REFUND_LIMIT;
    public static final d FREE_METAL_INSURANCE_LIMIT;
    public static final d FREE_PREMIUM_INSURANCE_LIMIT;
    public static final d FREE_ULTRA_INSURANCE_LIMIT;
    public static final d PERSONAL_LIABILITY_COVER_LIMIT;
    public static final d PURCHASE_PROTECTION_ANNUAL_REFUND_LIMIT;
    public static final d REFUND_PROTECTION_PER_ITEM_REFUND_LIMIT;
    public static final d TICKET_PROTECTION_ANNUAL_REFUND_LIMIT;
    public static final d TRIP_CANCELLATION_ANNUAL_REFUND_LIMIT;
    public static final d UNKNOWN;

    static {
        d dVar = new d("TICKET_PROTECTION_ANNUAL_REFUND_LIMIT", 0);
        TICKET_PROTECTION_ANNUAL_REFUND_LIMIT = dVar;
        d dVar2 = new d("PURCHASE_PROTECTION_ANNUAL_REFUND_LIMIT", 1);
        PURCHASE_PROTECTION_ANNUAL_REFUND_LIMIT = dVar2;
        d dVar3 = new d("REFUND_PROTECTION_PER_ITEM_REFUND_LIMIT", 2);
        REFUND_PROTECTION_PER_ITEM_REFUND_LIMIT = dVar3;
        d dVar4 = new d("FREE_PREMIUM_INSURANCE_LIMIT", 3);
        FREE_PREMIUM_INSURANCE_LIMIT = dVar4;
        d dVar5 = new d("FREE_METAL_INSURANCE_LIMIT", 4);
        FREE_METAL_INSURANCE_LIMIT = dVar5;
        d dVar6 = new d("FREE_ULTRA_INSURANCE_LIMIT", 5);
        FREE_ULTRA_INSURANCE_LIMIT = dVar6;
        d dVar7 = new d("CAR_HIRE_EXCESS_LIMIT", 6);
        CAR_HIRE_EXCESS_LIMIT = dVar7;
        d dVar8 = new d("PERSONAL_LIABILITY_COVER_LIMIT", 7);
        PERSONAL_LIABILITY_COVER_LIMIT = dVar8;
        d dVar9 = new d("TRIP_CANCELLATION_ANNUAL_REFUND_LIMIT", 8);
        TRIP_CANCELLATION_ANNUAL_REFUND_LIMIT = dVar9;
        d dVar10 = new d("EVENT_CANCELLATION_ANNUAL_REFUND_LIMIT", 9);
        EVENT_CANCELLATION_ANNUAL_REFUND_LIMIT = dVar10;
        d dVar11 = new d("UNKNOWN", 10);
        UNKNOWN = dVar11;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
