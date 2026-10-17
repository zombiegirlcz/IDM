package p0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0l.f;
import rp0.v0;

/* JADX INFO: loaded from: classes12.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ v0 u;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v0 v0Var, v vVar, Continuation continuation) {
        super(1, continuation);
        this.u = v0Var;
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(this.u.f256203b, "EXPLANATION_PROMPT_ID")) {
            this.v.v2(f.b.f231555a);
        }
        return Unit.f186387a;
    }
}
