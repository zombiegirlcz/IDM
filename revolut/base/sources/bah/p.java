package bah;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.z;
import z0h.a1;
import z0h.b0;
import z0h.b1;
import z0h.c0;
import z0h.c1;
import z0h.d0;
import z0h.d1;
import z0h.e0;
import z0h.f1;
import z0h.g0;
import z0h.g1;
import z0h.h0;
import z0h.i0;
import z0h.i1;
import z0h.j0;
import z0h.k0;
import z0h.k1;
import z0h.l0;
import z0h.m0;
import z0h.m1;
import z0h.n0;
import z0h.n1;
import z0h.o0;
import z0h.p0;
import z0h.q0;
import z0h.r0;
import z0h.r1;
import z0h.s0;
import z0h.u0;
import z0h.v0;
import z0h.w0;
import z0h.x0;
import z0h.y0;
import z0h.z0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements pzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qy5.a f14093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f14094b;

    public p(aah.b parcelWrapper, qy5.a commonDisclaimerProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(parcelWrapper, "parcelWrapper");
        Intrinsics.checkNotNullParameter(commonDisclaimerProvider, "commonDisclaimerProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f14093a = commonDisclaimerProvider;
        this.f14094b = featureToggleInteractor;
    }

    public static CompositeClause A() {
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_risk_and_disclosures_text, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_are_provided_by_revolut, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_us_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static CompositeClause B() {
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_us_risk_and_disclosures_text, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_are_provided_by_revolut, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_us_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_no_gurantee, null, null, 14)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), v(), null, null, 12);
    }

    public static CompositeClause C() {
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_us_risk_and_disclosures_text, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_are_provided_by_revolut, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_us_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_no_gurantee, null, null, 14)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), v(), null, null, 12);
    }

    public static CompositeClause D(List list) {
        t0 t0Var = t0.f186434a;
        return new CompositeClause(list, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static List d(Links links) {
        return u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_disclosures_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12));
    }

    public static TextLocalisedClause k(Links links) {
        int i = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_view_three_separated_dot_and;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_trading_disclosures, null, new Click(28, (Integer) null, (Object) m1.f318535a, "TRADING_DISCLOSURE", false), 10);
        int i2 = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosures;
        String str = links.v;
        return new TextLocalisedClause(i, v.k(textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) (str != null ? new n1(str) : null), "RESEARCH_DISCLOSURE", false), 10)), null, 12);
    }

    public static List o(Links links) {
        return v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_performance_and_risk_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_car_risk_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_stock_customer_agreement_link, null, new Click(28, (Integer) null, (Object) new n1(links.k), "SECURITIES_CUSTOMER_AGREEMENT", false), 10)), null, 12), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14));
    }

    public static TextLocalisedClause q(Links links) {
        int i = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_view_two_separated_and;
        int i2 = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosure;
        String str = links.v;
        return new TextLocalisedClause(i, v.k(new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) (str != null ? new n1(str) : null), "RESEARCH_DISCLOSURE", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_trading_disclosure, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURE", false), 10)), null, 12);
    }

    public static CompositeClause r() {
        TextLocalisedClause[] elements = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURES", false), 10)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), v(), null, null, 12);
    }

    public static CompositeClause s() {
        return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURES", false), 10)), null, 12)), v(), null, null, 12);
    }

    public static TextClause v() {
        return new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static List w(Links links) {
        return v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_and_disclosures_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_terms_of_business_link, null, new Click(28, (Integer) null, (Object) new n1(links.f105092g), "SECURITIES_TERMS_OF_BUSINESS", false), 10), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12));
    }

    public static Clause z(x0 x0Var) {
        if (x0Var instanceof v0) {
            v0 v0Var = (v0) x0Var;
            u0 u0Var = v0Var.d;
            Instant instant = v0Var.f318570c;
            int i = o.e[u0Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_revolut_suggestion_last_updated, u.c(new TextLocalisedClause(com.revolut.core.android.R$string.date_format_default, v.k(new TimeClause(instant.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12), new TimeClause(instant.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            }
            switch (o.f14089a[v0Var.f318569b.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_revolut_suggestion_footer, v.k(new TextLocalisedClause(com.revolut.core.android.R$string.date_format_default, v.k(new TimeClause(instant.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12), new TimeClause(instant.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_revolut_suggestion_research, null, new Click(28, (Integer) null, (Object) new i1(mzg.a.SUGGESTION_WIDGET), "DETAIL_DISCLAIMERS", false), 10)), null, 12);
                case 2:
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_revolut_suggestion_footer, v.k(new TextLocalisedClause(com.revolut.core.android.R$string.date_format_default, v.k(new TimeClause(instant.toEpochMilli(), TimeClause.Format.DateLong.f57962b, null, null, 12), new TimeClause(instant.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_revolut_suggestion_research, null, new Click(28, (Integer) null, (Object) new i1(mzg.a.SUGGESTION_WIDGET), "DETAIL_DISCLAIMERS", false), 10)), null, 12);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (x0Var instanceof w0) {
            w0 w0Var = (w0) x0Var;
            hel.b bVar = w0Var.f318572b;
            String str = w0Var.f318571a.v;
            switch (o.f14089a[bVar.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_revolut_suggestion_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosure, null, new Click(28, (Integer) null, (Object) (str != null ? new n1(str) : null), "RESEARCH_DISCLOSURE", false), 10)), null, 12);
                case 2:
                    return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_revolut_suggestion_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosures, null, new Click(28, (Integer) null, (Object) (str != null ? new n1(str) : null), "RESEARCH_DISCLOSURE", false), 10)), null, 12);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(x0Var instanceof z0h.t0)) {
                throw new NoWhenBranchMatchedException();
            }
            z0h.t0 t0Var = (z0h.t0) x0Var;
            s0 s0Var = t0Var.f318562c;
            Links links = t0Var.f318560a;
            hel.b bVar2 = t0Var.f318561b;
            int i2 = o.f[s0Var.ordinal()];
            if (i2 == 1) {
                switch (o.f14089a[bVar2.ordinal()]) {
                    case 1:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_revolut_suggestion, null, null, 14), q(links)), v(), null, null, 12);
                    case 2:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_not_personal_recommendation, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_value_may_go_up_down, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_investment_services_and_recommendations, null, null, 14), k(links)), v(), null, null, 12);
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else if (i2 == 2) {
                switch (o.f14089a[bVar2.ordinal()]) {
                    case 1:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_data_provided_by_polygon, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_past_performance_and_forecasts, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14), q(links)), v(), null, null, 12);
                    case 2:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_data_provided_by_polygon, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_past_performance_and_forecasts, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), k(links)), v(), null, null, 12);
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else if (i2 == 3) {
                switch (o.f14089a[bVar2.ordinal()]) {
                    case 1:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_not_investment_advice, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14), q(links)), v(), null, null, 12);
                    case 2:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_not_personal_recommendation, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_value_may_go_up_down, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), k(links)), v(), null, null, 12);
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (o.f14089a[bVar2.ordinal()]) {
                    case 1:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_not_investment_advice_analyst_projections, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_past_performance_and_forecasts, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14), q(links), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_factset_copyright, null, null, 14)), v(), null, null, 12);
                    case 2:
                        return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_provided_by_factset_not_investment_advice, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_past_performance_and_forecasts, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), k(links), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_factset_copyright, null, null, 14)), v(), null, null, 12);
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        d1 d1Var = (d1) disclaimer;
        if (d1Var instanceof i0) {
            i0 i0Var = (i0) d1Var;
            Links links = i0Var.f318513a;
            switch (o.f14089a[i0Var.f318514b.ordinal()]) {
                case 1:
                    Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_performance_and_risk_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_car_risk_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_stock_customer_agreement_link, null, new Click(28, (Integer) null, (Object) new n1(links.k), "SECURITIES_CUSTOMER_AGREEMENT", false), 10)), null, 12)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 2:
                    return j(links, r1.NONE, false);
                case 3:
                    return A();
                case 4:
                    return e(links, r1.NONE);
                case 5:
                case 6:
                case 7:
                    return x(links, r1.NONE);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (d1Var instanceof d0) {
            d0 d0Var = (d0) d1Var;
            hel.b bVar = d0Var.f318492b;
            Links links2 = d0Var.f318491a;
            switch (o.f14089a[bVar.ordinal()]) {
                case 1:
                    return new CompositeClause(zhm.d0.E0(o(links2), u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_gb, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 2:
                    return new CompositeClause(zhm.d0.E0(i(links2), u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_eea, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 3:
                    return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_us, null, null, 14), A()), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 4:
                    return new CompositeClause(zhm.d0.E0(d(links2), u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 5:
                case 6:
                case 7:
                    return new CompositeClause(zhm.d0.E0(w(links2), u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_sg, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (d1Var instanceof c0) {
            c0 c0Var = (c0) d1Var;
            hel.b bVar2 = c0Var.f318487b;
            Links links3 = c0Var.f318486a;
            switch (o.f14089a[bVar2.ordinal()]) {
                case 1:
                    return new CompositeClause(zhm.d0.E0(o(links3), v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_gb, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_analyst_price_target, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 2:
                    return new CompositeClause(zhm.d0.E0(i(links3), v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_eea, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_analyst_price_target, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 3:
                    return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_us, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_analyst_price_target, null, null, 14), A()), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 4:
                    return new CompositeClause(zhm.d0.E0(d(links3), v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_au_analyst_price_target, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 5:
                case 6:
                case 7:
                    return new CompositeClause(zhm.d0.E0(w(links3), v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_sg, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sg_analyst_price_target, null, null, 14))), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        boolean z = d1Var instanceof k0;
        qy5.a aVar = this.f14093a;
        if (z) {
            k0 k0Var = (k0) d1Var;
            switch (o.f14090b[k0Var.f318522c.ordinal()]) {
                case 1:
                    hel.b bVar3 = k0Var.f318521b;
                    Links links4 = k0Var.f318520a;
                    switch (o.f14089a[bVar3.ordinal()]) {
                        case 1:
                            return p(links4, r1.NONE);
                        case 2:
                            Clause[] elements2 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_bond_footer, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), aVar.h(links4, r1.NONE)};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            return D(kotlin.collections.d.L(elements2));
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            return t(k0Var);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return t(k0Var);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        boolean z3 = d1Var instanceof l0;
        m1 m1Var = m1.f318535a;
        if (z3) {
            l0 l0Var = (l0) d1Var;
            r1 r1Var = l0Var.f318528c;
            Links links5 = l0Var.f318526a;
            switch (o.f14089a[l0Var.f318527b.ordinal()]) {
                case 1:
                    return new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut_short, null, null, 14);
                case 2:
                    return j(links5, r1Var, false);
                case 3:
                    TextLocalisedClause[] elements3 = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_risk_and_disclosures_text, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_are_provided_by_revolut, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_us_disclosures_link, null, new Click(28, (Integer) null, aah.b.a(m1Var, r1Var), "SECURITIES_DISCLOSURES", false), 10)), null, 12), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_no_gurantee, null, null, 14)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements3), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 4:
                    return h(links5, r1Var);
                case 5:
                case 6:
                case 7:
                    return x(links5, r1Var);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        boolean z4 = d1Var instanceof o0;
        k1 k1Var = k1.f318523a;
        if (z4) {
            int i = o.f14089a[((o0) d1Var).f318543b.ordinal()];
            if (i == 1) {
                TextLocalisedClause[] elements4 = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), null, 12)};
                Intrinsics.checkNotNullParameter(elements4, "elements");
                return new CompositeClause(kotlin.collections.d.L(elements4), v(), null, null, 12);
            }
            if (i == 3) {
                TextLocalisedClause[] elements5 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_indices_provider, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_commodity_currency_provider, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_markets_us_past_performance_link, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_markets_us_past_performance_link_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12)};
                Intrinsics.checkNotNullParameter(elements5, "elements");
                return new CompositeClause(kotlin.collections.d.L(elements5), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            if (i == 5 || i == 6 || i == 7) {
                TextLocalisedClause[] elements6 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_indices_provider, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_commodity_currency_provider, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_markets_sg_past_performance_risk, null, null, 14)};
                Intrinsics.checkNotNullParameter(elements6, "elements");
                return new CompositeClause(kotlin.collections.d.L(elements6), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            TextLocalisedClause[] elements7 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_indices_provider, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_commodity_currency_provider, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14)};
            Intrinsics.checkNotNullParameter(elements7, "elements");
            return new CompositeClause(kotlin.collections.d.L(elements7), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        boolean z6 = d1Var instanceof j0;
        gte.a aVar2 = this.f14094b;
        if (z6) {
            j0 j0Var = (j0) d1Var;
            hel.b bVar4 = j0Var.f318517b;
            Links links6 = j0Var.f318516a;
            String str = links6.f105092g;
            switch (o.f14089a[bVar4.ordinal()]) {
                case 1:
                    TextLocalisedClause[] elements8 = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_performance_and_risk_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_capital_risk_link, null, new Click(28, (Integer) null, (Object) new n1(links6.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_stock_customer_agreement_link, null, new Click(28, (Integer) null, (Object) new n1(str), "SECURITIES_TERMS_OF_BUSINESS", false), 10)), null, 12)};
                    Intrinsics.checkNotNullParameter(elements8, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements8), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 2:
                    TextLocalisedClause[] elements9 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_index_eu_data_provider, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14)};
                    Intrinsics.checkNotNullParameter(elements9, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements9), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 3:
                    TextLocalisedClause[] elements10 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_index_us_data_provider, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_index_us_securities_services_provider, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_index_us_securities_services_provider_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12)};
                    Intrinsics.checkNotNullParameter(elements10, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements10), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 4:
                    TextLocalisedClause[] elements11 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_index_au_data_provider, null, null, 14), ((jte.d) aVar2).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? null : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_au_services_are_provided_by_revolut, null, null, 14)};
                    Intrinsics.checkNotNullParameter(elements11, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements11), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 5:
                case 6:
                case 7:
                    TextLocalisedClause[] elements12 = {new TextLocalisedClause(R$string.wealth_footer_disclosure_index_sg_past_performance_risk, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_index_sg_data_provider, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_and_disclosures_text, v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_link, null, new Click(28, (Integer) null, (Object) new n1(str), "SECURITIES_TERMS_OF_BUSINESS", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_sng_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12)};
                    Intrinsics.checkNotNullParameter(elements12, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements12), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (d1Var instanceof n0) {
            n0 n0Var = (n0) d1Var;
            int i2 = o.f14089a[n0Var.f318540b.ordinal()];
            if (i2 == 1) {
                TextLocalisedClause[] elements13 = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), null, 12)};
                Intrinsics.checkNotNullParameter(elements13, "elements");
                return new CompositeClause(kotlin.collections.d.L(elements13), v(), null, null, 12);
            }
            if (i2 != 6) {
                return new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_market_provider, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14)), v(), null, null, 12);
            }
            String str2 = n0Var.f318539a.f105092g;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_indices_provider, null, null, 14);
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_footer_disclosure_markets_overview_commodity_currency_provider, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14);
            HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(str2), (Integer) null, new n1(str2), 12);
            int i3 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
            m70.a.c(t0.f186434a);
            return new CompositeClause(v.k(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause, new HtmlLocalisedClause(i3, u.c(""), (Integer) null, m1Var, 12)))), v(), null, null, 12);
        }
        if (d1Var instanceof c1) {
            c1 c1Var = (c1) d1Var;
            hel.b bVar5 = c1Var.f318489b;
            Links links7 = c1Var.f318488a;
            switch (o.f14089a[bVar5.ordinal()]) {
                case 1:
                    return s();
                case 2:
                    return j(links7, r1.NONE, c1Var.f318490c);
                case 3:
                    return A();
                case 4:
                    return e(links7, r1.NONE);
                case 5:
                case 6:
                case 7:
                    return x(links7, r1.NONE);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (d1Var instanceof b1) {
            b1 b1Var = (b1) d1Var;
            switch (o.f14089a[b1Var.f318483b.ordinal()]) {
                case 1:
                    return s();
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                    break;
                case 4:
                    return e(b1Var.f318482a, r1.NONE);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (!(d1Var instanceof a1)) {
                if (d1Var instanceof r0) {
                    r0 r0Var = (r0) d1Var;
                    StatementType statementType = r0Var.f318555b;
                    hel.b bVar6 = r0Var.f318556c;
                    ybl.n nVar = r0Var.f318554a;
                    if (!Intrinsics.f(statementType, StatementType.Account.f95315a)) {
                        if (!Intrinsics.f(statementType, StatementType.Pnl.f95316a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        switch (o.f14089a[bVar6.ordinal()]) {
                            case 1:
                                int i5 = o.f14091c[nVar.ordinal()];
                                if (i5 == 1) {
                                    return new TextLocalisedClause(R$string.trading_statements_footer_note, null, null, 14);
                                }
                                if (i5 == 2) {
                                    return new TextLocalisedClause(R$string.trading_statements_footer_note_csv, null, null, 14);
                                }
                                throw new NoWhenBranchMatchedException();
                            case 2:
                                return new TextLocalisedClause(R$string.trading_statements_footer_note_eea_pnl, null, null, 14);
                            case 3:
                                int i6 = o.f14091c[nVar.ordinal()];
                                if (i6 == 1) {
                                    return new TextLocalisedClause(R$string.trading_statement_footer_pdf_us, null, null, 14);
                                }
                                if (i6 == 2) {
                                    return new TextLocalisedClause(R$string.trading_statements_footer_note_csv, null, null, 14);
                                }
                                throw new NoWhenBranchMatchedException();
                            case 4:
                                return new TextLocalisedClause(R$string.trading_statements_footer_note_au_pnl, null, null, 14);
                            case 5:
                            case 6:
                            case 7:
                                return new TextLocalisedClause(R$string.trading_statements_footer_note_sg_pnl, null, null, 14);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    switch (o.f14089a[bVar6.ordinal()]) {
                        case 1:
                            int i21 = o.f14091c[nVar.ordinal()];
                            if (i21 == 1) {
                                return new TextLocalisedClause(R$string.trading_statements_footer_note, null, null, 14);
                            }
                            if (i21 == 2) {
                                return new TextLocalisedClause(R$string.trading_statements_footer_note_csv, null, null, 14);
                            }
                            throw new NoWhenBranchMatchedException();
                        case 2:
                            return new TextLocalisedClause(R$string.trading_statements_footer_note_eea, null, null, 14);
                        case 3:
                            int i22 = o.f14091c[nVar.ordinal()];
                            if (i22 == 1) {
                                return new TextLocalisedClause(R$string.trading_statement_footer_pdf_us, null, null, 14);
                            }
                            if (i22 == 2) {
                                return new TextLocalisedClause(R$string.trading_statements_footer_note_csv, null, null, 14);
                            }
                            throw new NoWhenBranchMatchedException();
                        case 4:
                            int i32 = o.f14091c[nVar.ordinal()];
                            if (i32 == 1) {
                                return new TextLocalisedClause(R$string.trading_statement_footer_pdf_au, null, null, 14);
                            }
                            if (i32 == 2) {
                                return new TextLocalisedClause(R$string.trading_statement_footer_csv_au, null, null, 14);
                            }
                            throw new NoWhenBranchMatchedException();
                        case 5:
                        case 6:
                        case 7:
                            return new TextLocalisedClause(R$string.trading_statements_footer_note_sg, null, null, 14);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (d1Var instanceof h0) {
                    h0 h0Var = (h0) d1Var;
                    return n(h0Var.f318508a, h0Var.f318509b);
                }
                if (d1Var instanceof m0) {
                    m0 m0Var = (m0) d1Var;
                    hel.b bVar7 = m0Var.f318534b;
                    Links links8 = m0Var.f318533a;
                    return (bVar7 == hel.b.AU && ((jte.d) aVar2).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c)) ? e(links8, r1.NONE) : n(links8, bVar7);
                }
                if (!(d1Var instanceof z0)) {
                    if (d1Var instanceof x0) {
                        return z((x0) d1Var);
                    }
                    if (d1Var instanceof q0) {
                        return y((q0) d1Var);
                    }
                    if (d1Var instanceof b0) {
                        b0 b0Var = (b0) d1Var;
                        switch (o.f14089a[b0Var.f318481b.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                                return null;
                            case 6:
                                String str3 = b0Var.f318480a.f105092g;
                                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut_with_digital_advisory, null, null, 14);
                                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_past_performance, null, null, 14);
                                HtmlLocalisedClause htmlLocalisedClause2 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(str3), (Integer) null, new n1(str3), 12);
                                int i33 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
                                m70.a.c(t0.f186434a);
                                return new CompositeClause(v.k(textLocalisedClause5, textLocalisedClause6, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause2, new HtmlLocalisedClause(i33, u.c(""), (Integer) null, m1.f318535a, 12)))), v(), null, null, 12);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (d1Var instanceof e0) {
                        switch (o.f14089a[((e0) d1Var).f318496b.ordinal()]) {
                            case 1:
                                return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURES", false), 10)), null, 12)), v(), null, null, 12);
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 7:
                                return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_information_provided_by_edi, null, null, 14);
                            case 6:
                                return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_information_provided_by_edi, null, null, 14)), v(), null, null, 12);
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (!(d1Var instanceof g0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g0 g0Var = (g0) d1Var;
                    hel.b bVar8 = g0Var.f318504b;
                    Links links9 = g0Var.f318503a;
                    switch (o.f14089a[bVar8.ordinal()]) {
                        case 1:
                            return r();
                        case 2:
                            return l(links9, r1.NONE);
                        case 3:
                            return C();
                        case 4:
                            return ((jte.d) aVar2).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_au_services_are_provided_by_revolut, null, null, 14);
                        case 5:
                        case 7:
                            return x(links9, r1.NONE);
                        case 6:
                            return u(links9, r1.NONE);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                z0 z0Var = (z0) d1Var;
                y0 y0Var = z0Var.f318581a;
                Links links10 = z0Var.f318582b;
                hel.b bVar9 = z0Var.f318583c;
                int i43 = o.d[y0Var.ordinal()];
                if (i43 == 1) {
                    switch (o.f14089a[bVar9.ordinal()]) {
                        case 1:
                            return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14);
                        case 2:
                            return j(links10, r1.NONE, false);
                        case 3:
                            return C();
                        case 4:
                            return h(links10, r1.NONE);
                        case 5:
                        case 7:
                            return x(links10, r1.NONE);
                        case 6:
                            return u(links10, r1.NONE);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (i43 == 2) {
                    switch (o.f14089a[bVar9.ordinal()]) {
                        case 1:
                            return r();
                        case 2:
                            return l(links10, r1.NONE);
                        case 3:
                            return C();
                        case 4:
                            return f(links10, r1.NONE);
                        case 5:
                        case 7:
                            return x(links10, r1.NONE);
                        case 6:
                            return u(links10, r1.NONE);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (i43 == 3) {
                    switch (o.f14089a[bVar9.ordinal()]) {
                        case 1:
                            return r();
                        case 2:
                            return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), aVar.h(links10, r1.NONE)), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                        case 3:
                            return C();
                        case 4:
                            return f(links10, r1.NONE);
                        case 5:
                        case 7:
                            return x(links10, r1.NONE);
                        case 6:
                            return u(links10, r1.NONE);
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                if (i43 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (o.f14089a[bVar9.ordinal()]) {
                    case 1:
                        return p(links10, r1.NONE);
                    case 2:
                        return m(links10, r1.NONE);
                    case 3:
                        return C();
                    case 4:
                        return f(links10, r1.NONE);
                    case 5:
                    case 7:
                        return x(links10, r1.NONE);
                    case 6:
                        return u(links10, r1.NONE);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            a1 a1Var = (a1) d1Var;
            hel.b bVar10 = a1Var.f318479b;
            Links links11 = a1Var.f318478a;
            switch (o.f14089a[bVar10.ordinal()]) {
                case 1:
                    return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_uk_risk_disclosures_format, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_capital_risk_link, null, new Click(28, (Integer) null, (Object) links11.d, "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_stock_customer_agreement_link, null, new Click(28, (Integer) null, (Object) links11.k, "SECURITIES_DISCLOSURES", false), 10)), null, 12)), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof d1;
    }

    public final TextLocalisedClause c(Links links, r1 r1Var) {
        return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_disclaimer_eea_car_text_two_links, v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_disclaimer_eea_car_link, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_link, null, new Click(28, (Integer) null, aah.b.a(new n1(links.f105092g), r1Var), "TERMS_OF_BUSINESS_CLICK_ID", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_disclaimer_eea_trading_disclosures_link, null, new Click(28, (Integer) null, aah.b.a(m1.f318535a, r1Var), "TRADING_DISCLOSURES_CLICK_ID", false), 10)), null, 12);
    }

    public final CompositeClause e(Links links, r1 r1Var) {
        return new CompositeClause(u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_disclosures_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_car_link, null, new Click(28, (Integer) null, aah.b.a(new n1(links.d), r1Var), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_stock_trading_disclosures_link, null, new Click(28, (Integer) null, aah.b.a(m1.f318535a, r1Var), "SECURITIES_DISCLOSURES", false), 10)), null, 12)), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final Clause f(Links links, r1 r1Var) {
        return ((jte.d) this.f14094b).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? e(links, r1Var) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_au_services_are_provided_by_revolut, null, null, 14);
    }

    public final Clause g(Links links, r1 r1Var) {
        return ((jte.d) this.f14094b).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? e(links, r1Var) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_au_services_are_provided_by_revolut, null, null, 14);
    }

    public final Clause h(Links links, r1 r1Var) {
        return ((jte.d) this.f14094b).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_view_three_separated_dot_and, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_car_link, null, new Click(28, (Integer) null, aah.b.a(new n1(links.d), r1Var), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_aus_stock_trading_disclosures_link, null, new Click(28, (Integer) null, aah.b.a(m1.f318535a, r1Var), "SECURITIES_DISCLOSURES", false), 10), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_aus_general_link, null, new Click(28, (Integer) null, aah.b.a(g1.f318505a, r1Var), "COMMODITIES_DISCLOSURES", false), 10)), null, 12) : e(links, r1Var);
    }

    public final List i(Links links) {
        return v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), this.f14093a.h(links, r1.NONE));
    }

    public final CompositeClause j(Links links, r1 r1Var, boolean z) {
        Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), z ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_eu_disclaimer, null, null, 14) : null, this.f14093a.h(links, r1Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final CompositeClause l(Links links, r1 r1Var) {
        Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_eea_information_provided_by_polygon, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), this.f14093a.h(links, r1Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), v(), null, null, 12);
    }

    public final CompositeClause m(Links links, r1 r1Var) {
        Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_eea_information_provided_by_fitch, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), this.f14093a.h(links, r1Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), v(), null, null, 12);
    }

    public final CompositeClause n(Links links, hel.b bVar) {
        String str = links.d;
        String str2 = links.f105092g;
        int i = o.f14089a[bVar.ordinal()];
        m1 m1Var = m1.f318535a;
        switch (i) {
            case 1:
                List listK = v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1.f318523a, "INVEST_DISCLOSURES", false), 10)), null, 12));
                t0 t0Var = t0.f186434a;
                return new CompositeClause(listK, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 2:
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_eea, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_eea, null, null, 14);
                HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_capital_at_risk, u.c(str), (Integer) null, new n1(str), 12);
                int i2 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_trading_disclosures;
                t0 t0Var2 = t0.f186434a;
                m70.a.c(t0Var2);
                return yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var2), m70.a.o(t0Var2)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause, new HtmlLocalisedClause(i2, u.c(""), (Integer) null, m1Var, 12)))));
            case 3:
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_us, null, null, 14);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_us_all_investments_involve_risk, null, null, 14);
                int i3 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_trading_disclosures;
                t0 t0Var3 = t0.f186434a;
                m70.a.c(t0Var3);
                return yoj.b.m(new TextClause(m70.a.o(t0Var3), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause4, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause5, new HtmlLocalisedClause(i3, u.c(""), (Integer) null, m1Var, 12))), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_us, null, null, 14)));
            case 4:
                TextLocalisedClause[] elements = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_au, null, null, 14), ((jte.d) this.f14094b).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? null : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_analytics_stocks_bottom_description_au, null, null, 14)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
            case 5:
            case 6:
            case 7:
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_disclosures_footer_stocks_data_provided_by_sg, null, null, 14);
                TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14);
                TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_sg, null, null, 14);
                HtmlLocalisedClause htmlLocalisedClause2 = new HtmlLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_view_terms_business, u.c(str2), (Integer) null, new n1(str2), 12);
                int i5 = com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_and_trading_disclosures;
                t0 t0Var4 = t0.f186434a;
                m70.a.c(t0Var4);
                return yoj.b.m(new TextClause(a0.d.r(m70.a.o(t0Var4), m70.a.o(t0Var4)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause6, textLocalisedClause7, textLocalisedClause8, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(htmlLocalisedClause2, new HtmlLocalisedClause(i5, u.c(""), (Integer) null, m1Var, 12)))));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final CompositeClause p(Links links, r1 r1Var) {
        Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_bond_footer, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_uk_bonds_services_are_provided_by_revolut, null, null, 14), this.f14093a.i(links, r1Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return D(kotlin.collections.d.L(elements));
    }

    public final CompositeClause t(k0 k0Var) {
        List listK;
        hel.b bVar = k0Var.f318521b;
        z zVar = k0Var.f318522c;
        Links links = k0Var.f318520a;
        int i = o.f14089a[bVar.ordinal()];
        m1 m1Var = m1.f318535a;
        switch (i) {
            case 1:
                z zVar2 = z.COMMODITY;
                k1 k1Var = k1.f318523a;
                listK = zVar != zVar2 ? v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), null, 12)) : v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_commodities_uk_general_text_short, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_commodities_data_provided_from_third_parties, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), null, 12));
                break;
            case 2:
                xi0.b bVar2 = k0Var.d;
                r1 r1Var = r1.NONE;
                aim.e eVarB = u.b();
                if (o.f14090b[zVar.ordinal()] == 9) {
                    eVarB.add(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_eu_disclaimer, null, null, 14));
                } else {
                    eVarB.add(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_eea_past_performance, null, null, 14));
                }
                if (io3.h.k(zVar) || zVar == z.EQUITY) {
                    xi0.b.Companion.getClass();
                    eVarB.add(new TextLocalisedClause(Intrinsics.f(bVar2, xi0.b.f306272g) ? com.revolut.retail.wealth.resources.R$string.wealth_stock_details_eu_disclaimer : com.revolut.retail.wealth.resources.R$string.wealth_stock_details_disclaimer, null, null, 14));
                }
                if (io3.h.k(zVar)) {
                    eVarB.add(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_eea_fund_exposure, null, null, 14));
                }
                if (zVar == z.CFD) {
                    eVarB.add(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_cfds_disclaimer_asset_prices_source, null, null, 14));
                }
                eVarB.add(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_eea, null, null, 14));
                eVarB.add(this.f14093a.h(links, r1Var));
                listK = u.a(eVarB);
                break;
            case 3:
                listK = v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_risk_and_disclosures_text, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_are_provided_by_revolut, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_us_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12));
                break;
            case 4:
                TextLocalisedClause[] elements = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_stock_details_disclaimer, null, null, 14), ((jte.d) this.f14094b).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? null : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_analytics_stocks_bottom_description_au, null, null, 14)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                t0 t0Var = t0.f186434a;
                listK = u.c(new CompositeClause(listL, new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
                break;
            case 5:
            case 6:
            case 7:
                listK = v.k(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_revolut_securities_disclaimer_sg, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_and_disclosures_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_terms_of_business_link, null, new Click(28, (Integer) null, (Object) new n1(links.f105092g), "SECURITIES_TERMS_OF_BUSINESS", false), 10), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return D(listK);
    }

    public final CompositeClause u(Links links, r1 r1Var) {
        Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14), c(links, r1Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final CompositeClause x(Links links, r1 r1Var) {
        Clause[] elements = {new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_sng_services_are_provided_by_revolut_with_digital_advisory, null, null, 14), c(links, r1Var)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final Clause y(q0 q0Var) {
        p0 p0Var = q0Var.f318548a;
        Links links = q0Var.f318549b;
        hel.b bVar = q0Var.f318550c;
        int i = o.f14092g[p0Var.ordinal()];
        m1 m1Var = m1.f318535a;
        k1 k1Var = k1.f318523a;
        if (i == 1) {
            switch (o.f14089a[bVar.ordinal()]) {
                case 1:
                    return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut_short, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)), null, 12)), v(), null, null, 12);
                case 2:
                    return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_disclosure_collection_eea_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_collection_eea_provided_by_polygon, null, null, 14), new TextLocalisedClause(R$string.wealth_disclosure_collection_eea_services_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12)), v(), null, null, 12);
                case 3:
                    TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_us_risk_and_disclosures_text, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_are_provided_by_revolut, u.c(new TextLocalisedClause(R$string.wealth_footer_disclosure_us_disclosures_link, null, new Click(28, (Integer) null, (Object) m1Var, "SECURITIES_DISCLOSURES", false), 10)), null, 12), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_us_brokerage_products_no_gurantee, null, null, 14)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements), v(), null, null, 12);
                case 4:
                    return e(links, r1.NONE);
                case 5:
                    return x(links, r1.NONE);
                case 6:
                case 7:
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (i == 2) {
            switch (o.f14089a[bVar.ordinal()]) {
                case 1:
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_uk_revolut_suggestion, null, null, 14);
                    int i2 = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_view_two_separated_and;
                    int i3 = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosure;
                    String str = links.v;
                    Clause[] elements2 = {textLocalisedClause, textLocalisedClause2, new TextLocalisedClause(i2, v.k(new TextLocalisedClause(i3, null, new Click(28, (Integer) null, (Object) (str != null ? new n1(str) : null), "RESEARCH_DISCLOSURE", false), 10), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_trading_disclosure, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURE", false), 10)), null, 12)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements2), v(), null, null, 12);
                case 2:
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14);
                    TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_eea_revolut_suggestion_regulated_not_advise, null, null, 14);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14);
                    int i5 = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_view_three_separated_dot_and;
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10);
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_trading_disclosures, null, new Click(28, (Integer) null, (Object) m1Var, "TRADING_DISCLOSURE", false), 10);
                    int i6 = com.revolut.retail.wealth.resources.R$string.invest_disclaimer_generic_research_disclosures;
                    String str2 = links.v;
                    Clause[] elements3 = {textLocalisedClause3, textLocalisedClause4, textLocalisedClause5, new TextLocalisedClause(i5, v.k(textLocalisedClause6, textLocalisedClause7, new TextLocalisedClause(i6, null, new Click(28, (Integer) null, (Object) (str2 != null ? new n1(str2) : null), "RESEARCH_DISCLOSURE", false), 10)), null, 12)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements3), v(), null, null, 12);
                case 3:
                    return B();
                case 4:
                    return g(links, r1.NONE);
                case 5:
                    return x(links, r1.NONE);
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (i == 3) {
            switch (o.f14089a[bVar.ordinal()]) {
                case 1:
                    TextLocalisedClause[] elements4 = {new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_disclosures_footer_past_performance_not_guarantee_future_result, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) k1Var, "INVEST_DISCLOSURES", false), 10)};
                    Intrinsics.checkNotNullParameter(elements4, "elements");
                    return new CompositeClause(kotlin.collections.d.L(elements4), v(), null, null, 12);
                case 2:
                    return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_disclosure_collection_eea_services_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_past_performance, null, null, 14), this.f14093a.h(links, r1.NONE)), v(), null, null, 12);
                case 3:
                    return B();
                case 4:
                    return g(links, r1.NONE);
                case 5:
                    return x(links, r1.NONE);
                case 6:
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            switch (o.f14089a[bVar.ordinal()]) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 2:
                    return m(links, r1.NONE);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
