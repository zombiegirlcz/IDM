package ft1;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bizum.api.R$string;
import ip0.iq;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f137780a = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_document, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10);

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        ft1.a domainState = (ft1.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ITEM_TERMS_ID", new RowDelegate.Model.MainImage.Image40(this.f137780a, null, null, false, null, false, 60), new TextLocalisedClause(R$string.bizum_registration_terms_widget, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        InputChecklistDelegate.Model model2 = new InputChecklistDelegate.Model("ITEM_ACK_ID", new TextLocalisedClause(R$string.bizum_registration_terms_acknowledge_text, null, null, 14), domainState.f137772b, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new f(v.k(model, model2), domainState.f137772b);
    }
}
