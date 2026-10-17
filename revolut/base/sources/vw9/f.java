package vw9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentProfileFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaymentProfileFlow paymentProfileFlow, Continuation continuation) {
        super(2, continuation);
        this.v = paymentProfileFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar = (com.revolut.feature.payments.profile.impl.ui_kompot.flow.b) gVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "CheckUsernameAllowance_REMAINING_ATTEMPTS_DIALOG_ID")) {
            d6k.g gVar = (d6k.g) bVar.f79638q;
            j60.a.v(gVar.o, false, new co7.a(gVar, 26), 1);
        }
        return Unit.f186387a;
    }
}
