package is2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreen;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SelectPaymentToBlockScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectPaymentToBlockScreen selectPaymentToBlockScreen, Continuation continuation) {
        super(2, continuation);
        this.v = selectPaymentToBlockScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarI3 = this.v.T2();
        Intrinsics.h(model);
        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar = (com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b) iVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            bVar.v2(new h(((a3) obj3).f272581b));
        } else if (obj3 instanceof qua.p) {
            bVar.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((qua.p) obj3).f249314a.f160150a, false, null, 6))));
        }
        return Unit.f186387a;
    }
}
