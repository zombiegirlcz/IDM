package uwf;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PassengerDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PassengerDetailsScreen passengerDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = passengerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        l lVar = (l) jVarE3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        lVar.o.d3(model);
        return Unit.f186387a;
    }
}
