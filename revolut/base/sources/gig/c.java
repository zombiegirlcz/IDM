package gig;

import aw0.n6;
import com.revolut.feature.travel.miles.impl.ui.screen.recommended_flight.TravelMilesRecommendedFlightsScreen;
import hfg.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelMilesRecommendedFlightsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelMilesRecommendedFlightsScreen travelMilesRecommendedFlightsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelMilesRecommendedFlightsScreen;
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
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesRecommendedFlightsScreen travelMilesRecommendedFlightsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelMilesRecommendedFlightsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) travelMilesRecommendedFlightsScreen.e3();
                y yVar = ((g) ((j2) sVar.f144211t.f22677a).getValue()).f144191c;
                String str = yVar != null ? yVar.f151902h : null;
                if (str != null) {
                    sVar.C2(new l(str));
                }
                break;
        }
        return Unit.f186387a;
    }
}
