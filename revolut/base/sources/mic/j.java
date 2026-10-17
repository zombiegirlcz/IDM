package mic;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PerkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PerkDetailsScreen perkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f51832a, "AVAILABILITY_LIST_ID")) {
            g0 g0Var = (g0) this.v.R2();
            RewardOutlet rewardOutlet = ((k) ((j2) g0Var.f205665x.f22677a).getValue()).d;
            if (rewardOutlet != null) {
                g0Var.C2(new v(rewardOutlet));
            }
        }
        return Unit.f186387a;
    }
}
