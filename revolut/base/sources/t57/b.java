package t57;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.FullScreenStateWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.j2;
import com.revolut.core.ui_kit.delegates.widgets.j4;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.w0;
import com.revolut.feature.freelancer_widgets.api.FreelancerWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import r2d.e;
import skm.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f268045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc7.a f268046c;

    public b(a0 widgetsUiInteractor, String widgetType, uc7.a homeFeedWidgetsEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        this.f268044a = widgetType;
        this.f268045b = widgetsUiInteractor;
        this.f268046c = homeFeedWidgetsEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return FreelancerWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        FreelancerWidgetContext widgetContext2 = (FreelancerWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if ((event instanceof i) || (event instanceof w0) || (event instanceof n0) || (event instanceof j2) || (event instanceof GoalProgressWidgetDelegate.b) || (event instanceof CalendarListWidgetDelegate.b) || (event instanceof FullScreenStateWidgetDelegate.a) || (event instanceof j4) || (event instanceof RowsWidgetDelegate.b)) {
            return pd.b.n(p0.f264003c, new a(this, widgetContext2, event, null));
        }
        if (event instanceof q0) {
            h hVar = new h(new e(this, 8, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
