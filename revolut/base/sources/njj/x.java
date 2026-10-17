package njj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ EsimMobilePlanCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimMobilePlanCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.u.d();
        aVar2.H2(aVar2.G, new njf.d(7));
        aVar2.F.a();
        return Unit.f186387a;
    }
}
