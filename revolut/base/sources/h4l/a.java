package h4l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOUNT_CLOSED;
    public static final a REQUESTED;
    public static final a SELLING_OPEN_POSITIONS;
    public static final a TRADING_SUSPENDED;
    public static final a UNKNOWN;
    public static final a WITHDRAWING_FUNDS;
    public static final a WITHDRAWING_FUNDS_NEGATIVE_BALANCE;

    static {
        a aVar = new a("REQUESTED", 0);
        REQUESTED = aVar;
        a aVar2 = new a("TRADING_SUSPENDED", 1);
        TRADING_SUSPENDED = aVar2;
        a aVar3 = new a("SELLING_OPEN_POSITIONS", 2);
        SELLING_OPEN_POSITIONS = aVar3;
        a aVar4 = new a("WITHDRAWING_FUNDS", 3);
        WITHDRAWING_FUNDS = aVar4;
        a aVar5 = new a("WITHDRAWING_FUNDS_NEGATIVE_BALANCE", 4);
        WITHDRAWING_FUNDS_NEGATIVE_BALANCE = aVar5;
        a aVar6 = new a("ACCOUNT_CLOSED", 5);
        ACCOUNT_CLOSED = aVar6;
        a aVar7 = new a("UNKNOWN", 6);
        UNKNOWN = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
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
