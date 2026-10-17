package x28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d2;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.k3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import e8h.p;
import e8h.u;
import efm.d0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f302529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k39.b f302530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9h.f f302531c;

    public k(a0 widgetsUiInteractor, k39.b navigationCommandsDispatcher, v9h.a commandProvider, v9h.f presentationModel) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(commandProvider, "commandProvider");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f302529a = widgetsUiInteractor;
        this.f302530b = navigationCommandsDispatcher;
        this.f302531c = presentationModel;
    }

    public final efm.b b(Object obj2) {
        if (!(obj2 instanceof j1h.a)) {
            return m.f235744a;
        }
        vel.f performanceAsset = ((j1h.a) obj2).f170462a;
        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
        return this.f302530b.a(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(performanceAsset.a(), null, false, null, null, null, 62), false, (Integer) null, 0, 61)));
    }

    public final efm.b c(String str) {
        if (!Intrinsics.f(str, "POPULAR_FIRST_BUY_ETFS_WIDGET_TAB_ID") && !Intrinsics.f(str, "POPULAR_FIRST_BUY_WIDGET_STOCKS_TAB_ID")) {
            return m.f235744a;
        }
        pfm.h hVar = new pfm.h(new p((u) this.f302531c.f287072a.f262806b, Intrinsics.f(str, "POPULAR_FIRST_BUY_ETFS_WIDGET_TAB_ID"), 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }

    public final pfm.a d() {
        d0 d0VarFirstOrError = this.f302531c.b().firstOrError();
        x0i.i iVar = new x0i.i(new x0b.c(this, 12), 3);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, iVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // csh.f
    public final Class j() {
        return InvestWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        m mVar = m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if ((model instanceof GridWidgetDelegate.Model) || (model instanceof RowsWidgetDelegate.Model)) {
                return d();
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof g3) {
            return d();
        }
        if (event instanceof d2) {
            return c(((d2) event).f55327c);
        }
        if (event instanceof k3) {
            return c(((k3) event).f55406c.f54199a);
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.e) {
            return b(((com.revolut.core.ui_kit.delegates.widgets.e) event).f55333c.f53167l);
        }
        if (event instanceof i3) {
            return b(((i3) event).f55382c.u);
        }
        if (!(event instanceof q0)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        pfm.h hVar = new pfm.h(new r2d.e(this, 28, ((q0) event).f55476b, widgetContext2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
