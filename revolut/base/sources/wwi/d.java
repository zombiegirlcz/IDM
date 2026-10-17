package wwi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportSearchScreen f300673w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AirportSearchScreen airportSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300673w = airportSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f300673w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f300673w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportSearchScreen airportSearchScreen = this.f300673w;
        switch (i) {
            case 0:
                String query = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) airportSearchScreen.Z.getValue();
                Intrinsics.h(query);
                q qVar = (q) kVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                qVar.x2(new wsg.j(query, 4));
                break;
            default:
                String airportId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar2 = (q) ((k) airportSearchScreen.Z.getValue());
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(airportId, "airportId");
                qVar2.v2(new i(airportId));
                break;
        }
        return Unit.f186387a;
    }
}
