package vwd;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ StakingDetailsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(StakingDetailsController stakingDetailsController, Continuation continuation) {
        super(2, continuation);
        this.u = stakingDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.staking.impl.stakingdetails.v2.a aVar2 = (com.revolut.feature.staking.impl.stakingdetails.v2.a) ((e) this.u.P.getValue());
        aVar2.getClass();
        aVar2.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.crypto-staking", 2))));
        return Unit.f186387a;
    }
}
