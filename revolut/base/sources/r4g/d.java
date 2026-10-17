package r4g;

import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ocb.u;
import r40.n0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsAirlinesFilterScreen f251451w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251451w = travelFlightsAirlinesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f251451w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f251451w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen = this.f251451w;
        switch (i) {
            case 0:
                String newQuery = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = travelFlightsAirlinesFilterScreen.e3();
                Intrinsics.h(newQuery);
                k kVar = (k) iVarE3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                kVar.H2(kVar.f251459p, new n0(newQuery, 1));
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = travelFlightsAirlinesFilterScreen.e3();
                Intrinsics.h(bool);
                k kVar2 = (k) iVarE32;
                kVar2.H2(kVar2.f251459p, new u(bool.booleanValue(), 28));
                break;
        }
        return Unit.f186387a;
    }
}
