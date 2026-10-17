package amm;

import kotlin.jvm.internal.Intrinsics;
import ulm.u0;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends c {
    public boolean e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6491c) {
            return;
        }
        if (!this.e) {
            d(j.f);
        }
        this.f6491c = true;
    }

    @Override // amm.c, mmm.s0
    public final long read(mmm.h sink, long j2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        if (this.f6491c) {
            throw new IllegalStateException("closed");
        }
        if (this.e) {
            return -1L;
        }
        long j3 = super.read(sink, j2);
        if (j3 != -1) {
            return j3;
        }
        this.e = true;
        d(u0.f281141b);
        return -1L;
    }
}
