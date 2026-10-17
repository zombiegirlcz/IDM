package ldk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.MilestoneRewardsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ MilestoneRewardsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MilestoneRewardsScreen milestoneRewardsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = milestoneRewardsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.u.R2();
        xck.b bVar = (xck.b) ((f) ((j2) yVarE3.f194187s.f22677a).getValue()).f194163a.getContent();
        yVarE3.C2(new o(bVar != null ? bVar.d : null));
        return Unit.f186387a;
    }
}
