package hcm;

import ch.qos.logback.core.util.FileSize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import ecm.g2;
import ecm.h2;
import ecm.m1;
import ecm.n0;
import ecm.o1;
import gcm.e6;
import gcm.i0;
import gcm.k6;
import gcm.l1;
import gcm.n2;
import gcm.o2;
import gcm.p1;
import gcm.p2;
import gcm.r3;
import gcm.v1;
import gcm.w1;
import gcm.w5;
import gcm.z5;
import io.grpc.StatusException;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import le.u1;
import mmm.k0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class t implements i0, e, f0 {
    public static final Map P;
    public static final Logger Q;
    public final SocketFactory A;
    public final SSLSocketFactory B;
    public int C;
    public final LinkedList D;
    public final io.grpc.okhttp.internal.c E;
    public p2 F;
    public boolean G;
    public long H;
    public long I;
    public final Runnable J;
    public final int K;
    public final k6 L;
    public final w1 M;
    public final ecm.f0 N;
    public final int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f151310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151312c;
    public final Random d;
    public final Supplier e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final icm.n f151313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r3 f151314h;
    public f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f151315j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n0 f151316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f151317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f151318n;
    public final Executor o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w5 f151319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledExecutorService f151320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f151321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f151322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f151323t;
    public ecm.b u;
    public g2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f151324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v1 f151325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f151326y;
    public boolean z;

    static {
        EnumMap enumMap = new EnumMap(icm.a.class);
        icm.a aVar = icm.a.NO_ERROR;
        g2 g2Var = g2.f124806l;
        enumMap.put(aVar, g2Var.g("No error: A GRPC status of OK should have been sent"));
        enumMap.put(icm.a.PROTOCOL_ERROR, g2Var.g("Protocol error"));
        enumMap.put(icm.a.INTERNAL_ERROR, g2Var.g("Internal error"));
        enumMap.put(icm.a.FLOW_CONTROL_ERROR, g2Var.g("Flow control error"));
        enumMap.put(icm.a.STREAM_CLOSED, g2Var.g("Stream closed"));
        enumMap.put(icm.a.FRAME_TOO_LARGE, g2Var.g("Frame too large"));
        enumMap.put(icm.a.REFUSED_STREAM, g2.f124807m.g("Refused stream"));
        enumMap.put(icm.a.CANCEL, g2.f.g("Cancelled"));
        enumMap.put(icm.a.COMPRESSION_ERROR, g2Var.g("Compression error"));
        enumMap.put(icm.a.CONNECT_ERROR, g2Var.g("Connect error"));
        enumMap.put(icm.a.ENHANCE_YOUR_CALM, g2.f124805j.g("Enhance your calm"));
        enumMap.put(icm.a.INADEQUATE_SECURITY, g2.i.g("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(t.class.getName());
    }

    public t(l lVar, InetSocketAddress inetSocketAddress, String str, ecm.b bVar, ecm.f0 f0Var, com.bumptech.glide.k kVar) {
        l1 l1Var = p1.f142819r;
        icm.k kVar2 = new icm.k();
        this.d = new Random();
        Object obj2 = new Object();
        this.k = obj2;
        this.f151318n = new HashMap();
        this.C = 0;
        this.D = new LinkedList();
        this.M = new w1(this, 2);
        this.O = 30000;
        this.f151310a = (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "address");
        this.f151311b = str;
        this.f151321r = lVar.f151283h;
        this.f = lVar.f151285l;
        this.o = (Executor) Preconditions.checkNotNull(lVar.f151280b, "executor");
        this.f151319p = new w5(lVar.f151280b);
        this.f151320q = (ScheduledExecutorService) Preconditions.checkNotNull(lVar.d, "scheduledExecutorService");
        this.f151317m = 3;
        this.A = SocketFactory.getDefault();
        this.B = lVar.f;
        this.E = (io.grpc.okhttp.internal.c) Preconditions.checkNotNull(lVar.f151282g, "connectionSpec");
        this.e = (Supplier) Preconditions.checkNotNull(l1Var, "stopwatchFactory");
        this.f151313g = (icm.n) Preconditions.checkNotNull(kVar2, "variant");
        this.f151312c = "grpc-java-okhttp/1.66.0";
        this.N = f0Var;
        this.J = (Runnable) Preconditions.checkNotNull(kVar, "tooManyPingsRunnable");
        this.K = lVar.f151286m;
        lVar.e.getClass();
        this.L = new k6();
        this.f151316l = n0.a(t.class, inetSocketAddress.toString());
        ecm.b bVar2 = ecm.b.f124779b;
        ecm.a aVar = z5.f143013b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(aVar, bVar);
        for (Map.Entry entry : bVar2.f124780a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((ecm.a) entry.getKey(), entry.getValue());
            }
        }
        this.u = new ecm.b(identityHashMap);
        synchronized (obj2) {
        }
    }

    public static void e(t tVar, icm.a aVar, String str) {
        tVar.r(0, aVar, v(aVar).a(str));
    }

    public static Socket f(t tVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        SocketFactory socketFactory = tVar.A;
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(tVar.O);
            mmm.e eVarS = u1.s(socketCreateSocket);
            k0 k0VarB = u1.b(u1.q(socketCreateSocket));
            zq.a aVarG = tVar.g(inetSocketAddress, str, str2);
            jcm.a aVarR = aVarG.r();
            Locale locale = Locale.US;
            k0VarB.p0("CONNECT " + aVarR.b() + ":" + aVarR.c() + " HTTP/1.1");
            k0VarB.p0("\r\n");
            int iW = aVarG.q().w();
            for (int i = 0; i < iW; i++) {
                k0VarB.p0(aVarG.q().t(i));
                k0VarB.p0(": ");
                k0VarB.p0(aVarG.q().x(i));
                k0VarB.p0("\r\n");
            }
            k0VarB.p0("\r\n");
            k0VarB.flush();
            io.grpc.okhttp.internal.n nVarH = io.grpc.okhttp.internal.n.h(o(eVarS));
            int i2 = nVarH.f163018c;
            while (!o(eVarS).equals("")) {
            }
            if (i2 >= 200 && i2 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            mmm.h hVar = new mmm.h();
            try {
                socketCreateSocket.shutdownOutput();
                eVarS.read(hVar, FileSize.KB_COEFFICIENT);
            } catch (IOException e) {
                hVar.D("Unable to read body: " + e.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            Locale locale2 = Locale.US;
            throw new StatusException(g2.f124807m.g("Response returned from proxy was not successful (expected 2xx, got " + i2 + " " + ((String) nVarH.f163017b) + "). Response body:\n" + hVar.q()));
        } catch (IOException e2) {
            if (socketCreateSocket != null) {
                p1.b(socketCreateSocket);
            }
            throw new StatusException(g2.f124807m.g("Failed trying to connect with proxy").f(e2));
        }
    }

    public static String o(mmm.e eVar) throws EOFException {
        mmm.h hVar = new mmm.h();
        while (eVar.read(hVar, 1L) != -1) {
            if (hVar.j(hVar.f207266b - 1) == 10) {
                return hVar.e(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: " + hVar.c(hVar.f207266b).e());
    }

    public static g2 v(icm.a aVar) {
        g2 g2Var = (g2) P.get(aVar);
        if (g2Var != null) {
            return g2Var;
        }
        return g2.f124803g.g("Unknown http2 error code: " + aVar.httpCode);
    }

    @Override // ecm.m0
    public final n0 a() {
        return this.f151316l;
    }

    @Override // gcm.s3
    public final Runnable b(r3 r3Var) {
        this.f151314h = (r3) Preconditions.checkNotNull(r3Var, "listener");
        if (this.G) {
            p2 p2Var = new p2(new n2(this), this.f151320q, this.H, this.I);
            this.F = p2Var;
            synchronized (p2Var) {
            }
        }
        d dVar = new d(this.f151319p, this);
        icm.n nVar = this.f151313g;
        k0 k0VarB = u1.b(dVar);
        ((icm.k) nVar).getClass();
        c cVar = new c(dVar, new icm.j(k0VarB));
        synchronized (this.k) {
            f fVar = new f(this, cVar);
            this.i = fVar;
            this.f151315j = new g0(this, fVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f151319p.execute(new h2(this, 4, countDownLatch, dVar));
        try {
            p();
            countDownLatch.countDown();
            this.f151319p.execute(new com.bumptech.glide.k(this, 12));
            return null;
        } catch (Throwable th10) {
            countDownLatch.countDown();
            throw th10;
        }
    }

    @Override // gcm.s3
    public final void c(g2 g2Var) {
        synchronized (this.k) {
            try {
                if (this.v != null) {
                    return;
                }
                this.v = g2Var;
                this.f151314h.a(g2Var);
                u();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // gcm.d0
    public final gcm.a0 d(ecm.p1 p1Var, m1 m1Var, ecm.d dVar, ecm.n[] nVarArr) {
        p pVar;
        Preconditions.checkNotNull(p1Var, "method");
        Preconditions.checkNotNull(m1Var, "headers");
        ecm.b bVar = this.u;
        e6 e6Var = new e6(nVarArr);
        for (ecm.n nVar : nVarArr) {
            nVar.v(bVar, m1Var);
        }
        synchronized (this.k) {
            pVar = new p(p1Var, m1Var, this.i, this, this.f151315j, this.k, this.f151321r, this.f, this.f151311b, this.f151312c, e6Var, this.L, dVar);
        }
        return pVar;
    }

    public final zq.a g(InetSocketAddress inetSocketAddress, String str, String str2) {
        io.grpc.okhttp.internal.n nVar = new io.grpc.okhttp.internal.n(1);
        nVar.j();
        nVar.f(inetSocketAddress.getHostName());
        nVar.i(inetSocketAddress.getPort());
        jcm.a aVarC = nVar.c();
        r10.w wVar = new r10.w();
        wVar.B(aVarC);
        wVar.p("Host", aVarC.b() + ":" + aVarC.c());
        wVar.p("User-Agent", this.f151312c);
        if (str != null && str2 != null) {
            wVar.p("Proxy-Authorization", yh5.b.b(str, str2));
        }
        return wVar.b();
    }

    @Override // gcm.i0
    public final ecm.b getAttributes() {
        return this.u;
    }

    public final void h(int i, g2 g2Var, gcm.b0 b0Var, boolean z, icm.a aVar, m1 m1Var) {
        synchronized (this.k) {
            try {
                p pVar = (p) this.f151318n.remove(Integer.valueOf(i));
                if (pVar != null) {
                    if (aVar != null) {
                        this.i.T9(i, icm.a.CANCEL);
                    }
                    if (g2Var != null) {
                        o oVar = pVar.f151304n;
                        if (m1Var == null) {
                            m1Var = new m1();
                        }
                        oVar.f(g2Var, b0Var, z, m1Var);
                    }
                    if (!s()) {
                        u();
                    }
                    m(pVar);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final e0[] i() {
        e0[] e0VarArr;
        e0 e0Var;
        synchronized (this.k) {
            e0VarArr = new e0[this.f151318n.size()];
            Iterator it8 = this.f151318n.values().iterator();
            int i = 0;
            while (it8.hasNext()) {
                int i2 = i + 1;
                o oVar = ((p) it8.next()).f151304n;
                synchronized (oVar.f151298x) {
                    e0Var = oVar.K;
                }
                e0VarArr[i] = e0Var;
                i = i2;
            }
        }
        return e0VarArr;
    }

    public final int j() {
        URI uriA = p1.a(this.f151311b);
        return uriA.getPort() != -1 ? uriA.getPort() : this.f151310a.getPort();
    }

    public final StatusException k() {
        synchronized (this.k) {
            try {
                g2 g2Var = this.v;
                if (g2Var != null) {
                    return new StatusException(g2Var);
                }
                return new StatusException(g2.f124807m.g("Connection closed"));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.k
            monitor-enter(r0)
            int r1 = r2.f151317m     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hcm.t.l(int):boolean");
    }

    public final void m(p pVar) {
        if (this.z && this.D.isEmpty() && this.f151318n.isEmpty()) {
            this.z = false;
            p2 p2Var = this.F;
            if (p2Var != null) {
                synchronized (p2Var) {
                    try {
                        o2 o2Var = p2Var.d;
                        if (o2Var == o2.PING_SCHEDULED || o2Var == o2.PING_DELAYED) {
                            p2Var.d = o2.IDLE;
                        }
                        if (p2Var.d == o2.PING_SENT) {
                            p2Var.d = o2.IDLE_AND_PING_SENT;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            }
        }
        if (pVar.e) {
            this.M.n(pVar, false);
        }
    }

    public final void n(Exception exc2) {
        Preconditions.checkNotNull(exc2, "failureCause");
        r(0, icm.a.INTERNAL_ERROR, g2.f124807m.f(exc2));
    }

    public final void p() {
        synchronized (this.k) {
            try {
                this.i.w1();
                icm.m mVar = new icm.m(0);
                mVar.e(7, this.f);
                this.i.V7(mVar);
                if (this.f > 65535) {
                    this.i.q6(0, r1 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void q(g2 g2Var) {
        c(g2Var);
        synchronized (this.k) {
            try {
                Iterator it8 = this.f151318n.entrySet().iterator();
                while (it8.hasNext()) {
                    Map.Entry entry = (Map.Entry) it8.next();
                    it8.remove();
                    ((p) entry.getValue()).f151304n.g(g2Var, false, new m1());
                    m((p) entry.getValue());
                }
                for (p pVar : this.D) {
                    pVar.f151304n.f(g2Var, gcm.b0.MISCARRIED, true, new m1());
                    m(pVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void r(int i, icm.a aVar, g2 g2Var) {
        synchronized (this.k) {
            try {
                if (this.v == null) {
                    this.v = g2Var;
                    this.f151314h.a(g2Var);
                }
                if (aVar != null && !this.f151324w) {
                    this.f151324w = true;
                    this.i.J7(aVar, new byte[0]);
                }
                Iterator it8 = this.f151318n.entrySet().iterator();
                while (it8.hasNext()) {
                    Map.Entry entry = (Map.Entry) it8.next();
                    if (((Integer) entry.getKey()).intValue() > i) {
                        it8.remove();
                        ((p) entry.getValue()).f151304n.f(g2Var, gcm.b0.REFUSED, false, new m1());
                        m((p) entry.getValue());
                    }
                }
                for (p pVar : this.D) {
                    pVar.f151304n.f(g2Var, gcm.b0.MISCARRIED, true, new m1());
                    m(pVar);
                }
                this.D.clear();
                u();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final boolean s() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.D;
            if (linkedList.isEmpty() || this.f151318n.size() >= this.C) {
                break;
            }
            t((p) linkedList.poll());
            z = true;
        }
        return z;
    }

    public final void t(p pVar) {
        boolean zE;
        Preconditions.checkState(pVar.f151304n.L == -1, "StreamId already assigned");
        this.f151318n.put(Integer.valueOf(this.f151317m), pVar);
        if (!this.z) {
            this.z = true;
            p2 p2Var = this.F;
            if (p2Var != null) {
                p2Var.b();
            }
        }
        if (pVar.e) {
            this.M.n(pVar, true);
        }
        o oVar = pVar.f151304n;
        int i = this.f151317m;
        Preconditions.checkState(oVar.L == -1, "the stream has been started with id %s", i);
        oVar.L = i;
        g0 g0Var = oVar.G;
        oVar.K = new e0(g0Var, i, g0Var.f151273a, (d0) Preconditions.checkNotNull(oVar, "stream"));
        o oVar2 = oVar.M.f151304n;
        Preconditions.checkState(oVar2.k != null);
        synchronized (oVar2.f142573b) {
            Preconditions.checkState(!oVar2.f, "Already allocated");
            oVar2.f = true;
        }
        synchronized (oVar2.f142573b) {
            zE = oVar2.e();
        }
        if (zE) {
            oVar2.k.d();
        }
        k6 k6Var = oVar2.f142574c;
        k6Var.getClass();
        k6Var.f142737a.a();
        if (oVar.I) {
            oVar.F.a2(oVar.L, oVar.f151299y, oVar.M.f151306q);
            for (ecm.e0 e0Var : oVar.M.f151302l.f142632a) {
                ((ecm.n) e0Var).u();
            }
            oVar.f151299y = null;
            mmm.h hVar = oVar.z;
            if (hVar.f207266b > 0) {
                oVar.G.a(oVar.A, oVar.K, hVar, oVar.B);
            }
            oVar.I = false;
        }
        o1 o1Var = pVar.f151301j.f124856a;
        if ((o1Var != o1.UNARY && o1Var != o1.SERVER_STREAMING) || pVar.f151306q) {
            this.i.flush();
        }
        int i2 = this.f151317m;
        if (i2 < 2147483645) {
            this.f151317m = i2 + 2;
        } else {
            this.f151317m = Integer.MAX_VALUE;
            r(Integer.MAX_VALUE, icm.a.NO_ERROR, g2.f124807m.g("Stream ids exhausted"));
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("logId", this.f151316l.f124847c).add("address", this.f151310a).toString();
    }

    public final void u() {
        if (this.v == null || !this.f151318n.isEmpty() || !this.D.isEmpty() || this.f151326y) {
            return;
        }
        this.f151326y = true;
        p2 p2Var = this.F;
        if (p2Var != null) {
            synchronized (p2Var) {
                try {
                    o2 o2Var = p2Var.d;
                    o2 o2Var2 = o2.DISCONNECTED;
                    if (o2Var != o2Var2) {
                        p2Var.d = o2Var2;
                        ScheduledFuture scheduledFuture = p2Var.e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = p2Var.f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            p2Var.f = null;
                        }
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        v1 v1Var = this.f151325x;
        if (v1Var != null) {
            v1Var.c(k());
            this.f151325x = null;
        }
        if (!this.f151324w) {
            this.f151324w = true;
            this.i.J7(icm.a.NO_ERROR, new byte[0]);
        }
        this.i.close();
    }
}
