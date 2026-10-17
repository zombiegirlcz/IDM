package go7;

import go7.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ s u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, Continuation continuation) {
        super(2, continuation);
        this.u = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.v2(g.a.f145095a);
        return Unit.f186387a;
    }
}
