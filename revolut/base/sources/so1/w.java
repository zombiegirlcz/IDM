package so1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a f264694w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f264694w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f264694w, continuation, 0);
            case 1:
                return new w(this.f264694w, continuation, 1);
            case 2:
                return new w(this.f264694w, continuation, 2);
            default:
                return new w(this.f264694w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar2 = this.f264694w;
                v vVar = new v(aVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "PAY_BILL_TASK_ID", vVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar4 = this.f264694w;
                w wVar = new w(aVar4, null, 0);
                this.v = 1;
                Object objB0 = u0.b0(aVar4.X(), "PAY_BUTTON_TAG", wVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar6 = this.f264694w;
                v vVar2 = new v(aVar6, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar6.k, "PAY_BILL_TASK_ID", vVar2, this);
                return objB2 == aVar5 ? aVar5 : objB2;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar8 = this.f264694w;
                w wVar2 = new w(aVar8, null, 2);
                this.v = 1;
                Object objB02 = u0.b0(aVar8.X(), "PAY_BUTTON_TAG", wVar2, this);
                return objB02 == aVar7 ? aVar7 : objB02;
        }
    }
}
