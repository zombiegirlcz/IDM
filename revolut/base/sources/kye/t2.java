package kye;

import com.revolut.domain.models.topup.methods.TopupMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class t2 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t2 t2Var = new t2(this.v, continuation);
        t2Var.u = obj2;
        return t2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t2) create((TopupMethod.SuggestedMethod) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TopupMethod.SuggestedMethod suggestedMethod = (TopupMethod.SuggestedMethod) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k3 k3Var = this.v;
        k3Var.H2(k3Var.f190763d0, new kv7.g(suggestedMethod, 23));
        return Unit.f186387a;
    }
}
