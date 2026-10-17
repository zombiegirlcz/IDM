package gck;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreen;
import gck.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanGiftingReceiverIntroScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PlanGiftingReceiverIntroScreen planGiftingReceiverIntroScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planGiftingReceiverIntroScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.d();
        String listId = model.f52373a;
        w wVar = (w) sVarE3;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "GIFT_INVALID_STATE_ID")) {
            wVar.C2(p.a.f142508a);
        } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            wVar.f142525x.a();
            wVar.I2();
        }
        return Unit.f186387a;
    }
}
