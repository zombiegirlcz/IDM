package mc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ComparisonBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalBarsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.feature.spending_analytics.api.widget.CashflowWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.AnalyticsAccount;
import kotlin.jvm.internal.Intrinsics;
import la8.j;
import pfm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f204304a;

    public h(uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f204304a = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return CashflowWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CashflowWidgetContext widgetContext2 = (CashflowWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        if (model instanceof ComparisonBarsTileWidgetDelegate.Model) {
            Object obj2 = ((ComparisonBarsTileWidgetDelegate.Model) model).f55057g;
            pfm.h hVar = new pfm.h(new j(this, obj2 instanceof AnalyticsAccount ? (AnalyticsAccount) obj2 : null, 11), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (!(model instanceof HorizontalBarsTileWidgetDelegate.Model)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Object obj3 = ((HorizontalBarsTileWidgetDelegate.Model) model).f55158j;
        pfm.h hVar2 = new pfm.h(new j(this, obj3 instanceof AnalyticsAccount ? (AnalyticsAccount) obj3 : null, 11), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        return hVar2;
    }
}
