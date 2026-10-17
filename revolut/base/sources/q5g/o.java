package q5g;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelFlightsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0VarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) b0VarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51674g;
        PointsRedeemOption pointsRedeemOption = obj3 instanceof PointsRedeemOption ? (PointsRedeemOption) obj3 : null;
        if (pointsRedeemOption != null) {
            j2 j2Var = bVar.o.f242374c;
            od0.i.Companion.getClass();
            od0.i iVarA = od0.h.a(pointsRedeemOption);
            j2Var.getClass();
            j2Var.g(null, iVarA);
            bVar.H2(bVar.B, new q56.o(pointsRedeemOption, 4));
        }
        return Unit.f186387a;
    }
}
