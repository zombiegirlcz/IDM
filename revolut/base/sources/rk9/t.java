package rk9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a f254787w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254787w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f254787w, continuation, 0);
            default:
                return new t(this.f254787w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar2 = this.f254787w;
                s sVar = new s(aVar2, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "confirm-cancellation", sVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar4 = this.f254787w;
                    ti9.l lVar = aVar4.o;
                    String str = aVar4.f78930p.f78928a;
                    this.v = 1;
                    Object objB2 = ((ti9.n) lVar).f271471b.d.b(new ej9.i(str), false, this);
                    if (objB2 != aVar3) {
                        objB2 = Unit.f186387a;
                    }
                    if (objB2 != aVar3) {
                        objB2 = Unit.f186387a;
                    }
                    if (objB2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
