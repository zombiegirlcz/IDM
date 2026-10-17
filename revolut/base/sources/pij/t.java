package pij;

import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$OutputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$SubscriptionItemClickData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((EsimDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimDelegate.Model model = (EsimDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f52238q;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract.SubscriptionItemClickData");
        EsimSubscriptionsScreenContract$SubscriptionItemClickData clickData = (EsimSubscriptionsScreenContract$SubscriptionItemClickData) obj3;
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) this.v.R2();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        if (clickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.PlanOffer) {
            bVar.S2((EsimSubscriptionsScreenContract$SubscriptionItemClickData.PlanOffer) clickData);
        } else if (clickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.DataPlanSubscription) {
            bVar.C2(new EsimSubscriptionsScreenContract$OutputData.BuyAgainClicked(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.DataPlanSubscription) clickData).f101065a));
        } else if (!(clickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.MobilePlanSubscription) && !(clickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.RoamingAllowance)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }
}
