package klf;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f185585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f185586c;

    public /* synthetic */ v(FlowCollector flowCollector, h0 h0Var, int i) {
        this.f185584a = i;
        this.f185585b = flowCollector;
        this.f185586c = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f185584a
            switch(r0) {
                case 0: goto L5b;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof klf.f0
            if (r0 == 0) goto L18
            r0 = r6
            klf.f0 r0 = (klf.f0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            klf.f0 r0 = new klf.f0
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L58
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L4c
            klf.h0 r6 = r4.f185586c
            klf.e0 r2 = klf.e0.f185470a
            java.lang.Object r5 = klf.h0.a(r6, r5, r2)
            tof.a3 r5 = (tof.a3) r5
            goto L4d
        L4c:
            r5 = 0
        L4d:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f185585b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5a:
            return r1
        L5b:
            boolean r0 = r6 instanceof klf.u
            if (r0 == 0) goto L6e
            r0 = r6
            klf.u r0 = (klf.u) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L6e
            int r1 = r1 - r2
            r0.v = r1
            goto L73
        L6e:
            klf.u r0 = new klf.u
            r0.<init>(r4, r6)
        L73:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L8a
            if (r2 != r3) goto L82
            yhm.o.b(r6)
            goto Lae
        L82:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L8a:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r5 = r5.getContent()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto La2
            klf.h0 r6 = r4.f185586c
            klf.t r2 = klf.t.f185576a
            java.lang.Object r5 = klf.h0.a(r6, r5, r2)
            tof.t3 r5 = (tof.t3) r5
            goto La3
        La2:
            r5 = 0
        La3:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f185585b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto Lae
            goto Lb0
        Lae:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: klf.v.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
