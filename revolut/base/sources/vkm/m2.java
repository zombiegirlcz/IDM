package vkm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class m2 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f290075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gim.i f290076b;

    /* JADX WARN: Multi-variable type inference failed */
    public m2(Function2 function2, FlowCollector flowCollector) {
        this.f290075a = flowCollector;
        this.f290076b = (gim.i) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (((vkm.m2) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [gim.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [gim.i, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof vkm.l2
            if (r0 == 0) goto L13
            r0 = r7
            vkm.l2 r0 = (vkm.l2) r0
            int r1 = r0.f290067y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f290067y = r1
            goto L18
        L13:
            vkm.l2 r0 = new vkm.l2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f290065w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f290067y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L73
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            wkm.t r2 = r0.v
            vkm.m2 r4 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L3a:
            r7 = move-exception
            goto L79
        L3c:
            yhm.o.b(r7)
            wkm.t r2 = new wkm.t
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f290075a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            gim.i r7 = r6.f290076b     // Catch: java.lang.Throwable -> L3a
            r0.u = r6     // Catch: java.lang.Throwable -> L3a
            r0.v = r2     // Catch: java.lang.Throwable -> L3a
            r0.f290067y = r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3a
            if (r7 != r1) goto L59
            goto L72
        L59:
            r4 = r6
        L5a:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector r7 = r4.f290075a
            boolean r2 = r7 instanceof vkm.m2
            if (r2 == 0) goto L76
            vkm.m2 r7 = (vkm.m2) r7
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f290067y = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L76:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L79:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.m2.a(gim.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        return this.f290075a.emit(obj2, continuation);
    }
}
