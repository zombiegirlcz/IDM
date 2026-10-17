package zvf;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        sa saVar = new sa("ID_WARNING", (Clause) new TextLocalisedClause(R$string.transport_get_help_provider_widget_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.transport_get_help_provider_widget_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
        RowDelegate.Model model = new RowDelegate.Model("ID_CONTACT", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_help_chat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.transport_get_help_action_contact_support, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, zvf.a.CONTACT, null, 0, R$attr.uikit_dp8, 0, 0, 499122168);
        RowDelegate.Model model2 = new RowDelegate.Model("ID_FAQ", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_16_list_bullet, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.transport_get_help_action_faq, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, zvf.a.FAQ, null, R$attr.uikit_dp8, 0, 0, 0, 515899384);
        aim.e eVarB = u.b();
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        eVarB.add(saVar);
        List listK = v.k(model, model2);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new b(u.a(eVarB));
    }
}
