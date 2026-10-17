package t9e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sqd.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BlockFuturePaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BlockFuturePaymentsScreen blockFuturePaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = blockFuturePaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Y.getValue();
        Intrinsics.h(model);
        w wVar = (w) jVar;
        mde.e eVar = wVar.f269007t;
        Intrinsics.checkNotNullParameter(model, "model");
        f fVar = (f) ((g) wVar.t2()).f268986a.getContent();
        if (fVar != null) {
            Object obj3 = model.u;
            String str = model.f53228a;
            if (Intrinsics.f(str, "BLOCK_SUBSCRIPTION_LIST_ID")) {
                wVar.A = yji.l.a1(wVar, rd0.e.b(wVar.f269009x.c(fVar.f268983a)), null, null, new u(wVar, null, 1), 3);
            } else if (Intrinsics.f(str, "BLOCK_MERCHANT_LIST_ID")) {
                wVar.n2(new h0(wVar, null, 18), new whi.b(6));
            } else if (obj3 != null && wVar.f269003p.f89183b && eVar.a(obj3)) {
                wVar.C1(eVar.i(obj3));
            } else if (obj3 instanceof qua.p) {
                wVar.C1(new BridgeDestination(new FeatureCommand(new SubscriptionsDetailsFeatureConfig(((qua.p) obj3).f249314a.f160150a, false, null, 6))));
            }
        }
        return Unit.f186387a;
    }
}
