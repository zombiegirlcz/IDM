package uw4;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.credit.card.api.widget.CreditCardWidgetContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.core.navigation.FeatureCommand;
import dsh.o;
import efm.d0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import om4.g3;
import org.jetbrains.annotations.NotNull;
import sri.m;
import wli.x;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements csh.f {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f283550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f283551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f283552c;
    public final x d;

    public g(a0 widgetsUiInteractor, g3 creditCardMsiAdsUrlDecoratorInteractor, m navigator, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardMsiAdsUrlDecoratorInteractor, "creditCardMsiAdsUrlDecoratorInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f283550a = widgetsUiInteractor;
        this.f283551b = creditCardMsiAdsUrlDecoratorInteractor;
        this.f283552c = navigator;
        this.d = deeplinkHandler;
    }

    @Override // csh.f
    public final Class j() {
        return CreditCardWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CreditCardWidgetContext widgetContext2 = (CreditCardWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            if (!(((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof HorizontalScrollerWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            this.f283552c.c(new FeatureCommand(new ShopsFeatureConfig.Home("MSI")));
        } else if (event instanceof n0) {
            Object obj2 = ((n0) event).f55437c.f53167l;
            sl4.d dVar = obj2 instanceof sl4.d ? (sl4.d) obj2 : null;
            if (dVar != null) {
                String deeplink = dVar.d;
                String str = dVar.e;
                g3 g3Var = this.f283551b;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                d0 d0VarZ0 = this.d.Z0(g3Var.f226586a.a(deeplink, "9b8f8d3e-d6c1-4b86-8400-3573593aae7d", str), lg0.a.OPEN_BROWSER, Boolean.FALSE);
                d0VarZ0.getClass();
                pfm.h hVar = new pfm.h(d0VarZ0, 4);
                Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                return hVar;
            }
        } else if (event instanceof q0) {
            String str2 = ((q0) event).f55476b;
            String creditCardFacilityId = widgetContext2.getCreditCardFacilityId();
            HomeFeedWidgetContext.CreditCard.INSTANCE.getClass();
            this.f283550a.a(new o(HomeFeedWidgetContext.CreditCard.Companion.a(creditCardFacilityId), str2));
        } else {
            int i = jli.h.f175850a;
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
