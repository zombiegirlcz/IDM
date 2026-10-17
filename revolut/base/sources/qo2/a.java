package qo2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DIRECT_DEBIT;
    public static final a RECURRING_CREDIT;
    public static final a SCHEDULED_PAYMENT;
    public static final a UNCOVERED_CHECK;
    public static final a UNKNOWN;

    static {
        a aVar = new a("UNKNOWN", 0);
        UNKNOWN = aVar;
        a aVar2 = new a("SCHEDULED_PAYMENT", 1);
        SCHEDULED_PAYMENT = aVar2;
        a aVar3 = new a("DIRECT_DEBIT", 2);
        DIRECT_DEBIT = aVar3;
        a aVar4 = new a("RECURRING_CREDIT", 3);
        RECURRING_CREDIT = aVar4;
        a aVar5 = new a("UNCOVERED_CHECK", 4);
        UNCOVERED_CHECK = aVar5;
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
