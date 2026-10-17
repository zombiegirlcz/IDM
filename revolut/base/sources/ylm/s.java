package ylm;

import bmm.e0;
import bmm.g0;
import bmm.m0;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import ulm.h1;
import ulm.r0;
import ulm.t1;

/* JADX INFO: loaded from: classes13.dex */
public final class s extends bmm.r implements ulm.w, zlm.d {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xlm.d f314793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f314794c;
    public final Socket d;
    public final Socket e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1 f314795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v60.g f314796h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bmm.u f314797j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f314798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f314799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f314800n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f314801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f314802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f314803r;

    public s(xlm.d taskRunner, u connectionPool, t1 route, Socket rawSocket, Socket javaNetSocket, r0 r0Var, h1 protocol, v60.g socket, int i) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(rawSocket, "rawSocket");
        Intrinsics.checkNotNullParameter(javaNetSocket, "javaNetSocket");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(socket, "socket");
        e connectionListener = g.f314763a;
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f314793b = taskRunner;
        this.f314794c = route;
        this.d = rawSocket;
        this.e = javaNetSocket;
        this.f = r0Var;
        this.f314795g = protocol;
        this.f314796h = socket;
        this.i = i;
        this.f314801p = 1;
        this.f314802q = new ArrayList();
        this.f314803r = Long.MAX_VALUE;
    }

    public static void f(OkHttpClient client, t1 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f281139b.type() != Proxy.Type.DIRECT) {
            ulm.a aVar = failedRoute.f281138a;
            aVar.f281057g.connectFailed(aVar.f281058h.j(), failedRoute.f281139b.address(), failure);
        }
        x xVar = client.D;
        synchronized (xVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            xVar.f314819a.add(failedRoute);
        }
    }

    @Override // bmm.r
    public final void a(bmm.u connection, m0 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this) {
            this.f314801p = (settings.f16948a & 8) != 0 ? settings.f16949b[3] : Integer.MAX_VALUE;
            Unit unit = Unit.f186387a;
        }
    }

    @Override // zlm.d
    public final void b() {
        synchronized (this) {
            this.k = true;
            Unit unit = Unit.f186387a;
        }
        g.c(this);
    }

    @Override // zlm.d
    public final void c(q call, IOException iOException) {
        boolean z;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                z = false;
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f314797j != null) || (iOException instanceof ConnectionShutdownException)) {
                        z = !this.k;
                        this.k = true;
                        if (this.f314800n == 0) {
                            if (iOException != null) {
                                f(call.f314779a, this.f314794c, iOException);
                            }
                            this.f314799m++;
                        }
                    }
                } else if (((StreamResetException) iOException).f226122a == bmm.b.REFUSED_STREAM) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        z = !this.k;
                        this.k = true;
                        this.f314799m++;
                    }
                } else if (((StreamResetException) iOException).f226122a != bmm.b.CANCEL || !call.f314790r) {
                    z = !this.k;
                    this.k = true;
                    this.f314799m++;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (z) {
            g.c(this);
        }
    }

    @Override // zlm.d
    public final void cancel() {
        vlm.j.e(this.d);
    }

    @Override // bmm.r
    public final void d(e0 stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(bmm.b.REFUSED_STREAM, null);
    }

    @Override // zlm.d
    public final t1 e() {
        return this.f314794c;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(ulm.a r10, java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ylm.s.g(ulm.a, java.util.List):boolean");
    }

    public final boolean h(boolean z) {
        long j2;
        TimeZone timeZone = vlm.j.f290512a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        bmm.u uVar = this.f314797j;
        if (uVar == null) {
            synchronized (this) {
                j2 = jNanoTime - this.f314803r;
            }
            if (j2 < 10000000000L || !z) {
                return true;
            }
            return vlm.j.j(this.e, this.f314796h.h());
        }
        synchronized (uVar) {
            if (uVar.f) {
                return false;
            }
            if (uVar.o < uVar.f16969n) {
                if (jNanoTime >= uVar.f16970p) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void i() throws SocketException {
        this.f314803r = System.nanoTime();
        h1 h1Var = this.f314795g;
        if (h1Var == h1.HTTP_2 || h1Var == h1.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            bmm.c flowControlListener = bmm.c.f16894a;
            bmm.n nVar = new bmm.n(this.f314793b);
            v60.g socket = this.f314796h;
            String peerName = this.f314794c.f281138a.f281058h.d;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            nVar.f16951b = socket;
            String str = vlm.j.f290513b + zsc.p.SPACE_CHAR + peerName;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            nVar.f16952c = str;
            Intrinsics.checkNotNullParameter(this, "listener");
            nVar.d = this;
            nVar.f = this.i;
            Intrinsics.checkNotNullParameter(flowControlListener, "flowControlListener");
            nVar.f16953g = flowControlListener;
            bmm.u uVar = new bmm.u(nVar);
            this.f314797j = uVar;
            bmm.u.Companion.getClass();
            m0 m0Var = bmm.u.A;
            this.f314801p = (m0Var.f16948a & 8) != 0 ? m0Var.f16949b[3] : Integer.MAX_VALUE;
            g0 g0Var = uVar.f16976x;
            synchronized (g0Var) {
                try {
                    if (g0Var.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = g0.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(vlm.j.g(">> CONNECTION " + bmm.i.f16929a.e(), new Object[0]));
                    }
                    g0Var.f16921a.I8(bmm.i.f16929a);
                    g0Var.f16921a.flush();
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            g0 g0Var2 = uVar.f16976x;
            m0 settings = uVar.f16972r;
            g0Var2.getClass();
            Intrinsics.checkNotNullParameter(settings, "settings");
            synchronized (g0Var2) {
                try {
                    if (g0Var2.d) {
                        throw new IOException("closed");
                    }
                    g0Var2.f(0, Integer.bitCount(settings.f16948a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & settings.f16948a) == 0) {
                            z = false;
                        }
                        if (z) {
                            g0Var2.f16921a.writeShort(i);
                            g0Var2.f16921a.writeInt(settings.f16949b[i]);
                        }
                    }
                    g0Var2.f16921a.flush();
                    Unit unit2 = Unit.f186387a;
                } catch (Throwable th11) {
                    throw th11;
                }
            }
            if (uVar.f16972r.a() != 65535) {
                uVar.f16976x.q6(0, r2 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            xlm.b.c(uVar.f16964g.d(), uVar.f16963c, 0L, uVar.f16977y, 6);
        }
    }

    public final String toString() {
        Object obj2;
        StringBuilder sb6 = new StringBuilder("Connection{");
        t1 t1Var = this.f314794c;
        sb6.append(t1Var.f281138a.f281058h.d);
        sb6.append(CoreConstants.COLON_CHAR);
        sb6.append(t1Var.f281138a.f281058h.e);
        sb6.append(", proxy=");
        sb6.append(t1Var.f281139b);
        sb6.append(" hostAddress=");
        sb6.append(t1Var.f281140c);
        sb6.append(" cipherSuite=");
        r0 r0Var = this.f;
        if (r0Var == null || (obj2 = r0Var.f281128b) == null) {
            obj2 = "none";
        }
        sb6.append(obj2);
        sb6.append(" protocol=");
        sb6.append(this.f314795g);
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }
}
