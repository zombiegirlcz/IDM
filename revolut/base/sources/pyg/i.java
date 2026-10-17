package pyg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.ak0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbj.c f240835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f240836b;

    public i(bbj.c cryptoDisclaimerMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cryptoDisclaimerMapper, "cryptoDisclaimerMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f240835a = cryptoDisclaimerMapper;
        this.f240836b = featureToggleInteractor;
    }

    public static CompositeClause a(Links links, hel.b bVar) {
        switch (bVar == null ? -1 : h.f240834a[bVar.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                Clause[] elements = {e(links, bVar), b(bVar), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) d.f240832a, "TRADING_DISCLOSURES_LINK_ID", false), 10)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.t(t0.f186434a);
                return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 2:
                Clause[] elements2 = {e(links, bVar), b(bVar)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL2 = kotlin.collections.d.L(elements2);
                m70.a.t(t0.f186434a);
                return new CompositeClause(listL2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 3:
                return d(links);
        }
    }

    public static TextLocalisedClause b(hel.b bVar) {
        switch (bVar == null ? -1 : h.f240834a[bVar.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_uk_general_text_short, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_eea_general_text_short, u.c(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_commodities_eea_general_text_disclosures, null, new Click(28, (Integer) null, (Object) b.f240830a, "COMMODITIES_DISCLOSURES_LINK_ID", false), 10)), null, 12);
        }
    }

    public static CompositeClause d(Links links) {
        String str;
        TextLocalisedClause[] elements = {new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_past_performance, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_and_disclosures_text, v.k(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_sng_terms_of_business_link, null, (links == null || (str = links.f105092g) == null) ? null : new Click(28, (Integer) null, (Object) new c(str), "TERMS_OF_BUSINESS_LINK_ID", false), 10), new TextLocalisedClause(R$string.wealth_robo_disclaimer_eea_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) d.f240832a, "TRADING_DISCLOSURES_LINK_ID", false), 10)), null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static Clause e(Links links, hel.b bVar) {
        switch (bVar == null ? -1 : h.f240834a[bVar.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_uk_services_are_provided_by_revolut_short, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_eea_services_are_provided_by_revolut_short, u.c(new TextLocalisedClause(R$string.wealthcore_footer_disclosure_securities_eea_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) d.f240832a, "TRADING_DISCLOSURES_LINK_ID", false), 10)), null, 12);
            case 3:
                return d(links);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.CompositeClause c(com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L6
            wi0.b r1 = r6.f100020b
            goto L7
        L6:
            r1 = r0
        L7:
            boolean r1 = com.bumptech.glide.d.r(r1)
            if (r1 == 0) goto L1a
            com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles$CryptoIsraelExpansion r1 = com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles.CryptoIsraelExpansion.f71495c
            gte.a r2 = r5.f240836b
            jte.d r2 = (jte.d) r2
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L1a
            goto L37
        L1a:
            if (r6 == 0) goto L37
            com.revolut.domain.models.user.UserCompanyRegion r0 = r6.f100019a
            wi0.b r1 = r6.f100020b
            boolean r2 = r6.f100021c
            boolean r6 = r6.d
            bbj.c r3 = r5.f240835a
            cbj.b r3 = (cbj.b) r3
            java.lang.String r4 = "userCompanyRegion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "countryCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            com.revolut.core.ui_kit.models.CompositeClause r6 = r3.a(r0, r1, r2, r6)
            return r6
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pyg.i.c(com.revolut.retail.feature.crypto.disclaimer.api.DisclaimerParams):com.revolut.core.ui_kit.models.CompositeClause");
    }

    public final List f(WidgetisedAnalyticsType analyticsProducts, hel.b bVar, DisclaimerParams disclaimerParams, Links links) {
        Clause clauseE;
        Intrinsics.checkNotNullParameter(analyticsProducts, "analyticsProducts");
        List list = null;
        if (analyticsProducts instanceof WidgetisedAnalyticsType.AllInvestments) {
            switch (bVar == null ? -1 : h.f240834a[bVar.ordinal()]) {
                case -1:
                case 4:
                case 5:
                case 6:
                case 7:
                    clauseE = null;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    Clause[] elements = {a(links, bVar), c(disclaimerParams)};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    clauseE = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    break;
                case 2:
                    Clause[] elements2 = {a(links, bVar), c(disclaimerParams)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    List listL = kotlin.collections.d.L(elements2);
                    m70.a.t(t0.f186434a);
                    clauseE = new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    break;
                case 3:
                    Clause[] elements3 = {d(links), c(disclaimerParams)};
                    Intrinsics.checkNotNullParameter(elements3, "elements");
                    List listL2 = kotlin.collections.d.L(elements3);
                    m70.a.t(t0.f186434a);
                    clauseE = new CompositeClause(listL2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                    break;
            }
        } else if (analyticsProducts instanceof WidgetisedAnalyticsType.AllInvestAccounts) {
            clauseE = a(links, bVar);
        } else if (analyticsProducts instanceof WidgetisedAnalyticsType.Crypto) {
            clauseE = c(disclaimerParams);
        } else if (analyticsProducts instanceof WidgetisedAnalyticsType.Commodities) {
            clauseE = b(bVar);
        } else {
            if (!(analyticsProducts instanceof WidgetisedAnalyticsType.Brokerage) && !(analyticsProducts instanceof WidgetisedAnalyticsType.JointBrokerage) && !(analyticsProducts instanceof WidgetisedAnalyticsType.Isa) && !(analyticsProducts instanceof WidgetisedAnalyticsType.Jisa) && !(analyticsProducts instanceof WidgetisedAnalyticsType.Pea) && !(analyticsProducts instanceof WidgetisedAnalyticsType.Robo) && !(analyticsProducts instanceof WidgetisedAnalyticsType.Cfd)) {
                throw new NoWhenBranchMatchedException();
            }
            clauseE = e(links, bVar);
        }
        Clause clause = clauseE;
        if (clause != null) {
            List listC = u.c(new TextDelegate.Model("WEALTH_DISCLAIMERS_LIST_ID", clause, false, new ak0(null, null, 3), null, null, 0, R$attr.uikit_dp8, 0, 0, 1780));
            yp0.b.q(listC, 0, 0, 0, 0, 15);
            list = listC;
        }
        return list == null ? f0.f322471a : list;
    }
}
