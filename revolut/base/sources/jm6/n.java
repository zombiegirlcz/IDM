package jm6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import we6.p0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.link_external.b u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.C2(p0.d.f296664a);
        return Unit.f186387a;
    }
}
