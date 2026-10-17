package kbh;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.ak0;
import java.util.List;
import k1h.o;
import k1h.p;
import k1h.q;
import k1h.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.z;
import z0h.m1;
import z0h.n1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f182593a;

    public h(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f182593a = featureToggleInteractor;
    }

    public static CompositeClause b(Links links) {
        HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(R$string.trading_disclosures_footer_capital_at_risk, u.c(links.d), (Integer) null, new p(links.d), 12);
        int i = R$string.trading_disclosures_footer_view_trading_disclosures;
        m70.a.c(t0.f186434a);
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause, new HtmlLocalisedClause(i, u.c(""), (Integer) null, o.a.f180271a, 12)));
    }

    public static TextLocalisedClause c(q qVar, hel.b bVar) {
        int i = g.f182592b[qVar.ordinal()];
        if (i == 1) {
            switch (g.f182591a[bVar.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_us, null, null, 14);
                case 2:
                    return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_eea, null, null, 14);
                case 3:
                case 4:
                case 5:
                    return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_sg, null, null, 14);
                case 6:
                    return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_gb, null, null, 14);
                case 7:
                    return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        switch (g.f182591a[bVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_us, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_eea, null, null, 14);
            case 3:
            case 4:
            case 5:
                return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_sg, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_gb, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_news_data_provided_by_au, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static CompositeClause e(Links links) {
        HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(R$string.trading_disclosures_footer_view_terms_business, u.c(links.f105092g), (Integer) null, new p(links.f105092g), 12);
        int i = R$string.trading_disclosures_footer_and_trading_disclosures;
        m70.a.c(t0.f186434a);
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause, new HtmlLocalisedClause(i, u.c(""), (Integer) null, o.a.f180271a, 12)));
    }

    public final List d(Links links, hel.b tradingContext, z zVar, q qVar) {
        CompositeClause compositeClauseM;
        CompositeClause compositeClause;
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        switch (g.f182591a[tradingContext.ordinal()]) {
            case 1:
                TextLocalisedClause textLocalisedClauseC = qVar != null ? c(qVar, hel.b.US) : null;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trading_disclosures_footer_us_all_investments_involve_risk, null, null, 14);
                int i = R$string.trading_disclosures_footer_view_trading_disclosures;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Clause[] elements = {textLocalisedClauseC, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new HtmlLocalisedClause(i, u.c(""), (Integer) null, o.a.f180271a, 12))), new TextLocalisedClause(R$string.wealth_trading_revolut_securities_disclaimer_us, null, null, 14)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                compositeClauseM = yoj.b.m(new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                compositeClause = compositeClauseM;
                TextDelegate.Model model = new TextDelegate.Model("footer.disclosure", CompositeClause.a(compositeClause, null, null, 11), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                int i2 = R$attr.uikit_dp16;
                yp0.b.r(model, 0, 0, i2, i2, 3);
                return u.c(model);
            case 2:
                if (zVar == null || !io3.h.k(zVar)) {
                    Clause[] elements2 = {qVar != null ? c(qVar, hel.b.EEA) : null, new TextLocalisedClause(R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_revolut_securities_disclaimer_eea, null, null, 14), b(links)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    List listL = kotlin.collections.d.L(elements2);
                    t0 t0Var2 = t0.f186434a;
                    compositeClauseM = yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var2), m70.a.o(t0Var2)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL);
                } else {
                    Clause[] elements3 = {qVar != null ? c(qVar, hel.b.EEA) : null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14), new TextLocalisedClause(R$string.trading_disclosures_footer_fund_exposure_eu, null, null, 14))), new TextLocalisedClause(R$string.wealth_trading_revolut_securities_disclaimer_eea, null, null, 14), b(links)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    List listL2 = kotlin.collections.d.L(elements3);
                    t0 t0Var3 = t0.f186434a;
                    compositeClauseM = yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var3), m70.a.o(t0Var3)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL2);
                }
                compositeClause = compositeClauseM;
                TextDelegate.Model model2 = new TextDelegate.Model("footer.disclosure", CompositeClause.a(compositeClause, null, null, 11), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                int i22 = R$attr.uikit_dp16;
                yp0.b.r(model2, 0, 0, i22, i22, 3);
                return u.c(model2);
            case 3:
                Clause[] elements4 = {qVar != null ? c(qVar, hel.b.MX) : null, new TextLocalisedClause(R$string.wealth_trading_revolut_securities_disclaimer_mx, null, null, 14), e(links)};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                List listL3 = kotlin.collections.d.L(elements4);
                t0 t0Var4 = t0.f186434a;
                compositeClauseM = yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var4), m70.a.o(t0Var4)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL3);
                compositeClause = compositeClauseM;
                TextDelegate.Model model22 = new TextDelegate.Model("footer.disclosure", CompositeClause.a(compositeClause, null, null, 11), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                int i222 = R$attr.uikit_dp16;
                yp0.b.r(model22, 0, 0, i222, i222, 3);
                return u.c(model22);
            case 4:
            case 5:
                Clause[] elements5 = {qVar != null ? c(qVar, hel.b.SG) : null, new TextLocalisedClause(R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_revolut_securities_disclaimer_sg, null, null, 14), e(links)};
                Intrinsics.checkNotNullParameter(elements5, "elements");
                List listL4 = kotlin.collections.d.L(elements5);
                t0 t0Var5 = t0.f186434a;
                compositeClauseM = yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var5), m70.a.o(t0Var5)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), listL4);
                compositeClause = compositeClauseM;
                TextDelegate.Model model222 = new TextDelegate.Model("footer.disclosure", CompositeClause.a(compositeClause, null, null, 11), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                int i2222 = R$attr.uikit_dp16;
                yp0.b.r(model222, 0, 0, i2222, i2222, 3);
                return u.c(model222);
            case 6:
                Clause[] elements6 = {qVar != null ? c(qVar, hel.b.GB) : null, new TextLocalisedClause(R$string.trading_disclosure_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.trading_disclosure_uk_performance_and_risk_text, v.k(new TextLocalisedClause(R$string.trading_disclosure_uk_car_risk_link, null, new Click(28, (Integer) null, (Object) new p(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.trading_disclosures_footer_see_customer_agreement_plain, null, new Click(28, (Integer) null, (Object) new p(links.k), "SECURITIES_DISCLOSURES", false), 10)), null, 12)};
                Intrinsics.checkNotNullParameter(elements6, "elements");
                compositeClause = new CompositeClause(kotlin.collections.d.L(elements6), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                TextDelegate.Model model2222 = new TextDelegate.Model("footer.disclosure", CompositeClause.a(compositeClause, null, null, 11), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                int i22222 = R$attr.uikit_dp16;
                yp0.b.r(model2222, 0, 0, i22222, i22222, 3);
                return u.c(model2222);
            case 7:
                if (((jte.d) this.f182593a).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c)) {
                    int i3 = qVar == null ? -1 : g.f182592b[qVar.ordinal()];
                    if (i3 == -1) {
                        compositeClauseM = new CompositeClause(u.c(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealth_footer_disclosure_securities_aus_disclosures_text, v.k(new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealth_footer_disclosure_securities_aus_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(com.revolut.feature.wealth.impl.R$string.wealth_footer_disclosure_securities_aus_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12)), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    } else {
                        if (i3 != 1 && i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        compositeClauseM = new CompositeClause(u.c(new TextLocalisedClause(R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14)), null, null, null, 14);
                    }
                } else {
                    Clause[] elements7 = {qVar != null ? c(qVar, tradingContext) : null, new TextLocalisedClause(R$string.wealth_analytics_stocks_bottom_description_au, null, null, 14)};
                    Intrinsics.checkNotNullParameter(elements7, "elements");
                    compositeClauseM = new CompositeClause(kotlin.collections.d.L(elements7), null, null, null, 14);
                }
                compositeClause = compositeClauseM;
                TextDelegate.Model model22222 = new TextDelegate.Model("footer.disclosure", CompositeClause.a(compositeClause, null, null, 11), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
                int i222222 = R$attr.uikit_dp16;
                yp0.b.r(model22222, 0, 0, i222222, i222222, 3);
                return u.c(model22222);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
