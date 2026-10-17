package n18;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f211289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt0.b f211290c;

    public /* synthetic */ b(FlowCollector flowCollector, jt0.b bVar, int i) {
        this.f211288a = i;
        this.f211289b = flowCollector;
        this.f211290c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f211288a
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof n18.d
            if (r0 == 0) goto L18
            r0 = r6
            n18.d r0 = (n18.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            n18.d r0 = new n18.d
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            jt0.b r6 = r4.f211290c
            com.revolut.data.model.Data r5 = jt0.b.J(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f211289b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4c:
            return r1
        L4d:
            boolean r0 = r6 instanceof n18.a
            if (r0 == 0) goto L60
            r0 = r6
            n18.a r0 = (n18.a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L60
            int r1 = r1 - r2
            r0.v = r1
            goto L65
        L60:
            n18.a r0 = new n18.a
            r0.<init>(r4, r6)
        L65:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7c
            if (r2 != r3) goto L74
            yhm.o.b(r6)
            goto L92
        L74:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7c:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            jt0.b r6 = r4.f211290c
            com.revolut.data.model.Data r5 = jt0.b.J(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f211289b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L92
            goto L94
        L92:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n18.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
