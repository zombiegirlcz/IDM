package r6g;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsPassengersPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsPassengersPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child = obj3 instanceof TravelFlightsPassengersPickerScreenContract$Child ? (TravelFlightsPassengersPickerScreenContract$Child) obj3 : null;
        if (travelFlightsPassengersPickerScreenContract$Child == null) {
            RuntimeException runtimeException = new RuntimeException("Unexpected parcel type in onDetailsActionClicked");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
        } else {
            oki.h.v2(aVar2.f93387t, new TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker(travelFlightsPassengersPickerScreenContract$Child.f93375a, travelFlightsPassengersPickerScreenContract$Child.f93376b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
