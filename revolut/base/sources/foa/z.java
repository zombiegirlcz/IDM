package foa;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z COMMODITY_VOLATILITY;
    public static final z CREDIT_COLLECTION;
    public static final z CRYPTOCURRENCY_VOLATILITY;

    @NotNull
    public static final y Companion;
    public static final z MARKETING;
    public static final z PERSONALIZED_THIRD_PARTY;
    public static final z REVOLUT_PAY_DELIVERY_TRACKING;
    public static final z REVOLUT_PAY_FLIGHT_TRACKING;
    public static final z REVOLUT_X_MARKETING;
    public static final z TRADING_STOCKS_VOLATILITY;

    static {
        z zVar = new z("MARKETING", 0);
        MARKETING = zVar;
        z zVar2 = new z("REVOLUT_X_MARKETING", 1);
        REVOLUT_X_MARKETING = zVar2;
        z zVar3 = new z("PERSONALIZED_THIRD_PARTY", 2);
        PERSONALIZED_THIRD_PARTY = zVar3;
        z zVar4 = new z("TRADING_STOCKS_VOLATILITY", 3);
        TRADING_STOCKS_VOLATILITY = zVar4;
        z zVar5 = new z("COMMODITY_VOLATILITY", 4);
        COMMODITY_VOLATILITY = zVar5;
        z zVar6 = new z("CRYPTOCURRENCY_VOLATILITY", 5);
        CRYPTOCURRENCY_VOLATILITY = zVar6;
        z zVar7 = new z("REVOLUT_PAY_DELIVERY_TRACKING", 6);
        REVOLUT_PAY_DELIVERY_TRACKING = zVar7;
        z zVar8 = new z("REVOLUT_PAY_FLIGHT_TRACKING", 7);
        REVOLUT_PAY_FLIGHT_TRACKING = zVar8;
        z zVar9 = new z("CREDIT_COLLECTION", 8);
        CREDIT_COLLECTION = zVar9;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
        Companion = new y();
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
