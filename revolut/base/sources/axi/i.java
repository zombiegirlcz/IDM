package axi;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ AirportLoungePassCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = airportLoungePassCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) this.u.d()).C.a();
        return Unit.f186387a;
    }
}
