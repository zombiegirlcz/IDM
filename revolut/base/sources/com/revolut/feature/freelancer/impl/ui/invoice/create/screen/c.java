package com.revolut.feature.freelancer.impl.ui.invoice.create.screen;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import gim.i;
import ix6.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerInvoice freelancerInvoice;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        q qVar = (q) data.getContent();
        String str = (qVar == null || (freelancerInvoice = qVar.f169408a) == null) ? null : freelancerInvoice.v;
        g gVar = this.v;
        gVar.H2(gVar.z, new bba.q(str, data, 3));
        return Unit.f186387a;
    }
}
