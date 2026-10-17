package com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment;

import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$FlowContext;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nl9.d;
import nl9.e;
import oki.h;
import ul9.g;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = cVar.o.f78971a;
            if (str == null) {
                cVar.J2(new IllegalStateException("The flow is opened not during the payment (paymentId = null) and user is enrolled"));
                return Unit.f186387a;
            }
            g gVar = cVar.f78978p;
            this.u = 1;
            obj2 = gVar.d(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        e eVar = (e) obj2;
        if (eVar instanceof nl9.c) {
            h.t2(cVar, cVar.f78980r, new PayWithSmileEnrollmentFlowContract$Step.FallbackConfirmation(((nl9.c) eVar).f217100a, PayWithSmileEnrollmentFlowContract$FlowContext.Processing.f78970a), false, null, false, 12);
        } else if (Intrinsics.f(eVar, nl9.b.f217099a)) {
            h.D2(cVar.f78980r);
        } else {
            if (!Intrinsics.f(eVar, d.f217101a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(cVar, cVar.f78980r, PayWithSmileEnrollmentFlowContract$Step.AcceptConsent.f78972a, false, null, false, 12);
        }
        return Unit.f186387a;
    }
}
