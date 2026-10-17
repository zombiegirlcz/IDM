package xti;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.airport_search.AsftAirportSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftAirportSearchScreen f308823w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AsftAirportSearchScreen asftAirportSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f308823w = asftAirportSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f308823w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f308823w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftAirportSearchScreen asftAirportSearchScreen = this.f308823w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = asftAirportSearchScreen.e3();
                Intrinsics.h(query);
                jVarE3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                jVarE3.H2(jVarE3.f308833r, new xf0.h(query, 13));
                break;
            default:
                String airportIataCode = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = asftAirportSearchScreen.e3();
                jVarE32.getClass();
                Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
                jVarE32.C2(new f(airportIataCode));
                break;
        }
        return Unit.f186387a;
    }
}
