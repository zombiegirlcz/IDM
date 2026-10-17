package vjg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ART;
    public static final a FUN;
    public static final a MAIN;
    public static final a PLANS;
    public static final a REDEEMABLE;
    public static final a REWARDS;

    static {
        a aVar = new a("MAIN", 0);
        MAIN = aVar;
        a aVar2 = new a("PLANS", 1);
        PLANS = aVar2;
        a aVar3 = new a("ART", 2);
        ART = aVar3;
        a aVar4 = new a("FUN", 3);
        FUN = aVar4;
        a aVar5 = new a("REDEEMABLE", 4);
        REDEEMABLE = aVar5;
        a aVar6 = new a("REWARDS", 5);
        REWARDS = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
