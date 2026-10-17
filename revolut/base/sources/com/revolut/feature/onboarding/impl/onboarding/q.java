package com.revolut.feature.onboarding.impl.onboarding;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ d67.u u;
    public final /* synthetic */ v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(d67.u uVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.u = uVar;
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d67.q qVar = d67.q.f111462a;
        d67.u uVar = this.u;
        boolean zF = Intrinsics.f(uVar, qVar);
        v vVar = this.v;
        if (zF) {
            vVar.B2();
            return Unit.f186387a;
        }
        if (Intrinsics.f(uVar, d67.s.f111464a)) {
            yp.b bVar = vVar.D;
            Intrinsics.checkNotNullParameter(ui0.b.Companion, "<this>");
            return vVar.C1(bVar.b(new ui0.b("com.revolut.junior", null)));
        }
        IllegalStateException illegalStateException = new IllegalStateException(uVar + " result is not supported");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return Unit.f186387a;
    }
}
