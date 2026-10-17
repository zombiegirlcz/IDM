package dyg;

import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WidgetisedAnalyticsAllocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = widgetisedAnalyticsAllocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) widgetisedAnalyticsAllocationScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) widgetisedAnalyticsAllocationScreen.e3()).f95053w, WidgetisedAnalyticsAllocationScreenContract$ModalStep.CfdAllocationBreakdown.f95047a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
