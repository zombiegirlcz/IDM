package n4d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ r0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(r0 r0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = r0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p0(this.v, continuation, 0);
            default:
                return new p0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Class cls = Boolean.TYPE;
        r0 r0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(cls, r0Var.f212398c, "STORAGE_KEY_PREFILL_WATCHLIST", Boolean.FALSE);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return r0Var.f212398c.v0(Boolean.TRUE, "STORAGE_KEY_PREFILL_WATCHLIST", cls);
        }
    }
}
