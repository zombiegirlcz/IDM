package mc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.feature.spending_analytics.api.widget.SpendingWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f204298a;

    public e(uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f204298a = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return SpendingWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        SpendingWidgetContext widgetContext2 = (SpendingWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(((i) event).f55375c instanceof LineChartTileWidgetDelegate.Model)) {
            return mVar;
        }
        pfm.h hVar = new pfm.h(new i1i.a(this, 15), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
