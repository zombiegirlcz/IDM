package jc7;

import ash.i;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.m3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.w2;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import imk.p0;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import q06.l;
import qf1.n;
import qf1.o;
import qf1.p;
import qf1.q;
import tf1.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f172745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k39.b f172746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f172747c;
    public final a0 d;
    public final uc7.a e;
    public final l f;

    public e(d0 addNewProductWidgetNaviCommandProvider, k39.b navigationCommandsDispatcher, i widgetsInteractor, a0 widgetsUiInteractor, uc7.a homeFeedWidgetsEventDispatcher, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(addNewProductWidgetNaviCommandProvider, "addNewProductWidgetNaviCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.f172745a = addNewProductWidgetNaviCommandProvider;
        this.f172746b = navigationCommandsDispatcher;
        this.f172747c = widgetsInteractor;
        this.d = widgetsUiInteractor;
        this.e = homeFeedWidgetsEventDispatcher;
        this.f = deeplinkRouter;
    }

    public static Object c(Object obj2) {
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        p pVar = qVar != null ? qVar.f245228a : null;
        if (pVar instanceof n) {
            return ((n) pVar).f245226a;
        }
        if (Intrinsics.f(pVar, o.f245227a)) {
            return lf1.b.f194626a;
        }
        if (pVar == null) {
            return obj2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final efm.b b(Object obj2) {
        Object objC = c(obj2);
        if (objC instanceof qf1.l) {
            return pd.b.n(g.f186406a, new iz1.p(this, (qf1.l) objC, null, 24));
        }
        pfm.n nVarN = efm.b.n(new RuntimeException(a0.d.m(obj2, "Wrong parcel type for ")));
        Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
        return nVarN;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Personal.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        efm.b bVarN;
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        Continuation continuation = null;
        if (event instanceof q0) {
            Object objC = c(((q0) event).f55477c.f55103h);
            lf1.d dVar = objC instanceof lf1.d ? (lf1.d) objC : null;
            if (dVar == null) {
                pfm.n nVarN = efm.b.n(new IllegalStateException("Wrong parcel " + dVar));
                Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
                return nVarN;
            }
            if (dVar.equals(lf1.b.f194626a)) {
                bVarN = new h(new a09.a0(this, 20, event, widgetContext2), 2);
            } else {
                if (!dVar.equals(lf1.c.f194627a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarN = pd.b.n(g.f186406a, new d(this, widgetContext2, event, null));
            }
        } else if (event instanceof i3) {
            bVarN = b(((i3) event).f55382c.u);
        } else if (event instanceof m3) {
            bVarN = b(((m3) event).f55431c.u);
        } else if (event instanceof w2) {
            bVarN = b(((w2) event).d);
        } else if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            bVarN = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof RowsWidgetDelegate.Model ? pd.b.n(g.f186406a, new p0(this, continuation, 23)) : m.f235744a;
        } else if (event instanceof g3) {
            bVarN = pd.b.n(g.f186406a, new p0(this, continuation, 23));
        } else {
            bVarN = efm.b.n(new RuntimeException("Cannot handle unknown event: " + event));
        }
        return ue0.e.v(bVarN);
    }
}
