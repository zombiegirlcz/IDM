package com.revolut.feature.kyc.impl.dap;

import com.revolut.feature.kyc.impl.dap.DapFlowContract$Step;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import gim.i;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import ps8.b;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ u u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u uVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = uVar;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        u uVar = this.u;
        boolean z = uVar instanceof s;
        b bVar = this.v;
        if (z) {
            bVar.C2(b.a.f239427a);
        } else if (uVar instanceof t) {
            h.t2(bVar, bVar.f77617q, DapFlowContract$Step.Sdk.f77615a, false, null, false, 14);
        } else {
            if (!(uVar instanceof p) && !(uVar instanceof q) && !(uVar instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            e.n(new IllegalStateException("Dap marketing prompt result has unexpected type: " + uVar));
        }
        return Unit.f186387a;
    }
}
