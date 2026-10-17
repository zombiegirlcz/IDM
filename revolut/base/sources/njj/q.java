package njj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ EsimMobilePlanCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(EsimMobilePlanCheckoutScreen esimMobilePlanCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = esimMobilePlanCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a) this.u.d();
        aVar2.H2(aVar2.G, new lph.c(!((b0) ((j2) r0.f22677a).getValue()).f216547h, 15));
        return Unit.f186387a;
    }
}
