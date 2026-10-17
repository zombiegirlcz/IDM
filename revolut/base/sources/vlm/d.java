package vlm;

import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.k;
import mmm.s0;
import mmm.v0;
import okhttp3.ResponseBody;
import ulm.b1;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends ResponseBody implements s0 {
    public final b1 f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f290506h;

    public d(b1 b1Var, long j2) {
        this.f = b1Var;
        this.f290506h = j2;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f290506h;
    }

    @Override // okhttp3.ResponseBody
    public final b1 contentType() {
        return this.f;
    }

    @Override // mmm.s0
    public final long read(mmm.h sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // okhttp3.ResponseBody
    public final k source() {
        return u1.c(this);
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return v0.d;
    }
}
