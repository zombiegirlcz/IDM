package hl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVE_INSTALLMENT_PLAN;
    public static final a FACILITY_OVERDUE;
    public static final a PENDING_TRANSACTIONS;
    public static final a STAMP_DUTY_NOT_PAID;
    public static final a UNKNOWN;

    static {
        a aVar = new a("PENDING_TRANSACTIONS", 0);
        PENDING_TRANSACTIONS = aVar;
        a aVar2 = new a("ACTIVE_INSTALLMENT_PLAN", 1);
        ACTIVE_INSTALLMENT_PLAN = aVar2;
        a aVar3 = new a("STAMP_DUTY_NOT_PAID", 2);
        STAMP_DUTY_NOT_PAID = aVar3;
        a aVar4 = new a("FACILITY_OVERDUE", 3);
        FACILITY_OVERDUE = aVar4;
        a aVar5 = new a("UNKNOWN", 4);
        UNKNOWN = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
