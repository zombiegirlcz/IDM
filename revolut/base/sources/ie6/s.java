package ie6;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.extension_auth.impl.R$string;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge6.h f160649a;

    public s(ge6.h extensionAuthMapper) {
        Intrinsics.checkNotNullParameter(extensionAuthMapper, "extensionAuthMapper");
        this.f160649a = extensionAuthMapper;
    }

    public static aw0.g a(boolean z, boolean z3) {
        m6 m6Var = n6.Companion;
        return new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.rwa_main_button_reject, null, null, 14), LargeActionButton.ButtonStyle.f58726b, new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246)), "MAIN_BUTTON_TAG", z, null, null, null, 968), m6.c(m6Var, new TextLocalisedClause(R$string.rwa_main_button_accept, null, null, 14), LargeActionButton.ButtonStyle.f58725a, new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246)), "SECONDARY_BUTTON_TAG", z3, null, null, null, 968), (Clause) null, (aw0.f) null, 25);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = false;
        if (domainState.f160631c) {
            pb0 pb0Var = new pb0("loading_id");
            yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
            return new h(zhm.u.c(pb0Var), a(false, false), false);
        }
        if (domainState.d) {
            return new h(ge6.h.c(), a(false, false), false);
        }
        ExtensionAuthRequestData extensionAuthRequestData = domainState.f160629a;
        if (extensionAuthRequestData == null) {
            pb0 pb0Var2 = new pb0("loading_id");
            yp0.b.l(pb0Var2, 0, 0, 0, 0, null, false, 63);
            return new h(zhm.u.c(pb0Var2), a(false, false), false);
        }
        i iVar = domainState.f160630b;
        i iVar2 = i.IDLE;
        boolean z3 = iVar == iVar2;
        if (iVar == iVar2 && extensionAuthRequestData.getF72185c() > 0) {
            z = true;
        }
        return new h(this.f160649a.d(extensionAuthRequestData), a(z3, z), true);
    }
}
