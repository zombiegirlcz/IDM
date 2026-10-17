package oc9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import y89.e;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes_terms.h u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.onboarding.impl.qes_terms.h hVar, Continuation continuation) {
        super(2, continuation);
        this.u = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.K2(e.b.f311641a);
        return Unit.f186387a;
    }
}
