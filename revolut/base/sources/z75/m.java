package z75;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f319921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yx4.a f319922c;

    public /* synthetic */ m(FlowCollector flowCollector, yx4.a aVar, int i) {
        this.f319920a = i;
        this.f319921b = flowCollector;
        this.f319922c = aVar;
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
            int r0 = r4.f319920a
            switch(r0) {
                case 0: goto L4e;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof z75.n
            if (r0 == 0) goto L18
            r0 = r6
            z75.n r0 = (z75.n) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            z75.n r0 = new z75.n
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
            yx4.a r6 = r4.f319922c
            r6.getClass()
            yx4.b r5 = yx4.a.a(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f319921b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4d:
            return r1
        L4e:
            boolean r0 = r6 instanceof z75.l
            if (r0 == 0) goto L61
            r0 = r6
            z75.l r0 = (z75.l) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L61
            int r1 = r1 - r2
            r0.v = r1
            goto L66
        L61:
            z75.l r0 = new z75.l
            r0.<init>(r4, r6)
        L66:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L7d
            if (r2 != r3) goto L75
            yhm.o.b(r6)
            goto L94
        L75:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L7d:
            yhm.o.b(r6)
            yx4.a r6 = r4.f319922c
            r6.getClass()
            yx4.b r5 = yx4.a.a(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f319921b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L94
            goto L96
        L94:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z75.m.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
