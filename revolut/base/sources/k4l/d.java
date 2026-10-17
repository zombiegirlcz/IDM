package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d COMMODITIES;
    public static final d MARGIN;
    public static final d STOCKS;
    public static final d TAA;

    static {
        d dVar = new d("STOCKS", 0);
        STOCKS = dVar;
        d dVar2 = new d("COMMODITIES", 1);
        COMMODITIES = dVar2;
        d dVar3 = new d("MARGIN", 2);
        MARGIN = dVar3;
        d dVar4 = new d("TAA", 3);
        TAA = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
