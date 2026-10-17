package a84;

import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2108c;

    public e(b screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f2108c = screen;
    }

    @Override // yji.d
    public final void M() {
        TwinVerticalButton twinVerticalButtonE = this.f2108c.E();
        yji.d.H(this, rd0.e.b(twinVerticalButtonE.o0()), new a07.d(this, null, 12), 3);
        yji.d.H(this, rd0.e.b(twinVerticalButtonE.m0()), new d(this, twinVerticalButtonE, null), 3);
    }

    @Override // a84.a
    public final void Q(boolean z, boolean z3) {
        b bVar = this.f2108c;
        TwinVerticalButton twinVerticalButtonE = bVar.E();
        twinVerticalButtonE.setVisibility(z ? 0 : 8);
        if (bVar.i()) {
            twinVerticalButtonE.setCollapsible(z3);
        }
        twinVerticalButtonE.setMainButtonVisible(z3);
    }

    @Override // yji.d
    public final void onCreate() {
        b bVar = this.f2108c;
        TwinVerticalButton twinVerticalButtonE = bVar.E();
        twinVerticalButtonE.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
        twinVerticalButtonE.setVisibility(4);
        twinVerticalButtonE.setMainButtonVisible(false);
        twinVerticalButtonE.setMainButtonLoadingTag("LOADING_TAG_MAIN_BUTTON");
        twinVerticalButtonE.setSecondaryButtonVisible(false);
        twinVerticalButtonE.setCollapsible(bVar.i());
        twinVerticalButtonE.setCollapsed(bVar.i(), false);
        bVar.h().setTag(R$id.uikit_main_scrollable_view, "MAIN_SCROLLABLE_TAG");
    }
}
