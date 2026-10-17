package nmm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.n0;
import mmm.o0;
import mmm.s0;
import mmm.v0;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f217401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f217402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lal.a f217403c;

    public e(lal.a aVar) {
        this.f217403c = aVar;
        Socket socket = (Socket) aVar.f193426b;
        this.f217401a = socket.getInputStream();
        this.f217402b = new k(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        lal.a aVar = this.f217403c;
        k kVar = this.f217402b;
        kVar.j();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) aVar.f193427c;
            Socket socket = (Socket) aVar.f193426b;
            Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f217401a.close();
                    }
                }
                Unit unit = Unit.f186387a;
                if (kVar.k()) {
                    throw kVar.m(null);
                }
                return;
            }
            return;
        } catch (IOException e) {
            if (!kVar.k()) {
                throw e;
            }
            throw kVar.m(e);
        } finally {
            kVar.k();
        }
        kVar.k();
    }

    @Override // mmm.s0
    public final long read(mmm.h sink, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j2 == 0) {
            return 0L;
        }
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        k kVar = this.f217402b;
        kVar.f();
        n0 n0VarU = sink.u(1);
        int iMin = (int) Math.min(j2, 8192 - n0VarU.f207293c);
        try {
            kVar.j();
            try {
                int i = this.f217401a.read(n0VarU.f207291a, n0VarU.f207293c, iMin);
                if (kVar.k()) {
                    throw kVar.m(null);
                }
                if (i != -1) {
                    n0VarU.f207293c += i;
                    long j3 = i;
                    sink.f207266b += j3;
                    return j3;
                }
                if (n0VarU.f207292b != n0VarU.f207293c) {
                    return -1L;
                }
                sink.f207265a = n0VarU.a();
                o0.a(n0VarU);
                return -1L;
            } catch (IOException e) {
                if (kVar.k()) {
                    throw kVar.m(e);
                }
                throw e;
            } finally {
                kVar.k();
            }
        } catch (AssertionError e2) {
            if (n.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return this.f217402b;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f217403c.f193426b) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
