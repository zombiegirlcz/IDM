package axi;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AirportLoungePassCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = airportLoungePassCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) airportLoungePassCheckoutScreen.e3()).J2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) airportLoungePassCheckoutScreen.e3()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) airportLoungePassCheckoutScreen.e3()).E, AirportLoungePassCheckoutScreenContract$ModalStep.RevPointsInfo.f99053a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
