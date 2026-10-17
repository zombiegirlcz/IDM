package a38;

import a08.l;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.j3;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.f;
import efm.b;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d28.a f1077b;

    public a(Class widgetContextClass, d28.a swipeActionRowClickEventHandler) {
        Intrinsics.checkNotNullParameter(widgetContextClass, "widgetContextClass");
        Intrinsics.checkNotNullParameter(swipeActionRowClickEventHandler, "swipeActionRowClickEventHandler");
        this.f1076a = widgetContextClass;
        this.f1077b = swipeActionRowClickEventHandler;
    }

    @Override // csh.f
    public final Class j() {
        return this.f1076a;
    }

    @Override // csh.f
    public final b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        vh vhVar;
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        j3 j3Var = event instanceof j3 ? (j3) event : null;
        if (j3Var == null || (vhVar = j3Var.f55396c) == null) {
            m mVar = m.f235744a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        h hVar = new h(new l(this, vhVar, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
