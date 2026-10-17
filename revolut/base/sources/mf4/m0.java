package mf4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f204872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f204872w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m0(this.v, this.f204872w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = this.v;
        l0 l0Var = new l0(gVar, this.f204872w, null, 1);
        this.u = 1;
        Object objB = pu7.a.B(gVar.k, "update repayment type", l0Var, this);
        return objB == aVar ? aVar : objB;
    }
}
