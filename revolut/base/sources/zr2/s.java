package zr2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.block.BlockMerchantTransparentScreen;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockMerchantTransparentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BlockMerchantTransparentScreen blockMerchantTransparentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockMerchantTransparentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(model);
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof qua.p) {
            nVar.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((qua.p) obj3).f249314a.f160150a, false, null, 6))));
        }
        return Unit.f186387a;
    }
}
