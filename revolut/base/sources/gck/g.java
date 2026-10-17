package gck;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PlanGiftingReceiverIntroScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planGiftingReceiverIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        w wVar = (w) this.u.d();
        j60.a.v(wVar.u, false, null, 3);
        wVar.C2(new m(((kbk.j) zi0.c.I(((l) ((j2) wVar.f142526y.f22677a).getValue()).f142501a)).f182628b));
        return Unit.f186387a;
    }
}
