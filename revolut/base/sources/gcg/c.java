package gcg;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.TravelHotelsHomeDiscoverScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsHomeDiscoverScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsHomeDiscoverScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeroBannerDelegate.Model model = (HeroBannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarD3 = this.v.d();
        Intrinsics.h(model);
        e0 e0Var = (e0) rVarD3;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52424a, "DISCOVER_BANNER_ITEM_ID")) {
            e0Var.n2(new b0(e0Var, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
