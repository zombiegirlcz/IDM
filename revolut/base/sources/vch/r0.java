package vch;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ x0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, Continuation continuation) {
        super(2, continuation);
        this.v = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r0 r0Var = new r0(this.v, continuation);
        r0Var.u = obj2;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str = (String) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(str);
        this.v.C1(new ExternalDestination.Browser(str, null));
        return Unit.f186387a;
    }
}
