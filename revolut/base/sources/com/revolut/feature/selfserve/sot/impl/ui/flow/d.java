package com.revolut.feature.selfserve.sot.impl.ui.flow;

import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f85940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z, e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = z;
        this.f85940w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, this.f85940w, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if ((n1Var instanceof k1) || (n1Var instanceof l1)) {
            boolean z = this.v;
            e eVar = this.f85940w;
            if (z) {
                h.t2(eVar, eVar.f85946w, eVar.K2(), false, null, false, 12);
            } else {
                h.t2(eVar, eVar.f85946w, SotFlowContract$Step.Status.f85932a, false, null, false, 12);
            }
        }
        return Unit.f186387a;
    }
}
