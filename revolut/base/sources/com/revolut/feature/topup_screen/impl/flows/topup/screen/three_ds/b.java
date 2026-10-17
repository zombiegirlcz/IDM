package com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds;

import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a;
import dze.j;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = c.Companion;
        this.u.C2(a.b.f90959a);
        return Unit.f186387a;
    }
}
