package a6g;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.TravelFlightsFareSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsFareSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsFareSelectionScreen travelFlightsFareSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsFareSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.H2(aVar2.o, new a31.g(d0.e0(model.f52519a, "FARE_OPTION_ID_"), 9));
        return Unit.f186387a;
    }
}
