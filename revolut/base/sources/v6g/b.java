package v6g;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v25.k;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsPriceBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelFlightsPriceBreakdownScreen travelFlightsPriceBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsPriceBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.U.getValue();
        Intrinsics.h(model);
        f fVar = (f) eVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        if (!Intrinsics.f(str, "FLIGHT_ITEM_ID")) {
            if (Intrinsics.f(str, "EXTRAS_ITEM_ID")) {
                dVar = d.EXTRAS;
            }
            return Unit.f186387a;
        }
        dVar = d.FLIGHT;
        fVar.H2(fVar.o, new k(dVar, 13));
        return Unit.f186387a;
    }
}
