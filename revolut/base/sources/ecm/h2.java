package ecm;

import gcm.b3;
import gcm.k3;
import gcm.z5;
import io.grpc.StatusException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.concurrent.CountDownLatch;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f124817c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h2(Object obj2, int i, Object obj3, Object obj4) {
        this.f124815a = i;
        this.d = obj2;
        this.f124816b = obj3;
        this.f124817c = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hcm.t tVar;
        hcm.s sVar;
        Socket socketF;
        SSLSession session;
        Socket socket;
        switch (this.f124815a) {
            case 0:
                ((k2) this.d).execute((j2) this.f124816b);
                return;
            case 1:
                ((gcm.p0) this.d).f.e((h) this.f124816b, (m1) this.f124817c);
                return;
            case 2:
                ((gcm.o0) this.d).f142789a.a((g2) this.f124816b, (m1) this.f124817c);
                return;
            case 3:
                r rVar = (r) this.f124817c;
                y0 y0Var = (y0) this.f124816b;
                b3 b3Var = (b3) this.d;
                k3 k3Var = b3Var.f142589b;
                if (b3Var != k3Var.f142727y) {
                    return;
                }
                k3Var.E.g(y0Var);
                if (rVar != r.SHUTDOWN) {
                    k3Var.N.b(f.INFO, "Entering {0} state with picker: {1}", rVar, y0Var);
                    k3Var.f142723s.c(rVar);
                    return;
                }
                return;
            default:
                try {
                    ((CountDownLatch) this.f124816b).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                mmm.l0 l0VarC = le.u1.c(new hcm.r());
                try {
                    try {
                        hcm.t tVar2 = (hcm.t) this.d;
                        f0 f0Var = tVar2.N;
                        if (f0Var == null) {
                            socketF = tVar2.A.createSocket(tVar2.f151310a.getAddress(), ((hcm.t) this.d).f151310a.getPort());
                        } else {
                            SocketAddress socketAddress = f0Var.f124798a;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new StatusException(g2.f124806l.g("Unsupported SocketAddress implementation " + ((hcm.t) this.d).N.f124798a.getClass()));
                            }
                            socketF = hcm.t.f(tVar2, f0Var.f124799b, (InetSocketAddress) socketAddress, f0Var.f124800c, f0Var.d);
                        }
                        hcm.t tVar3 = (hcm.t) this.d;
                        SSLSocketFactory sSLSocketFactory = tVar3.B;
                        if (sSLSocketFactory != null) {
                            String host = tVar3.f151311b;
                            URI uriA = gcm.p1.a(host);
                            if (uriA.getHost() != null) {
                                host = uriA.getHost();
                            }
                            SSLSocket sSLSocketA = hcm.a0.a(sSLSocketFactory, socketF, host, ((hcm.t) this.d).j(), ((hcm.t) this.d).E);
                            session = sSLSocketA.getSession();
                            socket = sSLSocketA;
                        } else {
                            session = null;
                            socket = socketF;
                        }
                        socket.setTcpNoDelay(true);
                        mmm.l0 l0VarC2 = le.u1.c(le.u1.s(socket));
                        ((hcm.d) this.f124817c).d(le.u1.q(socket), socket);
                        hcm.t tVar4 = (hcm.t) this.d;
                        b bVar = tVar4.u;
                        bVar.getClass();
                        cpi.g gVar = new cpi.g(bVar);
                        gVar.J(e0.f124795a, socket.getRemoteSocketAddress());
                        gVar.J(e0.f124796b, socket.getLocalSocketAddress());
                        gVar.J(e0.f124797c, session);
                        gVar.J(z5.f143012a, session == null ? b2.NONE : b2.PRIVACY_AND_INTEGRITY);
                        tVar4.u = gVar.h();
                        hcm.t tVar5 = (hcm.t) this.d;
                        ((icm.k) tVar5.f151313g).getClass();
                        tVar5.f151323t = new hcm.s(tVar5, new icm.i(l0VarC2));
                        synchronized (((hcm.t) this.d).k) {
                            try {
                                if (session != null) {
                                }
                            } finally {
                            }
                            break;
                        }
                        return;
                    } catch (StatusException e) {
                        ((hcm.t) this.d).r(0, icm.a.INTERNAL_ERROR, e.f162991a);
                        tVar = (hcm.t) this.d;
                        ((icm.k) tVar.f151313g).getClass();
                        sVar = new hcm.s(tVar, new icm.i(l0VarC));
                        tVar.f151323t = sVar;
                        return;
                    } catch (Exception e2) {
                        ((hcm.t) this.d).n(e2);
                        tVar = (hcm.t) this.d;
                        ((icm.k) tVar.f151313g).getClass();
                        sVar = new hcm.s(tVar, new icm.i(l0VarC));
                        tVar.f151323t = sVar;
                        return;
                    }
                } catch (Throwable th10) {
                    hcm.t tVar6 = (hcm.t) this.d;
                    ((icm.k) tVar6.f151313g).getClass();
                    tVar6.f151323t = new hcm.s(tVar6, new icm.i(l0VarC));
                    throw th10;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f124815a) {
            case 0:
                return ((Runnable) this.f124817c).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }
}
