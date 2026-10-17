package a6g;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsFareSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelFlightsFareSelectionScreen travelFlightsFareSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsFareSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.o;
        Payment payment = obj3 instanceof Payment ? (Payment) obj3 : null;
        if (payment != null) {
            oki.h.v2(aVar2.f93342p, new TravelFlightsFareSelectionScreenContract$ModalStep.PriceBreakdown(payment), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
