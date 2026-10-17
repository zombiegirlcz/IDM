package vw6;

import aim.e;
import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.freelancer.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l71.d;
import l71.f;
import o07.k;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f292646a;

    public b(k freelancerProcessingFeeItemMapper) {
        Intrinsics.checkNotNullParameter(freelancerProcessingFeeItemMapper, "freelancerProcessingFeeItemMapper");
        this.f292646a = freelancerProcessingFeeItemMapper;
    }

    public static CdnImage b(FreelancerPluginType pluginType) {
        Intrinsics.checkNotNullParameter(pluginType, "pluginType");
        if (Intrinsics.f(pluginType, FreelancerPluginType.PrestaShop.f60845a)) {
            return new CdnImage("icon", "mobile/freelancer/plugins/presta_shop", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        if (Intrinsics.f(pluginType, FreelancerPluginType.Shopify.f60846a)) {
            return new CdnImage("icon", "mobile/freelancer/plugins/shopify", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        if (Intrinsics.f(pluginType, FreelancerPluginType.Woocommerce.f60847a)) {
            return new CdnImage("icon", "mobile/freelancer/plugins/woo", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause c(FreelancerPluginType pluginType) {
        Intrinsics.checkNotNullParameter(pluginType, "pluginType");
        if (Intrinsics.f(pluginType, FreelancerPluginType.PrestaShop.f60845a)) {
            return new TextLocalisedClause(R$string.freelancer_ecommerce_presta_shop_options_title, null, null, 14);
        }
        if (Intrinsics.f(pluginType, FreelancerPluginType.Shopify.f60846a)) {
            return new TextLocalisedClause(R$string.freelancer_ecommerce_shopify_options_title, null, null, 14);
        }
        if (Intrinsics.f(pluginType, FreelancerPluginType.Woocommerce.f60847a)) {
            return new TextLocalisedClause(R$string.freelancer_ecommerce_woo_options_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final e a(List pluginFee, d dVar) {
        Intrinsics.checkNotNullParameter(pluginFee, "pluginFee");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = pluginFee.iterator();
        while (it8.hasNext()) {
            as6.b bVar = (as6.b) it8.next();
            a0.x(this.f292646a.a(bVar.f8797a, w.u(bVar.f8798b)), arrayList);
        }
        ArrayList arrayListG = yp0.b.g(arrayList, new ListSubheaderDelegate.Model("LIST_ID_FEE_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_ecommerce_plugin_payment_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        e eVarB = u.b();
        eVarB.addAll(arrayListG);
        if (!arrayListG.isEmpty() && dVar != null && f.g(dVar)) {
            eVarB.add(new TextDelegate.Model("LIST_ID_PT_FEE_FOOTER", new TextLocalisedClause(R$string.freelancer_processing_fees_disclaimer_additional_taxes, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036));
        }
        return u.a(eVarB);
    }
}
