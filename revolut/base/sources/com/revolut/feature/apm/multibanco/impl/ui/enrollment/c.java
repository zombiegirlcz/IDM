package com.revolut.feature.apm.multibanco.impl.ui.enrollment;

import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MultibancoExternalEnrollmentFlowContract$Step.Confirmation f62584w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, MultibancoExternalEnrollmentFlowContract$Step.Confirmation confirmation, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f62584w = confirmation;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f62584w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        MultibancoExternalEnrollmentFlowContract$Step.Confirmation confirmation = this.f62584w;
        d dVar = this.v;
        b bVar = new b(dVar, confirmation, null);
        this.u = 1;
        Object objP2 = dVar.p2(this, bVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
