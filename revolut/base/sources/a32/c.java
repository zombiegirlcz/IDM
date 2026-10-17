package a32;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ m02.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ PaymentPocketInfo f1016w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        m02.a aVar = (m02.a) obj2;
        PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(3, 0, continuation);
                cVar.v = aVar;
                cVar.f1016w = paymentPocketInfo;
                return cVar.invokeSuspend(Unit.f186387a);
            case 1:
                c cVar2 = new c(3, 1, continuation);
                cVar2.v = aVar;
                cVar2.f1016w = paymentPocketInfo;
                return cVar2.invokeSuspend(Unit.f186387a);
            case 2:
                c cVar3 = new c(3, 2, continuation);
                cVar3.v = aVar;
                cVar3.f1016w = paymentPocketInfo;
                return cVar3.invokeSuspend(Unit.f186387a);
            case 3:
                c cVar4 = new c(3, 3, continuation);
                cVar4.v = aVar;
                cVar4.f1016w = paymentPocketInfo;
                return cVar4.invokeSuspend(Unit.f186387a);
            case 4:
                c cVar5 = new c(3, 4, continuation);
                cVar5.v = aVar;
                cVar5.f1016w = paymentPocketInfo;
                return cVar5.invokeSuspend(Unit.f186387a);
            default:
                c cVar6 = new c(3, 5, continuation);
                cVar6.v = aVar;
                cVar6.f1016w = paymentPocketInfo;
                return cVar6.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                m02.a aVar = this.v;
                PaymentPocketInfo paymentPocketInfo = this.f1016w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(aVar, paymentPocketInfo);
            case 1:
                m02.a aVar3 = this.v;
                PaymentPocketInfo paymentPocketInfo2 = this.f1016w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(aVar3, paymentPocketInfo2);
            case 2:
                m02.a aVar5 = this.v;
                PaymentPocketInfo paymentPocketInfo3 = this.f1016w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(aVar5, paymentPocketInfo3);
            case 3:
                m02.a aVar7 = this.v;
                PaymentPocketInfo paymentPocketInfo4 = this.f1016w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new jh9.g(aVar7.f201040a, paymentPocketInfo4);
            case 4:
                m02.a aVar9 = this.v;
                PaymentPocketInfo paymentPocketInfo5 = this.f1016w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(aVar9, paymentPocketInfo5);
            default:
                m02.a aVar11 = this.v;
                PaymentPocketInfo paymentPocketInfo6 = this.f1016w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(aVar11, paymentPocketInfo6);
        }
    }
}
