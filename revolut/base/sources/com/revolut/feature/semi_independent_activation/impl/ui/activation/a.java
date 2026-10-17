package com.revolut.feature.semi_independent_activation.impl.ui.activation;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f85974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f85974w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f85974w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r9 == r3) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            com.revolut.feature.semi_independent_activation.impl.ui.activation.b r0 = r8.v
            com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$InputData r1 = r0.o
            p0d.e r2 = r0.f85975p
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L22
            if (r4 == r6) goto L1e
            if (r4 != r5) goto L16
            yhm.o.b(r9)
            goto L55
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            yhm.o.b(r9)
            goto L42
        L22:
            yhm.o.b(r9)
            r8.u = r6
            java.lang.String r9 = r1.f85970a
            w4l.j r4 = w4l.j.f294644c
            akg.n r9 = r2.c(r9, r4)
            pyb.g r4 = new pyb.g
            r7 = 20
            r4.<init>(r7)
            r7 = 0
            jhi.b r9 = mo3.a.g(r9, r7, r4, r6)
            java.lang.Object r9 = vkm.q.x(r9, r8)
            if (r9 != r3) goto L42
            goto L54
        L42:
            j0d.q r9 = (j0d.q) r9
            java.lang.String r9 = r9.d
            if (r9 != 0) goto L57
            java.lang.String r9 = r1.f85970a
            r8.u = r5
            java.lang.String r1 = r8.f85974w
            java.lang.Object r9 = r2.a(r9, r1, r8)
            if (r9 != r3) goto L55
        L54:
            return r3
        L55:
            java.lang.String r9 = (java.lang.String) r9
        L57:
            yki.a r1 = r0.f85977r
            com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$Step$Workflow r2 = new com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$Step$Workflow
            r2.<init>(r9)
            r5 = 0
            r6 = 12
            r3 = 1
            r4 = 0
            oki.h.t2(r0, r1, r2, r3, r4, r5, r6)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.semi_independent_activation.impl.ui.activation.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
