package com.revolut.feature.shared.help_centre.impl.faq;

import com.revolut.feature.shared.help_centre.impl.faq.FaqFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import m30.j;
import n30.p0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FaqFlowContract$Step.InboundCall f86202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, FaqFlowContract$Step.InboundCall inboundCall, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f86202w = inboundCall;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f86202w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar = this.v;
        j jVar = cVar.f86206y;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = c.O2(cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (!((Boolean) obj2).booleanValue()) {
            return Unit.f186387a;
        }
        FaqFlowContract$Step.InboundCall inboundCall = this.f86202w;
        if (inboundCall instanceof FaqFlowContract$Step.InboundCall.CreateNewTicket) {
            ((p0) jVar).h(null, null, ((FaqFlowContract$Step.InboundCall.CreateNewTicket) inboundCall).f86184a, null);
        } else {
            if (!(inboundCall instanceof FaqFlowContract$Step.InboundCall.UseExistingTicket)) {
                throw new NoWhenBranchMatchedException();
            }
            FaqFlowContract$Step.InboundCall.UseExistingTicket useExistingTicket = (FaqFlowContract$Step.InboundCall.UseExistingTicket) inboundCall;
            ((p0) jVar).h(useExistingTicket.f86185a, null, useExistingTicket.f86186b, null);
        }
        cVar.I2();
        return Unit.f186387a;
    }
}
