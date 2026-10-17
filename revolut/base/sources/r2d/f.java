package r2d;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.separate_favourites.api.widget.FavouritesWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f251103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f251104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1d.a f251105c;

    public f(r presenterDelegate, a0 widgetsUiInteractor, o1d.a configProvider) {
        Intrinsics.checkNotNullParameter(presenterDelegate, "presenterDelegate");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        this.f251103a = presenterDelegate;
        this.f251104b = widgetsUiInteractor;
        this.f251105c = configProvider;
    }

    @Override // csh.f
    public final Class j() {
        return FavouritesWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        FavouritesWidgetContext widgetContext2 = (FavouritesWidgetContext) widgetContext;
        r rVar = this.f251103a;
        xoj.a aVar = rVar.i;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i3;
        efm.b bVarN = null;
        o1d.a aVar2 = this.f251105c;
        if (z) {
            RowDelegate.Model model = ((i3) event).f55382c;
            if (Intrinsics.f(model.f53228a, "ALERTS_WIDGET_EMPTY_STATE")) {
                AlertsWidgetContext widgetContext3 = aVar2.b();
                Intrinsics.checkNotNullParameter(widgetContext3, "widgetContext");
                bVarN = new pfm.a(((cpj.b) aVar).f(yoj.c.FAVOURITES, yoj.d.DISABLED), new r25.c(9, new q(rVar, widgetContext3, 1)), 4);
                Intrinsics.checkNotNullExpressionValue(bVarN, "flatMapCompletable(...)");
            } else {
                Object obj2 = model.u;
                if (obj2 instanceof AlertItem) {
                    AlertItem item = (AlertItem) obj2;
                    Intrinsics.checkNotNullParameter(item, "item");
                    bVarN = new pfm.a(((cpj.b) aVar).f(yoj.c.FAVOURITES, yoj.d.DISABLED), new r25.c(10, new r10.b(rVar, item, 23)), 4);
                    Intrinsics.checkNotNullExpressionValue(bVarN, "flatMapCompletable(...)");
                }
            }
        } else if (event instanceof q0) {
            bVarN = new pfm.h(new e(this, 0, event, widgetContext2), 2);
        } else if (event instanceof g3) {
            bVarN = rVar.N(aVar2.b());
        } else if ((event instanceof com.revolut.core.ui_kit.delegates.widgets.i) && !(((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c instanceof ErrorWidgetDelegate.Model)) {
            bVarN = rVar.N(aVar2.b());
        }
        if (bVarN != null) {
            return bVarN;
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
