package b9e;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BLOCKED;
    public static final b BLOCKED_OR_DEACTIVATED;
    public static final b BLOCKED_OR_INACTIVE;
    public static final b DIRECT_DEBIT;
    public static final b INACTIVE;
    public static final b LOAN_PAYMENT;
    public static final b PAY_LATER_REPAYMENT;
    public static final b SCHEDULED_TRANSFER;
    public static final b SUBSCRIPTION;

    static {
        b bVar = new b("SUBSCRIPTION", 0);
        SUBSCRIPTION = bVar;
        b bVar2 = new b("DIRECT_DEBIT", 1);
        DIRECT_DEBIT = bVar2;
        b bVar3 = new b("PAY_LATER_REPAYMENT", 2);
        PAY_LATER_REPAYMENT = bVar3;
        b bVar4 = new b("LOAN_PAYMENT", 3);
        LOAN_PAYMENT = bVar4;
        b bVar5 = new b("SCHEDULED_TRANSFER", 4);
        SCHEDULED_TRANSFER = bVar5;
        b bVar6 = new b("INACTIVE", 5);
        INACTIVE = bVar6;
        b bVar7 = new b("BLOCKED", 6);
        BLOCKED = bVar7;
        b bVar8 = new b("BLOCKED_OR_INACTIVE", 7);
        BLOCKED_OR_INACTIVE = bVar8;
        b bVar9 = new b("BLOCKED_OR_DEACTIVATED", 8);
        BLOCKED_OR_DEACTIVATED = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
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
