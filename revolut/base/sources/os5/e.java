package os5;

import com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.retail.core.navigation.FeatureCommand;
import csh.f;
import h93.f0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import ne0.o;
import pfm.h;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ss5.a f229234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f229235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l93.f f229236c;

    public e(ss5.a cryptoFeedWidgetsEventDispatcher, a0 widgetsUiInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(cryptoFeedWidgetsEventDispatcher, "cryptoFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f229234a = cryptoFeedWidgetsEventDispatcher;
        this.f229235b = widgetsUiInteractor;
        this.f229236c = revolutCardsInteractor;
    }

    public final h b(f0 f0Var, boolean z, boolean z3) {
        h hVar = new h(new o(this, new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(f0Var.f150110a, 4, f0Var.d() && z, false), z3 ? n63.a.ZoomWidgets : n63.a.Default, 15), 19), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    public final h c() {
        h hVar = new h(new o(this, u0.b(new FeatureCommand(new CardOrderNewFeatureConfig(SelectedTab.CRYPTO, null, null, null, null, false, null, null, null, null, null, null, 16382))), 20), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // csh.f
    public final Class j() {
        return CryptoWidgetContext.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    @Override // csh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.b w(com.revolut.feature.widgets.api.dependencies.WidgetContext r14, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os5.e.w(com.revolut.feature.widgets.api.dependencies.WidgetContext, com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$a):efm.b");
    }
}
