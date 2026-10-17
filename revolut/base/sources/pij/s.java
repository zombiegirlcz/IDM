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
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(EsimSubscriptionsScreen esimSubscriptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((EsimDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            bVar.C2(new EsimSubscriptionsScreenContract$OutputData.DataPlanSubscriptionClicked(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.DataPlanSubscription) clickData).f101066b));
        } else if (clickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.MobilePlanSubscription) {
            bVar.C2(new EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.MobilePlanSubscription) clickData).f101068b));
        } else {
            if (!(clickData instanceof EsimSubscriptionsScreenContract$SubscriptionItemClickData.RoamingAllowance)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.C2(new EsimSubscriptionsScreenContract$OutputData.MobilePlanSubscriptionClicked(((EsimSubscriptionsScreenContract$SubscriptionItemClickData.RoamingAllowance) clickData).f101074b));
        }
        return Unit.f186387a;
    }
}
