package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.k1;
import nii.l1;
import nii.n1;
import u6c.k;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f84568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f84568w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f84568w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if ((n1Var instanceof l1) || (n1Var instanceof k1)) {
            this.v.C2(new RevolutPaySummaryScreenContract$OutputData.PaymentFailure(this.f84568w));
        }
        return Unit.f186387a;
    }
}
