package ovb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExclusiveStoreProductCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsExclusiveStoreProductCheckoutScreen revPointsExclusiveStoreProductCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExclusiveStoreProductCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarM3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) hVarM3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        dVar.f83611x.a();
        return Unit.f186387a;
    }
}
