package l5g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ TravelFlightsCheckInScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelFlightsCheckInScreen travelFlightsCheckInScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelFlightsCheckInScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((com.revolut.feature.travel.flights.impl.ui.screen.checkin.a) this.u.R2()).f93290p.a();
        return Unit.f186387a;
    }
}
