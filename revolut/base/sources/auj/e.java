package auj;

import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_history.RewardsHubChallengeHistoryScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RewardsHubChallengeHistoryScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RewardsHubChallengeHistoryScreen rewardsHubChallengeHistoryScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rewardsHubChallengeHistoryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ChallengeMediumImageCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ChallengeMediumImageCardDelegate.Model model = (ChallengeMediumImageCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarR2 = this.v.R2();
        Intrinsics.h(model);
        n nVar = (n) jVarR2;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        d0j.h hVar = model.f52023p.f292125a;
        if (nVar.J2()) {
            nVar.f9855s = hVar.f110400b;
        }
        nVar.C2(new h(hVar.f110400b, hVar.f110399a));
        return Unit.f186387a;
    }
}
