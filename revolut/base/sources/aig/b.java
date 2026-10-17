package aig;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelMilesHomeScreen travelMilesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.home.e) jVarD3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        eVar.f94353r.Z2(new com.revolut.feature.travel.miles.impl.ui.screen.home.d(model, eVar, null));
        return Unit.f186387a;
    }
}
