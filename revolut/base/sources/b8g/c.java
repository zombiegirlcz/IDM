package b8g;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final c ADD_PASSENGER;
    public static final c ANCILLARIES;
    public static final c CANCELLATION;
    public static final c CHANGE_CUSTOMERS_PERSONAL_INFO;

    @NotNull
    public static final b Companion;
    public static final c DOCUMENT_TRAVEL_INFO;
    public static final c NAME_CORRECTION_CHANGE;
    public static final c OTHER;
    public static final c PAYMENT_QUESTION;
    public static final c REBOOKING;
    public static final c REFUND;
    public static final c SCHEDULE_CHANGE;

    static {
        c cVar = new c("REBOOKING", 0);
        REBOOKING = cVar;
        c cVar2 = new c("CANCELLATION", 1);
        CANCELLATION = cVar2;
        c cVar3 = new c("REFUND", 2);
        REFUND = cVar3;
        c cVar4 = new c("NAME_CORRECTION_CHANGE", 3);
        NAME_CORRECTION_CHANGE = cVar4;
        c cVar5 = new c("ADD_PASSENGER", 4);
        ADD_PASSENGER = cVar5;
        c cVar6 = new c("CHANGE_CUSTOMERS_PERSONAL_INFO", 5);
        CHANGE_CUSTOMERS_PERSONAL_INFO = cVar6;
        c cVar7 = new c("DOCUMENT_TRAVEL_INFO", 6);
        DOCUMENT_TRAVEL_INFO = cVar7;
        c cVar8 = new c("PAYMENT_QUESTION", 7);
        PAYMENT_QUESTION = cVar8;
        c cVar9 = new c("ANCILLARIES", 8);
        ANCILLARIES = cVar9;
        c cVar10 = new c("SCHEDULE_CHANGE", 9);
        SCHEDULE_CHANGE = cVar10;
        c cVar11 = new c("OTHER", 10);
        OTHER = cVar11;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new a(0));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
