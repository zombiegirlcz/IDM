package zr;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f324510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f324511c;

    public /* synthetic */ h(FlowCollector flowCollector, k kVar, int i) {
        this.f324509a = i;
        this.f324510b = flowCollector;
        this.f324511c = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f324509a
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof zr.j
            if (r0 == 0) goto L18
            r0 = r6
            zr.j r0 = (zr.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            zr.j r0 = new zr.j
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            gr.r r5 = (gr.r) r5
            zr.k r6 = r4.f324511c
            cr.a r6 = r6.f324517b
            ur.d r5 = cr.a.a(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f324510b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4e:
            return r1
        L4f:
            boolean r0 = r6 instanceof zr.g
            if (r0 == 0) goto L62
            r0 = r6
            zr.g r0 = (zr.g) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L62
            int r1 = r1 - r2
            r0.v = r1
            goto L67
        L62:
            zr.g r0 = new zr.g
            r0.<init>(r4, r6)
        L67:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7e
            if (r2 != r3) goto L76
            yhm.o.b(r6)
            goto L96
        L76:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7e:
            yhm.o.b(r6)
            gr.r r5 = (gr.r) r5
            zr.k r6 = r4.f324511c
            cr.a r6 = r6.f324517b
            ur.d r5 = cr.a.a(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f324510b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L96
            goto L98
        L96:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
