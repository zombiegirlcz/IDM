package phg;

import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ocb.u;
import om4.t3;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesFlightSearchFilterOptionScreen f236301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236301w = travelMilesFlightSearchFilterOptionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f236301w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f236301w, continuation, 1);
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
        TravelMilesFlightSearchFilterOptionScreen travelMilesFlightSearchFilterOptionScreen = this.f236301w;
        switch (i) {
            case 0:
                String newQuery = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = travelMilesFlightSearchFilterOptionScreen.e3();
                Intrinsics.h(newQuery);
                l lVar = (l) jVarE3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                lVar.H2(lVar.f236309p, new t3(newQuery, 27));
                break;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = travelMilesFlightSearchFilterOptionScreen.e3();
                Intrinsics.h(bool);
                l lVar2 = (l) jVarE32;
                lVar2.H2(lVar2.f236309p, new u(bool.booleanValue(), 10));
                break;
        }
        return Unit.f186387a;
    }
}
