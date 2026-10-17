package amm;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import ulm.u0;
import ulm.x0;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends c {
    public long e;
    public final /* synthetic */ j f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, x0 url2, long j2) {
        super(jVar, url2);
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f = jVar;
        this.e = j2;
        if (j2 == 0) {
            d(u0.f281141b);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6491c) {
            return;
        }
        if (this.e != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!vlm.j.f(this)) {
                this.f.f6500b.b();
                d(j.f);
            }
        }
        this.f6491c = true;
    }

    @Override // amm.c, mmm.s0
    public final long read(mmm.h sink, long j2) throws ProtocolException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        if (this.f6491c) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.e;
        if (j3 == 0) {
            return -1L;
        }
        long j5 = super.read(sink, Math.min(j3, j2));
        if (j5 == -1) {
            this.f.f6500b.b();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            d(j.f);
            throw protocolException;
        }
        long j16 = this.e - j5;
        this.e = j16;
        if (j16 == 0) {
            d(u0.f281141b);
        }
        return j5;
    }
}
