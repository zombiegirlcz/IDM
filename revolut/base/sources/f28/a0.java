package f28;

import com.revolut.core.ui_kit.delegates.LineChartResizableTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ash.d f131447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ish.a0 f131448b;

    public a0(ash.d eventDispatcher, ish.a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f131447a = eventDispatcher;
        this.f131448b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        LineChartResizableTileDelegate.Model model;
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            return new pfm.h(new a09.a0(this, 12, event, widgetContext2), 2);
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        pfm.m mVar = pfm.m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        BaseDraggableWidgetDelegate.Model model2 = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
        LineChartTileWidgetDelegate.Model model3 = model2 instanceof LineChartTileWidgetDelegate.Model ? (LineChartTileWidgetDelegate.Model) model2 : null;
        String str = (model3 == null || (model = model3.f55188c) == null) ? null : model.f52643a;
        if (Intrinsics.f(str, "ANALYTICS_TOTAL_VALUE_WIDGET_LIST_ID")) {
            return pd.b.n(p0.f264003c, new z(this, ixg.a.TOTAL_VALUE, null));
        }
        if (Intrinsics.f(str, "ANALYTICS_PERFORMANCE_WIDGET_LIST_ID")) {
            return pd.b.n(p0.f264003c, new z(this, ixg.a.PERFORMANCE, null));
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
