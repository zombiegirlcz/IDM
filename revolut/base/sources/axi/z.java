package axi;

import axi.m;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c u;
    public final /* synthetic */ Pair v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = pair;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new z(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((z) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.u.C2(new m.a(this.v));
        return Unit.f186387a;
    }
}
