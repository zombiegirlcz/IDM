package r4g;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsAirlinesFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelFlightsAirlinesFilterScreen travelFlightsAirlinesFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsAirlinesFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        k kVar = (k) iVarE3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        kVar.H2(kVar.f251459p, new r10.b(model, kVar, 29));
        return Unit.f186387a;
    }
}
