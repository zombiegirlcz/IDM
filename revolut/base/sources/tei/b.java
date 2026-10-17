package tei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CANCELLED;
    public static final b CONFIRMED;
    public static final b FAILED;
    public static final b PARTIALLY_COMPLETED;
    public static final b PENDING;
    public static final b PROCESSING_BOOKING;
    public static final b PROCESSING_CANCELLATION;
    public static final b PROCESSING_PAYMENT;

    static {
        b bVar = new b("PENDING", 0);
        PENDING = bVar;
        b bVar2 = new b("PROCESSING_BOOKING", 1);
        PROCESSING_BOOKING = bVar2;
        b bVar3 = new b("PROCESSING_PAYMENT", 2);
        PROCESSING_PAYMENT = bVar3;
        b bVar4 = new b("PROCESSING_CANCELLATION", 3);
        PROCESSING_CANCELLATION = bVar4;
        b bVar5 = new b("CONFIRMED", 4);
        CONFIRMED = bVar5;
        b bVar6 = new b("CANCELLED", 5);
        CANCELLED = bVar6;
        b bVar7 = new b("FAILED", 6);
        FAILED = bVar7;
        b bVar8 = new b("PARTIALLY_COMPLETED", 7);
        PARTIALLY_COMPLETED = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
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
