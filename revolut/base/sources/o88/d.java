package o88;

import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f222961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f222962b;

    public d(a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f222961a = homeFeedWidgetsEventDispatcher;
        this.f222962b = widgetsUiInteractor;
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
            h hVar = new h(new ly2.d(this, 18, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        if (!(model instanceof AvatarWidgetDelegate.Model)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        Object obj2 = ((AvatarWidgetDelegate.Model) model).f54968n;
        q88.a aVar = obj2 instanceof q88.a ? (q88.a) obj2 : null;
        return (aVar == null || !aVar.f243044a) ? mVar : pd.b.n(p0.f264003c, new c(this, widgetContext2, event, null));
    }
}
