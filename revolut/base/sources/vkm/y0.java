package vkm;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class y0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f290150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f290151c;

    public /* synthetic */ y0(Function2 function2, Ref$ObjectRef ref$ObjectRef, int i) {
        this.f290149a = i;
        this.f290150b = function2;
        this.f290151c = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            int r0 = r4.f290149a
            switch(r0) {
                case 0: goto L60;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof vkm.b1
            if (r0 == 0) goto L18
            r0 = r6
            vkm.b1 r0 = (vkm.b1) r0
            int r1 = r0.f289997w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f289997w = r1
            goto L1d
        L18:
            vkm.b1 r0 = new vkm.b1
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289997w
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f289999y
            vkm.y0 r0 = r0.u
            yhm.o.b(r6)
            goto L4b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            yhm.o.b(r6)
            r0.u = r4
            r0.f289999y = r5
            r0.f289997w = r3
            kotlin.jvm.functions.Function2 r6 = r4.f290150b
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L4a
            goto L55
        L4a:
            r0 = r4
        L4b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L56
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L55:
            return r1
        L56:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f290151c
            r6.f186409a = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        L60:
            boolean r0 = r6 instanceof vkm.x0
            if (r0 == 0) goto L73
            r0 = r6
            vkm.x0 r0 = (vkm.x0) r0
            int r1 = r0.f290142w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L73
            int r1 = r1 - r2
            r0.f290142w = r1
            goto L78
        L73:
            vkm.x0 r0 = new vkm.x0
            r0.<init>(r4, r6)
        L78:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290142w
            r3 = 1
            if (r2 == 0) goto L93
            if (r2 != r3) goto L8b
            java.lang.Object r5 = r0.f290144y
            vkm.y0 r0 = r0.u
            yhm.o.b(r6)
            goto La6
        L8b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L93:
            yhm.o.b(r6)
            r0.u = r4
            r0.f290144y = r5
            r0.f290142w = r3
            kotlin.jvm.functions.Function2 r6 = r4.f290150b
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto La5
            goto Lb0
        La5:
            r0 = r4
        La6:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto Lb1
            kotlin.Unit r1 = kotlin.Unit.f186387a
        Lb0:
            return r1
        Lb1:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f290151c
            r6.f186409a = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.y0.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
