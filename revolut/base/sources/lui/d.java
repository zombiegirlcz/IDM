package lui;

import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$InputData;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AsftCancelBookingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AsftCancelBookingScreen asftCancelBookingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = asftCancelBookingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftCancelBookingScreen asftCancelBookingScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a) ((h) asftCancelBookingScreen.Q.getValue())).C2(f.f200246a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a aVar3 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a) ((h) asftCancelBookingScreen.Q.getValue());
                AsftCancelBookingScreenContract$InputData asftCancelBookingScreenContract$InputData = aVar3.o;
                aVar3.C2(new e(asftCancelBookingScreenContract$InputData.f98849a, asftCancelBookingScreenContract$InputData.f98850b, asftCancelBookingScreenContract$InputData.d));
                break;
        }
        return Unit.f186387a;
    }
}
