package so1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public ro1.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f264692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a f264693x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f264693x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f264693x, continuation, 0);
            default:
                return new v(this.f264693x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((v) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a aVar = this.f264693x;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f264692w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    xn1.b bVar = aVar.f61238p;
                    ro1.b bVarI2 = com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a.I2(aVar);
                    this.f264692w = 1;
                    xn1.e eVar = (xn1.e) bVar;
                    eVar.getClass();
                    xn1.d dVar = new xn1.d(eVar, bVarI2, null, 0);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, dVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ro1.c cVar = this.v;
                        yhm.o.b(obj2);
                        return cVar;
                    }
                    yhm.o.b(obj2);
                }
                ro1.c cVar2 = (ro1.c) obj2;
                co9.b bVar2 = aVar.u;
                this.v = cVar2;
                this.f264692w = 2;
                return bVar2.e(this) == aVar2 ? aVar2 : cVar2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f264692w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    xn1.b bVar3 = aVar.f61238p;
                    ro1.b bVarI22 = com.revolut.feature.apm.bills.bpay.impl.screen.review.review.a.I2(aVar);
                    this.f264692w = 1;
                    xn1.e eVar2 = (xn1.e) bVar3;
                    eVar2.getClass();
                    xn1.d dVar2 = new xn1.d(eVar2, bVarI22, null, 1);
                    p0 p0Var2 = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, dVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ro1.c cVar3 = this.v;
                        yhm.o.b(obj2);
                        return cVar3;
                    }
                    yhm.o.b(obj2);
                }
                ro1.c cVar4 = (ro1.c) obj2;
                co9.b bVar4 = aVar.u;
                this.v = cVar4;
                this.f264692w = 2;
                return bVar4.e(this) == aVar3 ? aVar3 : cVar4;
        }
    }
}
