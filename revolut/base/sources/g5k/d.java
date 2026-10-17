package g5k;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.payments.bank_transfer.api.widgets.p2p_international.P2PInternationalWidgetContext;
import f0d.m;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ash.d f140804a;

    public d(ash.d widgetsCommonEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f140804a = widgetsCommonEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return P2PInternationalWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        P2PInternationalWidgetContext widgetContext2 = (P2PInternationalWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = new h(new m(event, this, 21), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
