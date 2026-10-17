package com.revolut.feature.apm.multibanco.impl.ui.enrollment;

import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$Step;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MultibancoExternalEnrollmentFlowContract$Step.Confirmation f62582w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, MultibancoExternalEnrollmentFlowContract$Step.Confirmation confirmation, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f62582w = confirmation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f62582w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = this.v;
            l72.c cVar = dVar.f62588q;
            String str = this.f62582w.f62577a;
            String str2 = dVar.o.f62575a;
            this.u = 1;
            a1a.b bVar = new a1a.b((a72.d) ((l72.d) cVar).f192506b, str, str2, null, 7);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, bVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
