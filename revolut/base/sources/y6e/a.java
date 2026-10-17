package y6e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.api.navigation.JointAccountCreationDestination;
import com.revolut.feature.joint.api.navigation.JointCreationConfiguration;
import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination;
import com.revolut.feature.subaccount.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.f;
import qf1.h;
import qf1.j;
import qf1.k;
import qf1.t;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f245232a;
        if (Intrinsics.f(str, f.PERSONAL_POCKET.getId())) {
            return new k(R$drawable.uikit_icn_24_wallet, new TextLocalisedClause(R$string.add_new_product_personal_pocket_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_personal_pocket_subtitle, null, null, 14), new TextLocalisedClause(R$string.add_new_product_personal_pocket_grouped_title, null, null, 14), null, null, 48);
        }
        if (Intrinsics.f(str, f.GROUP_POCKET.getId())) {
            return new k(R$drawable.uikit_icn_24_people, new TextLocalisedClause(R$string.add_new_product_group_pocket_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_group_pocket_subtitle, null, null, 14), new TextLocalisedClause(R$string.add_new_product_group_pocket_grouped_title, null, null, 14), null, null, 48);
        }
        if (!Intrinsics.f(str, f.JOINT_POCKET.getId())) {
            throw new IllegalArgumentException(j6.a.q("Unsupported item type:", item.f245232a));
        }
        return new k(R$drawable.uikit_icn_24_joint, new TextLocalisedClause(R$string.add_new_product_joint_pocket_title, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_pocket_subtitle, null, null, 14), new TextLocalisedClause(R$string.add_new_product_joint_pocket_grouped_title, null, null, 14), null, null, 48);
    }

    @Override // pf1.a
    public final List b(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f245232a;
        if (Intrinsics.f(str, f.PERSONAL_POCKET.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pockets, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_subaccount, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_spaces, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pots, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_vaults, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_jars, null, null, 14));
        }
        if (Intrinsics.f(str, f.GROUP_POCKET.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pockets, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_subaccount, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_spaces, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pots, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_vaults, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_jars, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_group, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shared, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_split, null, null, 14));
        }
        if (Intrinsics.f(str, f.JOINT_POCKET.getId())) {
            return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pockets, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_subaccount, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_spaces, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pots, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_vaults, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_jars, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_joint, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_shared, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_couple, null, null, 14));
        }
        throw new IllegalArgumentException(j6.a.q("Unsupported item type:", item.f245232a));
    }

    @Override // pf1.a
    public final j c(d dVar) {
        t item = (t) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f245232a;
        if (Intrinsics.f(str, f.PERSONAL_POCKET.getId())) {
            return new h(new CreateSubaccountWithTypeScreenDestination(y0.b(SubaccountType.Personal.f88963a), new CreateSubaccountProductArticleConfig.ResolveBySubaccountType(true), null, null, false, 28));
        }
        if (Intrinsics.f(str, f.GROUP_POCKET.getId())) {
            return new h(new CreateSubaccountWithTypeScreenDestination(y0.b(SubaccountType.Group.f88960a), new CreateSubaccountProductArticleConfig.ResolveBySubaccountType(true), null, null, false, 28));
        }
        if (Intrinsics.f(str, f.JOINT_POCKET.getId())) {
            return new h(new JointAccountCreationDestination(JointCreationConfiguration.Pocket.f76501a));
        }
        throw new IllegalArgumentException(j6.a.q("Unsupported item type:", item.f245232a));
    }
}
