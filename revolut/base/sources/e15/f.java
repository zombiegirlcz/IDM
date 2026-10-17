package e15;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.credit.health.api.navigation.CreditHealthNavigationDestination;
import com.revolut.feature.credit.health.api.widget.CreditHealthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.o;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f121884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f121885b;

    public f(m navigator, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f121884a = navigator;
        this.f121885b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return CreditHealthWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CreditHealthWidgetContext widgetContext2 = (CreditHealthWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            this.f121884a.c(u0.f(CreditHealthNavigationDestination.f69955b));
        } else if (event instanceof q0) {
            this.f121885b.a(new o(widgetContext2, ((q0) event).f55476b));
        }
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
