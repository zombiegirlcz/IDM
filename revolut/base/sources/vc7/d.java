package vc7;

import ba6.l;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.v0;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.core.navigation.FeatureCommand;
import csh.f;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import r2d.e;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f287650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f287651b;

    public d(k39.b navigationCommandsDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f287650a = navigationCommandsDispatcher;
        this.f287651b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Personal.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        k39.b bVar = this.f287650a;
        m mVar = m.f235744a;
        if (z) {
            if (((i) event).f55375c instanceof HorizontalScrollerWidgetDelegate.Model) {
                return bVar.a(new FeatureCommand(DonationsKompotFeatureConfig.CharitiesOverview.f71976g));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof v0) {
            Object obj2 = ((v0) event).f55529c.i;
            l lVar = obj2 instanceof l ? (l) obj2 : null;
            return lVar != null ? bVar.a(new FeatureCommand(new DonationsKompotFeatureConfig.Charity(lVar.f13938a, null))) : mVar;
        }
        if (event instanceof q0) {
            return new h(new e(this, 23, event, widgetContext2), 2);
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
