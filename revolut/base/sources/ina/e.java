package ina;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wi0.b f162708w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, wi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f162708w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f162708w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        ufm.i iVarC = ((rre.d) cVar).c(TermsScope.f90374n0, this.f162708w);
        this.u = 1;
        Object objB = nim.a.b(iVarC, this);
        return objB == aVar ? aVar : objB;
    }
}
