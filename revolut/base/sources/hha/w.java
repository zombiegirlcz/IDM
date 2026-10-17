package hha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w EVERYDAY_BENEFITS;
    public static final w FEATURES_FOR_YOU;
    public static final w INSURANCE_BENEFITS;
    public static final w INVESTMENTS;
    public static final w TRAVEL_BENEFITS;
    public static final w TRAVEL_SAVINGS_AND_PROTECTION;
    public static final w UNKNOWN;

    static {
        w wVar = new w("EVERYDAY_BENEFITS", 0);
        EVERYDAY_BENEFITS = wVar;
        w wVar2 = new w("TRAVEL_BENEFITS", 1);
        TRAVEL_BENEFITS = wVar2;
        w wVar3 = new w("INSURANCE_BENEFITS", 2);
        INSURANCE_BENEFITS = wVar3;
        w wVar4 = new w("INVESTMENTS", 3);
        INVESTMENTS = wVar4;
        w wVar5 = new w("TRAVEL_SAVINGS_AND_PROTECTION", 4);
        TRAVEL_SAVINGS_AND_PROTECTION = wVar5;
        w wVar6 = new w("FEATURES_FOR_YOU", 5);
        FEATURES_FOR_YOU = wVar6;
        w wVar7 = new w("UNKNOWN", 6);
        UNKNOWN = wVar7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7};
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
