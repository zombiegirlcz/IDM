package h4l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCOUNTS_CLOSED;
    public static final c ACCOUNTS_SUSPENDED;
    public static final c APPROVED;
    public static final c CANCELLED;
    public static final c MONEY_WITHDRAWN;
    public static final c ORDERS_PLACED;
    public static final c POSITIONS_CLOSED;
    public static final c POSITIONS_RECONCILED;
    public static final c POSITIONS_RECONCILIATION_SCHEDULED;
    public static final c REQUESTED;
    public static final c UNKNOWN;

    static {
        c cVar = new c("REQUESTED", 0);
        REQUESTED = cVar;
        c cVar2 = new c("ACCOUNTS_SUSPENDED", 1);
        ACCOUNTS_SUSPENDED = cVar2;
        c cVar3 = new c("APPROVED", 2);
        APPROVED = cVar3;
        c cVar4 = new c("POSITIONS_RECONCILIATION_SCHEDULED", 3);
        POSITIONS_RECONCILIATION_SCHEDULED = cVar4;
        c cVar5 = new c("POSITIONS_RECONCILED", 4);
        POSITIONS_RECONCILED = cVar5;
        c cVar6 = new c("ORDERS_PLACED", 5);
        ORDERS_PLACED = cVar6;
        c cVar7 = new c("POSITIONS_CLOSED", 6);
        POSITIONS_CLOSED = cVar7;
        c cVar8 = new c("MONEY_WITHDRAWN", 7);
        MONEY_WITHDRAWN = cVar8;
        c cVar9 = new c("ACCOUNTS_CLOSED", 8);
        ACCOUNTS_CLOSED = cVar9;
        c cVar10 = new c("CANCELLED", 9);
        CANCELLED = cVar10;
        c cVar11 = new c("UNKNOWN", 10);
        UNKNOWN = cVar11;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
