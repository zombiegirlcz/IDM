package q5g;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ TravelFlightsCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) this.u.R2();
        bVar.H2(bVar.B, new q3d.i(18));
        return Unit.f186387a;
    }
}
