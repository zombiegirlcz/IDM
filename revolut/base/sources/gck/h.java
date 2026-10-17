package gck;

import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingClaimingExitRule;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import ip0.x60;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanGiftingReceiverIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planGiftingReceiverIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((x60) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planGiftingReceiverIntroScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) planGiftingReceiverIntroScreen.d();
                PlanGiftingClaimingExitRule planGiftingClaimingExitRule = wVar.o.f102500b;
                if (planGiftingClaimingExitRule instanceof PlanGiftingClaimingExitRule.LeaveFlow) {
                    wVar.B2();
                } else {
                    if (!(planGiftingClaimingExitRule instanceof PlanGiftingClaimingExitRule.OpenChatWithSender)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    od0.i iVar = (od0.i) ((l) ((j2) wVar.f142526y.f22677a).getValue()).f142502b.getContent();
                    zm3.a aVar3 = iVar != null ? (zm3.a) iVar.g() : null;
                    if (aVar3 != null) {
                        wVar.C2(new o(aVar3));
                    } else {
                        wVar.B2();
                    }
                }
                return Unit.f186387a;
        }
    }
}
