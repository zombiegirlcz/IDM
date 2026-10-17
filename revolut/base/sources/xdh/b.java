package xdh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b NO_REBALANCE;
    public static final b PENDING_CASH_ALLOCATION;
    public static final b PENDING_INITIAL_FUNDING;
    public static final b PENDING_REBALANCE;
    public static final b PENDING_TEMPLATE_ALLOCATION_CHANGE;
    public static final b PENDING_TEMPLATE_CHANGE;

    static {
        b bVar = new b("NO_REBALANCE", 0);
        NO_REBALANCE = bVar;
        b bVar2 = new b("PENDING_TEMPLATE_CHANGE", 1);
        PENDING_TEMPLATE_CHANGE = bVar2;
        b bVar3 = new b("PENDING_TEMPLATE_ALLOCATION_CHANGE", 2);
        PENDING_TEMPLATE_ALLOCATION_CHANGE = bVar3;
        b bVar4 = new b("PENDING_CASH_ALLOCATION", 3);
        PENDING_CASH_ALLOCATION = bVar4;
        b bVar5 = new b("PENDING_REBALANCE", 4);
        PENDING_REBALANCE = bVar5;
        b bVar6 = new b("PENDING_INITIAL_FUNDING", 5);
        PENDING_INITIAL_FUNDING = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
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
