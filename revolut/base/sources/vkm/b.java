package vkm;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements Flow {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vkm.a
            if (r0 == 0) goto L13
            r0 = r7
            vkm.a r0 = (vkm.a) r0
            int r1 = r0.f289989x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289989x = r1
            goto L18
        L13:
            vkm.a r0 = new vkm.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289989x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wkm.t r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r7 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            wkm.t r7 = new wkm.t
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.u = r7     // Catch: java.lang.Throwable -> L51
            r0.f289989x = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r5.collectSafely(r7, r0)     // Catch: java.lang.Throwable -> L51
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r6 = r7
        L4b:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L51:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L55:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.b.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Object collectSafely(FlowCollector flowCollector, Continuation continuation);
}
