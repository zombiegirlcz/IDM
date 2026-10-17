package ahf;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ z u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = zVar;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.u bridgeDestination;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = this.u;
        c0 c0Var = zVar.f5105r;
        ExchangeOrder order = (ExchangeOrder) this.v;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(order, "order");
        if (hx7.q.L(order.getF72134a())) {
            Intrinsics.checkNotNullParameter(order, "<this>");
            bridgeDestination = new CryptoOrderDetailsDestination(com.revolut.feature_crypto_order_details.api.navigation.a.a(order));
        } else {
            bridgeDestination = new BridgeDestination(new FeatureCommand(new OrderDetailsFeatureConfig(order)));
        }
        return zVar.C1(bridgeDestination);
    }
}
