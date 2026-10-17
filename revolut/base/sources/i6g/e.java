package i6g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TravelFlightsLocationPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelFlightsLocationPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((m) this.u.R2()).f159005q.a();
        return Unit.f186387a;
    }
}
