package vpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import qv0.p;
import rpb.d;
import rpb.n;
import skm.p0;
import ue0.e;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f291146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc7.a f291147b;

    public b(d navigationProvider, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f291146a = navigationProvider;
        this.f291147b = homeFeedWidgetsEventDispatcher;
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
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        j jVar = ((i) event).f55375c;
        p pVar = jVar instanceof p ? (p) jVar : null;
        Object f55256g = pVar != null ? pVar.getF55256g() : null;
        if (f55256g instanceof n) {
            return e.v(pd.b.n(p0.f264003c, new vfg.m(this, (n) f55256g, null, 22)));
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
