package com.revolut.feature.freelancer.impl.ui.invoice.templates.details;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f73955w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f73955w = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f73955w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r2 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (((com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate) r2) == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0143, code lost:
    
        if (r2 == r5) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
    
        if (((com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate) r2) == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014b, code lost:
    
        r1.B2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
    
        return kotlin.Unit.f186387a;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.invoice.templates.details.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
