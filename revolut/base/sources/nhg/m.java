package nhg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.TravelMilesFlightSearchResultsScreenContract$ModalStep;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.a;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;
import vhg.c;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesFlightSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TravelMilesFlightSearchResultsScreen travelMilesFlightSearchResultsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesFlightSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.h3();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f fVar = (com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.f) vVarE3;
        cli.y yVar = fVar.u;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof c.b) {
            fVar.H2(yVar, new nd8.i(27));
            fVar.M2(a.b.f94319a);
        } else if (obj3 instanceof c.a) {
            oki.h.v2(fVar.v, TravelMilesFlightSearchResultsScreenContract$ModalStep.DatePicker.f94311a, ModalDestination.Style.POPUP.f98311a);
        } else if (obj3 instanceof c.C1599c) {
            fVar.H2(yVar, new nd8.i(23));
            lk0.g gVar = ((com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.b) ((j2) yVar.f22677a).getValue()).d;
            if (gVar != null) {
                if (gVar.f196174a.size() <= 1) {
                    fVar.I2();
                } else {
                    fVar.f94330p.f288630b.onNext(h.b.f196176a);
                }
            }
        }
        return Unit.f186387a;
    }
}
