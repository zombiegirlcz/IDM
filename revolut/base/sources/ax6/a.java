package ax6;

import a0.d;
import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.z;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.preview.FreelancerPluginPreviewScreenContract$PluginType;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xw6.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0081a Companion = new C0081a();

    /* JADX INFO: renamed from: ax6.a$a, reason: collision with other inner class name */
    public static final class C0081a {
        private C0081a() {
        }
    }

    public static b a(FreelancerPluginPreviewScreenContract$PluginType type) {
        TextLocalisedClause textLocalisedClause;
        CdnImage cdnImage;
        Intrinsics.checkNotNullParameter(type, "type");
        FreelancerPluginPreviewScreenContract$PluginType.PrestaShop prestaShop = FreelancerPluginPreviewScreenContract$PluginType.PrestaShop.f73806a;
        boolean zF = Intrinsics.f(type, prestaShop);
        FreelancerPluginPreviewScreenContract$PluginType.Woocommerce woocommerce = FreelancerPluginPreviewScreenContract$PluginType.Woocommerce.f73807a;
        if (zF) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_ecommerce_presta_shop_tutorial_title, null, null, 14);
        } else {
            if (!Intrinsics.f(type, woocommerce)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_ecommerce_woo_tutorial_title, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        if (Intrinsics.f(type, prestaShop)) {
            cdnImage = new CdnImage("background", "mobile/freelancer/e_commerce/presta_shop", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        } else {
            if (!Intrinsics.f(type, woocommerce)) {
                throw new NoWhenBranchMatchedException();
            }
            cdnImage = new CdnImage("background", "mobile/freelancer/e_commerce/woo", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
        }
        return new b(new z("LIST_ID_PLUGIN_HEADER_STORY", new NavBarWithContainerBackground.ImageBackground(cdnImage, s8.MULTICOLOR, (Color.SolidRes) null, 12), textLocalisedClause2, null, 56));
    }

    public static RowDelegate.Model b(int i, TextLocalisedClause textLocalisedClause) {
        return new RowDelegate.Model(d.n("LIST_ID_TUTORIAL_ITEM_", i), new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8), false, false, 6), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }
}
