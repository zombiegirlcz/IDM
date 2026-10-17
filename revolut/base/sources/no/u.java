package no;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ z u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, Continuation continuation) {
        super(3, continuation);
        this.u = zVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        return new u(this.u, (Continuation) obj4).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVar = z.Companion;
        z zVar = this.u;
        CoroutineScope coroutineScopeC = zVar.e.c();
        skm.p0 p0Var = skm.p0.f264001a;
        skm.e0.C(coroutineScopeC, elm.f.f127540b, null, new nfj.j2(zVar, null, 17), 2);
        return Unit.f186387a;
    }
}
