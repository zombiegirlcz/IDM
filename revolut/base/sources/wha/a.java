package wha;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import com.revolut.feature.pro.accounts.impl.R$string;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final qf1.k a(qf1.d dVar) {
        TextLocalisedClause textLocalisedClause;
        uha.c item = (uha.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        int i = R$drawable.uikit_icn_24_services;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_new_design_title, null, null, 14);
        Double d = item.f280167c;
        if (d != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_v3_description, u.c(new PercentageClause(d.doubleValue(), (PercentageClause.Format) null, (Custom) null, 6)), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_description_sub_accounts_v2, null, null, 14);
        }
        return new qf1.k(i, textLocalisedClause2, textLocalisedClause, null, null, null, 56);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        uha.c item = (uha.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pro, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_business, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_freelancer, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_fx, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_currency, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_cashback, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_hustle, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_work, null, null, 14));
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        ParcelableDestination pendingAccount;
        uha.c item = (uha.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        uha.k kVar = item.f280166b;
        boolean zF = Intrinsics.f(kVar, uha.d.INSTANCE);
        FreelancerOnboardingNavStrategy.NavigateToMain navigateToMain = FreelancerOnboardingNavStrategy.NavigateToMain.f73261a;
        if (zF) {
            pendingAccount = new FreelancerBizFeatureConfig.Onboarding.Default(FreelancerOnboardingArticleConfig.DoNotShowArticle.f73172a, navigateToMain, 1);
        } else if (Intrinsics.f(kVar, uha.f.INSTANCE)) {
            pendingAccount = new FreelancerBizFeatureConfig.Onboarding.Default(new FreelancerOnboardingArticleConfig.ShowArticle(dr6.a.GENERAL), navigateToMain, 1);
        } else if (Intrinsics.f(kVar, uha.g.INSTANCE)) {
            pendingAccount = new OpenNewPocketDestination(io3.l.MERCHANT, (AccountId) AccountId.Personal.f51414a, true);
        } else {
            if (!(kVar instanceof uha.j)) {
                throw new NoWhenBranchMatchedException();
            }
            pendingAccount = new FreelancerBizFeatureConfig.PendingAccount(((uha.j) kVar).f280173a);
        }
        return new qf1.h(pendingAccount);
    }
}
