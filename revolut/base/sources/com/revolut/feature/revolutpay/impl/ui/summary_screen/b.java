package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f84565w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f84565w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f84565w, continuation);
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
        boolean z = n1Var instanceof l1;
        f fVar = this.v;
        if (z) {
            fVar.O.k(this.f84565w);
        } else {
            fVar.C2(RevolutPaySummaryScreenContract$OutputData.BackPressed.f84555a);
        }
        return Unit.f186387a;
    }
}
