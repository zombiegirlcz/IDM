package mn1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ b0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.u = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b0 b0Var = this.u;
        return yji.l.i2(b0Var, b0Var.v.a(b0Var.u.a(((h) ((j2) b0Var.f207334w.f22677a).getValue()).d)), null, new ml3.y(b0Var, 13), 1);
    }
}
