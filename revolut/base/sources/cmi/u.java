package cmi;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    @NotNull
    private static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f25304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f25305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f25306c;
    public volatile h0 d;
    public volatile e e;

    public u(z stateStorage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(stateStorage, "stateStorage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f25304a = stateStorage;
        this.f25305b = appCoroutineScope;
        this.f25306c = hlm.d.a();
        this.e = c.f25270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:28:0x006d, B:30:0x0075, B:33:0x007c), top: B:38:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof cmi.p
            if (r0 == 0) goto L13
            r0 = r8
            cmi.p r0 = (cmi.p) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            cmi.p r0 = new cmi.p
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f25297x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            hlm.c r1 = r0.f25296w
            cmi.e r2 = r0.v
            skm.g0 r0 = r0.u
            yhm.o.b(r8)
            goto L6d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            skm.g0 r2 = r0.u
            yhm.o.b(r8)
            goto L57
        L3f:
            yhm.o.b(r8)
            skm.h0 r8 = r7.d
            if (r8 != 0) goto L49
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L49:
            r0.u = r8
            r0.z = r4
            java.lang.Object r2 = r8.y(r0)
            if (r2 != r1) goto L54
            goto L69
        L54:
            r6 = r2
            r2 = r8
            r8 = r6
        L57:
            cmi.e r8 = (cmi.e) r8
            hlm.c r4 = r7.f25306c
            r0.u = r2
            r0.v = r8
            r0.f25296w = r4
            r0.z = r3
            java.lang.Object r0 = r4.lock(r5, r0)
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            r0 = r2
            r1 = r4
            r2 = r8
        L6d:
            skm.h0 r8 = r7.d     // Catch: java.lang.Throwable -> L7a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r0)     // Catch: java.lang.Throwable -> L7a
            if (r8 == 0) goto L7c
            r7.d = r5     // Catch: java.lang.Throwable -> L7a
            r7.e = r2     // Catch: java.lang.Throwable -> L7a
            goto L7c
        L7a:
            r8 = move-exception
            goto L84
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L7a
            r1.unlock(r5)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L84:
            r1.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.u.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r5.f25304a.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cmi.q
            if (r0 == 0) goto L13
            r0 = r6
            cmi.q r0 = (cmi.q) r0
            int r1 = r0.f25299w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25299w = r1
            goto L18
        L13:
            cmi.q r0 = new cmi.q
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25299w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f25299w = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 != r1) goto L42
            goto L4c
        L42:
            r0.f25299w = r3
            cmi.z r6 = r5.f25304a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4d
        L4c:
            return r1
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.u.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cmi.s
            if (r0 == 0) goto L13
            r0 = r6
            cmi.s r0 = (cmi.s) r0
            int r1 = r0.f25302x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25302x = r1
            goto L18
        L13:
            cmi.s r0 = new cmi.s
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25302x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            hlm.c r0 = r0.u
            yhm.o.b(r6)
            goto L43
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            hlm.c r6 = r5.f25306c
            r0.u = r6
            r0.f25302x = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L42
            return r1
        L42:
            r0 = r6
        L43:
            skm.h0 r6 = r5.d     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L4d
            r6.f(r4)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r6 = move-exception
            goto L59
        L4d:
            r5.d = r4     // Catch: java.lang.Throwable -> L4b
            cmi.c r6 = cmi.c.f25270a     // Catch: java.lang.Throwable -> L4b
            r5.e = r6     // Catch: java.lang.Throwable -> L4b
            kotlin.Unit r6 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L4b
            r0.unlock(r4)
            return r6
        L59:
            r0.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.u.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cmi.t
            if (r0 == 0) goto L13
            r0 = r5
            cmi.t r0 = (cmi.t) r0
            int r1 = r0.f25303w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25303w = r1
            goto L18
        L13:
            cmi.t r0 = new cmi.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25303w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f25303w = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cmi.e r5 = r4.e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cmi.u.d(gim.c):java.lang.Object");
    }
}
