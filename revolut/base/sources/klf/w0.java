package klf;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f185594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tof.a3 f185595c;

    public /* synthetic */ w0(FlowCollector flowCollector, tof.a3 a3Var, int i) {
        this.f185593a = i;
        this.f185594b = flowCollector;
        this.f185595c = a3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f185593a
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof vkf.i
            if (r0 == 0) goto L18
            r0 = r6
            vkf.i r0 = (vkf.i) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            vkf.i r0 = new vkf.i
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            kof.e r5 = (kof.e) r5
            kotlin.Pair r6 = new kotlin.Pair
            tof.a3 r2 = r4.f185595c
            r6.<init>(r5, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f185594b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4d:
            return r1
        L4e:
            boolean r0 = r6 instanceof klf.v0
            if (r0 == 0) goto L61
            r0 = r6
            klf.v0 r0 = (klf.v0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L61
            int r1 = r1 - r2
            r0.v = r1
            goto L66
        L61:
            klf.v0 r0 = new klf.v0
            r0.<init>(r4, r6)
        L66:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7d
            if (r2 != r3) goto L75
            yhm.o.b(r6)
            goto L9a
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7d:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            cmf.d r6 = new cmf.d
            java.lang.Object r5 = r5.getContent()
            yk5.a r5 = (yk5.a) r5
            tof.a3 r2 = r4.f185595c
            r6.<init>(r2, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f185594b
            java.lang.Object r5 = r5.emit(r6, r0)
            if (r5 != r1) goto L9a
            goto L9c
        L9a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: klf.w0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
