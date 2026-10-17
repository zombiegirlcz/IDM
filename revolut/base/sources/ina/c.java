package ina;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        mre.c cVar = this.v.f162727r;
        TermsScope.INSTANCE.getClass();
        ufm.i iVarC = ((rre.d) cVar).c(TermsScope.f90360a0, null);
        this.u = 1;
        Object objB = nim.a.b(iVarC, this);
        return objB == aVar ? aVar : objB;
    }
}
