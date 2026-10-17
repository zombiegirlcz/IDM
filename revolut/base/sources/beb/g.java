package beb;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConfirmReservationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ConfirmReservationScreen confirmReservationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = confirmReservationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52519a, "CONFIRM_RESERVATION_CANCELLATION_CONSENT")) {
            aVar2.H2(aVar2.f82839s, new n(model, 0));
        }
        return Unit.f186387a;
    }
}
