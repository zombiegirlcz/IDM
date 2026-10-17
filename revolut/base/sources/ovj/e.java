package ovj;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.api.travel_trips.widget.TripItineraryWidgetContext;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends csh.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f230238b;

    public e(a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f230238b = widgetsUiInteractor;
    }

    @Override // csh.f
    public final Class j() {
        return TripItineraryWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        TripItineraryWidgetContext widgetContext2 = (TripItineraryWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        h hVar = new h(new ly2.d(event, 20, this, widgetContext2), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
