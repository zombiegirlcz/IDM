package jie;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f174466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f174467c;

    public /* synthetic */ c(FlowCollector flowCollector, f fVar, int i) {
        this.f174465a = i;
        this.f174466b = flowCollector;
        this.f174467c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f174465a
            switch(r0) {
                case 0: goto L4f;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof jie.e
            if (r0 == 0) goto L18
            r0 = r6
            jie.e r0 = (jie.e) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            jie.e r0 = new jie.e
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
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            jie.f r6 = r4.f174467c
            zjh.j r6 = r6.f174472c
            java.util.List r5 = zjh.j.v(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f174466b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4c
            goto L4e
        L4c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4e:
            return r1
        L4f:
            boolean r0 = r6 instanceof jie.b
            if (r0 == 0) goto L62
            r0 = r6
            jie.b r0 = (jie.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L62
            int r1 = r1 - r2
            r0.v = r1
            goto L67
        L62:
            jie.b r0 = new jie.b
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
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            jie.f r6 = r4.f174467c
            zjh.j r6 = r6.f174472c
            java.util.List r5 = zjh.j.v(r6, r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f174466b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L96
            goto L98
        L96:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jie.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
