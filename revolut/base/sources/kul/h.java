package kul;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.ui.trade.model.ExtendedHoursStatus;
import d9.e1;
import dfl.r;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4l.e0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.v5;
import nel.z;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xul.l f189858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final evl.c f189859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wul.j f189860c;
    public final gte.a d;
    public final d1h.h e;

    public h(kvl.f autoTopUpMapper, xul.l orderUnifiedInfoGroupMapper, evl.c sourcePocketMapper, wul.j scheduleSettingsMapper, gte.a featureToggleInteractor, d1h.h wealthRemoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(autoTopUpMapper, "autoTopUpMapper");
        Intrinsics.checkNotNullParameter(orderUnifiedInfoGroupMapper, "orderUnifiedInfoGroupMapper");
        Intrinsics.checkNotNullParameter(sourcePocketMapper, "sourcePocketMapper");
        Intrinsics.checkNotNullParameter(scheduleSettingsMapper, "scheduleSettingsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f189858a = orderUnifiedInfoGroupMapper;
        this.f189859b = sourcePocketMapper;
        this.f189860c = scheduleSettingsMapper;
        this.d = featureToggleInteractor;
        this.e = wealthRemoteDisclaimersMapper;
    }

    public static CellDetailsActionDelegate.Model e(Instant deadline) {
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        return new CellDetailsActionDelegate.Model("LIST_ID_ORDER_CANCELLATION_DEADLINE", new TextLocalisedClause(R$string.wealth_trading_orders_item_cancellation_deadline, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(deadline.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12), null, false, false, null, null, deadline, 0, 0, 0, 0, 4192228);
    }

    public static CellDetailsActionDelegate.Model f(Instant date, bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        return new CellDetailsActionDelegate.Model("LIST_ID_ESTIMATED_SETTLEMENT_DATE", new TextLocalisedClause(R$string.wealth_trading_orders_estimated_settlement, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(date.toEpochMilli(), new TimeClause.Format.DateMedium(0), null, null, 12), false, false, null, tradeSide, 0, 0, 32224);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List g(com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult r33) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kul.h.g(com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult):java.util.List");
    }

    public static CellDetailsActionDelegate.Model h(ZonedDateTime expirationDate, r0 orderType) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_review_expiry, null, null, 14);
        long jI = pu7.a.I(expirationDate);
        TimeClause.Format.INSTANCE.getClass();
        return new CellDetailsActionDelegate.Model("TIME_IN_FORCE_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TimeClause(jI, TimeClause.Format.f57959a, null, null, 12), false, true, null, new Pair(expirationDate, orderType), 0, 0, 32160);
    }

    public static CellDetailsDelegate.Model i(ExtendedHoursStatus extendedHoursStatus) {
        boolean z;
        Intrinsics.checkNotNullParameter(extendedHoursStatus, "extendedHoursStatus");
        if (Intrinsics.f(extendedHoursStatus, ExtendedHoursStatus.Unavailable.f107065a)) {
            return null;
        }
        if (Intrinsics.f(extendedHoursStatus, ExtendedHoursStatus.OptedOut.f107064a)) {
            z = false;
        } else {
            if (!(extendedHoursStatus instanceof ExtendedHoursStatus.OptedIn)) {
                throw new NoWhenBranchMatchedException();
            }
            z = ((ExtendedHoursStatus.OptedIn) extendedHoursStatus).f107063a;
        }
        return new CellDetailsDelegate.Model("EXTENDED_HOURS_ID", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_extended_hours_info_popup_extended_hours, null, null, 14), new TextLocalisedClause(z ? com.revolut.trading.orders.R$string.market_data_exchange_breakdown_extended_hours_included_copy : com.revolut.trading.orders.R$string.market_data_exchange_breakdown_extended_hours_excluded_copy, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static qv0.i j(h hVar, ChargeBreakdown feeBreakdown, r0 r0Var, nel.n nVar, e0 e0Var, boolean z) {
        hVar.getClass();
        Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
        return ((wul.m) hVar.f189858a).e(feeBreakdown, r0Var, null, null, e0Var, null, z);
    }

    public static RowDelegate.Model k(AutoTopUpStatus autoTopUpStatus, SourcePocketWrapper sourcePocketWrapper, nel.n instrument) {
        Boolean boolValueOf;
        boolean zJ;
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        if (Intrinsics.f(autoTopUpStatus, AutoTopUpStatus.Unavailable.f91772a)) {
            zJ = sourcePocketWrapper.b();
        } else {
            if (!(autoTopUpStatus instanceof AutoTopUpStatus.Available)) {
                throw new NoWhenBranchMatchedException();
            }
            AutoTopUpSource autoTopUpSource = ((AutoTopUpStatus.Available) autoTopUpStatus).f91771a;
            if (autoTopUpSource != null) {
                xi0.a aVar = xi0.b.Companion;
                String str = ((AutoTopUpSource.Pocket) autoTopUpSource).f91770a.f163147c;
                aVar.getClass();
                boolValueOf = Boolean.valueOf(!xi0.a.a(str).equals(instrument.i));
            } else {
                boolValueOf = null;
            }
            zJ = pd.b.j(boolValueOf);
        }
        if (!zJ) {
            return null;
        }
        CurrencyClause currencyClause = new CurrencyClause(instrument.i, CurrencyClause.Format.Ticker.f57756a, null, 4);
        return new RowDelegate.Model("LIST_ID_BANNER_FX_FEES", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rates_converter, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_fx_fees_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_fx_fees_message_format, v.k(currencyClause, currencyClause, currencyClause), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static qv0.i l(OrderQuote orderQuote, nel.n instrument) throws Throwable {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        dj0.d dVarL = a.a.L(new Amount(orderQuote.f104757j.f104792a, e1.u(orderQuote).f104718b));
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        MoneyClause moneyClause = new MoneyClause(dVarL, defaults, null, o9Var, 4);
        f8l.e eVar = orderQuote.k;
        int i = g.f189857c[eVar.ordinal()];
        if (i == 1) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trade_list_last_price, null, null, 14);
            BigDecimal ONE = BigDecimal.ONE;
            Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
            List listK = v.k(new AssetClause(ONE, new AssetClauseType.Stock(0), instrument.e, null, o9Var, 8), moneyClause);
            m70.a.d(t0.f186434a);
            return new CellDetailsActionDelegate.Model("PRICE_ROW_ID", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_rates, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), yoj.b.m(new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK), false, false, null, null, 0, 0, 32672);
        }
        if (i == 2) {
            return new CellDetailsDelegate.Model("PRICE_ROW_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.wealth_trading_orders_limit_price, null, null, 14), (Image) null, 0, false, 30), moneyClause, null, null, null, null, 0, null, false, false, null, null, 28664);
        }
        if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        hx7.e.n(new IllegalStateException(eVar + " not supported for IPO"));
        return null;
    }

    public static RowDelegate.Model m() {
        return new RowDelegate.Model("LIST_ID_BANNER_ORDER_EXECUTION", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_execution_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_execution_general_info, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public static PlainTextDelegate.Model n(bfl.g side) {
        int i;
        Intrinsics.checkNotNullParameter(side, "side");
        int i2 = g.d[side.ordinal()];
        if (i2 == 1) {
            i = com.revolut.trading.orders.R$string.wealth_trading_orders_item_shares_to_be_confirmed;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.trading.orders.R$string.wealth_trading_orders_item_amount_to_be_confirmed;
        }
        return new PlainTextDelegate.Model("LIST_ID_ORDER_VALUE_CONFIRMATION", (Clause) null, (Clause) new TextLocalisedClause(i, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
    }

    public static List o(FiatExchangeOrderQuote fiatExchangeOrderQuotes) {
        Object next;
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuotes, "fiatExchangeOrderQuotes");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuotes, "<this>");
        List list = fiatExchangeOrderQuotes.f91688c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(e1.v((OrderQuote) it8.next()));
        }
        Iterator it9 = arrayList.iterator();
        if (it9.hasNext()) {
            next = it9.next();
            while (it9.hasNext()) {
                next = a.a.x((Amount) next, (Amount) it9.next());
            }
        } else {
            next = null;
        }
        Amount amount = (Amount) next;
        if (amount != null) {
            Amount amount2 = e1.G(amount.f104717a) ? amount : null;
            if (amount2 != null) {
                Amount amountA = qcf.a.a(fiatExchangeOrderQuotes);
                if (amountA == null) {
                    BigDecimal ZERO = BigDecimal.ZERO;
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    amountA = new Amount(ZERO, amount2.f104718b);
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_review_paid_by_cash_title, null, null, 14);
                o9 o9Var = o9.NON_SENSITIVE;
                return v.k(new CellDetailsDelegate.Model("LIST_ID_PAID_BY_CASH_ITEM", textLocalisedClause, e4i.c.a(amountA, null, null, null, null, o9Var, 31), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("LIST_ID_PAID_BY_MARGIN_ITEM", new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_review_paid_by_margin_title, null, null, 14), e4i.c.a(amount2, null, null, null, null, o9Var, 31), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
        }
        return f0.f322471a;
    }

    public static qv0.i p(OrderQuote orderQuote, z instrumentType, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        int i2 = g.f189856b[instrumentType.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trading_orders_item_last_available_price;
        } else if (i2 != 2) {
            hx7.e.n(new IllegalStateException("add support for " + instrumentType));
            i = com.revolut.trading.orders.R$string.wealth_trading_orders_current_price;
        } else {
            i = com.revolut.trading.orders.R$string.wealth_trading_orders_current_price;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(a.a.L(new Amount(orderQuote.f104757j.f104792a, e1.u(orderQuote).f104718b)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        return z ? new CellDetailsActionDelegate.Model("LIST_ID_PRICE_CELL", textLocalisedClause, 0, new ResourceImage(R$drawable.uikit_icn_24_arrow_rates, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new CompositeClause(v.k(new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_list_units_value, (Number) 1, (List) null, (Style) null, 28), moneyClause), new TextClause(" = ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "price_cell_value_click_id", false), null, 8), null, false, false, null, null, null, 0, 0, 0, 0, 4194276) : new CellDetailsDelegate.Model("LIST_ID_PRICE_CELL", new aw0.t0((Clause) textLocalisedClause, (Image) null, 0, false, 22), moneyClause, null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static PlainTextDelegate.Model q(Instant date, bfl.g tradeSide) {
        int i;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        int i2 = g.d[tradeSide.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trading_orders_item_next_price_and_shares_update_date;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_orders_item_next_price_update_date;
        }
        return new PlainTextDelegate.Model("LIST_ID_PRICE_UPDATE_DATE_CELL", (Clause) null, (Clause) new TextLocalisedClause(i, u.c(new TimeClause(date.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
    }

    public static CellDetailsDelegate.Model s(OrderQuote orderQuote, bfl.g side) {
        Amount amountU;
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = g.d[side.ordinal()];
        if (i == 1) {
            amountU = e1.u(orderQuote);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amountU = e1.v(orderQuote);
        }
        return new CellDetailsDelegate.Model("LIST_ID_ORDER_VALUE", new aw0.t0((Clause) new TextLocalisedClause(R$string.wealth_trade_list_traded_value, null, null, 14), (Image) null, 0, false, 30), e4i.c.a(amountU, null, null, null, null, o9.NON_SENSITIVE, 31), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static RowDelegate.Model t(ChargeBreakdown chargeBreakdown, nel.n instrument, hel.b bVar) {
        Intrinsics.checkNotNullParameter(chargeBreakdown, "chargeBreakdown");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        if (instrument.d()) {
            return u(new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_etf_commission_fee_title, null, null, 14), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_etf_commission_fee_message, null, null, 14));
        }
        if (instrument.c()) {
            return u(new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_commission_title_private_markets, null, null, 14), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_commission_description_info_private_markets, null, null, 14));
        }
        Amount amount = chargeBreakdown.f104722a;
        Amount amount2 = e1.G(amount.f104717a) ? amount : null;
        if (amount2 != null) {
            return u((bVar == null ? -1 : g.e[bVar.ordinal()]) == 1 ? new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_commission_fee_title, null, null, 14) : new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_usage_fees_title, null, null, 14), new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_recurring_buy_banner_usage_fees_message_format, u.c(e4i.c.a(amount2, null, null, null, null, o9.NON_SENSITIVE, 31)), null, 12));
        }
        return null;
    }

    public static final RowDelegate.Model u(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new RowDelegate.Model("LIST_ID_BANNER_USAGE_FEES", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_fees, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    public final qv0.i a(TradingAccount tradingAccount, hel.b bVar, bfl.g tradeSide) {
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(tradeSide, "<this>");
        TextLocalisedClause textLocalisedClause = null;
        if ((tradeSide == bfl.g.SELL) && bVar == hel.b.MX) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.trading.orders.R$string.trading_orders_review_disclaimer_mx_potential_conversion_description, null, null, 14);
        }
        return ((wul.m) this.f189858a).b(tradingAccount, bVar, textLocalisedClause);
    }

    public final qv0.i b(bfl.g tradeSide, OrderQuote orderQuote, dj0.d totalMoney, r0 r0Var, z zVar) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(totalMoney, "totalMoney");
        return ((wul.m) this.f189858a).c(tradeSide, orderQuote.f104752a == orderQuote.f104753b ? r.STOCK_QUANTITY : r.MONEY_AMOUNT, totalMoney, r0Var, zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model c(com.revolut.feature.trading_orders.common.models.AutoTopUpStatus r33, hel.b r34, com.revolut.data.model.Data r35) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kul.h.c(com.revolut.feature.trading_orders.common.models.AutoTopUpStatus, hel.b, com.revolut.data.model.Data):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public final qv0.i d(AutoTopUpStatus autoTopUpStatus, SourcePocketWrapper sourcePocketWrapper, TradingLegalEntityInformation tradingLegalEntityInformation) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        if (Intrinsics.f(autoTopUpStatus, AutoTopUpStatus.Unavailable.f91772a)) {
            textLocalisedClause = (sourcePocketWrapper.b() || !sourcePocketWrapper.d) ? this.f189859b.a(sourcePocketWrapper.f91794a, tradingLegalEntityInformation, null) : null;
        } else {
            if (!(autoTopUpStatus instanceof AutoTopUpStatus.Available)) {
                throw new NoWhenBranchMatchedException();
            }
            AutoTopUpSource autoTopUpSource = ((AutoTopUpStatus.Available) autoTopUpStatus).f91771a;
            if (autoTopUpSource == null) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_auto_topup_none, null, null, 14);
            } else {
                if (!(autoTopUpSource instanceof AutoTopUpSource.Pocket)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_auto_topup_details_format, u.c(new CurrencyClause(z92.f.l(((AutoTopUpSource.Pocket) autoTopUpSource).f91770a), CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
            }
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        if (textLocalisedClause2 != null) {
            return new CellDetailsDelegate.Model("LIST_ID_AUTO_TOP_UP_SETTINGS_ITEM", new TextLocalisedClause(R$string.wealth_trading_orders_auto_topup, null, null, 14), textLocalisedClause2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        return null;
    }

    public final qv0.i r(OrderQuote orderQuote, r0 r0Var, z zVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(orderQuote, "<this>");
        if (e1.k(orderQuote).f104719a != f8l.c.SECURITY) {
            f8l.c cVar = e1.t(orderQuote).f104719a;
        }
        return ((wul.m) this.f189858a).k(r0Var, orderQuote.f104752a == orderQuote.f104753b ? r.STOCK_QUANTITY : r.MONEY_AMOUNT, e1.l(orderQuote), zVar, false);
    }
}
