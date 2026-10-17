package eig;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesMainScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelMilesMainScreen travelMilesMainScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesMainScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SearchButtonDelegate.Model model = (SearchButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) lVarD3;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        eVar.C2(b.a.C0577a.f94368a);
        return Unit.f186387a;
    }
}
