package cui;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AsftCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AsftCheckoutScreen asftCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = asftCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Object obj3 = model.f51674g;
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) oVarE3;
        if (obj3 instanceof bti.f) {
            bVar.H2(bVar.z, new av8.o(obj3, 4));
        } else {
            bVar.getClass();
            hx7.e.n(new IllegalStateException("Parcel must be AirportLoungePassesPointsOption"));
        }
        return Unit.f186387a;
    }
}
