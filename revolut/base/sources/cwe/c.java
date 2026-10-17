package cwe;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import oki.h;
import yhm.o;
import yki.l;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.add_card.b u;
    public final /* synthetic */ l v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.topup_screen.impl.flow.add_card.b bVar, l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = bVar;
        this.v = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h.D2(this.v);
        return Unit.f186387a;
    }
}
