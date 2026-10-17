package v88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f286728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f286729b;

    public f(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f286728a = homeFeedWidgetsEventDispatcher;
        this.f286729b = widgetsUiInteractor;
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
            return pd.b.n(p0.f264003c, new d(event, this, widgetContext2, null));
        }
        if (event instanceof q0) {
            h hVar = new h(new r2d.e(this, 21, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (event instanceof i) {
            return pd.b.n(p0.f264003c, new e(event, this, widgetContext2, null));
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
