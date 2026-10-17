package ezi;

import a08.l;
import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig;
import com.revolut.retail.feature.airportlounges.api.widgets.AirportLoungesWidgetContext;
import csh.f;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f130944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.d f130945b;

    public d(ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f130944a = widgetsUiInteractor;
        this.f130945b = widgetsCommonEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return AirportLoungesWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        AirportLoungesWidgetContext widgetContext2 = (AirportLoungesWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            h hVar = new h(new a09.a0(this, 11, (q0) event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        if (model instanceof AccessPassWidgetDelegate.Model) {
            h hVar2 = new h(new l(this, AirportLoungesFeatureConfig.PassDetailsDestination.f98948b, 29), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (!(model instanceof GoalProgressEmptyWidgetDelegate.Model)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        h hVar3 = new h(new l(this, new AirportLoungesFeatureConfig.HomeDestination((ZoomTransitionAnimation.Default) null, 3), 29), 2);
        Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
        return hVar3;
    }
}
