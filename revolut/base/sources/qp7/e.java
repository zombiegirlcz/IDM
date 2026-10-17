package qp7;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReservationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReservationScreen reservationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reservationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.T2().y2(model.f53304a);
        return Unit.f186387a;
    }
}
