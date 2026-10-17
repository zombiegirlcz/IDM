package qbf;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lqbf/t;", "", "STOCKS", "CRYPTO", "ADVANCED_PORTFOLIO_ANALYTICS", "ADVANCED_WEB_TRADING_TERMINAL", "EXTENDED_SECURITIES", "INCREASED_ORDER_LIMITS", "DEDICATED_CUSTOMER_SUPPORT", "NO_MINIMUM_FEES", "ORDER_BOOK", "UNKNOWN", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @lg.b("advanced_portfolio_analytics")
    public static final t ADVANCED_PORTFOLIO_ANALYTICS;

    @lg.b("advanced_web_trading_terminal")
    public static final t ADVANCED_WEB_TRADING_TERMINAL;

    @lg.b("crypto")
    public static final t CRYPTO;

    @lg.b("dedicated_customer_support")
    public static final t DEDICATED_CUSTOMER_SUPPORT;

    @lg.b("extended_securities_universe")
    public static final t EXTENDED_SECURITIES;

    @lg.b("securities_trading_increased_order_limit")
    public static final t INCREASED_ORDER_LIMITS;

    @lg.b("no_minimum_fees")
    public static final t NO_MINIMUM_FEES;

    @lg.b("order_book")
    public static final t ORDER_BOOK;

    @lg.b("stocks")
    public static final t STOCKS;

    @lg.b("UNKNOWN")
    @he0.b
    public static final t UNKNOWN;

    static {
        t tVar = new t("STOCKS", 0);
        STOCKS = tVar;
        t tVar2 = new t("CRYPTO", 1);
        CRYPTO = tVar2;
        t tVar3 = new t("ADVANCED_PORTFOLIO_ANALYTICS", 2);
        ADVANCED_PORTFOLIO_ANALYTICS = tVar3;
        t tVar4 = new t("ADVANCED_WEB_TRADING_TERMINAL", 3);
        ADVANCED_WEB_TRADING_TERMINAL = tVar4;
        t tVar5 = new t("EXTENDED_SECURITIES", 4);
        EXTENDED_SECURITIES = tVar5;
        t tVar6 = new t("INCREASED_ORDER_LIMITS", 5);
        INCREASED_ORDER_LIMITS = tVar6;
        t tVar7 = new t("DEDICATED_CUSTOMER_SUPPORT", 6);
        DEDICATED_CUSTOMER_SUPPORT = tVar7;
        t tVar8 = new t("NO_MINIMUM_FEES", 7);
        NO_MINIMUM_FEES = tVar8;
        t tVar9 = new t("ORDER_BOOK", 8);
        ORDER_BOOK = tVar9;
        t tVar10 = new t("UNKNOWN", 9);
        UNKNOWN = tVar10;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
