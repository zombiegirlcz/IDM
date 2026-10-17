package l5g;

import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsCheckInScreen f192257w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelFlightsCheckInScreen travelFlightsCheckInScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f192257w = travelFlightsCheckInScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f192257w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f192257w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsCheckInScreen travelFlightsCheckInScreen = this.f192257w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarD3 = travelFlightsCheckInScreen.d3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) fVarD3).I2(aVar);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVarD32 = travelFlightsCheckInScreen.d3();
                Intrinsics.h(aVar3);
                ((com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) fVarD32).I2(aVar3);
                break;
        }
        return Unit.f186387a;
    }
}
