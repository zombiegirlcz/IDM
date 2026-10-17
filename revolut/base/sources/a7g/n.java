package a7g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.search_results.TravelFlightsSearchScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk0.h;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TravelFlightsSearchScreen travelFlightsSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.search_results.b) vVarE3;
        cli.y yVar = bVar.f93427w;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        int iHashCode = str.hashCode();
        if (iHashCode != 1023571797) {
            lk0.g gVar = null;
            if (iHashCode != 1142636368) {
                if (iHashCode == 1918729248 && str.equals("ERROR_STATE_ID")) {
                    i4g.h hVar = (i4g.h) bVar.f93422p;
                    ihm.b bVar2 = hVar.f;
                    lk0.g gVar2 = (lk0.g) bVar2.f();
                    if (gVar2 != null) {
                        List list = gVar2.f196174a;
                        if (!list.isEmpty() && ((lk0.e) zhm.d0.m0(list)).e != null) {
                            gVar = gVar2;
                        }
                        if (gVar != null) {
                            List list2 = gVar.f196174a;
                            if (list2.size() == 1) {
                                hVar.e.onNext(((lk0.e) zhm.d0.m0(list2)).f196172b);
                            } else {
                                bVar2.onNext(lk0.g.a(list2.subList(0, list2.size() - 1)));
                                hVar.d.onNext(h.b.f196176a);
                            }
                        }
                    }
                }
            } else if (str.equals("search_result_no_results_with_filters_state")) {
                bVar.l2(new f0(bVar, null), new yi5.b(26));
            }
        } else if (str.equals("search_result_no_results_state")) {
            oki.h.v2(bVar.f93428x, new TravelFlightsSearchScreenContract$ModalStep.DatesSelection(((r) ((j2) yVar.f22677a).getValue()).f1892a.f93579c, ((r) ((j2) yVar.f22677a).getValue()).f1892a.d), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
