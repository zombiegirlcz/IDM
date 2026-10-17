package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlm.a f163087a;
    private volatile m0 closed;

    public s0(jlm.a source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f163087a = source;
    }

    @Override // io.ktor.utils.io.t
    public final void a(Throwable th10) {
        if (this.closed != null) {
            return;
        }
        String message = th10.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new m0(new IOException(message, th10));
    }

    @Override // io.ktor.utils.io.t
    public final Throwable b() {
        m0 m0Var = this.closed;
        if (m0Var != null) {
            return m0Var.a(l0.f);
        }
        return null;
    }

    @Override // io.ktor.utils.io.t
    public final jlm.a c() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.f163087a;
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.t
    public final Object d(int i, gim.c cVar) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return Boolean.valueOf(this.f163087a.a(i));
        }
        throw thB;
    }

    @Override // io.ktor.utils.io.t
    public final boolean e() {
        return this.f163087a.J();
    }
}
