package uib;

import kotlin.enums.EnumEntries;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FLEXIBLE_ACCOUNTS;
    public static final c FLEXIBLE_CASH_FUNDS;

    @d
    public static final c INTEREST;
    public static final c SAVINGS;
    public static final c SAVINGS_AND_FUNDS;

    static {
        c cVar = new c("SAVINGS_AND_FUNDS", 0);
        SAVINGS_AND_FUNDS = cVar;
        c cVar2 = new c("INTEREST", 1);
        INTEREST = cVar2;
        c cVar3 = new c("SAVINGS", 2);
        SAVINGS = cVar3;
        c cVar4 = new c("FLEXIBLE_CASH_FUNDS", 3);
        FLEXIBLE_CASH_FUNDS = cVar4;
        c cVar5 = new c("FLEXIBLE_ACCOUNTS", 4);
        FLEXIBLE_ACCOUNTS = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
