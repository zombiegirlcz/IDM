package l28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends csh.a {
    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof g3;
        ScreenerRedesignAllCollectionsDestination screenerRedesignAllCollectionsDestination = ScreenerRedesignAllCollectionsDestination.f96104a;
        if (z) {
            b(screenerRedesignAllCollectionsDestination);
        } else if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            if (((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof RowsWidgetDelegate.Model) {
                b(screenerRedesignAllCollectionsDestination);
            }
        } else if (event instanceof i3) {
            Object obj2 = ((i3) event).f55382c.u;
            ScreenerCollectionDestination screenerCollectionDestination = obj2 instanceof ScreenerCollection ? new ScreenerCollectionDestination(((ScreenerCollection) obj2).f105154a, null) : null;
            if (screenerCollectionDestination != null) {
                b(screenerCollectionDestination);
            }
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
