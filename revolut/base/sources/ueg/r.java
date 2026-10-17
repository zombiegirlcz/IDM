package ueg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mx0.q9;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsSearchResultsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            case 1:
                return new r(this.v, continuation, 1);
            case 2:
                return new r(this.v, continuation, 2);
            case 3:
                return new r(this.v, continuation, 3);
            case 4:
                return new r(this.v, continuation, 4);
            default:
                return new r(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2();
                cli.y yVar = bVar.W;
                if (((v) ((j2) yVar.f22677a).getValue()).f279429m == i0.DATES_GUESTS_EXPANDED) {
                    bVar.C2(a.b.f94059a);
                } else {
                    bVar.H2(yVar, new p0(0));
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2();
                bVar2.getClass();
                bVar2.n2(new t0(3, bVar2, continuation), new whi.b(6));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2()).C2(a.C0573a.f94058a);
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2()).B2();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2();
                q9 q9Var = bVar3.K;
                if (q9Var != null) {
                    bVar3.n2(new u2i.g(bVar3, q9Var.f209962a, continuation, 14), new whi.b(6));
                }
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) travelHotelsSearchResultsMapScreen.R2();
                bVar4.H2(bVar4.W, new p0(2));
                break;
        }
        return Unit.f186387a;
    }
}
