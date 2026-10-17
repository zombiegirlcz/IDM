package a3i;

import b9.w2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_exchange.impl.ui.order_details_kompot.b f1158w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f1158w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f1158w, continuation, 0);
            default:
                return new r(this.f1158w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar = this.f1158w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q qVar = new q(bVar, null, 0);
                    this.v = 1;
                    if (bVar.p2(this, qVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar.C2(aii.q.f5292a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature_exchange.impl.ui.order_details_kompot.b bVar2 = this.f1158w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    w2 w2Var = bVar2.f96972p;
                    this.v = 1;
                    obj2 = w2Var.H(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar2.H2(bVar2.f96976t, new a2g.p(((Boolean) obj2).booleanValue(), 2));
                return Unit.f186387a;
        }
    }
}
