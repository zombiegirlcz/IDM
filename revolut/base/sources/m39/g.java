package m39;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.feature.lifestyle_feed.api.models.LifestyleWidgetContext;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import pfm.m;
import tof.a3;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.a f202305a;

    public g(k39.a lifestyleFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(lifestyleFeedWidgetsEventDispatcher, "lifestyleFeedWidgetsEventDispatcher");
        this.f202305a = lifestyleFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return LifestyleWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        LifestyleWidgetContext widgetContext2 = (LifestyleWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i3;
        k39.a aVar = this.f202305a;
        if (z) {
            Object obj2 = ((i3) event).f55382c.u;
            if (obj2 instanceof RevPointsTransaction) {
                aVar.b(new g39.a(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetails((RevPointsTransaction) obj2, null, true, null, false, 26))));
            } else if (obj2 instanceof a3) {
                aVar.b(new g39.a(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P((a3) obj2), null, null, null, 126)))));
            }
        } else if (event instanceof i) {
            if (((i) event).f55375c instanceof RowsWidgetDelegate.Model) {
                aVar.b(new g39.a(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(null, null, 3))));
            }
        } else if (event instanceof g3) {
            aVar.b(new g39.a(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(null, null, 3))));
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
