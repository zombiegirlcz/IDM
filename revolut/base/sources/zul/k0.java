package zul;

import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.trading.orders.R$string;
import ip0.ak0;
import ip0.sq;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jdf.g f325531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ruk.a0 f325532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3h.a f325533c;
    public final gte.a d;
    public final e4h.h e;
    public final e3h.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f325534g;

    public k0(jdf.g investmentPlanProjectionsMapper, ruk.a0 disclaimersMapper, x3h.a statsLabelsFormatter, gte.a featureToggleInteractor, e4h.h etfExposureOverviewMapper, e3h.f historicalChartMapper, g0 annualReturnDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(investmentPlanProjectionsMapper, "investmentPlanProjectionsMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        Intrinsics.checkNotNullParameter(statsLabelsFormatter, "statsLabelsFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(etfExposureOverviewMapper, "etfExposureOverviewMapper");
        Intrinsics.checkNotNullParameter(historicalChartMapper, "historicalChartMapper");
        Intrinsics.checkNotNullParameter(annualReturnDisclaimerMapper, "annualReturnDisclaimerMapper");
        this.f325531a = investmentPlanProjectionsMapper;
        this.f325532b = disclaimersMapper;
        this.f325533c = statsLabelsFormatter;
        this.d = featureToggleInteractor;
        this.e = etfExposureOverviewMapper;
        this.f = historicalChartMapper;
        this.f325534g = annualReturnDisclaimerMapper;
    }

    public final void a(aim.e eVar, List list, n nVar, List list2, dj0.d dVar) {
        TextDelegate.Model model;
        List listA = ((hsl.o) this.f325531a).a(list, nVar.f325540a);
        yp0.b.k(listA, 0, 0, 0, 0, 31);
        eVar.addAll(listA);
        int iMax = Math.max(0, list2.indexOf(dVar));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_invest_order_investment_plan_projections_slider_description, null, null, 14);
        int iJ = zhm.v.j(list2);
        Float fValueOf = Float.valueOf(16.0f);
        InputSliderDelegate.Model model2 = new InputSliderDelegate.Model("input_slider_list_id", sq.f166385a, 0, textLocalisedClause, iJ, iMax, b() ? new CompositeClause(zhm.v.k(yoj.b.w(new ImageClause(R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), sx4.g.e(2)), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8)), null, null, null, 14) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, false, null, null, null, 32528);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVar.add(model2);
        jdf.f domainState = nVar.f325540a;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (((jte.d) this.f325534g.f325527a).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c)) {
            int i = R$string.wealth_trading_invest_order_investment_plan_projections_disclaimer_learn_more;
            jdf.b bVar = domainState.f173063b;
            if (bVar == null) {
                bVar = jdf.b.FIVE_YEARS;
            }
            CompositeClause compositeClause = new CompositeClause(zhm.v.k(new TextLocalisedClause(i, null, new Click(28, (Integer) null, (Object) new m(bVar.b()), "ANNUAL_RETURN_DISCLAIMER_LINK", false), 10), sx4.g.e(1), new TextLocalisedClause(R$string.wealth_trading_invest_order_investment_plan_projections_disclaimer_description, null, null, 14)), null, null, null, 14);
            ak0 ak0Var = new ak0(null, null, 3);
            int i2 = R$attr.uikit_dp8;
            model = new TextDelegate.Model("ANNUAL_RETURN_DISCLAIMER_LIST_ID", compositeClause, false, ak0Var, null, null, i2, i2, 0, 0, 1652);
        } else {
            model = null;
        }
        n14.e.b(eVar, model);
    }

    public final boolean b() {
        return ((jte.d) this.d).c(FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c);
    }
}
