package yd9;

import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.exchange.models.ExchangeOrderInfo;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import d9.e1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import u80.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static final Clause a(ExchangeOrderInfo exchangeOrderInfo) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(exchangeOrderInfo.f72141h));
        BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        Intrinsics.h(bigDecimal2);
        if (e1.I(bigDecimal2)) {
            r6.b.D("The target rate should not be zero");
        }
        BigDecimal bigDecimalC = q.c(bigDecimal2);
        f8l.c cVar = f8l.c.FIAT;
        xi0.b bVar = exchangeOrderInfo.f;
        String str = bVar.f306286a;
        new Amount(bigDecimalC, new Asset(cVar, str, bVar));
        AssetClause assetClause = new AssetClause(bigDecimalC, new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(bigDecimalC.scale(), 2), false, false, 13)), str, null, o9.SENSITIVE, 8);
        int i = c.f312657a[exchangeOrderInfo.f72139c.ordinal()];
        return i != 3 ? i != 4 ? assetClause : new TextLocalisedClause(R$string.wealth_trading_orders_sl_price_subtitle, u.c(assetClause), null, 12) : new TextLocalisedClause(R$string.wealth_trading_orders_tp_price_subtitle, u.c(assetClause), null, 12);
    }

    public static final CompositeClause b(ExchangeOrder.Active active) {
        int i;
        Intrinsics.checkNotNullParameter(active, "<this>");
        boolean zP = hx7.q.P(active);
        ExchangeOrderInfo exchangeOrderInfo = active.f72130b;
        ExchangeOrderInfo exchangeOrderInfo2 = active.f72129a;
        if (zP) {
            Intrinsics.checkNotNullParameter(active, "<this>");
            ExchangeOrderInfo exchangeOrderInfo3 = exchangeOrderInfo2.f72139c == wd6.h.TAKE_PROFIT ? exchangeOrderInfo2 : null;
            if (exchangeOrderInfo3 == null) {
                exchangeOrderInfo3 = exchangeOrderInfo;
            }
            Clause clauseA = exchangeOrderInfo3 != null ? a(exchangeOrderInfo3) : null;
            Intrinsics.checkNotNullParameter(active, "<this>");
            if (exchangeOrderInfo2.f72139c != wd6.h.STOP_LOSS) {
                exchangeOrderInfo2 = null;
            }
            if (exchangeOrderInfo2 != null) {
                exchangeOrderInfo = exchangeOrderInfo2;
            }
            Clause[] elements = {clauseA, exchangeOrderInfo != null ? a(exchangeOrderInfo) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
        }
        boolean z = cp5.d.z(exchangeOrderInfo2.e);
        MoneyClause moneyClauseB = z ? u5l.a.b(d(active), null, null, null, 15) : new MoneyClause(d(active), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.SENSITIVE, 4);
        Clause clauseB = z ? u5l.a.b(q.a(new BigDecimal(String.valueOf(exchangeOrderInfo2.f72141h)), exchangeOrderInfo2.f), null, null, null, 15) : a(exchangeOrderInfo2);
        int i2 = c.f312657a[exchangeOrderInfo2.f72139c.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trading_orders_limit_price_subtitle;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException((exchangeOrderInfo2.f72139c + " is not supported").toString());
            }
            i = R$string.wealth_trading_orders_stop_price_subtitle;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(clauseB), null, 12);
        if (!z) {
            return yoj.b.m(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(moneyClauseB, textLocalisedClause));
        }
        List listK = v.k(moneyClauseB, clauseB);
        m70.a.a(t0.f186434a);
        return yoj.b.m(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listK);
    }

    public static final TextLocalisedClause c(ExchangeOrder.Active active) {
        int i;
        Intrinsics.checkNotNullParameter(active, "<this>");
        boolean zP = hx7.q.P(active);
        ExchangeOrderInfo exchangeOrderInfo = active.f72129a;
        if (zP) {
            i = R$string.wealth_trading_orders_tpsl_title;
        } else {
            int i2 = c.f312658b[exchangeOrderInfo.d.ordinal()];
            if (i2 == 1) {
                int i3 = c.f312657a[exchangeOrderInfo.f72139c.ordinal()];
                if (i3 == 1) {
                    i = R$string.wealth_trading_orders_limit_order_buy_title;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException((exchangeOrderInfo.f72139c + " mapping is not supported or the wrong mapper is used").toString());
                    }
                    i = R$string.wealth_trading_orders_stop_order_buy_title;
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i5 = c.f312657a[exchangeOrderInfo.f72139c.ordinal()];
                if (i5 == 1) {
                    i = R$string.wealth_trading_orders_limit_order_sell_title;
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException((exchangeOrderInfo.f72139c + " mapping is not supported or the wrong mapper is used").toString());
                    }
                    i = R$string.wealth_trading_orders_stop_order_sell_title;
                }
            }
        }
        return new TextLocalisedClause(i, u.c(new CurrencyClause(exchangeOrderInfo.e, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12);
    }

    public static final dj0.d d(ExchangeOrder exchangeOrder) {
        if (Intrinsics.f(exchangeOrder.getF72134a().f72140g.f115083b, exchangeOrder.getF72134a().e)) {
            return exchangeOrder.getF72134a().f72140g;
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(exchangeOrder.getF72134a().f72141h));
        if (e1.I(bigDecimal)) {
            r6.b.D("The target rate should not be zero");
            dj0.d.Companion.getClass();
            return dj0.d.c(dj0.d.e, 0L, exchangeOrder.getF72134a().e, 1);
        }
        dj0.d dVar = exchangeOrder.getF72134a().f72140g;
        BigDecimal bigDecimalDivide = BigDecimal.ONE.divide(bigDecimal, MathContext.DECIMAL128);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return pyd.c.L(dVar, bigDecimalDivide, exchangeOrder.getF72134a().e);
    }
}
