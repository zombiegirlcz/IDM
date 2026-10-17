package ds2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreen;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import qua.p;
import tof.a3;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockedMerchantDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BlockedMerchantDetailsScreen blockedMerchantDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockedMerchantDetailsScreen;
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
        o.b(obj2);
        g gVarG3 = this.v.T2();
        Intrinsics.h(model);
        i iVar = (i) gVarG3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof a3) {
            iVar.C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P((a3) obj3), null, null, null, 126))));
        } else if (obj3 instanceof p) {
            iVar.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((p) obj3).f249314a.f160150a, false, null, 6))));
        }
        return Unit.f186387a;
    }
}
