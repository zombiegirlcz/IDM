package s87;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CONSUMER_CONFIDENCE;
    public static final e GDP;
    public static final e INFLATION_RATE;
    public static final e INTEREST_RATE;
    public static final e RETAIL_SALES;
    public static final e UNEMPLOYMENT;

    static {
        e eVar = new e("GDP", 0);
        GDP = eVar;
        e eVar2 = new e("INFLATION_RATE", 1);
        INFLATION_RATE = eVar2;
        e eVar3 = new e("INTEREST_RATE", 2);
        INTEREST_RATE = eVar3;
        e eVar4 = new e("RETAIL_SALES", 3);
        RETAIL_SALES = eVar4;
        e eVar5 = new e("UNEMPLOYMENT", 4);
        UNEMPLOYMENT = eVar5;
        e eVar6 = new e("CONSUMER_CONFIDENCE", 5);
        CONSUMER_CONFIDENCE = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
