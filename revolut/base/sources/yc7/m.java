package yc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.a3;
import com.revolut.core.ui_kit.delegates.widgets.c3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import efm.d0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pig.y;
import q56.o;
import q75.n;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f312561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u68.i f312562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f312563c;
    public final uc7.a d;
    public final q78.e e;

    public m(k39.b navigationCommandsDispatcher, u68.i juniorWidgetNavigationScreensProvider, a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(juniorWidgetNavigationScreensProvider, "juniorWidgetNavigationScreensProvider");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f312561a = navigationCommandsDispatcher;
        this.f312562b = juniorWidgetNavigationScreensProvider;
        this.f312563c = widgetsUiInteractor;
        this.d = homeFeedWidgetsEventDispatcher;
        this.e = juniorAccountDestinationResolver;
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
        if (event instanceof a3) {
            Object obj2 = ((a3) event).f55292c.f55221j;
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.junior_dashboard.api.JuniorAccountInfo");
            return pd.b.n(p0.f264003c, new l(this, (sf8.m) obj2, null));
        }
        if (!(event instanceof c3)) {
            if (event instanceof q0) {
                pfm.h hVar = new pfm.h(new k(this, 0, event, widgetContext2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            }
            boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
            pfm.m mVar = pfm.m.f235744a;
            if (!z) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (!(model instanceof QuickActionWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj3 = ((QuickActionWidgetDelegate.Model) model).f55221j;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.junior_dashboard.api.JuniorAccountInfo");
            return pd.b.n(p0.f264003c, new l(this, (sf8.m) obj3, null));
        }
        Object obj4 = ((c3) event).f55316c.f55221j;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.junior_dashboard.api.JuniorAccountInfo");
        sf8.m mVar2 = (sf8.m) obj4;
        String juniorId = mVar2.f262361b;
        String walletId = mVar2.f262360a;
        q78.g gVar = (q78.g) this.f312562b;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        d0 d0VarFirstOrError = m70.a.g(gVar.f242779a.a0(juniorId, false), null, new q34.a(19), 1).firstOrError();
        q3d.c cVar = new q3d.c(17, new n(5));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(new ufm.i(iVar, new q3d.c(15, new o(gVar, 10)), 0), new q3d.c(16, new y(walletId, 22)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        pfm.a aVar = new pfm.a(iVar2, new ya6.f(new y8a.h(this, 22), 10), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
