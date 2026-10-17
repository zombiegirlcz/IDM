package s9h;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.wealth.api.ui.delegates.mosttraded.widget.MostTradedFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import q0h.j;
import q0h.k;
import skm.p0;
import xzg.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9h.g f261180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f261181b;

    public b(q9h.g router, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f261180a = router;
        this.f261181b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return MostTradedFeedWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        q0h.e eVar;
        MostTradedFeedWidgetContext widgetContext2 = (MostTradedFeedWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q0) {
            return new pfm.h(new r2d.e(this, 5, event, widgetContext2), 2);
        }
        boolean z = event instanceof i3;
        q9h.g gVar = this.f261180a;
        m mVar = m.f235744a;
        if (z) {
            Object obj2 = ((i3) event).f55382c.u;
            k kVar = obj2 instanceof k ? (k) obj2 : null;
            if (!(kVar instanceof j)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            v asset = ((j) kVar).f241278a;
            Intrinsics.checkNotNullParameter(asset, "asset");
            return pd.b.n(p0.f264003c, new q9h.f(gVar, asset, null));
        }
        if (!(event instanceof i)) {
            if (event instanceof g3) {
                Object obj3 = ((g3) event).f55360c;
                eVar = obj3 instanceof q0h.e ? (q0h.e) obj3 : null;
                if (eVar != null) {
                    return gVar.a(eVar);
                }
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            }
            return mVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        RowsWidgetDelegate.Model model2 = model instanceof RowsWidgetDelegate.Model ? (RowsWidgetDelegate.Model) model : null;
        Object obj4 = model2 != null ? model2.f55231n : null;
        eVar = obj4 instanceof q0h.e ? (q0h.e) obj4 : null;
        if (eVar != null) {
            return gVar.a(eVar);
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
