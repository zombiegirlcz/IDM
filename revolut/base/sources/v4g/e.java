package v4g;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import uyh.k0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsBaggageSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsBaggageSelectionScreen travelFlightsBaggageSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsBaggageSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b) oVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "ALL_TRAVELLERS_SWITCH_ID")) {
            y yVar = bVar.f93253s;
            com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.a aVar2 = ((g) ((j2) yVar.f22677a).getValue()).f286077a;
            a.C0564a c0564a = aVar2 instanceof a.C0564a ? (a.C0564a) aVar2 : null;
            if (c0564a != null) {
                a2 a2Var = bVar.f93252r;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                bVar.H2(yVar, new k0(c0564a, bVar, 20));
            }
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
