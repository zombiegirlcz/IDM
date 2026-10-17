package iyf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BAD_REQUEST;
    public static final a BAD_WEATHER;
    public static final a DUPLICATE_BOOKING;
    public static final a EXPERIENCE_NO_LONGER_OPERATING;
    public static final a EXPERIENCE_UNAVAILABLE;
    public static final a EXPERIENCE_WAS_CANCELLED;
    public static final a GLOBAL_EVENT_FORCE_MAJEURE;
    public static final a ISSUE_WITH_PICKUP;
    public static final a ISSUE_WITH_TICKET;
    public static final a MINIMUM_NUMBER_OF_VISITORS_NOT_MET;
    public static final a PAYMENT_FAILED;
    public static final a PRICE_CHANGED;
    public static final a UNEXPECTED;

    static {
        a aVar = new a("EXPERIENCE_UNAVAILABLE", 0);
        EXPERIENCE_UNAVAILABLE = aVar;
        a aVar2 = new a("PRICE_CHANGED", 1);
        PRICE_CHANGED = aVar2;
        a aVar3 = new a("BAD_WEATHER", 2);
        BAD_WEATHER = aVar3;
        a aVar4 = new a("DUPLICATE_BOOKING", 3);
        DUPLICATE_BOOKING = aVar4;
        a aVar5 = new a("EXPERIENCE_NO_LONGER_OPERATING", 4);
        EXPERIENCE_NO_LONGER_OPERATING = aVar5;
        a aVar6 = new a("MINIMUM_NUMBER_OF_VISITORS_NOT_MET", 5);
        MINIMUM_NUMBER_OF_VISITORS_NOT_MET = aVar6;
        a aVar7 = new a("GLOBAL_EVENT_FORCE_MAJEURE", 6);
        GLOBAL_EVENT_FORCE_MAJEURE = aVar7;
        a aVar8 = new a("EXPERIENCE_WAS_CANCELLED", 7);
        EXPERIENCE_WAS_CANCELLED = aVar8;
        a aVar9 = new a("ISSUE_WITH_TICKET", 8);
        ISSUE_WITH_TICKET = aVar9;
        a aVar10 = new a("ISSUE_WITH_PICKUP", 9);
        ISSUE_WITH_PICKUP = aVar10;
        a aVar11 = new a("BAD_REQUEST", 10);
        BAD_REQUEST = aVar11;
        a aVar12 = new a("PAYMENT_FAILED", 11);
        PAYMENT_FAILED = aVar12;
        a aVar13 = new a("UNEXPECTED", 12);
        UNEXPECTED = aVar13;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13};
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
