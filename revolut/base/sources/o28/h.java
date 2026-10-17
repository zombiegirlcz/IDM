package o28;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.h3;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.o;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import efm.r;
import ip0.r40;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import nsh.p;
import nya.b0;
import nyb.h0;
import nzj.n;
import o17.x;
import pfm.m;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h8b.g f221546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h8b.c f221547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f221548c;
    public final p d;
    public final h8b.a e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f221549g;

    public h(h8b.g router, h8b.c eventInfoMapperWrapper, p expandableDialogActionDispatcher, p expandableDialogEventProvider, h8b.a corporateEventDetailsNavigator, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(eventInfoMapperWrapper, "eventInfoMapperWrapper");
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(expandableDialogEventProvider, "expandableDialogEventProvider");
        Intrinsics.checkNotNullParameter(corporateEventDetailsNavigator, "corporateEventDetailsNavigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f221546a = router;
        this.f221547b = eventInfoMapperWrapper;
        this.f221548c = expandableDialogActionDispatcher;
        this.d = expandableDialogEventProvider;
        this.e = corporateEventDetailsNavigator;
        this.f = widgetsUiInteractor;
    }

    @Override // csh.f
    public final void i() {
        p pVar = this.d;
        CellDetailsDelegate cellDetailsDelegate = pVar.f218901p;
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = pVar.f218902q;
        LargeActionButtonDelegate largeActionButtonDelegate = pVar.f218900n;
        ifm.c cVar = this.f221549g;
        if (cVar != null) {
            cVar.dispose();
        }
        r rVarFilter = largeActionButtonDelegate.d.f121375b.filter(new g(new x(18), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        h8b.g gVar = this.f221546a;
        r rVarC = w.a0(rVarFilter, new x(19)).switchMapCompletable(new g(new n(1, gVar, h8b.f.class, "openAssetDetails", "openAssetDetails(Ljava/lang/String;)Lio/reactivex/Completable;", 0, 1), 2)).C();
        Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
        r rVarFilter2 = largeActionButtonDelegate.d.f121375b.filter(new h0(23, new x(11)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        int i = 0;
        int i2 = 1;
        r rVarC2 = w.a0(rVarFilter2, new x(12)).switchMapCompletable(new h0(24, new n(i2, gVar, h8b.f.class, "openBrowser", "openBrowser(Ljava/lang/String;)Lio/reactivex/Completable;", i, 3))).C();
        Intrinsics.checkNotNullExpressionValue(rVarC2, "toObservable(...)");
        r rVarFilter3 = twinHorizontalButtonDelegate.f53572c.f121375b.filter(new h0(26, new x(9)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        r rVarC3 = w.a0(rVarFilter3, new x(17)).switchMapCompletable(new g(new n(i2, gVar, h8b.f.class, "openAssetDetails", "openAssetDetails(Ljava/lang/String;)Lio/reactivex/Completable;", i, 2), 0)).C();
        Intrinsics.checkNotNullExpressionValue(rVarC3, "toObservable(...)");
        r rVarFilter4 = twinHorizontalButtonDelegate.d.f121375b.filter(new h0(28, new x(15)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        int i3 = 29;
        r rVarC4 = w.a0(rVarFilter4, new x(16)).switchMapCompletable(new h0(i3, new n(i2, gVar, h8b.f.class, "openBrowser", "openBrowser(Ljava/lang/String;)Lio/reactivex/Completable;", i, 4))).C();
        Intrinsics.checkNotNullExpressionValue(rVarC4, "toObservable(...)");
        r rVarFilter5 = cellDetailsDelegate.e.filter(new g(new x(20), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter5, "filter(...)");
        r rVarC5 = w.a0(rVarFilter5, new x(10)).switchMapCompletable(new h0(22, new b0(this, 23))).C();
        Intrinsics.checkNotNullExpressionValue(rVarC5, "toObservable(...)");
        r rVarFilter6 = cellDetailsDelegate.e.filter(new h0(25, new x(13)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter6, "filter(...)");
        int i5 = 27;
        r rVarC6 = w.a0(rVarFilter6, new x(14)).switchMapCompletable(new h0(i5, new n(i2, gVar, h8b.f.class, "openBrowser", "openBrowser(Ljava/lang/String;)Lio/reactivex/Completable;", i, 5))).C();
        Intrinsics.checkNotNullExpressionValue(rVarC6, "toObservable(...)");
        this.f221549g = r.merge(v.k(rVarC, rVarC2, rVarC3, rVarC4, rVarC5, rVarC6)).subscribe();
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final void r() {
        ifm.c cVar = this.f221549g;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        Object obj2;
        r40 r40Var;
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        efm.b bVarY = null;
        if (event instanceof i3) {
            ((i3) event).f55382c.getClass();
        } else if (event instanceof q0) {
            bVarY = new pfm.h(new ly2.d(this, 15, event, widgetContext2), 2);
        } else {
            boolean z = event instanceof g3;
            h8b.g gVar = this.f221546a;
            if (z || (event instanceof com.revolut.core.ui_kit.delegates.widgets.n)) {
                bVarY = gVar.Y(null);
            } else if (event instanceof i) {
                BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
                if ((model instanceof RowsWidgetDelegate.Model) || (model instanceof CalendarListWidgetDelegate.Model)) {
                    bVarY = gVar.Y(null);
                }
            } else if ((event instanceof o) || (event instanceof h3)) {
                h3 h3Var = event instanceof h3 ? (h3) event : null;
                if (h3Var == null || (r40Var = h3Var.f55371c) == null || (obj2 = r40Var.f166116s) == null) {
                    obj2 = ((o) event).f55444c.u;
                }
                kp3.b bVar = obj2 instanceof kp3.b ? (kp3.b) obj2 : null;
                if (bVar != null) {
                    bVarY = gVar.a(h8b.a.a(this.e, bVar, false));
                }
            }
        }
        if (bVarY != null) {
            return bVarY;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
