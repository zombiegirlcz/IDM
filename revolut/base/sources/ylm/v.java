package ylm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import ulm.h1;
import ulm.i1;
import ulm.j1;
import ulm.s0;
import ulm.t1;
import ulm.x0;

/* JADX INFO: loaded from: classes14.dex */
public final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xlm.d f314807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f314808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f314809c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f314810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f314811h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ulm.a f314812j;
    public final x k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f314813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f314814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ke.o f314815n;
    public c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t1 f314816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayDeque f314817q;

    public v(xlm.d taskRunner, u connectionPool, int i, int i2, int i3, int i5, int i6, boolean z, boolean z3, ulm.a address, x routeDatabase, q call, j1 request) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f314807a = taskRunner;
        this.f314808b = connectionPool;
        this.f314809c = i;
        this.d = i2;
        this.e = i3;
        this.f = i5;
        this.f314810g = i6;
        this.f314811h = z;
        this.i = z3;
        this.f314812j = address;
        this.k = routeDatabase;
        this.f314813l = call;
        this.f314814m = !Intrinsics.f(request.f281096b, "GET");
        this.f314817q = new ArrayDeque();
    }

    public final ulm.a a() {
        return this.f314812j;
    }

    public final boolean b(s sVar) {
        c0 c0Var;
        t1 t1Var;
        if (this.f314817q.isEmpty() && this.f314816p == null) {
            if (sVar != null) {
                synchronized (sVar) {
                    t1Var = null;
                    if (sVar.f314799m == 0 && sVar.k && vlm.j.c(sVar.f314794c.f281138a.f281058h, this.f314812j.f281058h)) {
                        t1Var = sVar.f314794c;
                    }
                }
                if (t1Var != null) {
                    this.f314816p = t1Var;
                    return true;
                }
            }
            ke.o oVar = this.f314815n;
            if ((oVar == null || oVar.f182952b >= oVar.f182951a.size()) && (c0Var = this.o) != null) {
                return c0Var.a();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, java.util.List] */
    public final z c() throws IOException {
        Socket socketI;
        boolean z;
        w wVar;
        d dVarD;
        String hostname;
        int port;
        List addresses;
        boolean zContains;
        s connection = this.f314813l.f314784j;
        if (connection == null) {
            wVar = null;
        } else {
            boolean zH = connection.h(this.f314814m);
            synchronized (connection) {
                try {
                    if (!zH) {
                        z = !connection.k;
                        connection.k = true;
                        socketI = this.f314813l.i();
                    } else if (connection.k || !f(connection.f314794c.f281138a.f281058h)) {
                        socketI = this.f314813l.i();
                        z = false;
                    } else {
                        z = false;
                        socketI = null;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (this.f314813l.f314784j == null) {
                if (socketI != null) {
                    vlm.j.e(socketI);
                }
                q qVar = this.f314813l;
                qVar.e.connectionReleased(qVar, connection);
                g.b(this.f314813l, connection);
                if (socketI != null || z) {
                    Intrinsics.checkNotNullParameter(connection, "connection");
                }
                wVar = null;
            } else {
                if (socketI != null) {
                    throw new IllegalStateException("Check failed.");
                }
                wVar = new w(connection);
            }
        }
        if (wVar != null) {
            return wVar;
        }
        w wVarE = e(null, null);
        if (wVarE != null) {
            return wVarE;
        }
        if (!this.f314817q.isEmpty()) {
            return (z) this.f314817q.removeFirst();
        }
        t1 t1Var = this.f314816p;
        if (t1Var != null) {
            this.f314816p = null;
            dVarD = d(t1Var, null);
        } else {
            ke.o oVar = this.f314815n;
            if (oVar == null || oVar.f182952b >= oVar.f182951a.size()) {
                c0 c0Var = this.o;
                if (c0Var == null) {
                    c0Var = new c0(this.f314812j, this.k, this.f314813l, this.i);
                    this.o = c0Var;
                }
                if (!c0Var.a()) {
                    throw new IOException("exhausted all routes");
                }
                if (!c0Var.a()) {
                    throw new NoSuchElementException();
                }
                ArrayList arrayList = new ArrayList();
                while (c0Var.f < c0Var.e.size()) {
                    ulm.a aVar = c0Var.f314743a;
                    if (c0Var.f >= c0Var.e.size()) {
                        throw new SocketException("No route to " + aVar.f281058h.d + "; exhausted proxy configurations: " + c0Var.e);
                    }
                    List list = c0Var.e;
                    int i = c0Var.f;
                    c0Var.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    q qVar2 = c0Var.f314745c;
                    ArrayList arrayList2 = new ArrayList();
                    c0Var.f314746g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        x0 x0Var = aVar.f281058h;
                        hostname = x0Var.d;
                        port = x0Var.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        c0.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostname = inetSocketAddress.getHostName();
                            Intrinsics.checkNotNullExpressionValue(hostname, "getHostName(...)");
                        } else {
                            hostname = address.getHostAddress();
                            Intrinsics.checkNotNullExpressionValue(hostname, "getHostAddress(...)");
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostname + CoreConstants.COLON_CHAR + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostname, port));
                    } else {
                        if (vlm.g.a(hostname)) {
                            addresses = zhm.u.c(InetAddress.getByName(hostname));
                        } else {
                            qVar2.e.dnsStart(qVar2, hostname);
                            ((ah.a) aVar.f281054a).getClass();
                            Intrinsics.checkNotNullParameter(hostname, "hostname");
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(hostname);
                                Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
                                List listV0 = kotlin.collections.d.v0(allByName);
                                if (listV0.isEmpty()) {
                                    throw new UnknownHostException(aVar.f281054a + " returned no addresses for " + hostname);
                                }
                                qVar2.e.dnsEnd(qVar2, hostname, listV0);
                                addresses = listV0;
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (c0Var.d) {
                            Intrinsics.checkNotNullParameter(addresses, "addresses");
                            if (addresses.size() >= 2) {
                                ArrayList a7 = new ArrayList();
                                ArrayList b4 = new ArrayList();
                                for (Object obj2 : addresses) {
                                    if (((InetAddress) obj2) instanceof Inet6Address) {
                                        a7.add(obj2);
                                    } else {
                                        b4.add(obj2);
                                    }
                                }
                                if (!a7.isEmpty() && !b4.isEmpty()) {
                                    byte[] bArr = vlm.h.f290508a;
                                    Intrinsics.checkNotNullParameter(a7, "a");
                                    Intrinsics.checkNotNullParameter(b4, "b");
                                    Iterator it8 = a7.iterator();
                                    Iterator it9 = b4.iterator();
                                    aim.e eVarB = zhm.u.b();
                                    while (true) {
                                        if (!it8.hasNext() && !it9.hasNext()) {
                                            break;
                                        }
                                        if (it8.hasNext()) {
                                            eVarB.add(it8.next());
                                        }
                                        if (it9.hasNext()) {
                                            eVarB.add(it9.next());
                                        }
                                    }
                                    addresses = zhm.u.a(eVarB);
                                }
                            }
                        }
                        Iterator it10 = addresses.iterator();
                        while (it10.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it10.next(), port));
                        }
                    }
                    Iterator it11 = c0Var.f314746g.iterator();
                    while (it11.hasNext()) {
                        t1 route = new t1(c0Var.f314743a, proxy, (InetSocketAddress) it11.next());
                        x xVar = c0Var.f314744b;
                        synchronized (xVar) {
                            Intrinsics.checkNotNullParameter(route, "route");
                            zContains = xVar.f314819a.contains(route);
                        }
                        if (zContains) {
                            c0Var.f314747h.add(route);
                        } else {
                            arrayList.add(route);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    zhm.a0.x(c0Var.f314747h, arrayList);
                    c0Var.f314747h.clear();
                }
                ke.o oVar2 = new ke.o(arrayList);
                this.f314815n = oVar2;
                if (this.f314813l.f314790r) {
                    throw new IOException("Canceled");
                }
                if (oVar2.f182952b >= arrayList.size()) {
                    throw new NoSuchElementException();
                }
                int i2 = oVar2.f182952b;
                oVar2.f182952b = i2 + 1;
                dVarD = d((t1) arrayList.get(i2), arrayList);
            } else {
                int i3 = oVar.f182952b;
                ArrayList arrayList3 = oVar.f182951a;
                if (i3 >= arrayList3.size()) {
                    throw new NoSuchElementException();
                }
                int i5 = oVar.f182952b;
                oVar.f182952b = i5 + 1;
                dVarD = d((t1) arrayList3.get(i5), null);
            }
        }
        w wVarE2 = e(dVarD, dVarD.f314754l);
        return wVarE2 != null ? wVarE2 : dVarD;
    }

    public final d d(t1 route, ArrayList arrayList) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(route, "route");
        ulm.a aVar = route.f281138a;
        if (aVar.f281056c == null) {
            if (!aVar.f281059j.contains(ulm.a0.f281061h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f281138a.f281058h.d;
            emm.h.Companion.getClass();
            if (!emm.h.f127697a.i(str)) {
                throw new UnknownServiceException(p.a.p("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(h1.H2_PRIOR_KNOWLEDGE)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        j1 request = null;
        if (route.f281139b.type() == Proxy.Type.HTTP) {
            ulm.a aVar2 = route.f281138a;
            if (aVar2.f281056c != null || aVar2.i.contains(h1.H2_PRIOR_KNOWLEDGE)) {
                i1 i1Var = new i1();
                x0 url2 = route.f281138a.f281058h;
                Intrinsics.checkNotNullParameter(url2, "url");
                i1Var.f281089a = url2;
                i1Var.c("CONNECT", null);
                ulm.a aVar3 = route.f281138a;
                i1Var.b("Host", vlm.j.o(aVar3.f281058h, true));
                i1Var.b("Proxy-Connection", "Keep-Alive");
                i1Var.b("User-Agent", "okhttp/5.3.2");
                request = new j1(i1Var);
                Response.a aVar4 = new Response.a();
                Intrinsics.checkNotNullParameter(request, "request");
                aVar4.f226099a = request;
                aVar4.d(h1.HTTP_1_1);
                aVar4.f226101c = 407;
                Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
                aVar4.d = "Preemptive Authenticate";
                aVar4.f226105l = -1L;
                aVar4.f226106m = -1L;
                Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
                Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
                s0 s0Var = aVar4.f;
                s0Var.getClass();
                Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
                Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
                ue8.c.o(s0Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                j1 j1VarA = aVar3.f.a(route, aVar4.a());
                if (j1VarA != null) {
                    request = j1VarA;
                }
            }
        }
        return new d(this.f314807a, this.f314808b, this.f314809c, this.d, this.e, this.f, this.f314810g, this.f314811h, this.f314813l, this, route, arrayList, 0, request, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:14:0x0040, B:22:0x004d, B:25:0x0054), top: B:53:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ylm.w e(ylm.d r11, java.util.List r12) {
        /*
            r10 = this;
            ylm.u r0 = r10.f314808b
            boolean r1 = r10.f314814m
            ulm.a r2 = r10.f314812j
            ylm.q r3 = r10.f314813l
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.isReady()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            r0.getClass()
            java.lang.String r7 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            java.lang.String r7 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r0.d
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r7 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
        L2d:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L82
            java.lang.Object r7 = r0.next()
            ylm.s r7 = (ylm.s) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            monitor-enter(r7)
            if (r6 == 0) goto L4d
            bmm.u r9 = r7.f314797j     // Catch: java.lang.Throwable -> L4b
            if (r9 == 0) goto L46
            r9 = r5
            goto L47
        L46:
            r9 = r4
        L47:
            if (r9 != 0) goto L4d
        L49:
            r9 = r4
            goto L58
        L4b:
            r11 = move-exception
            goto L80
        L4d:
            boolean r9 = r7.g(r2, r12)     // Catch: java.lang.Throwable -> L4b
            if (r9 != 0) goto L54
            goto L49
        L54:
            r3.b(r7)     // Catch: java.lang.Throwable -> L4b
            r9 = r5
        L58:
            monitor-exit(r7)
            if (r9 == 0) goto L2d
            boolean r9 = r7.h(r1)
            if (r9 == 0) goto L62
            goto L83
        L62:
            monitor-enter(r7)
            boolean r8 = r7.k     // Catch: java.lang.Throwable -> L7d
            r7.k = r5     // Catch: java.lang.Throwable -> L7d
            java.net.Socket r9 = r3.i()     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r7)
            if (r9 == 0) goto L77
            vlm.j.e(r9)
            java.lang.String r8 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            goto L2d
        L77:
            if (r8 != 0) goto L2d
            ylm.g.c(r7)
            goto L2d
        L7d:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L80:
            monitor-exit(r7)
            throw r11
        L82:
            r7 = r8
        L83:
            if (r7 != 0) goto L86
            return r8
        L86:
            if (r11 == 0) goto L93
            ulm.t1 r12 = r11.k
            r10.f314816p = r12
            java.net.Socket r11 = r11.f314760s
            if (r11 == 0) goto L93
            vlm.j.e(r11)
        L93:
            ylm.q r11 = r10.f314813l
            ulm.m0 r12 = r11.e
            r12.connectionAcquired(r11, r7)
            ylm.q r11 = r10.f314813l
            java.lang.String r12 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r12)
            java.lang.String r12 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r12)
            ylm.w r11 = new ylm.w
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ylm.v.e(ylm.d, java.util.List):ylm.w");
    }

    public final boolean f(x0 url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        x0 x0Var = this.f314812j.f281058h;
        return url2.e == x0Var.e && Intrinsics.f(url2.d, x0Var.d);
    }
}
