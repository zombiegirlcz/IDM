package zpb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a4;
import com.revolut.core.ui_kit.delegates.widgets.h4;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import skm.p0;
import yc7.k;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends pri.c implements csh.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final uc7.a f324225h;
    public final a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Class f324226j;

    public e(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f324225h = homeFeedWidgetsEventDispatcher;
        this.i = widgetsUiInteractor;
        this.f324226j = HomeFeedWidgetContext.Savings.class;
    }

    @Override // csh.f
    public final Class j() {
        return this.f324226j;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Savings widgetContext2 = (HomeFeedWidgetContext.Savings) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof h4) || (event instanceof a4) || (event instanceof i)) {
            return pd.b.n(p0.f264003c, new d(this, widgetContext2, event, null));
        }
        if (event instanceof q0) {
            pfm.h hVar = new pfm.h(new k(this, 6, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
