package cli;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f25022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f25023c;

    public /* synthetic */ e(FlowCollector flowCollector, n nVar, int i) {
        this.f25021a = i;
        this.f25022b = flowCollector;
        this.f25023c = nVar;
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
            int r0 = r4.f25021a
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof cli.f
            if (r0 == 0) goto L18
            r0 = r6
            cli.f r0 = (cli.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            cli.f r0 = new cli.f
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
            cli.j r5 = (cli.j) r5
            cli.n r6 = r4.f25023c
            cli.o r5 = r6.c(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f25022b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4c:
            return r1
        L4d:
            boolean r0 = r6 instanceof cli.d
            if (r0 == 0) goto L60
            r0 = r6
            cli.d r0 = (cli.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L60
            int r1 = r1 - r2
            r0.v = r1
            goto L65
        L60:
            cli.d r0 = new cli.d
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
            cli.j r5 = (cli.j) r5
            cli.n r6 = r4.f25023c
            cli.o r5 = r6.c(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f25022b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L92
            goto L94
        L92:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cli.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
