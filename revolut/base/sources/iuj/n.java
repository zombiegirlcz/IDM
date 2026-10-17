package iuj;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RewardsHubHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RewardsHubHomeScreen rewardsHubHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rewardsHubHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.R2();
        Intrinsics.h(model);
        a0 a0Var = (a0) vVarE3;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        a0Var.f168627s.a();
        return Unit.f186387a;
    }
}
