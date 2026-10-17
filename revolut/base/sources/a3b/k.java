package a3b;

import ael.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pfm.r;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.flows.withdraw.a f1090w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f1091x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar, dj0.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f1090w = aVar;
        this.f1091x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f1090w, this.f1091x, continuation, 0);
            default:
                return new k(this.f1090w, this.f1091x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar2 = this.f1090w;
                    ybl.d dVar = aVar2.f82199p;
                    r rVarI = ((y) dVar).i(aVar2.o.f82196a, this.f1091x, aVar2.u, null);
                    this.v = 1;
                    if (nim.a.a(rVarI, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar4 = this.f1090w;
                if (i2 == 0) {
                    o.b(obj2);
                    k kVar = new k(aVar4, this.f1091x, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar4, kVar, this) != aVar3) {
                    }
                    return aVar3;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 2;
                Object objJ2 = com.revolut.feature.retail.cfd.impl.flows.withdraw.a.J2(aVar4, this);
                if (objJ2 != aVar3) {
                    return objJ2;
                }
                return aVar3;
        }
    }
}
