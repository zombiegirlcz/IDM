package m6g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsPassengersDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsPassengersDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "USER_ERROR_ID")) {
            aVar2.f93372y.a();
        } else if (Intrinsics.f(str, "OFFER_DETAILS_ERROR_ID")) {
            aVar2.f93371x.a();
        }
        return Unit.f186387a;
    }
}
