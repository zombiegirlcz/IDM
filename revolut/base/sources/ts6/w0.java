package ts6;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f274034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f274035c;

    public /* synthetic */ w0(FlowCollector flowCollector, t0 t0Var, int i) {
        this.f274033a = i;
        this.f274034b = flowCollector;
        this.f274035c = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f274033a
            switch(r0) {
                case 0: goto L50;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof ts6.x0
            if (r0 == 0) goto L18
            r0 = r6
            ts6.x0 r0 = (ts6.x0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            ts6.x0 r0 = new ts6.x0
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            jf0.c r5 = (jf0.c) r5
            ts6.t0 r6 = r4.f274035c
            r6.getClass()
            tr6.a r5 = ts6.t0.c(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f274034b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4f:
            return r1
        L50:
            boolean r0 = r6 instanceof ts6.v0
            if (r0 == 0) goto L63
            r0 = r6
            ts6.v0 r0 = (ts6.v0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L63
            int r1 = r1 - r2
            r0.v = r1
            goto L68
        L63:
            ts6.v0 r0 = new ts6.v0
            r0.<init>(r4, r6)
        L68:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7f
            if (r2 != r3) goto L77
            yhm.o.b(r6)
            goto Lad
        L77:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7f:
            yhm.o.b(r6)
            r6 = r5
            jf0.c r6 = (jf0.c) r6
            ts6.t0 r2 = r4.f274035c
            r2.getClass()
            java.lang.String r2 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            boolean r2 = ts6.t0.a(r6)
            if (r2 == 0) goto Lad
            r2 = 2
            java.lang.String r6 = r6.e(r2)
            java.lang.String r2 = "join"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto Lad
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f274034b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto Lad
            goto Laf
        Lad:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ts6.w0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
