package aig;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelMilesHomeScreen travelMilesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SearchButtonDelegate.Model model = (SearchButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.home.e) jVarD3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        eVar.C2(b.a.C0576a.f94350a);
        return Unit.f186387a;
    }
}
