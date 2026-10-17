package khg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.TravelMilesFlightSearchResultDetailsScreen;
import hfg.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelMilesFlightSearchResultDetailsScreen travelMilesFlightSearchResultDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_result_details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof iig.b) {
            String str = ((iig.b) obj3).f161613a;
            g0 g0Var = (g0) ((h) ((j2) aVar2.f94305t.f22677a).getValue()).f184122a.getContent();
            aVar2.I2(str, g0Var != null ? g0Var.f151839a.f151816b : null);
        }
        return Unit.f186387a;
    }
}
