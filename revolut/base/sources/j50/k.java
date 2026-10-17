package j50;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f171440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f171441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f171442c;
    public final dp6.a d;
    public final iyi.i e;
    public final iz1.g f;

    public k(dp6.a feedbackRepository, iyi.i jobRunner, iz1.g onStateChanged) {
        e initialState = e.f171428a;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        this.f171440a = new AtomicReference(initialState);
        this.f171441b = new AtomicBoolean(false);
        this.f171442c = new AtomicReference(f0.f322471a);
        this.d = feedbackRepository;
        this.e = jobRunner;
        this.f = onStateChanged;
    }

    public final void a() {
        if (this.f171441b.compareAndSet(false, true)) {
            this.e.invoke(new wm3.j(this, null, 26));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j50.g r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof j50.h
            if (r0 == 0) goto L13
            r0 = r6
            j50.h r0 = (j50.h) r0
            int r1 = r0.f171433x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171433x = r1
            goto L18
        L13:
            j50.h r0 = new j50.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171433x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            j50.g r5 = r0.u
            yhm.o.b(r6)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
            goto L55
        L29:
            r5 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            boolean r6 = r5 instanceof j50.f
            r2 = 0
            if (r6 == 0) goto L3f
            r6 = r5
            j50.f r6 = (j50.f) r6
            goto L40
        L3f:
            r6 = r2
        L40:
            if (r6 == 0) goto L44
            java.lang.String r2 = r6.f171429a
        L44:
            if (r2 == 0) goto L55
            dp6.a r6 = r4.d     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
            r0.u = r5     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
            r0.f171433x = r3     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
            lp6.m r6 = (lp6.m) r6     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
            if (r6 != r1) goto L55
            return r1
        L55:
            j50.e r5 = j50.e.f171428a     // Catch: java.util.concurrent.CancellationException -> L29 java.lang.Exception -> L57
        L57:
            return r5
        L58:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.k.b(j50.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j50.g r10, j50.b r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof j50.i
            if (r0 == 0) goto L14
            r0 = r12
            j50.i r0 = (j50.i) r0
            int r1 = r0.f171436y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f171436y = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            j50.i r0 = new j50.i
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f171434w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f171436y
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            j50.b r11 = r7.v
            j50.g r10 = r7.u
            yhm.o.b(r12)     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            goto L6a
        L2d:
            r0 = move-exception
            r10 = r0
            goto L7c
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            yhm.o.b(r12)
            dp6.a r1 = r9.d     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            r12 = r2
            yo6.d r2 = yo6.d.AIR_MESSAGE     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            java.util.UUID r3 = r11.f171424a     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            java.lang.String r3 = r3.toString()     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            boolean r4 = r11.f171425b     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            if (r4 == 0) goto L56
            yo6.e r4 = yo6.e.POSITIVE     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
        L51:
            int r4 = r4.b()     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            goto L59
        L56:
            yo6.e r4 = yo6.e.NEGATIVE     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            goto L51
        L59:
            r7.u = r10     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            r7.v = r11     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            r7.f171436y = r12     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            r5 = 0
            r6 = 0
            r8 = 32
            java.lang.Object r12 = dp6.a.b(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            if (r12 != r0) goto L6a
            return r0
        L6a:
            com.revolut.feature.feedback.api.domain.Feedback r12 = (com.revolut.feature.feedback.api.domain.Feedback) r12     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            java.lang.String r1 = r12.f73125a     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            boolean r3 = r11.f171425b     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            java.util.UUID r2 = r11.f171424a     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            j50.f r0 = new j50.f     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            zhm.f0 r4 = zhm.f0.f322471a     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L2d java.lang.Exception -> L7b
            return r0
        L7b:
            return r10
        L7c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.k.c(j50.g, j50.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j50.g r10, j50.c r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j50.k.d(j50.g, j50.c, gim.c):java.lang.Object");
    }

    public final void e(d newAction) {
        while (true) {
            AtomicReference atomicReference = this.f171442c;
            List currentQueue = (List) atomicReference.get();
            Intrinsics.h(currentQueue);
            Intrinsics.checkNotNullParameter(currentQueue, "currentQueue");
            Intrinsics.checkNotNullParameter(newAction, "newAction");
            ArrayList arrayListF0 = d0.F0(newAction, currentQueue);
            while (!atomicReference.compareAndSet(currentQueue, arrayListF0)) {
                if (atomicReference.get() != currentQueue) {
                    break;
                }
            }
            a();
            return;
        }
    }
}
