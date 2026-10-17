package zc7;

import amd.j;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.IconsTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.m3;
import com.revolut.feature.home_feed.api.widget.NetworthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f321240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final frd.i f321241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc7.a f321242c;

    public c(k39.b navigationCommandsDispatcher, frd.i totalWealthEventRouter, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(totalWealthEventRouter, "totalWealthEventRouter");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f321240a = navigationCommandsDispatcher;
        this.f321241b = totalWealthEventRouter;
        this.f321242c = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return NetworthWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        NetworthWidgetContext widgetContext2 = (NetworthWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i3;
        m mVar = m.f235744a;
        if (z) {
            Object obj2 = ((i3) event).f55382c.u;
            if (obj2 instanceof j) {
                return pd.b.n(p0.f264003c, new b(this, (j) obj2, null));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof m3) {
            Object obj3 = ((m3) event).f55431c.u;
            if (obj3 instanceof j) {
                return pd.b.n(p0.f264003c, new b(this, (j) obj3, null));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            return ((model instanceof IconsTileWidgetDelegate.Model) || (model instanceof RowsWidgetDelegate.Model)) ? pd.b.n(p0.f264003c, new a(this, event, null)) : mVar;
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
