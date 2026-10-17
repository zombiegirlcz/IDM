package qg7;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.result.LotteryResultController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LotteryResultController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LotteryResultController lotteryResultController, Continuation continuation) {
        super(2, continuation);
        this.v = lotteryResultController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        PromptMarketingContentDelegate.Model model = (PromptMarketingContentDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarD3 = this.v.R2();
        Object obj3 = model.f53090n;
        u uVar = (u) fVarD3;
        uVar.getClass();
        if (obj3 instanceof ug7.e) {
            uVar.K2(((ug7.e) obj3).f279983a);
        } else {
            hx7.e.n(new IllegalArgumentException(a0.d.m(obj3, "Unknown parcel ")));
        }
        return Unit.f186387a;
    }
}
