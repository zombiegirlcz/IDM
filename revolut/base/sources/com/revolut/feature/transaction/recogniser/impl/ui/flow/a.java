package com.revolut.feature.transaction.recogniser.impl.ui.flow;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import tji.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m mVar = (m) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!(mVar instanceof j1)) {
            boolean z = mVar instanceof k1;
            b bVar = this.v;
            if (z || (mVar instanceof l1)) {
                bVar.P2();
            } else if (mVar instanceof m1) {
                bVar.r2();
                bVar.E2(new TransactionRecogniserFlowContract$Step.AddNote(bVar.v), false, null, false);
            }
        }
        return Unit.f186387a;
    }
}
