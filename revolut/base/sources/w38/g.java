package w38;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.api.navigation.JointAccountCreationDestination;
import com.revolut.feature.joint.api.navigation.JointCreationConfiguration;
import com.revolut.feature.joint.impl.R$string;
import com.revolut.feature.pockets.api.ui.add_new.OpenNewPocketDestination;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements pf1.a {
    @Override // pf1.a
    public final qf1.k a(qf1.d dVar) {
        int i;
        n38.d item = (n38.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        wi0.b bVarC = com.bumptech.glide.d.c(item.f211936c);
        boolean z = item.f211935b instanceof n38.g;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause((z && com.bumptech.glide.d.u(bVarC)) ? R$string.add_new_product_joint_currency_opened_title_mx : z ? R$string.add_new_product_joint_currency_opened_title : com.bumptech.glide.d.u(bVarC) ? R$string.add_new_product_joint_currency_title_mx : R$string.account_switcher_product_selection_joint_account_title, null, null, 14);
        if (z) {
            int i2 = item.d;
            i = (31 > i2 || i2 > Integer.MAX_VALUE) ? (26 > i2 || i2 >= 31) ? R$string.add_new_product_joint_currency_subtitle_multiple : R$string.add_new_product_joint_currency_subtitle_reduced : R$string.add_new_product_joint_currency_subtitle;
        } else {
            i = com.bumptech.glide.d.u(bVarC) ? R$string.add_new_product_joint_currency_onboarding_subtitle_mx : com.bumptech.glide.d.p(bVarC) ? R$string.add_new_product_joint_currency_onboarding_subtitle : R$string.add_new_product_joint_currency_onboarding_subtitle_account_card;
        }
        return new qf1.k(R$drawable.uikit_icn_24_joint, textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        n38.d item = (n38.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        n38.p pVar = item.f211935b;
        if (pVar instanceof n38.g) {
            return zhm.v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_fx, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shared, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_partner, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_couple, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_duo, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_exchange, null, null, 14));
        }
        if ((pVar instanceof n38.k) || (pVar instanceof n38.l) || (pVar instanceof n38.o)) {
            return zhm.v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shared, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_partner, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_couple, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_duo, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_household, null, null, 14));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pf1.a
    public final qf1.j c(qf1.d dVar) {
        n38.d item = (n38.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        n38.p pVar = item.f211935b;
        if (pVar instanceof n38.g) {
            n38.g gVar = (n38.g) pVar;
            return new qf1.h(new OpenNewPocketDestination(io3.l.CURRENT, (AccountId) new AccountId.Joint(gVar.f211949a, gVar.f211950b), true));
        }
        boolean z = pVar instanceof n38.k;
        JointCreationConfiguration.Account account = JointCreationConfiguration.Account.f76500a;
        if (z) {
            if (!((n38.k) pVar).f211953a) {
                return new qf1.h(new JointAccountCreationDestination(account));
            }
            return new qf1.i(new f(new ProductAccountDescriptor$Value.Main(new ProductAccountId("JOINT_PENDING_INVITATION_PRODUCT_ID", null), ProductId.JOINT)));
        }
        if (pVar instanceof n38.o) {
            return new qf1.i(new f(new ProductAccountDescriptor$Value.Main(new ProductAccountId(((n38.o) pVar).f211956a, null), ProductId.JOINT)));
        }
        if (pVar instanceof n38.l) {
            return new qf1.h(new JointAccountCreationDestination(account));
        }
        throw new NoWhenBranchMatchedException();
    }
}
