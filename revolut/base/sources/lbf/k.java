package lbf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ADVANCED_PORTFOLIO_ANALYTICS;
    public static final k ADVANCED_WEB_TRADING_TERMINAL;
    public static final k CRYPTO;
    public static final k DEDICATED_CUSTOMER_SUPPORT;
    public static final k EXTENDED_SECURITIES;
    public static final k INCREASED_ORDER_LIMITS;
    public static final k NO_MINIMUM_FEES;
    public static final k ORDER_BOOK;
    public static final k STOCKS;
    public static final k UNKNOWN;

    static {
        k kVar = new k("STOCKS", 0);
        STOCKS = kVar;
        k kVar2 = new k("CRYPTO", 1);
        CRYPTO = kVar2;
        k kVar3 = new k("ADVANCED_PORTFOLIO_ANALYTICS", 2);
        ADVANCED_PORTFOLIO_ANALYTICS = kVar3;
        k kVar4 = new k("ADVANCED_WEB_TRADING_TERMINAL", 3);
        ADVANCED_WEB_TRADING_TERMINAL = kVar4;
        k kVar5 = new k("EXTENDED_SECURITIES", 4);
        EXTENDED_SECURITIES = kVar5;
        k kVar6 = new k("INCREASED_ORDER_LIMITS", 5);
        INCREASED_ORDER_LIMITS = kVar6;
        k kVar7 = new k("DEDICATED_CUSTOMER_SUPPORT", 6);
        DEDICATED_CUSTOMER_SUPPORT = kVar7;
        k kVar8 = new k("NO_MINIMUM_FEES", 7);
        NO_MINIMUM_FEES = kVar8;
        k kVar9 = new k("ORDER_BOOK", 8);
        ORDER_BOOK = kVar9;
        k kVar10 = new k("UNKNOWN", 9);
        UNKNOWN = kVar10;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
