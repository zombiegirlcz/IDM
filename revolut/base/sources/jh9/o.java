package jh9;

import com.revolut.feature.pay_bills_taxes.impl.ui_payment.helpers.models.PaymentData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function1 {
    public p u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f174173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PaymentData f174174x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, PaymentData paymentData, Continuation continuation) {
        super(1, continuation);
        this.f174173w = pVar;
        this.f174174x = paymentData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new o(this.f174173w, this.f174174x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((o) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        p pVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        p pVar2 = this.f174173w;
        if (i == 0) {
            yhm.o.b(obj2);
            x02.d dVar = pVar2.f174177r;
            x02.c cVar = x02.c.BILLS;
            this.u = pVar2;
            this.v = 1;
            obj2 = ((q12.l) dVar).a(this.f174174x, cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
            pVar = pVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.u;
            yhm.o.b(obj2);
        }
        return yji.l.i2(pVar, (dki.p) obj2, null, new m(pVar2, 1), 1);
    }
}
