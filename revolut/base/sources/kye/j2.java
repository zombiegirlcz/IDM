package kye;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class j2 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f190754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3 f190755c;

    public /* synthetic */ j2(FlowCollector flowCollector, k3 k3Var, int i) {
        this.f190753a = i;
        this.f190754b = flowCollector;
        this.f190755c = k3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f190753a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof kye.n2
            if (r0 == 0) goto L18
            r0 = r6
            kye.n2 r0 = (kye.n2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            kye.n2 r0 = new kye.n2
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            r6 = r5
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r6 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod) r6
            if (r6 == 0) goto L4f
            kye.k3 r2 = r4.f190755c
            boolean r6 = kye.k3.M2(r2, r6)
            if (r6 == 0) goto L4f
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f190754b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4f
            goto L51
        L4f:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L51:
            return r1
        L52:
            boolean r0 = r6 instanceof kye.i2
            if (r0 == 0) goto L65
            r0 = r6
            kye.i2 r0 = (kye.i2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.v = r1
            goto L6a
        L65:
            kye.i2 r0 = new kye.i2
            r0.<init>(r4, r6)
        L6a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L81
            if (r2 != r3) goto L79
            yhm.o.b(r6)
            goto La0
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L81:
            yhm.o.b(r6)
            r6 = r5
            yhm.r r6 = (yhm.r) r6
            java.lang.Object r6 = r6.f314201a
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r6 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod) r6
            if (r6 == 0) goto La0
            kye.k3 r2 = r4.f190755c
            boolean r6 = kye.k3.M2(r2, r6)
            if (r6 == 0) goto La0
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f190754b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto La0
            goto La2
        La0:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.j2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
