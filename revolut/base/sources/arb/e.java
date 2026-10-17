package arb;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f8625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f8626c;

    public /* synthetic */ e(FlowCollector flowCollector, g gVar, int i) {
        this.f8624a = i;
        this.f8625b = flowCollector;
        this.f8626c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.f8624a
            arb.g r1 = r9.f8626c
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            switch(r0) {
                case 0: goto L77;
                default: goto Lc;
            }
        Lc:
            boolean r0 = r11 instanceof arb.f
            if (r0 == 0) goto L1d
            r0 = r11
            arb.f r0 = (arb.f) r0
            int r5 = r0.v
            r6 = r5 & r3
            if (r6 == 0) goto L1d
            int r5 = r5 - r3
            r0.v = r5
            goto L22
        L1d:
            arb.f r0 = new arb.f
            r0.<init>(r9, r11)
        L22:
            java.lang.Object r11 = r0.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r5 = r0.v
            r6 = 2
            r7 = 0
            if (r5 == 0) goto L42
            if (r5 == r4) goto L3a
            if (r5 != r6) goto L34
            yhm.o.b(r11)
            goto L74
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        L3a:
            int r10 = r0.f8629y
            kotlinx.coroutines.flow.FlowCollector r1 = r0.f8628x
            yhm.o.b(r11)
            goto L67
        L42:
            yhm.o.b(r11)
            java.lang.String r10 = (java.lang.String) r10
            brb.e r10 = r1.f8632c
            kotlinx.coroutines.flow.FlowCollector r1 = r9.f8625b
            r0.f8628x = r1
            r11 = 0
            r0.f8629y = r11
            r0.v = r4
            bf5.a r2 = new bf5.a
            r4 = 29
            r2.<init>(r10, r7, r4)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)
            if (r10 != r3) goto L64
            goto L76
        L64:
            r8 = r11
            r11 = r10
            r10 = r8
        L67:
            r0.f8628x = r7
            r0.f8629y = r10
            r0.v = r6
            java.lang.Object r10 = r1.emit(r11, r0)
            if (r10 != r3) goto L74
            goto L76
        L74:
            kotlin.Unit r3 = kotlin.Unit.f186387a
        L76:
            return r3
        L77:
            boolean r0 = r11 instanceof arb.d
            if (r0 == 0) goto L88
            r0 = r11
            arb.d r0 = (arb.d) r0
            int r5 = r0.v
            r6 = r5 & r3
            if (r6 == 0) goto L88
            int r5 = r5 - r3
            r0.v = r5
            goto L8d
        L88:
            arb.d r0 = new arb.d
            r0.<init>(r9, r11)
        L8d:
            java.lang.Object r11 = r0.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r0 = r0.v
            if (r0 == 0) goto La1
            if (r0 != r4) goto L9b
            yhm.o.b(r11)
            goto Lab
        L9b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r2)
            throw r10
        La1:
            yhm.o.b(r11)
            java.lang.String r10 = (java.lang.String) r10
            ate.e r11 = r1.f8631b
            r11.a(r10)
        Lab:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: arb.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
