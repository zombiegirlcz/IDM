package plh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements pf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f237397a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f237397a = featureToggleInteractor;
    }

    @Override // pf1.a
    public final qf1.k a(qf1.d dVar) {
        tih.c item = (tih.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f271525a;
        if (Intrinsics.f(str, qf1.f.INVEST_SECURITIES.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_arrow_rates, new TextLocalisedClause(R$string.add_new_product_stocks_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_stocks_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_COMMODITIES.getId())) {
            hel.b bVar = item.f271527c;
            return new qf1.k(R$drawable.uikit_icn_24_commodities, new TextLocalisedClause(R$string.add_new_product_commodities_title, null, null, 14), new TextLocalisedClause((bVar == null ? -1 : b.f237396a[bVar.ordinal()]) == 1 ? R$string.add_new_product_commodities_uk_description : R$string.add_new_product_commodities_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_ROBO.getId())) {
            WealthUiApi$Toggles.RoboStrategies roboStrategies = WealthUiApi$Toggles.RoboStrategies.f95863c;
            gte.a aVar = this.f237397a;
            return new qf1.k(((jte.d) aVar).c(roboStrategies) ? R$drawable.uikit_icn_16_revolut : R$drawable.uikit_icn_24_robo_advisor, new TextLocalisedClause(((jte.d) aVar).c(roboStrategies) ? R$string.add_new_product_strategies_title : R$string.add_new_product_robo_title, null, null, 14), new TextLocalisedClause(((jte.d) aVar).c(roboStrategies) ? R$string.add_new_product_strategy_description : R$string.add_new_product_robo_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_ISA.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_bar_chart_percent, new TextLocalisedClause(R$string.add_new_product_isa_not_onboarded_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_isa_not_onboarded_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_PEA.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_bar_chart_percent, new TextLocalisedClause(R$string.add_new_product_pea_not_onboarded_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_pea_not_onboarded_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_PERSONAL_JISA.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_bar_chart_percent, new TextLocalisedClause(R$string.add_new_product_jisa_not_onboarded_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_personal_jisa_not_onboarded_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_CUSTODIAN_JISA.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_children, new TextLocalisedClause(R$string.add_new_product_jisa_not_onboarded_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_jisa_not_onboarded_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_CFD.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_cfd, new TextLocalisedClause(R$string.add_new_product_cfds_not_onboarded_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_cfds_not_onboarded_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_GIA_MARGIN.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_credit_bag, new TextLocalisedClause(R$string.add_new_product_margin_trading_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_margin_trading_subtitle, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_BONDS.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_bank, new TextLocalisedClause(R$string.add_new_product_bonds_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_bonds_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_ETFS.getId())) {
            Pair pair = item.d ? new Pair(new TextLocalisedClause(R$string.add_new_product_etps_etfs_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_etps_description, null, null, 14)) : new Pair(new TextLocalisedClause(R$string.add_new_product_etfs_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_etfs_description, null, null, 14));
            return new qf1.k(R$drawable.uikit_icn_24_pie_chart, (Clause) pair.f186385a, (Clause) pair.f186386b, null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_PRIVATE_MARKETS.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_portfolio_slow_and_steady, new TextLocalisedClause(R$string.add_new_product_funds_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_funds_description, null, null, 14), null, null, null, 56);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_SECURITIES_JOINT.getId())) {
            return new qf1.k(R$drawable.uikit_icn_24_joint, new TextLocalisedClause(R$string.add_new_product_joint_invest_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_invest_description, null, null, 14), null, null, null, 56);
        }
        throw new IllegalArgumentException(j6.a.q("Unsupported item type:", item.f271525a));
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) throws Throwable {
        tih.c item = (tih.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f271525a;
        if (Intrinsics.f(str, qf1.f.INVEST_SECURITIES.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investment, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_brokerage, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_global, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_apple, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_meta, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_nvidia, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_tesla, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_nvda, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_tsla, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_aapl, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_google, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_goog, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_facebook, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_msft, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_amd, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_COMMODITIES.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_commodities, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_gold, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_silver, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_metals, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_precious, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_ROBO.getId())) {
            aim.e eVarB = u.b();
            if (((jte.d) this.f237397a).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) {
                eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_strategies, null, null, 14));
                eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_strategy, null, null, 14));
            } else {
                eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_robo, null, null, 14));
                eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_advisor, null, null, 14));
            }
            eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_automated, null, null, 14));
            eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_portfolio, null, null, 14));
            eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investing, null, null, 14));
            eVarB.add(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_managed, null, null, 14));
            return u.a(eVarB);
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_ISA.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_isa, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_taxfree, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investing, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_PEA.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pea, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_taxfree, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investing, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_PERSONAL_JISA.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_isa, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_taxfree, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investing, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_junior, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_TAA_CUSTODIAN_JISA.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_isa, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_taxfree, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investing, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_junior, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_child, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_children, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_young, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_CFD.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_cfd, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_trading, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_margin, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_leverage, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_derivatives, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_GIA_MARGIN.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investment, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_brokerage, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_trading, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_margin, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_leverage, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investing, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_BONDS.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_bonds, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_bond, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_corporate, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_government, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_debt, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_coupon_rate, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_maturity, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_yield, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_ETFS.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_etfs, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_index, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_s_and_p, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_spy, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_voo, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_funds, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_passive, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_PRIVATE_MARKETS.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_funds, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_private_markets, null, null, 14));
        }
        if (Intrinsics.f(str, qf1.f.INVEST_SECURITIES_JOINT.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_joint, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_investment, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_brokerage, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_stocks, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shares, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_global, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_apple, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_meta, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_nvidia, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_tesla, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_nvda, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_tsla, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_aapl, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_google, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_goog, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_facebook, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_msft, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_amd, null, null, 14));
        }
        hx7.e.n(new IllegalArgumentException(j6.a.q("Unsupported item type:", item.f271525a)));
        return f0.f322471a;
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        tih.c item = (tih.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new qf1.i(new a(item.f271525a, item.f271526b));
    }
}
