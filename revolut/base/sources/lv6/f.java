package lv6;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.FreelancerCashbackBoosterScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerCashbackBoosterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerCashbackBoosterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FreelancerCashbackBoosterScreen freelancerCashbackBoosterScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) freelancerCashbackBoosterScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.b) freelancerCashbackBoosterScreen.e3()).v, FreelancerCashbackBoosterScreenContract$ModalStep.NewSalePicker.f73749a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
