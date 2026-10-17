package jck;

import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanGiftingReceiverPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planGiftingReceiverPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a aVar2 = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) planGiftingReceiverPickerScreen.d();
                ((pn3.b) aVar2.f102510r).c(aVar2, new j87.m(aVar2, 18));
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) planGiftingReceiverPickerScreen.d()).C2(q.f172865a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) planGiftingReceiverPickerScreen.d()).C2(s.f172867a);
                break;
        }
        return Unit.f186387a;
    }
}
