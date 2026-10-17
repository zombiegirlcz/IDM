package v5g;

import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$ModalStep;
import com.revolut.feature.travel.flights.impl.ui.screen.discover.TravelFlightsDiscoverScreenContract$SearchParameters;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import com.revolut.kompot.common.ModalDestination;
import ip0.vr;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsDiscoverScreen f286217w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TravelFlightsDiscoverScreen travelFlightsDiscoverScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f286217w = travelFlightsDiscoverScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f286217w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f286217w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f286217w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                b bVar4 = new b(this.f286217w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
            default:
                b bVar5 = new b(this.f286217w, continuation, 4);
                bVar5.v = obj2;
                return bVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        vr vrVar = (vr) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(vrVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
        TravelFlightsDiscoverScreen travelFlightsDiscoverScreen = this.f286217w;
        switch (i) {
            case 0:
                vr model = (vr) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD3 = travelFlightsDiscoverScreen.d3();
                Intrinsics.h(model);
                com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) gVarD3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                oki.h.v2(aVar2.f93337r, TravelFlightsDiscoverScreenContract$ModalStep.OriginSelection.f93329a, fullscreen_slide_from_bottom);
                break;
            case 1:
                vr model2 = (vr) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD32 = travelFlightsDiscoverScreen.d3();
                Intrinsics.h(model2);
                com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar4 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) gVarD32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                oki.h.v2(aVar4.f93337r, TravelFlightsDiscoverScreenContract$ModalStep.DestinationSelection.f93328a, fullscreen_slide_from_bottom);
                break;
            case 2:
                vr model3 = (vr) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD33 = travelFlightsDiscoverScreen.d3();
                Intrinsics.h(model3);
                com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar6 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) gVarD33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                y yVar = aVar6.f93336q;
                TravelFlightsDiscoverScreenContract$SearchParameters updateSearchParameters = ((d) ((j2) yVar.f22677a).getValue()).f286218a;
                Intrinsics.checkNotNullParameter(updateSearchParameters, "$this$updateSearchParameters");
                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParametersA = TravelFlightsDiscoverScreenContract$SearchParameters.a(updateSearchParameters, updateSearchParameters.f93333b, updateSearchParameters.f93332a, null, null, null, null, 60);
                aVar6.H2(yVar, new i(travelFlightsDiscoverScreenContract$SearchParametersA, 0));
                FlightSearchQuery flightSearchQueryE = ifk.b.E(travelFlightsDiscoverScreenContract$SearchParametersA);
                if (flightSearchQueryE != null) {
                    aVar6.f93335p.a(flightSearchQueryE);
                }
                break;
            case 3:
                vr model4 = (vr) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD34 = travelFlightsDiscoverScreen.d3();
                Intrinsics.h(model4);
                com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar8 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) gVarD34;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(model4, "model");
                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters = ((d) ((j2) aVar8.f93336q.f22677a).getValue()).f286218a;
                oki.h.v2(aVar8.f93337r, new TravelFlightsDiscoverScreenContract$ModalStep.DatesSelection(travelFlightsDiscoverScreenContract$SearchParameters.f93334c, travelFlightsDiscoverScreenContract$SearchParameters.d), fullscreen_slide_from_bottom);
                break;
            default:
                vr model5 = (vr) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarD35 = travelFlightsDiscoverScreen.d3();
                Intrinsics.h(model5);
                com.revolut.feature.travel.flights.impl.ui.screen.discover.a aVar10 = (com.revolut.feature.travel.flights.impl.ui.screen.discover.a) gVarD35;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(model5, "model");
                TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters2 = ((d) ((j2) aVar10.f93336q.f22677a).getValue()).f286218a;
                oki.h.v2(aVar10.f93337r, new TravelFlightsDiscoverScreenContract$ModalStep.PassengersSelection(travelFlightsDiscoverScreenContract$SearchParameters2.e, travelFlightsDiscoverScreenContract$SearchParameters2.f), fullscreen_slide_from_bottom);
                break;
        }
        return Unit.f186387a;
    }
}
