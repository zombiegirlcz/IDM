package g75;

import blj.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.y;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a f141122w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f141122w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f141122w, continuation, 0);
            default:
                return new l(this.f141122w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a aVar2 = this.f141122w;
                    y yVarD = rd0.e.d(yh5.b.d(ngm.n.K(new k(aVar2, null, 0)), rd0.e.b(aVar2.f70465q.b(aVar2.o.f70461a, w4l.h.f294642c))), h0.f322473a);
                    t tVar = new t(aVar2, 4);
                    this.v = 1;
                    if (yVarD.collect(tVar, this) == aVar) {
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
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.a aVar4 = this.f141122w;
                k kVar = new k(aVar4, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "create mandate", kVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
