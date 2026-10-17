package m6g;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.TravelFlightsPassengersDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsPassengersDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelFlightsPassengersDetailsScreen travelFlightsPassengersDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsPassengersDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.a) mVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.E;
        Intrinsics.checkNotNullParameter(model, "model");
        p6g.w wVarJ2 = aVar2.J2(model.f52580a);
        boolean z = wVarJ2 instanceof p6g.p;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            p6g.p pVar = (p6g.p) wVarJ2;
            String str = pVar.f233295a;
            TextLocalisedClause textLocalisedClause = pVar.f233297c;
            List list = pVar.f233298g;
            p6g.o oVar = pVar.d;
            oki.h.v2(aVar3, new TravelFlightsPassengersDetailsScreenContract$ModalStep.OptionSelection(str, textLocalisedClause, list, oVar != null ? oVar.f233293a : null), bottom_dialog);
        } else if (wVarJ2 instanceof p6g.b) {
            p6g.b bVar = (p6g.b) wVarJ2;
            String str2 = bVar.f233269a;
            TextLocalisedClause textLocalisedClause2 = bVar.f233271c;
            p6g.a aVar4 = bVar.d;
            oki.h.v2(aVar3, new TravelFlightsPassengersDetailsScreenContract$ModalStep.CountrySelection(str2, textLocalisedClause2, aVar4 != null ? aVar4.f233265a : null), bottom_dialog);
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
