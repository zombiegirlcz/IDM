package hmf;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f153740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f153741c;

    public /* synthetic */ f0(FlowCollector flowCollector, h0 h0Var, int i) {
        this.f153739a = i;
        this.f153740b = flowCollector;
        this.f153741c = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            int r0 = r7.f153739a
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            switch(r0) {
                case 0: goto L76;
                default: goto La;
            }
        La:
            boolean r0 = r9 instanceof hmf.g0
            if (r0 == 0) goto L1b
            r0 = r9
            hmf.g0 r0 = (hmf.g0) r0
            int r4 = r0.v
            r5 = r4 & r2
            if (r5 == 0) goto L1b
            int r4 = r4 - r2
            r0.v = r4
            goto L20
        L1b:
            hmf.g0 r0 = new hmf.g0
            r0.<init>(r7, r9)
        L20:
            java.lang.Object r9 = r0.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.v
            if (r4 == 0) goto L34
            if (r4 != r3) goto L2e
            yhm.o.b(r9)
            goto L73
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L34:
            yhm.o.b(r9)
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f153740b
            java.lang.String r8 = (java.lang.String) r8
            hmf.h0 r1 = r7.f153741c
            klf.h0 r1 = r1.f153774a
            r1.f185495l = r8
            hmf.h0 r1 = r7.f153741c
            java.util.Map r1 = r1.f153776c
            java.lang.Object r1 = r1.get(r8)
            phm.a r1 = (phm.a) r1
            if (r1 == 0) goto L55
            java.lang.Object r1 = r1.get()
            hmf.b0 r1 = (hmf.b0) r1
            if (r1 != 0) goto L6a
        L55:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            java.lang.String r5 = "Screen builder not found for key '"
            java.lang.String r6 = "'"
            java.lang.String r8 = p.a.p(r5, r8, r6)
            java.lang.String r5 = "TransactionDetailsScreenBuilderProvider"
            r6 = 0
            rd0.d.a(r4, r5, r8, r6, r1)
            r1 = r6
        L6a:
            r0.v = r3
            java.lang.Object r8 = r9.emit(r1, r0)
            if (r8 != r2) goto L73
            goto L75
        L73:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        L75:
            return r2
        L76:
            boolean r0 = r9 instanceof hmf.e0
            if (r0 == 0) goto L87
            r0 = r9
            hmf.e0 r0 = (hmf.e0) r0
            int r4 = r0.v
            r5 = r4 & r2
            if (r5 == 0) goto L87
            int r4 = r4 - r2
            r0.v = r4
            goto L8c
        L87:
            hmf.e0 r0 = new hmf.e0
            r0.<init>(r7, r9)
        L8c:
            java.lang.Object r9 = r0.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.v
            if (r4 == 0) goto La0
            if (r4 != r3) goto L9a
            yhm.o.b(r9)
            goto Lb8
        L9a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        La0:
            yhm.o.b(r9)
            kotlinx.coroutines.flow.FlowCollector r9 = r7.f153740b
            tof.a3 r8 = (tof.a3) r8
            hmf.h0 r1 = r7.f153741c
            zq.a r1 = r1.f153775b
            java.lang.String r8 = r1.D(r8)
            r0.v = r3
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r2) goto Lb8
            goto Lba
        Lb8:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hmf.f0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
