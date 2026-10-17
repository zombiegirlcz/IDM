package ti4;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.qe0;
import ip0.we0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
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
        List listC = u.c(new we0("IMAGE_LIST_ID", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d197", new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), 55), null, "mobile/3d_images/v2", 20))));
        List listK = v.k(new RowDelegate.Model("steps_prefix_0", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_sso_selfie_intro_faq_row_0_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856), new RowDelegate.Model("steps_prefix_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.credit_sso_selfie_intro_faq_row_1_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listK, listC);
        HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(R$string.credit_sso_selfie_intro_disclaimer, (List) null, (Integer) null, (Object) null, 30);
        ak0 ak0Var = new ak0(null, null, 3);
        int i = R$attr.uikit_dp16;
        int i2 = R$attr.uikit_dp32;
        return new j(d0.E0(u.c(new TextDelegate.Model("id_disclaimer", htmlLocalisedClause, false, ak0Var, null, null, i, 0, i2, i2, 372)), arrayListE0));
    }
}
