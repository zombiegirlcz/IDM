package zkh;

import aw0.o9;
import aw0.wa;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ael.t f322996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f322997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ufl.b f322998c;
    public final t5d.d d;

    public h(x8h.k displayCurrencyInteractor, ael.t portfolioBalanceInteractor, ybl.k tradingAccountsInteractor, ufl.b wealthHoldingsClauseFactory, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f322996a = portfolioBalanceInteractor;
        this.f322997b = tradingAccountsInteractor;
        this.f322998c = wealthHoldingsClauseFactory;
        this.d = swipeAssetTradeActionsMapper;
    }

    public final RowDelegate.Model a(InstrumentTicker instrumentTicker, kel.n nVar, dj0.d dVar, dj0.d dVar2, BigDecimal bigDecimal, Object obj2, w0 w0Var) {
        Clause textClause;
        dj0.d dVar3;
        TextLocalisedClause textLocalisedClause;
        String str = nVar.f183173a.f;
        String str2 = nVar.e;
        MoneyClause moneyClause = dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null;
        Clause clauseB = (dVar2 == null || bigDecimal == null) ? null : sfl.b.b(this.f322998c, dVar2, bigDecimal, null, 28);
        String str3 = nVar.f183173a.f183145a;
        TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        nel.z zVar = instrumentTicker != null ? instrumentTicker.d : null;
        if ((zVar == null ? -1 : f.f322991a[zVar.ordinal()]) == 1) {
            BigDecimal bigDecimal2 = instrumentTicker.f105125w;
            if (bigDecimal2 != null) {
                int i = R$string.wealth_search_item_bond_subtitle;
                BigDecimal bigDecimalMultiply = bigDecimal2.multiply(new BigDecimal(100));
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(new PercentageClause(bigDecimalMultiply, new PercentageClause.Format.Custom(2, 4, null, wa.SHOW_ALL_ZEROES, RoundingMode.DOWN), (Style) null, 4)), null, 12);
                textClause = textLocalisedClause;
            } else {
                textClause = null;
            }
        } else if (instrumentTicker == null || (dVar3 = instrumentTicker.e) == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            BigDecimal scale = nVar.f183174b.setScale(2, RoundingMode.DOWN);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            MoneyClause moneyClause2 = new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            if (scale.compareTo(BigDecimal.ZERO) == 0) {
                textLocalisedClause = new TextLocalisedClause(R$string.wealth_portfolio_shares_too_small_pattern, zhm.u.c(moneyClause2), null, 12);
                textClause = textLocalisedClause;
            } else {
                textClause = new TextLocalisedQuantityClause(R$plurals.wealth_portfolio_shares_subtitle_pattern, Integer.valueOf(scale.intValue()), zhm.v.k((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString(), moneyClause2), (Style) null, 24);
            }
        }
        return new RowDelegate.Model(str3, new InstrumentImage(str2, 30, null, null), null, null, textClause2, textClause, null, null, 0, new RowDelegate.Model.c.b(moneyClause, clauseB, null, false, 124), false, false, null, null, null, null, null, obj2, new AnalyticsContext(w0Var), 0, 0, 0, 0, 1023407980);
    }
}
