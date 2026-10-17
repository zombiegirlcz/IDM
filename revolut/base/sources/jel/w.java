package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w INFRASTRUCTURE;
    public static final w MULTI_ASSET;
    public static final w PRIVATE_CREDIT;
    public static final w PRIVATE_EQUITY;
    public static final w REAL_ESTATE;
    public static final w VENTURE_CAPITAL;

    static {
        w wVar = new w("MULTI_ASSET", 0);
        MULTI_ASSET = wVar;
        w wVar2 = new w("PRIVATE_EQUITY", 1);
        PRIVATE_EQUITY = wVar2;
        w wVar3 = new w("PRIVATE_CREDIT", 2);
        PRIVATE_CREDIT = wVar3;
        w wVar4 = new w("INFRASTRUCTURE", 3);
        INFRASTRUCTURE = wVar4;
        w wVar5 = new w("REAL_ESTATE", 4);
        REAL_ESTATE = wVar5;
        w wVar6 = new w("VENTURE_CAPITAL", 5);
        VENTURE_CAPITAL = wVar6;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
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
