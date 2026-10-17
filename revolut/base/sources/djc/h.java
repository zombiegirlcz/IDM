package djc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rentAndBillsManageLinkedPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        qua.p pVar = obj3 instanceof qua.p ? (qua.p) obj3 : null;
        if (pVar != null) {
            s sVarE3 = this.v.R2();
            String subscriptionId = pVar.f249314a.f160150a;
            b0 b0Var = (b0) sVarE3;
            b0Var.getClass();
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            b0Var.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(subscriptionId, false, null, 6))));
        }
        return Unit.f186387a;
    }
}
