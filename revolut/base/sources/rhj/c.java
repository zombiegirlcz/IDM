package rhj;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$SubscriptionItemClickData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimExpiredSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimExpiredSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((EsimDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimDelegate.Model model = (EsimDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarD3 = this.v.R2();
        Object obj3 = model.f52238q;
        l lVar = (l) jVarD3;
        lVar.getClass();
        EsimSubscriptionsScreenContract$SubscriptionItemClickData esimSubscriptionsScreenContract$SubscriptionItemClickData = obj3 instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData ? (EsimSubscriptionsScreenContract$SubscriptionItemClickData) obj3 : null;
        if (esimSubscriptionsScreenContract$SubscriptionItemClickData != null) {
            if (esimSubscriptionsScreenContract$SubscriptionItemClickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.DataPlanSubscription) {
                lVar.C2(new g(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.DataPlanSubscription) esimSubscriptionsScreenContract$SubscriptionItemClickData).f101066b));
            } else if (esimSubscriptionsScreenContract$SubscriptionItemClickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.MobilePlanSubscription) {
                lVar.C2(new h(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.MobilePlanSubscription) esimSubscriptionsScreenContract$SubscriptionItemClickData).f101068b));
            } else if (esimSubscriptionsScreenContract$SubscriptionItemClickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.RoamingAllowance) {
                lVar.C2(new h(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.RoamingAllowance) esimSubscriptionsScreenContract$SubscriptionItemClickData).f101074b));
            } else if (!(esimSubscriptionsScreenContract$SubscriptionItemClickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.PlanOffer)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f186387a;
    }
}
