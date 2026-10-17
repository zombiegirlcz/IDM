package nmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.n0;
import mmm.o0;
import mmm.q0;
import mmm.v0;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f217398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f217399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lal.a f217400c;

    public d(lal.a aVar) {
        this.f217400c = aVar;
        Socket socket = (Socket) aVar.f193426b;
        this.f217398a = socket.getOutputStream();
        this.f217399b = new k(socket);
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        OutputStream outputStream = this.f217398a;
        lal.a aVar = this.f217400c;
        k kVar = this.f217399b;
        kVar.j();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) aVar.f193427c;
            Socket socket = (Socket) aVar.f193426b;
            Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
                Unit unit = Unit.f186387a;
                if (kVar.k()) {
                    throw kVar.m(null);
                }
            }
        } catch (IOException e) {
            if (!kVar.k()) {
                throw e;
            }
            throw kVar.m(e);
        } finally {
            kVar.k();
        }
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() throws IOException {
        k kVar = this.f217399b;
        kVar.j();
        try {
            this.f217398a.flush();
            Unit unit = Unit.f186387a;
            if (kVar.k()) {
                throw kVar.m(null);
            }
        } catch (IOException e) {
            if (!kVar.k()) {
                throw e;
            }
            throw kVar.m(e);
        } finally {
            kVar.k();
        }
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return this.f217399b;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f217400c.f193426b) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // mmm.q0
    public final void write(mmm.h source, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        mmm.b.b(source.f207266b, 0L, j2);
        while (j2 > 0) {
            k kVar = this.f217399b;
            kVar.f();
            n0 n0Var = source.f207265a;
            Intrinsics.h(n0Var);
            int iMin = (int) Math.min(j2, n0Var.f207293c - n0Var.f207292b);
            kVar.j();
            try {
                try {
                    this.f217398a.write(n0Var.f207291a, n0Var.f207292b, iMin);
                    Unit unit = Unit.f186387a;
                    if (kVar.k()) {
                        throw kVar.m(null);
                    }
                    int i = n0Var.f207292b + iMin;
                    n0Var.f207292b = i;
                    long j3 = iMin;
                    j2 -= j3;
                    source.f207266b -= j3;
                    if (i == n0Var.f207293c) {
                        source.f207265a = n0Var.a();
                        o0.a(n0Var);
                    }
                } catch (IOException e) {
                    if (!kVar.k()) {
                        throw e;
                    }
                    throw kVar.m(e);
                }
            } catch (Throwable th10) {
                kVar.k();
                throw th10;
            }
        }
    }
}
