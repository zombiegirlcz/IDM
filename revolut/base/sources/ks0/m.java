package ks0;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f189082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189083c;

    public /* synthetic */ m(Object obj2, int i, int i2) {
        this.f189081a = i2;
        this.f189083c = obj2;
        this.f189082b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.f189081a
            switch(r0) {
                case 0: goto L5e;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof wkm.m
            if (r0 == 0) goto L18
            r0 = r8
            wkm.m r0 = (wkm.m) r0
            int r1 = r0.f298321w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f298321w = r1
            goto L1d
        L18:
            wkm.m r0 = new wkm.m
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298321w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r8)
            goto L5b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            goto L52
        L3b:
            yhm.o.b(r8)
            java.lang.Object r8 = r6.f189083c
            ukm.q r8 = (ukm.q) r8
            kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
            int r5 = r6.f189082b
            r2.<init>(r5, r7)
            r0.f298321w = r4
            java.lang.Object r7 = r8.send(r2, r0)
            if (r7 != r1) goto L52
            goto L5d
        L52:
            r0.f298321w = r3
            java.lang.Object r7 = do3.q.J(r0)
            if (r7 != r1) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5d:
            return r1
        L5e:
            java.lang.Object r8 = r6.f189083c
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Integer r0 = new java.lang.Integer
            int r1 = r6.f189082b
            r0.<init>(r1)
            r8.invoke(r0, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ks0.m.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
