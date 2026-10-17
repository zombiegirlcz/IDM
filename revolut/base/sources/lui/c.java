package lui;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ AsftCancelBookingScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AsftCancelBookingScreen asftCancelBookingScreen, Continuation continuation) {
        super(2, continuation);
        this.u = asftCancelBookingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        oki.h.v2(((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.a) ((h) this.u.Q.getValue())).f98854q, AsftCancelBookingScreenContract$ModalStep.RevPointsInfo.f98852a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
