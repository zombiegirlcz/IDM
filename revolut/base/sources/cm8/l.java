package cm8;

import cli.n;
import cli.o;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_remote_login.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model("PHONE_NUMBER_PRODUCT_ID", new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D100", null, null, null, 30)), new TextLocalisedClause(R$string.junior_app_invitation_phone_title, null, null, 14), new TextLocalisedClause(R$string.junior_app_invitation_phone_subtitle, null, null, 14), u.c(new pc("PHONE_NUMBER_PRODUCT_TAG_ID", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_star_filled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.junior_app_invitation_phone_tag_recommended, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.2f), R$attr.uikit_colorTransparent, null, 1000), null)), null, null, false, false, false, 992);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ProductSelectionDelegate.Model model2 = new ProductSelectionDelegate.Model("QR_CODE_SCANNER_ID", new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D038A", null, null, null, 30)), new TextLocalisedClause(R$string.junior_app_invitation_qr_code_title, null, null, 14), new TextLocalisedClause(R$string.junior_app_invitation_qr_code_scanning_subtitle, null, null, 14), null, null, null, false, false, false, 1008);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new i(v.k(model, model2));
    }
}
