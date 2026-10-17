package axi;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungePassCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungePassCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Object obj3 = model.f51674g;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) nVarE3;
        if (obj3 instanceof d0) {
            cVar.H2(cVar.D, new av8.o(obj3, 1));
        } else {
            cVar.getClass();
            hx7.e.n(new IllegalStateException("Parcel must be AirportLoungePassesPointsOption"));
        }
        return Unit.f186387a;
    }
}
