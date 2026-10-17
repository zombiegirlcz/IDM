package jck;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ PlanGiftingReceiverPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planGiftingReceiverPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar2 = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) this.u.d();
        aVar2.getClass();
        m70.a.c(t0.f186434a);
        aVar2.u.d(new Pair(Boolean.FALSE, ""));
        return Unit.f186387a;
    }
}
