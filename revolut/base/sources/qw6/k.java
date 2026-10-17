package qw6;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Set<FreelancerPluginType> set = domainState.f249785a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        for (FreelancerPluginType freelancerPluginType : set) {
            String str = "LIST_ID_PLUGIN" + freelancerPluginType;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(vw6.b.b(freelancerPluginType), null, null, false, null, false, 60);
            TextLocalisedClause textLocalisedClauseC = vw6.b.c(freelancerPluginType);
            if (freelancerPluginType.equals(FreelancerPluginType.PrestaShop.f60845a)) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_ecommerce_presta_shop_options_description, null, null, 14);
            } else if (freelancerPluginType.equals(FreelancerPluginType.Shopify.f60846a)) {
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_ecommerce_shopify_options_description, null, null, 14);
            } else {
                if (!freelancerPluginType.equals(FreelancerPluginType.Woocommerce.f60847a)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.freelancer_ecommerce_woo_options_description, null, null, 14);
            }
            arrayList.add(new RowDelegate.Model(str, image40, textLocalisedClauseC, null, 0, textLocalisedClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, freelancerPluginType, null, 0, 0, 0, 0, 532676568));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new h(arrayList);
    }
}
