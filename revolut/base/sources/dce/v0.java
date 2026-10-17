package dce;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qua.p f112904w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar, Continuation continuation, qua.p pVar) {
        super(2, continuation);
        this.v = cVar;
        this.f112904w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v0(this.v, continuation, this.f112904w);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c cVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            mde.e eVar = cVar.v;
            this.u = 1;
            obj2 = eVar.h(this.f112904w, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aii.u uVar = (aii.u) obj2;
        if (uVar != null) {
            return cVar.C1(uVar);
        }
        return null;
    }
}
