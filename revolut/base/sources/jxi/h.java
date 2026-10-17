package jxi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AirportLoungesHomeScreen airportLoungesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Pair pair = (Pair) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
        com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) this.v.d();
        if (zBooleanValue) {
            cVar.H2(cVar.G, new jxb.g(18));
        } else {
            cVar.getClass();
        }
        return Unit.f186387a;
    }
}
