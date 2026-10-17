package v4g;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreenContract$BaggageOptionParcel;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s7a.m0;
import vkm.j2;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsBaggageSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelFlightsBaggageSelectionScreen travelFlightsBaggageSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsBaggageSelectionScreen;
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
        List list;
        Set setI1;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b) oVarE3;
        y yVar = bVar.f93253s;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        TravelFlightsBaggageSelectionScreenContract$BaggageOptionParcel travelFlightsBaggageSelectionScreenContract$BaggageOptionParcel = obj3 instanceof TravelFlightsBaggageSelectionScreenContract$BaggageOptionParcel ? (TravelFlightsBaggageSelectionScreenContract$BaggageOptionParcel) obj3 : null;
        if (travelFlightsBaggageSelectionScreenContract$BaggageOptionParcel != null && (list = travelFlightsBaggageSelectionScreenContract$BaggageOptionParcel.f93244a) != null && (setI1 = d0.i1(list)) != null) {
            Set set = setI1.isEmpty() ? null : setI1;
            if (set != null) {
                Set set2 = ((g) ((j2) yVar.f22677a).getValue()).f286079c;
                Set setK = set2.containsAll(set) ? a1.k(set2, set) : a1.l(set2, set);
                bVar.H2(yVar, new m0(11, setK));
                bVar.I2(setK);
            }
        }
        return Unit.f186387a;
    }
}
