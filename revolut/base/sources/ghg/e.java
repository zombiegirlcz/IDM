package ghg;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TravelMilesFlightFinderScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelMilesFlightFinderScreen travelMilesFlightFinderScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelMilesFlightFinderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c cVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.c) this.u.R2();
        cVar.I2();
        cVar.J2(true);
        return Unit.f186387a;
    }
}
