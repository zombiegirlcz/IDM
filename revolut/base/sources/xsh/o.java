package xsh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ r u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dsh.l f308510w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, String str, dsh.l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = rVar;
        this.v = str;
        this.f308510w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.u, this.v, this.f308510w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        xng.l lVar = new xng.l(this.f308510w, 17);
        String str = this.v;
        rg3.h hVar = new rg3.h(1, str, lVar);
        r rVar = this.u;
        rVar.x2(hVar);
        rVar.n2(new xge.f(rVar, str, null, 18), new whi.b(6));
        return Unit.f186387a;
    }
}
