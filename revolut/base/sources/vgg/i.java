package vgg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ TravelMilesAirlineDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelMilesAirlineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) this.u.d();
        bVar.C2(new p(bVar.o.f94265a));
        return Unit.f186387a;
    }
}
