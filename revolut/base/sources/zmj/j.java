package zmj;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsSwitcherDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) this.v.d();
        boolean z = !model.f51915c;
        aVar2.H2(aVar2.J, new g0(aVar2, z, 0));
        aVar2.I.k(Boolean.valueOf(z));
        return Unit.f186387a;
    }
}
