package uyh;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h1j.b f284380w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, h1j.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f284380w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l0(this.v, this.f284380w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            h1j.b bVar = this.f284380w;
            com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = this.v;
            k0 k0Var = new k0(bVar, dVar, 0);
            this.u = 1;
            Set set = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
            if (dVar.T2(this, k0Var) == aVar) {
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
