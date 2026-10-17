package wlm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import mmm.k0;
import mmm.s0;
import mmm.v0;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f298532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mmm.k f298533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f298534c;
    public final /* synthetic */ k0 d;

    public b(mmm.k kVar, d dVar, k0 k0Var) {
        this.f298533b = kVar;
        this.f298534c = dVar;
        this.d = k0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f298532a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!vlm.j.f(this)) {
                this.f298532a = true;
                ((ulm.j) this.f298534c).a();
            }
        }
        this.f298533b.close();
    }

    @Override // mmm.s0
    public final long read(mmm.h sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long j3 = this.f298533b.read(sink, j2);
            k0 k0Var = this.d;
            if (j3 != -1) {
                sink.i(k0Var.f207280b, sink.f207266b - j3, j3);
                k0Var.d();
                return j3;
            }
            if (!this.f298532a) {
                this.f298532a = true;
                k0Var.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.f298532a) {
                throw e;
            }
            this.f298532a = true;
            ((ulm.j) this.f298534c).a();
            throw e;
        }
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f298533b.timeout();
    }
}
