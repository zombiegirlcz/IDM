package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.flow;

import com.bumptech.glide.d;
import com.revolut.feature.address.models.Address;
import do3.n;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import wtc.q0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address;
        n nVar = (n) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.v;
        q0 q0Var = bVar.f85717p;
        q0Var.getClass();
        boolean zB = q0.b(nVar);
        q0Var.getClass();
        bVar.H2(bVar.f85718q, new a82.n(zB, d.u((nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address)), 2));
        return Unit.f186387a;
    }
}
