package fuk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DIVIDEND_YIELD_CHART;
    public static final b EPS_GROWTH_CHART;
    public static final b PE_CHART;

    static {
        b bVar = new b("EPS_GROWTH_CHART", 0);
        EPS_GROWTH_CHART = bVar;
        b bVar2 = new b("PE_CHART", 1);
        PE_CHART = bVar2;
        b bVar3 = new b("DIVIDEND_YIELD_CHART", 2);
        DIVIDEND_YIELD_CHART = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
