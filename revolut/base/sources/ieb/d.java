package ieb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ ReservationCreationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReservationCreationScreen reservationCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = reservationCreationScreen;
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
        yhm.o.b(obj2);
        com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.u.d();
        g gVar = (g) ((j2) aVar2.v.f22677a).getValue();
        if (gVar.f160684a.getContent() == null || gVar.f160684a.getError() != null || gVar.f160687g == null) {
            aVar2.K2();
        } else {
            aVar2.J2();
        }
        return Unit.f186387a;
    }
}
