package vbc;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TrackingProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayDeliveries;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayOrderDetails;
import com.revolut.feature.revolutpay.order_tracking.api.widgets.RevolutPayWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import v3e.t;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f287497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc7.a f287498b;

    public g(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f287497a = widgetsUiInteractor;
        this.f287498b = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return RevolutPayWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        RevolutPayWidgetContext widgetContext2 = (RevolutPayWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            h hVar = new h(new r2d.e(this, 22, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        Object obj2 = model instanceof TrackingProgressWidgetDelegate.Model ? ((TrackingProgressWidgetDelegate.Model) model).f55274m : model instanceof TrackingProgressEmptyWidgetDelegate.Model ? ((TrackingProgressEmptyWidgetDelegate.Model) model).f55262g : mVar;
        if (obj2 instanceof lac.b) {
            h hVar2 = new h(new t(this, new RevolutPayFeatureConfig$RevolutPayOrderDetails(((lac.b) obj2).f193360a), 4), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (!(obj2 instanceof lac.a)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        h hVar3 = new h(new t(this, RevolutPayFeatureConfig$RevolutPayDeliveries.f84279a, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
        return hVar3;
    }
}
