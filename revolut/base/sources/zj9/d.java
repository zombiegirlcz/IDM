package zj9;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ PaymentOptionsController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaymentOptionsController paymentOptionsController, Continuation continuation) {
        super(2, continuation);
        this.u = paymentOptionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a aVar2 = (com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a) ((g) this.u.R.getValue());
        aVar2.getClass();
        aVar2.n2(new yzb.c(aVar2, null, 22), new whi.b(6));
        return Unit.f186387a;
    }
}
