package plk;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.upgrade_to_metal.UpgradeToMetalAtCostOfPremiumScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import plk.e;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ UpgradeToMetalAtCostOfPremiumScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UpgradeToMetalAtCostOfPremiumScreen upgradeToMetalAtCostOfPremiumScreen, Continuation continuation) {
        super(2, continuation);
        this.u = upgradeToMetalAtCostOfPremiumScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((j) ((f) this.u.P.getValue())).C2(e.a.f237437a);
        return Unit.f186387a;
    }
}
