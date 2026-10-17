package bmm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import mmm.s0;
import mmm.v0;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.k f16983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16985c;
    public int d;
    public int e;
    public int f;

    public y(mmm.k source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f16983a = source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // mmm.s0
    public final long read(mmm.h sink, long j2) throws IOException {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i3 = this.e;
            mmm.k kVar = this.f16983a;
            if (i3 == 0) {
                kVar.skip(this.f);
                this.f = 0;
                if ((this.f16985c & 4) == 0) {
                    i = this.d;
                    int iX = vlm.h.x(kVar);
                    this.e = iX;
                    this.f16984b = iX;
                    int iB = vlm.h.b(kVar.readByte());
                    this.f16985c = vlm.h.b(kVar.readByte());
                    z.Companion.getClass();
                    Logger logger = z.d;
                    if (logger.isLoggable(Level.FINE)) {
                        mmm.m mVar = i.f16929a;
                        logger.fine(i.b(this.d, this.f16984b, iB, this.f16985c, true));
                    }
                    i2 = kVar.readInt() & Integer.MAX_VALUE;
                    this.d = i2;
                    if (iB != 9) {
                        throw new IOException(a0.d.h(iB, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long j3 = kVar.read(sink, Math.min(j2, i3));
                if (j3 != -1) {
                    this.e -= (int) j3;
                    return j3;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f16983a.timeout();
    }
}
