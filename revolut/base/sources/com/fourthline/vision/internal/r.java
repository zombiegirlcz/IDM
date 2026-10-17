package com.fourthline.vision.internal;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class r extends vkm.b implements Closeable, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ukm.u f36742a = vc.s.a(0, null, null, 7);

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36745c;
        int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36745c = obj2;
            this.e |= Integer.MIN_VALUE;
            return r.collectSafely$suspendImpl(r.this, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.fourthline.vision.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.fourthline.vision.internal.r] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fourthline.vision.internal.r] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object collectSafely$suspendImpl(com.fourthline.vision.internal.r r4, kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof com.fourthline.vision.internal.r.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.vision.internal.r$a r0 = (com.fourthline.vision.internal.r.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.vision.internal.r$a r0 = new com.fourthline.vision.internal.r$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36745c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f36744b
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r4 = r0.f36743a
            com.fourthline.vision.internal.r r4 = (com.fourthline.vision.internal.r) r4
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2f
            goto L54
        L2f:
            r5 = move-exception
            goto L5a
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            yhm.o.b(r6)
            r4.onStart()
            ukm.u r6 = r4.f36742a     // Catch: java.lang.Throwable -> L2f
            vkm.e r2 = new vkm.e     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L2f
            r0.f36743a = r4     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            r0.f36744b = r6     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = vkm.q.u(r5, r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r5 != r1) goto L54
            return r1
        L54:
            r4.onStop()
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L5a:
            r4.onStop()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.r.collectSafely$suspendImpl(com.fourthline.vision.internal.r, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36742a.close(null);
        skm.e0.k(this, null);
    }

    @Override // vkm.b
    public Object collectSafely(@NotNull FlowCollector flowCollector, @NotNull Continuation<? super Unit> continuation) {
        return collectSafely$suspendImpl(this, flowCollector, continuation);
    }

    public final Object emit(Object obj2, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.f36742a.send(obj2, continuation);
        return objSend == fim.a.COROUTINE_SUSPENDED ? objSend : Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public abstract /* synthetic */ CoroutineContext getF74819h();

    public abstract void onStart();

    public abstract void onStop();
}
