package ylm;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import mmm.s0;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends mmm.v {
    public final long d;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f314767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f314768h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f314769j;
    public final /* synthetic */ j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, s0 delegate, long j2, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.k = jVar;
        this.d = j2;
        this.f = z;
        this.f314768h = true;
        if (j2 == 0) {
            d(null);
        }
    }

    @Override // mmm.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f314769j) {
            return;
        }
        this.f314769j = true;
        try {
            super.close();
            d(null);
        } catch (IOException e) {
            IOException iOExceptionD = d(e);
            Intrinsics.h(iOExceptionD);
            throw iOExceptionD;
        }
    }

    public final IOException d(IOException iOException) {
        if (this.i) {
            return iOException;
        }
        this.i = true;
        j jVar = this.k;
        if (iOException == null && this.f314768h) {
            this.f314768h = false;
            jVar.f314771b.responseBodyStart(jVar.f314770a);
        }
        return j.a(jVar, this.f314767g, this.f, iOException, 8);
    }

    @Override // mmm.v, mmm.s0
    public final long read(mmm.h sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f314769j) {
            throw new IllegalStateException("closed");
        }
        try {
            long j3 = delegate().read(sink, j2);
            boolean z = this.f314768h;
            j jVar = this.k;
            if (z) {
                this.f314768h = false;
                jVar.f314771b.responseBodyStart(jVar.f314770a);
            }
            if (j3 == -1) {
                d(null);
                return -1L;
            }
            long j5 = this.f314767g + j3;
            long j16 = this.d;
            if (j16 == -1 || j5 <= j16) {
                this.f314767g = j5;
                if (jVar.d.i()) {
                    d(null);
                }
                return j3;
            }
            throw new ProtocolException("expected " + j16 + " bytes but received " + j5);
        } catch (IOException e) {
            IOException iOExceptionD = d(e);
            Intrinsics.h(iOExceptionD);
            throw iOExceptionD;
        }
    }
}
