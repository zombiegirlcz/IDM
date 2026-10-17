package i6g;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.feature.travel.flights.models.domain.location.LocationSearchResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsLocationPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsLocationPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.R2();
        Intrinsics.h(model);
        m mVar = (m) hVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        LocationSearchResult locationSearchResult = obj3 instanceof LocationSearchResult ? (LocationSearchResult) obj3 : null;
        if (locationSearchResult != null) {
            mVar.C2(new g(locationSearchResult));
        }
        return Unit.f186387a;
    }
}
