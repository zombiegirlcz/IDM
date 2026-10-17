package y6g;

import cli.y;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsSearchFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelFlightsSearchFiltersScreen travelFlightsSearchFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsSearchFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a) mVarE3;
        y yVar = aVar2.f93403p;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "travel_flights_search_filters_airlines_show_all")) {
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.o;
            ArrayList arrayList = ((k) ((j2) yVar.f22677a).getValue()).f311273a.d;
            Iterable iterable = ((k) ((j2) yVar.f22677a).getValue()).e;
            if (iterable == null) {
                iterable = f0.f322471a;
            }
            oki.h.v2(aVar3, new TravelFlightsSearchFiltersScreenContract$ModalStep.Airlines(d0.i1(iterable), arrayList), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
