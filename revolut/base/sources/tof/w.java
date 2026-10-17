package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w CASH_LIKE_INTEREST;
    public static final w COMPOUND_INTEREST;
    public static final w LATE_PENALTY_INTEREST;
    public static final w PURCHASE_INTEREST;
    public static final w UNKNOWN;

    static {
        w wVar = new w("PURCHASE_INTEREST", 0);
        PURCHASE_INTEREST = wVar;
        w wVar2 = new w("CASH_LIKE_INTEREST", 1);
        CASH_LIKE_INTEREST = wVar2;
        w wVar3 = new w("LATE_PENALTY_INTEREST", 2);
        LATE_PENALTY_INTEREST = wVar3;
        w wVar4 = new w("COMPOUND_INTEREST", 3);
        COMPOUND_INTEREST = wVar4;
        w wVar5 = new w("UNKNOWN", 4);
        UNKNOWN = wVar5;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
