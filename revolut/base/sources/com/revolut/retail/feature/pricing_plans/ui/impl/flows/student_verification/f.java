package com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ g u;
    public final /* synthetic */ oki.g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, oki.g gVar2, Continuation continuation) {
        super(2, continuation);
        this.u = gVar;
        this.v = gVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.C2(a.b.f103288a);
        oki.g gVar = this.v;
        if (gVar != null) {
            gVar.pop();
        }
        return Unit.f186387a;
    }
}
