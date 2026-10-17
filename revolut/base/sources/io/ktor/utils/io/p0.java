package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f163074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jlm.a f163075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f163076c;
    public long d;

    public p0(t delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f163074a = delegate;
        this.f163075b = new jlm.a();
    }

    @Override // io.ktor.utils.io.t
    public final void a(Throwable th10) {
        this.f163074a.a(th10);
    }

    @Override // io.ktor.utils.io.t
    public final Throwable b() {
        return this.f163074a.b();
    }

    @Override // io.ktor.utils.io.t
    public final jlm.a c() {
        f();
        return this.f163075b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.o0
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.o0 r0 = (io.ktor.utils.io.o0) r0
            int r1 = r0.f163071w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f163071w = r1
            goto L18
        L13:
            io.ktor.utils.io.o0 r0 = new io.ktor.utils.io.o0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f163071w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L4c
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            r8.f()
            jlm.a r10 = r8.f163075b
            long r4 = r10.f175871c
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L41
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L41:
            r0.f163071w = r3
            io.ktor.utils.io.t r10 = r8.f163074a
            java.lang.Object r10 = r10.d(r9, r0)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L5a
            r8.f()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L5a:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.p0.d(int, gim.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.t
    public final boolean e() {
        return this.f163075b.J() && this.f163074a.e();
    }

    public final void f() {
        g();
        this.f163076c += this.f163075b.h(this.f163074a.c());
    }

    public final void g() {
        long j2 = this.d;
        long j3 = this.f163076c;
        long j5 = this.f163075b.f175871c;
        this.d = j2 + (j3 - j5);
        this.f163076c = j5;
    }
}
