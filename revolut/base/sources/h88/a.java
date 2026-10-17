package h88;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.api.navigation.JuniorAccountDestination$JuniorPocketChildPickerDestination;
import com.revolut.feature.junior.accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.h;
import qf1.j;
import qf1.k;
import qf1.t;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(qf1.d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_spaces_add_new_product_pocket_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.junior_spaces_add_new_product_pocket_grouped_title, null, null, 14);
        return new k(R$drawable.uikit_icn_24_children, textLocalisedClause, new TextLocalisedClause(R$string.junior_spaces_add_new_product_pocket_subtitle, null, null, 14), textLocalisedClause2, null, null, 48);
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pockets, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_subaccount, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_spaces, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pots, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_vaults, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_jars, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_kids, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_teens, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_child, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_youth, null, null, 14));
    }

    @Override // pf1.a
    public final j c(qf1.d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(JuniorAccountDestination$JuniorPocketChildPickerDestination.f76699a);
    }
}
