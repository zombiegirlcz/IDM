package t2i;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_exchange.impl.R$string;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    public final CellDetailsDelegate.Model a(b2i.b summary, o9 sensitivity) {
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        int i2 = i.f267585b[summary.e.ordinal()];
        if (i2 == 1) {
            i = R$string.fx_orders_summary_amount;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.fx_orders_summary_estimated_amount;
        }
        return new CellDetailsDelegate.Model("AMOUNT", new TextLocalisedClause(i, null, null, 14), new MoneyClause(summary.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, sensitivity, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final CellDetailsDelegate.Model b(b2i.b summary) {
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        wd6.e eVar = summary.f11943b;
        b2i.a aVar = summary.f11945g;
        int i2 = i.f267586c[eVar.ordinal()];
        if (i2 == 1) {
            int i3 = i.f267585b[aVar.ordinal()];
            if (i3 == 1) {
                i = R$string.fx_orders_summary_cost;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.fx_orders_summary_estimated_cost;
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = i.f267585b[aVar.ordinal()];
            if (i5 == 1) {
                i = R$string.fx_orders_summary_credit;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.fx_orders_summary_estimated_credit;
            }
        }
        return new CellDetailsDelegate.Model("COUNTER_AMOUNT", new TextLocalisedClause(i, null, null, 14), new MoneyClause(summary.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final CellDetailsDelegate.Model c(b2i.b summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new CellDetailsDelegate.Model("EXPIRE", new TextLocalisedClause(R$string.fx_orders_summary_expire_by, null, null, 14), new TextLocalisedClause(R$string.fx_orders_summary_never, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public final TextLocalisedClause d(b2i.b summary) {
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        wd6.h hVar = summary.f11942a;
        wd6.e eVar = summary.f11943b;
        wd6.h hVar2 = wd6.h.LIMIT;
        if (hVar == hVar2 && eVar == wd6.e.BUY) {
            i = R$string.fx_orders_summary_limit_buy;
        } else if (hVar == hVar2 && eVar == wd6.e.SELL) {
            i = R$string.fx_orders_summary_limit_sell;
        } else {
            wd6.h hVar3 = wd6.h.STOP;
            if (hVar == hVar3 && eVar == wd6.e.BUY) {
                i = R$string.fx_orders_summary_stop_buy;
            } else if (hVar == hVar3 && eVar == wd6.e.SELL) {
                i = R$string.fx_orders_summary_stop_sell;
            } else {
                wd6.h hVar4 = wd6.h.MARKET;
                if (hVar == hVar4 && eVar == wd6.e.BUY) {
                    i = R$string.market_order_confirmation_header_buy_title;
                } else {
                    if (hVar != hVar4 || eVar != wd6.e.SELL) {
                        throw new IllegalArgumentException(" details for " + hVar + " and " + eVar + " is not supported");
                    }
                    i = R$string.market_order_confirmation_header_sell_title;
                }
            }
        }
        return new TextLocalisedClause(i, u.c(new MoneyClause(summary.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }

    public final MoneyClause e(b2i.b summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        wd6.e eVar = summary.f11943b;
        dj0.d dVarL = summary.f;
        if (eVar == wd6.e.BUY) {
            dVarL = dVarL.l();
        }
        return new MoneyClause(dVarL, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4);
    }

    public final CellDetailsDelegate.Model f(b2i.b summary) {
        BigDecimal bigDecimal;
        int i;
        Intrinsics.checkNotNullParameter(summary, "summary");
        wd6.h hVar = summary.f11942a;
        dj0.d dVar = summary.d;
        if (hVar == wd6.h.MARKET) {
            Double d = summary.f11946h;
            bigDecimal = d != null ? new BigDecimal(String.valueOf(d.doubleValue())) : BigDecimal.ZERO;
        } else {
            bigDecimal = new BigDecimal(String.valueOf(summary.f11944c));
        }
        BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
        RateClause.Format format = cp5.d.z(dVar.f115083b) ? new RateClause.Format.Default(dVar.f115083b, true) : new RateClause.Format.ExchangeRate(true);
        int i2 = i.f267584a[hVar.ordinal()];
        if (i2 == 1) {
            i = R$string.fx_orders_settings_stop_price;
        } else if (i2 == 2) {
            i = R$string.fx_orders_settings_limit_price;
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(hVar + " not supported");
            }
            i = R$string.rates_transaction_breakdown_rate;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Intrinsics.h(bigDecimal2);
        return new CellDetailsDelegate.Model("LIMIT", textLocalisedClause, new RateClause(bigDecimal2, summary.f.f115083b, format, null), 0, null, null, null, null, null, false, 0, 0, 32760);
    }
}
