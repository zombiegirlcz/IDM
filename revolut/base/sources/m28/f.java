package m28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import ish.a0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m1i.j0;
import ofm.q;
import pfm.m;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f201728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k39.b f201729b;

    public f(a0 widgetsUiInteractor, k39.b navigationCommandsDispatcher, nlh.b wealthTradeCommandProvider) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        this.f201728a = widgetsUiInteractor;
        this.f201729b = navigationCommandsDispatcher;
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
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (z) {
            if (!(((i) event).f55375c instanceof HorizontalScrollerWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            pfm.a aVar = new pfm.a(q.L(p0.f264003c, new lo.c(this, (Continuation) null, 17)), new j0(new m11.h(this, 4), 8), 3);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            return ue0.e.v(aVar);
        }
        if (event instanceof n0) {
            Object obj2 = ((n0) event).f55437c.f53167l;
            jih.a aVar2 = obj2 instanceof jih.a ? (jih.a) obj2 : null;
            if (aVar2 != null) {
                return this.f201729b.a(gc0.c.f(new CryptoCommodityDetailsFeatureConfig(aVar2.f174489a, null, null, null, 62)));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (!(event instanceof q0)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        pfm.h hVar = new pfm.h(new ly2.d(this, 1, (q0) event, widgetContext2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
