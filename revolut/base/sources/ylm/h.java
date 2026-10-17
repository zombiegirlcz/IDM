package ylm;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import mmm.q0;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends mmm.u {
    public final long d;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f314764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f314765h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f314766j;
    public final /* synthetic */ j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, q0 delegate, long j2, boolean z) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.k = jVar;
        this.d = j2;
        this.f = z;
        this.i = z;
    }

    @Override // mmm.u, mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f314766j) {
            return;
        }
        this.f314766j = true;
        long j2 = this.d;
        if (j2 != -1 && this.f314765h != j2) {
            throw new ProtocolException("unexpected end of stream");
        }
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
        if (this.f314764g) {
            return iOException;
        }
        this.f314764g = true;
        return j.a(this.k, this.f314765h, this.f, iOException, 4);
    }

    @Override // mmm.u, mmm.q0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            IOException iOExceptionD = d(e);
            Intrinsics.h(iOExceptionD);
            throw iOExceptionD;
        }
    }

    @Override // mmm.u, mmm.q0
    public final void write(mmm.h source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f314766j) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.d;
        if (j3 != -1 && this.f314765h + j2 > j3) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j3, "expected ", " bytes but received ");
            sbV.append(this.f314765h + j2);
            throw new ProtocolException(sbV.toString());
        }
        try {
            if (this.i) {
                this.i = false;
                j jVar = this.k;
                jVar.f314771b.requestBodyStart(jVar.f314770a);
            }
            super.write(source, j2);
            this.f314765h += j2;
        } catch (IOException e) {
            IOException iOExceptionD = d(e);
            Intrinsics.h(iOExceptionD);
            throw iOExceptionD;
        }
    }
}
