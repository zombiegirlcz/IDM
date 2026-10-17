package vkm;

import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class g0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f290024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f290025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f290026c;

    public g0(Ref$IntRef ref$IntRef, int i, FlowCollector flowCollector) {
        this.f290024a = ref$IntRef;
        this.f290025b = i;
        this.f290026c = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vkm.f0
            if (r0 == 0) goto L13
            r0 = r7
            vkm.f0 r0 = (vkm.f0) r0
            int r1 = r0.f290019w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290019w = r1
            goto L18
        L13:
            vkm.f0 r0 = new vkm.f0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290019w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            kotlin.jvm.internal.Ref$IntRef r7 = r5.f290024a
            int r2 = r7.f186408a
            int r4 = r5.f290025b
            if (r2 < r4) goto L48
            r0.f290019w = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f290026c
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L48:
            int r2 = r2 + r3
            r7.f186408a = r2
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.g0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
