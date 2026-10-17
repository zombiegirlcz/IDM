package m11;

import com.revolut.crypto.challenge.impl.ui.screen.progress.CryptoChallengeProgressViewController;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CryptoChallengeProgressViewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(CryptoChallengeProgressViewController cryptoChallengeProgressViewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cryptoChallengeProgressViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.v, continuation, 0);
            case 1:
                return new q(this.v, continuation, 1);
            case 2:
                return new q(this.v, continuation, 2);
            default:
                return new q(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CryptoChallengeProgressViewController cryptoChallengeProgressViewController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.crypto.challenge.impl.ui.screen.progress.a) cryptoChallengeProgressViewController.e3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.crypto.challenge.impl.ui.screen.progress.a) cryptoChallengeProgressViewController.e3()).J2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.crypto.challenge.impl.ui.screen.progress.a) cryptoChallengeProgressViewController.e3()).J2();
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.crypto.challenge.impl.ui.screen.progress.a aVar5 = (com.revolut.crypto.challenge.impl.ui.screen.progress.a) cryptoChallengeProgressViewController.e3();
                aVar5.getClass();
                aVar5.C1(u0.c(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.CRYPTO_CHALLENGE, null, 14)));
                break;
        }
        return Unit.f186387a;
    }
}
