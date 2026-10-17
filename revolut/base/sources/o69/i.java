package o69;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.nearby.rewards.api.widget.NearbyRewardsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f222537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.d f222538b;

    public i(ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f222537a = widgetsUiInteractor;
        this.f222538b = widgetsCommonEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return NearbyRewardsWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        NearbyRewardsWidgetContext widgetContext2 = (NearbyRewardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            return new pfm.h(new i1i.a(this, 24), 2);
        }
        if (event instanceof q0) {
            return new pfm.h(new ly2.d(this, 17, event, widgetContext2), 2);
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
