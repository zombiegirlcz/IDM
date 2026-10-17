package xqi;

import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.retail.common.ui.api.Toggles;
import dy0.c0;
import dy0.q0;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final q0 a(c0 c0Var, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        return new q0((ParcelableViewTarget) new ViewIdTarget(((d) featureToggleInteractor).c(Toggles.AccountDetailsSurfacing.f98561c) ? R$id.uikit_accountSwitcherPagerIndicatorButton : R$id.navbarContentCenter_smallActionButton), false, new HomeOverlayConfig(true));
    }

    public static final q0 b(c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        ViewIdTarget viewIdTarget = new ViewIdTarget(R$id.navBarWithContainerHeader_avatar);
        HomeOverlayConfig.INSTANCE.getClass();
        return new q0((ParcelableViewTarget) viewIdTarget, false, HomeOverlayConfig.f59654b);
    }

    public static final q0 c(c0 c0Var, ListIdTarget highlightedElement) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(highlightedElement, "highlightedElement");
        HomeOverlayConfig.INSTANCE.getClass();
        return new q0((ParcelableViewTarget) highlightedElement, true, HomeOverlayConfig.f59654b);
    }
}
