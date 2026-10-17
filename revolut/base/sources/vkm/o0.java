package vkm;

import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class o0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gim.i f290085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f290086b;

    /* JADX WARN: Multi-variable type inference failed */
    public o0(Function3 function3, FlowCollector flowCollector) {
        this.f290085a = (gim.i) function3;
        this.f290086b = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vkm.n0
            if (r0 == 0) goto L13
            r0 = r6
            vkm.n0 r0 = (vkm.n0) r0
            int r1 = r0.f290078w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290078w = r1
            goto L18
        L13:
            vkm.n0 r0 = new vkm.n0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290078w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vkm.o0 r5 = r0.u
            yhm.o.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r4
            r0.f290078w = r3
            gim.i r6 = r4.f290085a
            kotlinx.coroutines.flow.FlowCollector r2 = r4.f290086b
            java.lang.Object r6 = r6.invoke(r2, r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4f:
            kotlinx.coroutines.flow.internal.AbortFlowException r6 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.o0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
