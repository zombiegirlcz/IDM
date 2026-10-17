package d6g;

import aw0.n6;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary.TravelFlightsItineraryScreen;
import d27.d0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsItineraryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelFlightsItineraryScreen travelFlightsItineraryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsItineraryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsItineraryScreen travelFlightsItineraryScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                travelFlightsItineraryScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a aVar3 = (com.revolut.feature.travel.flights.impl.ui.screen.itinerary.a) ((j) travelFlightsItineraryScreen.S.getValue());
                y yVar = aVar3.f93348r;
                Data data = ((f) ((j2) yVar.f22677a).getValue()).f111539c;
                if (zi0.c.E(data) && data.getContent() != null) {
                    List list = (List) zi0.c.I(data);
                    if (list.isEmpty()) {
                        list = null;
                    }
                    List list2 = list;
                    if (list2 != null) {
                        aVar3.C2(new i(list2));
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected empty fares list");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TravelFlightsItineraryScreenModel", null, illegalArgumentException, h0Var);
                    }
                } else if (data.getLoading()) {
                    aVar3.l2(new cq6.k(aVar3, null, 10), new yi5.b(26));
                } else {
                    aVar3.H2(yVar, new d0(27));
                    aVar3.f93347q.a();
                    aVar3.l2(new cq6.k(aVar3, null, 10), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
