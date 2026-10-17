package d8b;

import a08.l;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.retail.cobranded_cards.api.widgets.CobrandsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f112196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ash.d f112197b;

    public g(ash.d widgetsCommonEventDispatcher, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f112196a = widgetsUiInteractor;
        this.f112197b = widgetsCommonEventDispatcher;
    }

    @Override // csh.f
    public final Class j() {
        return CobrandsWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        CobrandsWidgetContext widgetContext2 = (CobrandsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            pfm.h hVar = new pfm.h(new l(this, new CobrandedCardsFeatureConfig.PlanHubDestination(null), 18), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (event instanceof q0) {
            pfm.h hVar2 = new pfm.h(new a09.a0(this, 5, (q0) event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
