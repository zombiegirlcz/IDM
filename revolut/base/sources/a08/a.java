package a08;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends pri.c implements g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xpi.g f162h;
    public final iqi.h i;

    public a(xpi.g navBar, iqi.h twinVerticalButtonView) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        this.f162h = navBar;
        this.i = twinVerticalButtonView;
    }

    public final void N(TextLocalisedClause textLocalisedClause, boolean z) {
        iqi.b bVar = (iqi.b) this.i;
        bVar.V(z);
        bVar.X(z);
        bVar.R(z, false);
        if (z) {
            bVar.Y(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        }
        bVar.setVisible(false);
        bVar.Z(true);
        bVar.e0(false);
        if (textLocalisedClause != null) {
            bVar.d0(textLocalisedClause);
        }
        bVar.b0(true);
        bVar.c0(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // a08.g
    public void g() {
        xpi.c cVar = (xpi.c) this.f162h;
        cVar.setVisible(true);
        cVar.c0(tx0.j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.Z(false);
        cVar.X(true);
    }
}
