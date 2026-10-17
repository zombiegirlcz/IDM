package tpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import qv0.p;
import rpb.o;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f273330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpb.d f273331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc7.a f273332c;

    public e(a0 widgetsUiInteractor, rpb.d navigationProvider, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f273330a = widgetsUiInteractor;
        this.f273331b = navigationProvider;
        this.f273332c = homeFeedWidgetsEventDispatcher;
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
            h hVar = new h(new r2d.e(this, 9, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        j jVar = ((i) event).f55375c;
        p pVar = jVar instanceof p ? (p) jVar : null;
        Object f52328h = pVar != null ? pVar.getF52328h() : null;
        if (f52328h instanceof o) {
            return ue0.e.v(pd.b.n(p0.f264003c, new d(this, (o) f52328h, null)));
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
