package gcg;

import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.discover.TravelHotelsHomeDiscoverScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsHomeDiscoverScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelHotelsHomeDiscoverScreen travelHotelsHomeDiscoverScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsHomeDiscoverScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((HeaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeaderDelegate.Model model = (HeaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarD3 = this.v.d();
        Intrinsics.h(model);
        e0 e0Var = (e0) rVarD3;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        cyf.a aVar2 = (cyf.a) e0Var.f142444t;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52397a, "REV_POINTS_BANNER_ITEM_ID")) {
            aVar2.A2(u0.b(jbb.a.a(ibb.c.e, null, null, null, 14)));
        }
        return Unit.f186387a;
    }
}
