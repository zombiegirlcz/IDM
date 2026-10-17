package fli;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f135999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f136000c;

    public /* synthetic */ d(FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f135998a = i;
        this.f135999b = flowCollector;
        this.f136000c = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.f135998a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof vkm.b0
            if (r0 == 0) goto L18
            r0 = r7
            vkm.b0 r0 = (vkm.b0) r0
            int r1 = r0.f289996x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f289996x = r1
            goto L1d
        L18:
            vkm.b0 r0 = new vkm.b0
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289996x
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            fli.d r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r7 = move-exception
            goto L4d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            yhm.o.b(r7)
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f135999b     // Catch: java.lang.Throwable -> L4b
            r0.u = r5     // Catch: java.lang.Throwable -> L4b
            r0.f289996x = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r6 = r7.emit(r6, r0)     // Catch: java.lang.Throwable -> L4b
            if (r6 != r1) goto L48
            goto L4a
        L48:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L4a:
            return r1
        L4b:
            r7 = move-exception
            r6 = r5
        L4d:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r6.f136000c
            r6.f186409a = r7
            throw r7
        L52:
            boolean r0 = r7 instanceof fli.c
            if (r0 == 0) goto L65
            r0 = r7
            fli.c r0 = (fli.c) r0
            int r1 = r0.f135997x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f135997x = r1
            goto L6a
        L65:
            fli.c r0 = new fli.c
            r0.<init>(r5, r7)
        L6a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135997x
            kotlin.jvm.internal.Ref$ObjectRef r3 = r5.f136000c
            r4 = 1
            if (r2 == 0) goto L85
            if (r2 != r4) goto L7d
            java.lang.Object r6 = r0.u
            yhm.o.b(r7)
            goto L9c
        L7d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L85:
            yhm.o.b(r7)
            java.lang.Object r7 = r3.f186409a
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r7, r6)
            r0.u = r6
            r0.f135997x = r4
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f135999b
            java.lang.Object r7 = r7.emit(r2, r0)
            if (r7 != r1) goto L9c
            goto La0
        L9c:
            r3.f186409a = r6
            kotlin.Unit r1 = kotlin.Unit.f186387a
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fli.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
