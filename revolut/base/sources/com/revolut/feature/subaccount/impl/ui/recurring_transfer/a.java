package com.revolut.feature.subaccount.impl.ui.recurring_transfer;

import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlowContract$Step;
import dj0.d;
import dpf.c;
import efm.r;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s6e.z;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f89125w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f89125w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f89125w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        b bVar = this.v;
        RecurringTransferFlowContract$FlowInput recurringTransferFlowContract$FlowInput = bVar.f89126t;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.f89125w;
        if (i == 0) {
            o.b(obj2);
            if (recurringTransferFlowContract$FlowInput.e) {
                r rVarS = ((z) bVar.v).s(recurringTransferFlowContract$FlowInput.f89119a, new xi0.b(6, recurringTransferFlowContract$FlowInput.f89120b, null), ((dpf.b) cVar).f116876a.f104286b);
                this.u = 1;
                obj2 = nim.a.e(rVarS, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            bVar.E2(new RecurringTransferFlowContract$Step.RecurringTransfer(l, ((dpf.b) cVar).f116876a), true, null, false);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        i6e.b bVar2 = (i6e.b) obj2;
        Long l2 = (bVar2 == null || (dVar = bVar2.f158906a) == null) ? null : new Long(dVar.f115082a);
        bVar.E2(new RecurringTransferFlowContract$Step.RecurringTransfer(l2, ((dpf.b) cVar).f116876a), true, null, false);
        return Unit.f186387a;
    }
}
