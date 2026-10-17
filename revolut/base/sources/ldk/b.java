package ldk;

import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.MilestoneRewardsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MilestoneRewardsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MilestoneRewardsScreen milestoneRewardsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = milestoneRewardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CenteredContentTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CenteredContentTileDelegate.Model model = (CenteredContentTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.R2().I2(model.i, model.f51983a);
        return Unit.f186387a;
    }
}
