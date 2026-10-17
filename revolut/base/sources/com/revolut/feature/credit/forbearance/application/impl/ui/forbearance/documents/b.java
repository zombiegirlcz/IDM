package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function1 {
    public List u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f69938w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.f69938w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f69938w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws yz4.c {
        /*
            r9 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.v
            com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c r2 = r9.f69938w
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r3) goto L17
            java.util.List r0 = r9.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r10)
            goto L79
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            yhm.o.b(r10)
            goto L4a
        L23:
            yhm.o.b(r10)
            rz4.b r10 = r2.f69942s
            java.lang.String r1 = r2.I2()
            w4l.h r6 = w4l.h.f294642c
            efm.r r10 = r10.b(r1, r6)
            efm.r r10 = zi0.c.J(r10)
            yw9.j r1 = new yw9.j
            r6 = 26
            r1.<init>(r6)
            efm.r r10 = m70.a.g(r10, r4, r1, r5)
            r9.v = r5
            java.lang.Object r10 = nim.a.c(r10, r9)
            if (r10 != r0) goto L4a
            goto L76
        L4a:
            java.util.List r10 = (java.util.List) r10
            l35.b r1 = r2.f69941r
            java.lang.String r6 = r2.I2()
            w4l.i r7 = w4l.i.f294643c
            y45.f r1 = (y45.f) r1
            efm.r r1 = r1.m(r6, r7)
            efm.r r1 = zi0.c.J(r1)
            yw9.j r6 = new yw9.j
            r7 = 27
            r6.<init>(r7)
            efm.r r1 = m70.a.g(r1, r4, r6, r5)
            r4 = r10
            java.util.List r4 = (java.util.List) r4
            r9.u = r4
            r9.v = r3
            java.lang.Object r1 = nim.a.c(r1, r9)
            if (r1 != r0) goto L77
        L76:
            return r0
        L77:
            r0 = r10
            r10 = r1
        L79:
            p35.e0 r10 = (p35.e0) r10
            p35.y0 r1 = r10.I
            com.revolut.feature.credit.loan.api.models.legacy.UnavailabilityReason r1 = r1.f
            kotlin.jvm.internal.Intrinsics.h(r0)
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto La5
            java.lang.Object r0 = zhm.d0.b0(r0)
            lz4.a r0 = (lz4.a) r0
            yki.i r3 = r2.v
            com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step$Documents r4 = new com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step$Documents
            java.lang.String r0 = r0.f200934a
            wi0.b r10 = r10.G
            r4.<init>(r0, r10)
            r7 = 0
            r8 = 12
            r5 = 0
            r6 = 0
            oki.h.t2(r2, r3, r4, r5, r6, r7, r8)
            goto La7
        La5:
            if (r1 != 0) goto Laa
        La7:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Laa:
            yz4.c r10 = new yz4.c
            r10.<init>(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
