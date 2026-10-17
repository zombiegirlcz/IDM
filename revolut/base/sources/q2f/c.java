package q2f;

import aw0.n6;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.TradeRevPointsAccountLimitInfoScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TradeRevPointsAccountLimitInfoScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TradeRevPointsAccountLimitInfoScreen tradeRevPointsAccountLimitInfoScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = tradeRevPointsAccountLimitInfoScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TradeRevPointsAccountLimitInfoScreen tradeRevPointsAccountLimitInfoScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) ((d) tradeRevPointsAccountLimitInfoScreen.U.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) ((d) tradeRevPointsAccountLimitInfoScreen.U.getValue());
                eVar.getClass();
                eVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14))));
                eVar.B2();
                break;
        }
        return Unit.f186387a;
    }
}
