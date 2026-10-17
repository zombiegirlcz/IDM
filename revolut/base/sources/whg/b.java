package whg;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.sort_by.TravelMilesFlightSearchResultsSortByScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsSortByScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelMilesFlightSearchResultsSortByScreen travelMilesFlightSearchResultsSortByScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsSortByScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.U.getValue();
        Intrinsics.h(model);
        e eVar = (e) dVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        if (obj3 instanceof f) {
            eVar.C2(new c(((f) obj3).f297652a));
        }
        return Unit.f186387a;
    }
}
