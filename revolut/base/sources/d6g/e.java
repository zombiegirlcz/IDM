package d6g;

import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import com.revolut.kompot.common.ModalDestination;
import ip0.e8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsItineraryScreen f111536w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelFlightsItineraryScreen travelFlightsItineraryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111536w = travelFlightsItineraryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f111536w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f111536w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsItineraryScreen travelFlightsItineraryScreen = this.f111536w;
        switch (i) {
            case 0:
                e8 e8Var = (e8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object obj3 = e8Var.e;
                Payment payment = obj3 instanceof Payment ? (Payment) obj3 : null;
                if (payment != null) {
                    com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) ((j) travelFlightsItineraryScreen.S.getValue());
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(payment, "payment");
                    oki.h.v2(aVar2.f93349s, new TravelFlightsItineraryScreenContract$ModalStep.PriceBreakdown(payment), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) travelFlightsItineraryScreen.S.getValue();
                Intrinsics.h(clickData);
                ((com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) jVar).getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Intrinsics.f(clickData.f275445a, "SEPARATE_TICKETS_INFO_CLICK");
                break;
        }
        return Unit.f186387a;
    }
}
