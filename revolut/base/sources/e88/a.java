package e88;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.g;
import qf1.h;
import qf1.j;
import qf1.k;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(qf1.d dVar) {
        t68.c item = (t68.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_children, new TextLocalisedClause(R$string.junior_add_new_product_title, null, null, 14), new TextLocalisedClause(R$string.junior_add_new_product_description, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        t68.c item = (t68.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_kids, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_teens, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_account, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_junior, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_child, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_teen, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_youth, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_u18, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_under18, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_minor, null, null, 14));
    }

    @Override // pf1.a
    public final j c(qf1.d dVar) {
        t68.c item = (t68.c) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return !item.f268264b.isEmpty() ? new g(new u68.a(item.f268264b, item.f268265c, item.d)) : new h(new JuniorOnboardingDestination.Creation((mh8.h) null, 3));
    }
}
