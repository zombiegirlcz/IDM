package gp7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.payment.PaymentBreakdownScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ PaymentBreakdownScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PaymentBreakdownScreen paymentBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.u = paymentBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j60.a.v(((f) this.u.X.getValue()).f145282p, false, null, 3);
        return Unit.f186387a;
    }
}
