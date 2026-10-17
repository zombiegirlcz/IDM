package so1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a f264696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ qua.p f264697x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar, qua.p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f264696w = aVar;
        this.f264697x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f264696w, this.f264697x, continuation, 0);
            default:
                return new y(this.f264696w, this.f264697x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar2 = this.f264696w;
                s15.j jVar = new s15.j(aVar2, this.f264697x, null, 7);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "PAY_BILL_TASK_ID", jVar, this);
                return objB == aVar ? aVar : objB;
            default:
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
                com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar4 = this.f264696w;
                y yVar = new y(aVar4, this.f264697x, null, 0);
                this.v = 1;
                Object objB0 = u0.b0(aVar4.X(), "PAY_BUTTON_TAG", yVar, this);
                return objB0 == aVar3 ? aVar3 : objB0;
        }
    }
}
