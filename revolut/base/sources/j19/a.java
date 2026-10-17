package j19;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EXCLUSIVE_STORE;
    public static final a LIFESTYLE_CAMPAIGNS;
    public static final a LIFESTYLE_INCENTIVE_TILE;
    public static final a LOYALTY;
    public static final a REWARDS_RECOMMENDATIONS;
    public static final a TRAVELS;

    static {
        a aVar = new a("LIFESTYLE_CAMPAIGNS", 0);
        LIFESTYLE_CAMPAIGNS = aVar;
        a aVar2 = new a("LOYALTY", 1);
        LOYALTY = aVar2;
        a aVar3 = new a("LIFESTYLE_INCENTIVE_TILE", 2);
        LIFESTYLE_INCENTIVE_TILE = aVar3;
        a aVar4 = new a("TRAVELS", 3);
        TRAVELS = aVar4;
        a aVar5 = new a("EXCLUSIVE_STORE", 4);
        EXCLUSIVE_STORE = aVar5;
        a aVar6 = new a("REWARDS_RECOMMENDATIONS", 5);
        REWARDS_RECOMMENDATIONS = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
