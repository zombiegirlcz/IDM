package wem;

import io.ktor.utils.io.l0;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.t;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import skm.b0;
import skm.e0;
import skm.g1;
import skm.h1;

/* JADX INFO: loaded from: classes23.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlm.b f296833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f296834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f296835c;
    public final jlm.a d;
    public final h1 e;
    public final CoroutineContext f;

    public c(jlm.b source, CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f296833a = source;
        this.f296834b = parent;
        this.d = new jlm.a();
        h1 h1Var = new h1((Job) parent.get(g1.f263979a));
        this.e = h1Var;
        this.f = parent.plus(h1Var).plus(new b0("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.t
    public final void a(Throwable th10) throws IOException {
        if (this.f296835c != null) {
            return;
        }
        String message = th10.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        e0.l(this.e, message, th10);
        this.f296833a.close();
        String message2 = th10.getMessage();
        this.f296835c = new m0(new IOException(message2 != null ? message2 : "Channel was cancelled", th10));
    }

    @Override // io.ktor.utils.io.t
    public final Throwable b() {
        m0 m0Var = this.f296835c;
        if (m0Var != null) {
            return m0Var.a(l0.f);
        }
        return null;
    }

    @Override // io.ktor.utils.io.t
    public final jlm.a c() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wem.b
            if (r0 == 0) goto L13
            r0 = r6
            wem.b r0 = (wem.b) r0
            int r1 = r0.f296832x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296832x = r1
            goto L18
        L13:
            wem.b r0 = new wem.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296832x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.u
            yhm.o.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            io.ktor.utils.io.m0 r6 = r4.f296835c
            if (r6 == 0) goto L3b
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L3b:
            wem.a r6 = new wem.a
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.u = r5
            r0.f296832x = r3
            kotlin.coroutines.CoroutineContext r2 = r4.f
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            jlm.a r6 = r4.d
            long r0 = a1m.e.x(r6)
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L5a
            goto L5b
        L5a:
            r3 = 0
        L5b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wem.c.d(int, gim.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.t
    public final boolean e() {
        return this.f296835c != null && this.d.J();
    }
}
