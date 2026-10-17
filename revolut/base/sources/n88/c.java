package n88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f213278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f213279b;

    public c(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f213278a = homeFeedWidgetsEventDispatcher;
        this.f213279b = widgetsUiInteractor;
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
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new ly2.d(this, 11, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if ((event instanceof com.revolut.core.ui_kit.delegates.widgets.i) || (event instanceof q)) {
            return pd.b.n(p0.f264003c, new b(this, widgetContext2, event, null));
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
