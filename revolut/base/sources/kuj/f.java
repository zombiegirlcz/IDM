package kuj;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.i4;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.rewards_hub.widget.RewardsHubWidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f189839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.d f189840b;

    public f(ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f189839a = widgetsUiInteractor;
        this.f189840b = widgetsCommonEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return RewardsHubWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        RewardsHubWidgetContext widgetContext2 = (RewardsHubWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i4) {
            h hVar = new h(new hc7.a(event, this, 21), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (event instanceof i) {
            h hVar2 = new h(new i1i.a(this, 10), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (event instanceof q0) {
            h hVar3 = new h(new a09.a0(this, 26, event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
            return hVar3;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
