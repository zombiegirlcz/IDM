package ypb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonLineChartWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import rpb.o;
import skm.p0;
import yc7.k;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f315809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpb.d f315810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc7.a f315811c;

    public e(a0 widgetsUiInteractor, rpb.d navigationProvider, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f315809a = widgetsUiInteractor;
        this.f315810b = navigationProvider;
        this.f315811c = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Savings.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            h hVar = new h(new k(this, 2, event, widgetContext2), 2);
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
        ComparisonLineChartWidgetDelegate.Model model2 = model instanceof ComparisonLineChartWidgetDelegate.Model ? (ComparisonLineChartWidgetDelegate.Model) model : null;
        Object obj2 = model2 != null ? model2.f55076n : null;
        if (obj2 instanceof o) {
            return ue0.e.v(pd.b.n(p0.f264003c, new d(this, (o) obj2, null)));
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
