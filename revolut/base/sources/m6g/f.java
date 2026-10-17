package m6g;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsPassengersDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsPassengersDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(textData);
        com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        p6g.w wVarJ2 = aVar2.J2(textData.f52597a);
        if (wVarJ2 instanceof p6g.v) {
            aVar2.H2(aVar2.D, new a9j.n(((p6g.v) wVarJ2).f233304a, 9, textData.f52598b.toString(), aVar2));
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
