package soa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BANK_UAB;
    public static final c COMMODITY_VOLATILITY;
    public static final c CRYPTOCURRENCY_VOLATILITY;
    public static final c DAILY_STOCK_HIGHLIGHTS;
    public static final c MARKETING;
    public static final c OFFERS;
    public static final c PERSONALIZED_THIRD_PARTY;
    public static final c REVOLUT_PAY_DELIVERY_TRACKING;
    public static final c REVOLUT_PAY_FLIGHT_TRACKING;
    public static final c REVOLUT_X_MARKETING;
    public static final c TRADING_STOCKS_VOLATILITY;

    static {
        c cVar = new c("MARKETING", 0);
        MARKETING = cVar;
        c cVar2 = new c("REVOLUT_X_MARKETING", 1);
        REVOLUT_X_MARKETING = cVar2;
        c cVar3 = new c("PERSONALIZED_THIRD_PARTY", 2);
        PERSONALIZED_THIRD_PARTY = cVar3;
        c cVar4 = new c("OFFERS", 3);
        OFFERS = cVar4;
        c cVar5 = new c("CRYPTOCURRENCY_VOLATILITY", 4);
        CRYPTOCURRENCY_VOLATILITY = cVar5;
        c cVar6 = new c("COMMODITY_VOLATILITY", 5);
        COMMODITY_VOLATILITY = cVar6;
        c cVar7 = new c("TRADING_STOCKS_VOLATILITY", 6);
        TRADING_STOCKS_VOLATILITY = cVar7;
        c cVar8 = new c("BANK_UAB", 7);
        BANK_UAB = cVar8;
        c cVar9 = new c("DAILY_STOCK_HIGHLIGHTS", 8);
        DAILY_STOCK_HIGHLIGHTS = cVar9;
        c cVar10 = new c("REVOLUT_PAY_DELIVERY_TRACKING", 9);
        REVOLUT_PAY_DELIVERY_TRACKING = cVar10;
        c cVar11 = new c("REVOLUT_PAY_FLIGHT_TRACKING", 10);
        REVOLUT_PAY_FLIGHT_TRACKING = cVar11;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
