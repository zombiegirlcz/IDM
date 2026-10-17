package e30;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p20.b;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ b u;
    public final /* synthetic */ b.j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, b.j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((z10.e) this.u.f122164a).b(this.v);
        return Unit.f186387a;
    }
}
