package tqk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CALL_DATE;
    public static final a FREE_TRADES_INCENTIVE;
    public static final a GLOBAL_MARKETS_COLLECTION_REORDER;

    static {
        a aVar = new a("CALL_DATE", 0);
        CALL_DATE = aVar;
        a aVar2 = new a("FREE_TRADES_INCENTIVE", 1);
        FREE_TRADES_INCENTIVE = aVar2;
        a aVar3 = new a("GLOBAL_MARKETS_COLLECTION_REORDER", 2);
        GLOBAL_MARKETS_COLLECTION_REORDER = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
