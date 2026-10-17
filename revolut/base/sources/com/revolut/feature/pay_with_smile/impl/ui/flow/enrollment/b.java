package com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment;

import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$Step;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import oki.h;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof k1;
        c cVar = this.v;
        if (z) {
            h.D2(cVar.f78980r);
        } else if (n1Var instanceof l1) {
            h.t2(cVar, cVar.f78980r, PayWithSmileEnrollmentFlowContract$Step.CreatePasscode.f78973a, false, null, false, 12);
        } else {
            if (!(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(d.s("Unexpected result ", n1Var));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
