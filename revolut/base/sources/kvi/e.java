package kvi;

import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressEmptyWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPass;
import com.revolut.retail.feature.airport.security_fast_track.api.navigation.AsftFeatureConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.widgets.AsftWidgetContext;
import csh.f;
import ish.a0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f190134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.d f190135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jvi.c f190136c;

    public e(a0 widgetsUiInteractor, ash.d widgetsCommonEventDispatcher, jvi.c asftPassAvailabilityMapper) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        Intrinsics.checkNotNullParameter(asftPassAvailabilityMapper, "asftPassAvailabilityMapper");
        this.f190134a = widgetsUiInteractor;
        this.f190135b = widgetsCommonEventDispatcher;
        this.f190136c = asftPassAvailabilityMapper;
    }

    @Override // csh.f
    public final Class j() {
        return AsftWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        Object objB;
        AsftWidgetContext widgetContext2 = (AsftWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (!z) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            h hVar = new h(new a09.a0(this, 27, (q0) event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        BaseDraggableWidgetDelegate.Model model = ((i) event).f55375c;
        if (!(model instanceof AccessPassWidgetDelegate.Model)) {
            if (!(model instanceof GoalProgressEmptyWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            h hVar2 = new h(new hc7.a(this, AsftFeatureConfig.PassBookingDestination.f98753a, 22), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        zn.d dVar = ((AccessPassWidgetDelegate.Model) model).f54943j;
        Intrinsics.i(dVar, "null cannot be cast to non-null type com.revolut.retail.feature.airport.security_fast_track.impl.widgets.model.AsftWidgetPassWithTermsUrl");
        nvi.a aVar = (nvi.a) dVar;
        AsftPass asftPass = aVar.f219699a;
        int i = d.f190133a[this.f190136c.a(asftPass).ordinal()];
        if (i == 1) {
            objB = u0.b(vhi.c.c(new AsftFeatureConfig.WidgetDestination.PassAvailableSoon(asftPass.f98723q, aVar.f219700b, asftPass.f98713a, asftPass.i, asftPass.o, asftPass.u), yhi.b.BOTTOM_DIALOG, null, false, 12));
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objB = new AsftFeatureConfig.PassDetailsDestination(asftPass.f98713a, false);
        }
        h hVar3 = new h(new hc7.a(this, objB, 22), 2);
        Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
        return hVar3;
    }
}
