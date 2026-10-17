package p0l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ p0.a u;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p0.a aVar, v vVar, Continuation continuation) {
        super(1, continuation);
        this.u = aVar;
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(this.u.f256150a, "EXPLANATION_PROMPT_ID")) {
            ((r60.d) this.v.f231570p).Q();
        }
        return Unit.f186387a;
    }
}
