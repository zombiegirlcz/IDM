package iuj;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.home.RewardsHubHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RewardsHubHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RewardsHubHomeScreen rewardsHubHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rewardsHubHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((ActionCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionCardDelegate.Model model = (ActionCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.R2();
        Intrinsics.h(model);
        a0 a0Var = (a0) vVarE3;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof g) {
            a0Var.C2(new t(((g) obj3).f168632a));
        }
        return Unit.f186387a;
    }
}
