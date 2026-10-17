package axi;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungePassCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungePassCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.money.Money");
        dj0.d originalPrice = (dj0.d) obj3;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) this.v.d();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        oki.h.v2(cVar.E, new AirportLoungePassCheckoutScreenContract$ModalStep.RevPayPocketSelection(originalPrice), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
