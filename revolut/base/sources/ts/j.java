package ts;

import cli.k;
import cli.n;
import cli.o;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import i26.l;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vision_before_you_proceed_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.vision_before_you_proceed_description, null, null, 14);
        List listC = u.c(new we0("before_you_proceed_image", new qe0(Constants.TAG_SUPPORTED_LOCALE_LIST, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D186", null, null, null, 30))));
        List listK = v.k(new RowDelegate.Model("before_you_proceed_document_not_expired", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_document_checked, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.vision_before_you_proceed_document_not_expired, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("before_you_proceed_document_clear", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.vision_before_you_proceed_document_clear_and_well_lit, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        l.E(listK);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new h(textLocalisedClause, textLocalisedClause2, d0.E0(listK, listC));
    }
}
