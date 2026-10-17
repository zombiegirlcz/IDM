package orl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n COMMODITIES;
    public static final n MARGIN;
    public static final n STOCKS;
    public static final n TAX_ADVANTAGED;

    static {
        n nVar = new n("COMMODITIES", 0);
        COMMODITIES = nVar;
        n nVar2 = new n("MARGIN", 1);
        MARGIN = nVar2;
        n nVar3 = new n("STOCKS", 2);
        STOCKS = nVar3;
        n nVar4 = new n("TAX_ADVANTAGED", 3);
        TAX_ADVANTAGED = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
