package bd7;

import bce.e;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import efm.d0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import nyb.o;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends pri.c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k39.b f14539h;
    public final com.revolut.feature.rev_points.api.navigation.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f14540j;
    public final Class k;

    public d(k39.b navigationCommandsDispatcher, com.revolut.feature.rev_points.api.navigation.a revPointsNavigationFactory, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(revPointsNavigationFactory, "revPointsNavigationFactory");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f14539h = navigationCommandsDispatcher;
        this.i = revPointsNavigationFactory;
        this.f14540j = widgetsUiInteractor;
        this.k = HomeFeedWidgetContext.Personal.class;
    }

    @Override // csh.f
    public final Class j() {
        return this.k;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            h hVar = new h(new a09.a0(this, 2, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (((i) event).f55375c instanceof ErrorWidgetDelegate.Model) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        qyb.a aVar = (qyb.a) this.i;
        aVar.getClass();
        RevPointsOptInNextDestination.Tab optInNextDestination = RevPointsOptInNextDestination.Tab.f83531a;
        Intrinsics.checkNotNullParameter(optInNextDestination, "optInNextDestination");
        RevPointsOptInSource.HomeWidget optInSource = RevPointsOptInSource.HomeWidget.f83992a;
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        d0 d0VarE = ((o) aVar.f250267a).e(false);
        qsa.a aVar2 = new qsa.a(19, new qpb.a(optInSource, optInNextDestination, 24));
        d0VarE.getClass();
        ufm.i iVar = new ufm.i(d0VarE, aVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        pfm.a aVar3 = new pfm.a(iVar, new e(new b9i.f(this, 10), 10), 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        return aVar3;
    }
}
