package kq;

import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f188275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f188276c;

    public /* synthetic */ g(Flow flow, int i, int i2) {
        this.f188274a = i2;
        this.f188276c = flow;
        this.f188275b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            int r0 = r8.f188274a
            switch(r0) {
                case 0: goto L65;
                default: goto L5;
            }
        L5:
            boolean r0 = r10 instanceof vkm.j0
            if (r0 == 0) goto L18
            r0 = r10
            vkm.j0 r0 = (vkm.j0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            vkm.j0 r0 = new vkm.j0
            r0.<init>(r8, r10)
        L1d:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f290051x
            yhm.o.b(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2e
            goto L61
        L2e:
            r10 = move-exception
            goto L5d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yhm.o.b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlinx.coroutines.flow.Flow r4 = r8.f188276c     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            c2d.l0 r5 = new c2d.l0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            int r6 = r8.f188275b     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.f290051x = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            r0.v = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L59
            if (r9 != r1) goto L61
            goto L63
        L59:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L5d:
            java.lang.Object r0 = r10.f187936a
            if (r0 != r9) goto L64
        L61:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L63:
            return r1
        L64:
            throw r10
        L65:
            kotlinx.coroutines.flow.Flow r0 = r8.f188276c
            tnb.k r0 = (tnb.k) r0
            iw4.j r1 = new iw4.j
            int r2 = r8.f188275b
            r3 = 1
            r1.<init>(r9, r2, r3)
            java.lang.Object r9 = r0.collect(r1, r10)
            fim.a r10 = fim.a.COROUTINE_SUSPENDED
            if (r9 != r10) goto L7a
            goto L7c
        L7a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L7c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.g.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
