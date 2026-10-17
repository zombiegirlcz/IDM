package ocj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NEWS;
    public static final a ORDERS;
    public static final a OVERVIEW;
    public static final a RECURRING_BUYS;
    public static final a TRANSACTIONS;

    static {
        a aVar = new a("OVERVIEW", 0);
        OVERVIEW = aVar;
        a aVar2 = new a("TRANSACTIONS", 1);
        TRANSACTIONS = aVar2;
        a aVar3 = new a("RECURRING_BUYS", 2);
        RECURRING_BUYS = aVar3;
        a aVar4 = new a("NEWS", 3);
        NEWS = aVar4;
        a aVar5 = new a("ORDERS", 4);
        ORDERS = aVar5;
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
