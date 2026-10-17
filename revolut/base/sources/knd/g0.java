package knd;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f186077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gim.i f186078c;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(Flow flow, Function2 function2, int i) {
        this.f186076a = i;
        switch (i) {
            case 1:
                this.f186077b = flow;
                this.f186078c = (gim.i) function2;
                break;
            default:
                this.f186077b = flow;
                this.f186078c = (gim.i) function2;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.f186076a
            switch(r0) {
                case 0: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof vkm.l0
            if (r0 == 0) goto L18
            r0 = r7
            vkm.l0 r0 = (vkm.l0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            vkm.l0 r0 = new vkm.l0
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            aci.d r6 = r0.f290063x
            yhm.o.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2e
            goto L5c
        L2e:
            r7 = move-exception
            goto L51
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            yhm.o.b(r7)
            kotlinx.coroutines.flow.Flow r7 = r5.f186077b
            aci.d r2 = new aci.d
            gim.i r4 = r5.f186078c
            r2.<init>(r4, r6)
            r0.f290063x = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            r0.v = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4f
            if (r6 != r1) goto L5c
            goto L5e
        L4f:
            r7 = move-exception
            r6 = r2
        L51:
            java.lang.Object r1 = r7.f187936a
            if (r1 != r6) goto L5f
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            skm.e0.p(r6)
        L5c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5e:
            return r1
        L5f:
            throw r7
        L60:
            aci.d r0 = new aci.d
            gim.i r1 = r5.f186078c
            r2 = 2
            r0.<init>(r6, r1, r2)
            kotlinx.coroutines.flow.Flow r6 = r5.f186077b
            java.lang.Object r6 = r6.collect(r0, r7)
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            if (r6 != r7) goto L73
            goto L75
        L73:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L75:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: knd.g0.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
