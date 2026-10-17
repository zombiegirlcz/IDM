package bg4;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f15096w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar, PaymentMethod.Pocket pocket, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f15096w = pocket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a0(this.v, this.f15096w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PaymentMethod.Pocket pocket = this.f15096w;
            com.revolut.feature.credit.application.plugins.impl.ui.payment.checkout.a aVar2 = this.v;
            z zVar = new z(aVar2, pocket, null);
            this.u = 1;
            if (aVar2.p2(this, zVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
