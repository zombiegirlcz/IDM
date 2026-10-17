package cui;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AsftCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AsftCheckoutScreen asftCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = asftCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftCheckoutScreen asftCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) asftCheckoutScreen.e3()).I2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) asftCheckoutScreen.e3()).B2();
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) asftCheckoutScreen.e3()).A, AsftCheckoutScreenContract$ModalStep.RevPointsInfo.f98809a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
