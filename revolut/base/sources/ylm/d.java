package ylm;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mmm.k0;
import mmm.l0;
import mmm.v0;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.g1;
import ulm.h1;
import ulm.j1;
import ulm.q0;
import ulm.r0;
import ulm.t1;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements z, zlm.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xlm.d f314748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f314749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f314750c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f314751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f314752h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v f314753j;
    public final t1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f314754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f314755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j1 f314756n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f314757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f314758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Socket f314759r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Socket f314760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r0 f314761t;
    public h1 u;
    public v60.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f314762w;

    public d(xlm.d taskRunner, u connectionPool, int i, int i2, int i3, int i5, int i6, boolean z, q call, v routePlanner, t1 route, List list, int i21, j1 j1Var, int i22, boolean z3) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f314748a = taskRunner;
        this.f314749b = connectionPool;
        this.f314750c = i;
        this.d = i2;
        this.e = i3;
        this.f = i5;
        this.f314751g = i6;
        this.f314752h = z;
        this.i = call;
        this.f314753j = routePlanner;
        this.k = route;
        this.f314754l = list;
        this.f314755m = i21;
        this.f314756n = j1Var;
        this.o = i22;
        this.f314757p = z3;
    }

    public static d k(d dVar, int i, j1 j1Var, int i2, boolean z, int i3) {
        return new d(dVar.f314748a, dVar.f314749b, dVar.f314750c, dVar.d, dVar.e, dVar.f, dVar.f314751g, dVar.f314752h, dVar.i, dVar.f314753j, dVar.k, dVar.f314754l, (i3 & 1) != 0 ? dVar.f314755m : i, (i3 & 2) != 0 ? dVar.f314756n : j1Var, (i3 & 4) != 0 ? dVar.o : i2, (i3 & 8) != 0 ? dVar.f314757p : z);
    }

    @Override // ylm.z
    public final s a() {
        x xVar = this.i.f314779a.D;
        t1 route = this.k;
        synchronized (xVar) {
            Intrinsics.checkNotNullParameter(route, "route");
            xVar.f314819a.remove(route);
        }
        s connection = this.f314762w;
        Intrinsics.h(connection);
        t1 route2 = this.k;
        q call = this.i;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(route2, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        w wVarE = this.f314753j.e(this, this.f314754l);
        if (wVarE != null) {
            return wVarE.f314818a;
        }
        synchronized (connection) {
            u uVar = this.f314749b;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            TimeZone timeZone = vlm.j.f290512a;
            uVar.d.add(connection);
            uVar.f314805b.d(uVar.f314806c, 0L);
            this.i.b(connection);
            Unit unit = Unit.f186387a;
        }
        q qVar = this.i;
        qVar.e.connectionAcquired(qVar, connection);
        q call2 = this.i;
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(call2, "call");
        return connection;
    }

    @Override // zlm.d
    public final void b() {
    }

    @Override // zlm.d
    public final void c(q call, IOException iOException) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    @Override // ylm.z, zlm.d
    public final void cancel() {
        this.f314758q = true;
        Socket socket = this.f314759r;
        if (socket != null) {
            vlm.j.e(socket);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: all -> 0x0033, IOException -> 0x0037, TRY_ENTER, TryCatch #2 {IOException -> 0x0037, blocks: (B:9:0x0026, B:11:0x002e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3), top: B:124:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4 A[Catch: all -> 0x0033, IOException -> 0x0141, TRY_ENTER, TryCatch #4 {all -> 0x0033, blocks: (B:7:0x0022, B:9:0x0026, B:11:0x002e, B:24:0x004e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:36:0x009b, B:52:0x00d7, B:53:0x00e9, B:55:0x00f2, B:57:0x00f6, B:59:0x0108, B:72:0x0134, B:73:0x0137, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3, B:46:0x00c4, B:50:0x00d3, B:49:0x00d1), top: B:127:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6 A[Catch: all -> 0x0033, IOException -> 0x0130, TRY_LEAVE, TryCatch #4 {all -> 0x0033, blocks: (B:7:0x0022, B:9:0x0026, B:11:0x002e, B:24:0x004e, B:27:0x0055, B:29:0x0059, B:31:0x0065, B:33:0x0069, B:35:0x0075, B:36:0x009b, B:52:0x00d7, B:53:0x00e9, B:55:0x00f2, B:57:0x00f6, B:59:0x0108, B:72:0x0134, B:73:0x0137, B:40:0x00b4, B:41:0x00b7, B:42:0x00b8, B:43:0x00bf, B:44:0x00c0, B:45:0x00c3, B:46:0x00c4, B:50:0x00d3, B:49:0x00d1), top: B:127:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168 A[Catch: all -> 0x01a7, TryCatch #6 {all -> 0x01a7, blocks: (B:80:0x0148, B:82:0x0168, B:85:0x0172, B:88:0x0177, B:90:0x017b, B:93:0x0184, B:96:0x0189, B:101:0x0192), top: B:128:0x0148 }] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [ylm.z] */
    @Override // ylm.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ylm.y d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ylm.d.d():ylm.y");
    }

    @Override // zlm.d
    public final t1 e() {
        return this.k;
    }

    @Override // ylm.z
    public final y f() throws Throwable {
        Socket socket;
        Socket socket2;
        u uVar = this.f314749b;
        t1 route = this.k;
        q call = this.i;
        CopyOnWriteArrayList copyOnWriteArrayList = call.f314792t;
        if (this.f314759r != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            call.e.connectStart(call, route.f281140c, route.f281139b);
            uVar.getClass();
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(call, "call");
            h();
            z = true;
            y yVar = new y(this, null, null, 6);
            copyOnWriteArrayList.remove(this);
            return yVar;
        } catch (IOException failure) {
            boolean z3 = z;
            try {
                ulm.a aVar = route.f281138a;
                if (route.f281139b.type() != Proxy.Type.DIRECT) {
                    ulm.a aVar2 = route.f281138a;
                    aVar2.f281057g.connectFailed(aVar2.f281058h.j(), route.f281139b.address(), failure);
                }
                call.e.connectFailed(call, route.f281140c, route.f281139b, null, failure);
                uVar.getClass();
                Intrinsics.checkNotNullParameter(route, "route");
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(failure, "failure");
                y yVar2 = new y(this, null, failure, 2);
                copyOnWriteArrayList.remove(this);
                if (!z3 && (socket2 = this.f314759r) != null) {
                    vlm.j.e(socket2);
                }
                return yVar2;
            } catch (Throwable th10) {
                th = th10;
                z = z3;
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.f314759r) != null) {
                    vlm.j.e(socket);
                }
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            copyOnWriteArrayList.remove(this);
            if (!z) {
                vlm.j.e(socket);
            }
            throw th;
        }
    }

    @Override // ylm.z
    public final z g() {
        return new d(this.f314748a, this.f314749b, this.f314750c, this.d, this.e, this.f, this.f314751g, this.f314752h, this.i, this.f314753j, this.k, this.f314754l, this.f314755m, this.f314756n, this.o, this.f314757p);
    }

    public final void h() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.k.f281139b.type();
        int i = type == null ? -1 : c.f314742a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.k.f281138a.f281055b.createSocket();
            Intrinsics.h(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(this.k.f281139b);
        }
        this.f314759r = socketCreateSocket;
        if (this.f314758q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            emm.h.Companion.getClass();
            emm.h.f127697a.f(socketCreateSocket, this.k.f281140c, this.e);
            try {
                Intrinsics.checkNotNullParameter(socketCreateSocket, "<this>");
                Intrinsics.checkNotNullParameter(socketCreateSocket, "<this>");
                lal.a aVar = new lal.a(socketCreateSocket);
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                this.v = new v60.g(aVar);
            } catch (NullPointerException e) {
                if (Intrinsics.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.f281140c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void i(SSLSocket sslSocket, ulm.a0 a0Var) {
        String strG;
        h1 h1VarA;
        ulm.a aVar = this.k.f281138a;
        try {
            if (a0Var.f281063b) {
                emm.h.Companion.getClass();
                emm.h.f127697a.e(sslSocket, aVar.f281058h.d, aVar.i);
            }
            sslSocket.startHandshake();
            SSLSession session = sslSocket.getSession();
            q0 q0Var = r0.Companion;
            Intrinsics.h(session);
            q0Var.getClass();
            r0 r0VarA = q0.a(session);
            HostnameVerifier hostnameVerifier = aVar.d;
            Intrinsics.h(hostnameVerifier);
            if (!hostnameVerifier.verify(aVar.f281058h.d, session)) {
                List listA = r0VarA.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar.f281058h.d + " not verified (no certificates)");
                }
                Object obj2 = listA.get(0);
                Intrinsics.i(obj2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate certificate = (X509Certificate) obj2;
                StringBuilder sb6 = new StringBuilder("\n            |Hostname ");
                sb6.append(aVar.f281058h.d);
                sb6.append(" not verified:\n            |    certificate: ");
                ulm.t.Companion.getClass();
                sb6.append(ulm.r.a(certificate));
                sb6.append("\n            |    DN: ");
                sb6.append(certificate.getSubjectDN().getName());
                sb6.append("\n            |    subjectAltNames: ");
                Intrinsics.checkNotNullParameter(certificate, "certificate");
                sb6.append(d0.E0(imm.f.a(certificate, 2), imm.f.a(certificate, 7)));
                sb6.append("\n            ");
                throw new SSLPeerUnverifiedException(kotlin.text.t.f(sb6.toString()));
            }
            ulm.t tVar = aVar.e;
            Intrinsics.h(tVar);
            r0 r0Var = new r0(r0VarA.f281127a, r0VarA.f281128b, r0VarA.f281129c, new qg7.k(tVar, 28, r0VarA, aVar));
            this.f314761t = r0Var;
            tVar.a(aVar.f281058h.d, new y99.c(r0Var, 23));
            if (a0Var.f281063b) {
                emm.h.Companion.getClass();
                strG = emm.h.f127697a.g(sslSocket);
            } else {
                strG = null;
            }
            this.f314760s = sslSocket;
            Intrinsics.checkNotNullParameter(sslSocket, "<this>");
            Intrinsics.checkNotNullParameter(sslSocket, "<this>");
            lal.a aVar2 = new lal.a(sslSocket);
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            this.v = new v60.g(aVar2);
            if (strG != null) {
                h1.Companion.getClass();
                h1VarA = g1.a(strG);
            } else {
                h1VarA = h1.HTTP_1_1;
            }
            this.u = h1VarA;
            emm.h.Companion.getClass();
            emm.h.f127697a.getClass();
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        } catch (Throwable th10) {
            emm.h.Companion.getClass();
            emm.h.f127697a.getClass();
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            vlm.j.e(sslSocket);
            throw th10;
        }
    }

    @Override // ylm.z
    public final boolean isReady() {
        return this.u != null;
    }

    public final y j() throws IOException {
        j1 j1VarA;
        j1 request = this.f314756n;
        Intrinsics.h(request);
        t1 route = this.k;
        ulm.a aVar = route.f281138a;
        Proxy proxy = route.f281139b;
        String str = "CONNECT " + vlm.j.o(aVar.f281058h, true) + " HTTP/1.1";
        while (true) {
            v60.g gVar = this.v;
            if (gVar == null) {
                Intrinsics.r("socket");
                throw null;
            }
            amm.j jVar = new amm.j(null, this, gVar);
            v60.g gVar2 = this.v;
            if (gVar2 == null) {
                Intrinsics.r("socket");
                throw null;
            }
            v0 v0VarTimeout = ((l0) gVar2.f286252c).f207282a.timeout();
            long j2 = this.f314750c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            v0VarTimeout.g(j2, timeUnit);
            v60.g gVar3 = this.v;
            if (gVar3 == null) {
                Intrinsics.r("socket");
                throw null;
            }
            ((k0) gVar3.d).f207279a.timeout().g(this.d, timeUnit);
            jVar.m(request.f281097c, str);
            jVar.b();
            Response.a aVarC = jVar.c(false);
            Intrinsics.h(aVarC);
            Intrinsics.checkNotNullParameter(request, "request");
            aVarC.f226099a = request;
            Response response = aVarC.a();
            int i = response.d;
            Intrinsics.checkNotNullParameter(response, "response");
            long jH = vlm.j.h(response);
            if (jH != -1) {
                amm.g gVarL = jVar.l(response.f226087a.f281095a, jH);
                vlm.j.l(gVarL, Integer.MAX_VALUE);
                gVarL.close();
            }
            if (i == 200) {
                j1VarA = null;
                break;
            }
            if (i != 407) {
                throw new IOException(a0.d.n("Unexpected response code for CONNECT: ", i));
            }
            j1VarA = route.f281138a.f.a(route, response);
            if (j1VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(response.f("Connection", null))) {
                break;
            }
            request = j1VarA;
        }
        if (j1VarA == null) {
            return new y(this, null, null, 6);
        }
        Socket socket = this.f314759r;
        if (socket != null) {
            vlm.j.e(socket);
        }
        int i2 = this.f314755m + 1;
        q call = this.i;
        if (i2 < 21) {
            call.e.connectEnd(call, route.f281140c, proxy, null);
            return new y(this, k(this, i2, j1VarA, 0, false, 12), null, 4);
        }
        ProtocolException failure = new ProtocolException("Too many tunnel connections attempted: 21");
        call.e.connectFailed(call, route.f281140c, proxy, null, failure);
        this.f314749b.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(failure, "failure");
        return new y(this, null, failure, 2);
    }

    public final d l(List connectionSpecs, SSLSocket socket) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(socket, "sslSocket");
        int i = this.o;
        int size = connectionSpecs.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ulm.a0 a0Var = (ulm.a0) connectionSpecs.get(i2);
            a0Var.getClass();
            Intrinsics.checkNotNullParameter(socket, "socket");
            if (a0Var.f281062a && ((strArr = a0Var.d) == null || vlm.h.m(strArr, socket.getEnabledProtocols(), cim.b.e()))) {
                String[] strArr2 = a0Var.f281064c;
                if (strArr2 != null) {
                    String[] enabledCipherSuites = socket.getEnabledCipherSuites();
                    ulm.v.Companion.getClass();
                    if (!vlm.h.m(strArr2, enabledCipherSuites, ulm.v.f281143b)) {
                    }
                }
                return k(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final d m(List connectionSpecs, SSLSocket sslSocket) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (this.o != -1) {
            return this;
        }
        d dVarL = l(connectionSpecs, sslSocket);
        if (dVarL != null) {
            return dVarL;
        }
        StringBuilder sb6 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb6.append(this.f314757p);
        sb6.append(", modes=");
        sb6.append(connectionSpecs);
        sb6.append(", supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.h(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.append(string);
        throw new UnknownServiceException(sb6.toString());
    }
}
