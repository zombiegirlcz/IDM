package m88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f203454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f203455b;

    public h(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f203454a = homeFeedWidgetsEventDispatcher;
        this.f203455b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Junior.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i3) {
            return pd.b.n(p0.f264003c, new g(event, this, widgetContext2, null));
        }
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new ly2.d(this, 5, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
