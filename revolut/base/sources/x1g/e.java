package x1g;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelExperiencesCheckoutScreen travelExperiencesCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(model);
        c0 c0Var = (c0) mVarE3;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "VISITOR_INFO_SUBHEADER_ITEM_ID")) {
            cli.y yVar = c0Var.I;
            TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = ((i) ((j2) yVar.f22677a).getValue()).f;
            List list = c0Var.o.i;
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            yji.l.g2(c0Var, new TravelExperiencesVisitorInformationScreen(new TravelExperiencesVisitorInformationScreenContract$InputData(travelExperiencesBookingContactDetails, list, ((i) ((j2) yVar.f22677a).getValue()).f302421g)), null, new q(c0Var, 0), 1);
        }
        return Unit.f186387a;
    }
}
