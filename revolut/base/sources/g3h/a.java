package g3h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SELL_ONLY_GOING_OTC;
    public static final a SELL_ONLY_LIQUIDITY_CONSTRAINTS;
    public static final a SELL_ONLY_PENNY_STOCK;
    public static final a SELL_ONLY_RISK_APPETITE;
    public static final a SELL_ONLY_SANCTIONS_ON_BUY;
    public static final a SUSPENDED_BANKRUPTCY;
    public static final a SUSPENDED_GOING_OTC;
    public static final a SUSPENDED_GOING_PRIVATE;
    public static final a SUSPENDED_MERGERS_AND_ACQUISITIONS;
    public static final a SUSPENDED_SANCTIONS_SUSPEND;
    public static final a SUSPENDED_STOCK_SPLIT;

    static {
        a aVar = new a("SELL_ONLY_RISK_APPETITE", 0);
        SELL_ONLY_RISK_APPETITE = aVar;
        a aVar2 = new a("SELL_ONLY_LIQUIDITY_CONSTRAINTS", 1);
        SELL_ONLY_LIQUIDITY_CONSTRAINTS = aVar2;
        a aVar3 = new a("SELL_ONLY_GOING_OTC", 2);
        SELL_ONLY_GOING_OTC = aVar3;
        a aVar4 = new a("SELL_ONLY_SANCTIONS_ON_BUY", 3);
        SELL_ONLY_SANCTIONS_ON_BUY = aVar4;
        a aVar5 = new a("SELL_ONLY_PENNY_STOCK", 4);
        SELL_ONLY_PENNY_STOCK = aVar5;
        a aVar6 = new a("SUSPENDED_MERGERS_AND_ACQUISITIONS", 5);
        SUSPENDED_MERGERS_AND_ACQUISITIONS = aVar6;
        a aVar7 = new a("SUSPENDED_STOCK_SPLIT", 6);
        SUSPENDED_STOCK_SPLIT = aVar7;
        a aVar8 = new a("SUSPENDED_GOING_OTC", 7);
        SUSPENDED_GOING_OTC = aVar8;
        a aVar9 = new a("SUSPENDED_SANCTIONS_SUSPEND", 8);
        SUSPENDED_SANCTIONS_SUSPEND = aVar9;
        a aVar10 = new a("SUSPENDED_GOING_PRIVATE", 9);
        SUSPENDED_GOING_PRIVATE = aVar10;
        a aVar11 = new a("SUSPENDED_BANKRUPTCY", 10);
        SUSPENDED_BANKRUPTCY = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
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
