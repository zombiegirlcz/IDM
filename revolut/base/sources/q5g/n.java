package q5g;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ TravelFlightsCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) this.u.R2();
        cli.y yVar = bVar.B;
        s sVar = (s) ((j2) yVar.f22677a).getValue();
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        Data data = sVar.f;
        Data data2 = sVar.f242388c;
        if (data.getError() == null || data2.getContent() == null || data2.getLoading()) {
            bVar.f93316x.a();
        } else {
            bVar.H2(yVar, new q3d.i(17));
            h hVar = bVar.o;
            hVar.e.a();
            j2 j2Var = hVar.d;
            od0.i.Companion.getClass();
            j2Var.getClass();
            j2Var.g(null, od0.i.f224256b);
        }
        return Unit.f186387a;
    }
}
