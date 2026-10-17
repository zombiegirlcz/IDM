package gck;

import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingHyperText;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanGiftingReceiverIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planGiftingReceiverIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((PlanGiftingHyperText.HyperTextAction) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanGiftingHyperText.HyperTextAction action = (PlanGiftingHyperText.HyperTextAction) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = (w) this.v.d();
        wVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Continuation continuation = null;
        if (action instanceof PlanGiftingHyperText.HyperTextAction.UrlAction) {
            wVar.l2(new ga9.v(wVar, ((PlanGiftingHyperText.HyperTextAction.UrlAction) action).f102440a, continuation, 16), new yi5.b(26));
        } else if (action instanceof PlanGiftingHyperText.HyperTextAction.BenefitsFullList) {
            wVar.J2();
        } else {
            if (!(action instanceof PlanGiftingHyperText.HyperTextAction.SeeAllDocuments)) {
                throw new NoWhenBranchMatchedException();
            }
            wVar.l2(new ga9.v(wVar, ((PlanGiftingHyperText.HyperTextAction.SeeAllDocuments) action).f102439a, continuation, 17), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
