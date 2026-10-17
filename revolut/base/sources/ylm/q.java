package ylm;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ulm.f0;
import ulm.j1;
import ulm.m0;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements Call, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f314779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f314780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f314781c;
    public final u d;
    public final m0 e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f314782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f314783h;
    public k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f314784j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public j f314785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f314786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f314787n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f314788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f314789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f314790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile j f314791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f314792t;

    public q(OkHttpClient client, j1 originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f314779a = client;
        this.f314780b = originalRequest;
        this.f314781c = z;
        this.d = client.F.f281162a;
        this.e = client.d.a(this);
        p pVar = new p(this);
        pVar.g(client.f226067w, TimeUnit.MILLISECONDS);
        this.f = pVar;
        this.f314782g = new AtomicBoolean();
        this.f314789q = true;
        this.f314792t = new CopyOnWriteArrayList();
        new AtomicReference(originalRequest.e);
    }

    public static final String a(q qVar) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(qVar.f314790r ? "canceled " : "");
        sb6.append(qVar.f314781c ? "web socket" : "call");
        sb6.append(" to ");
        sb6.append(qVar.f314780b.f281095a.i());
        return sb6.toString();
    }

    public final void b(s connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        TimeZone timeZone = vlm.j.f290512a;
        if (this.f314784j != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f314784j = connection;
        connection.f314802q.add(new o(this, this.f314783h));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketI;
        TimeZone timeZone = vlm.j.f290512a;
        s sVar = this.f314784j;
        if (sVar != null) {
            synchronized (sVar) {
                socketI = i();
            }
            if (this.f314784j == null) {
                if (socketI != null) {
                    vlm.j.e(socketI);
                }
                this.e.connectionReleased(this, sVar);
                g.b(this, sVar);
                if (socketI != null) {
                    g.a(sVar);
                }
            } else if (socketI != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.k && this.f.k()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.e.callEnd(this);
            return interruptedIOException;
        }
        m0 m0Var = this.e;
        Intrinsics.h(interruptedIOException);
        m0Var.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    @Override // okhttp3.Call
    public final void cancel() {
        if (this.f314790r) {
            return;
        }
        this.f314790r = true;
        j jVar = this.f314791s;
        if (jVar != null) {
            jVar.d.cancel();
        }
        Iterator it8 = this.f314792t.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            ((z) it8.next()).cancel();
        }
        this.e.canceled(this);
    }

    public final Object clone() {
        return new q(this.f314779a, this.f314780b, this.f314781c);
    }

    @Override // okhttp3.Call
    public final void d(ulm.p responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f314782g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        emm.h.Companion.getClass();
        this.f314783h = emm.h.f127697a.h();
        this.e.callStart(this);
        f0 f0Var = this.f314779a.f226053a;
        n call = new n(this, responseCallback);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        f0.d(f0Var, call, null, null, 6);
    }

    public final void e(boolean z) {
        j jVar;
        synchronized (this) {
            if (!this.f314789q) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f186387a;
        }
        if (z && (jVar = this.f314791s) != null) {
            jVar.d.cancel();
            jVar.f314770a.g(jVar, true, true, true, true, null);
        }
        this.f314785l = null;
    }

    @Override // okhttp3.Call
    public final Response execute() {
        if (!this.f314782g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f.j();
        emm.h.Companion.getClass();
        this.f314783h = emm.h.f127697a.h();
        this.e.callStart(this);
        try {
            f0 f0Var = this.f314779a.f226053a;
            synchronized (f0Var) {
                Intrinsics.checkNotNullParameter(this, "call");
                f0Var.d.add(this);
            }
            return f();
        } finally {
            f0 f0Var2 = this.f314779a.f226053a;
            f0Var2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            f0.d(f0Var2, null, this, null, 5);
        }
    }

    public final Response f() {
        ArrayList arrayList = new ArrayList();
        zhm.a0.x(this.f314779a.f226054b, arrayList);
        arrayList.add(new zlm.k(this.f314779a));
        arrayList.add(new zlm.a(this.f314779a.f226058j));
        arrayList.add(new wlm.c(this.f314779a.k));
        arrayList.add(a.f314741a);
        if (!this.f314781c) {
            zhm.a0.x(this.f314779a.f226055c, arrayList);
        }
        arrayList.add(zlm.b.f323303a);
        j1 j1Var = this.f314780b;
        OkHttpClient okHttpClient = this.f314779a;
        try {
            try {
                Response responseB = new zlm.h(this, arrayList, 0, null, j1Var, okHttpClient.f226068x, okHttpClient.f226069y, okHttpClient.z).b(this.f314780b);
                if (this.f314790r) {
                    vlm.h.f(responseB);
                    throw new IOException("Canceled");
                }
                h(null);
                return responseB;
            } catch (IOException e) {
                IOException iOExceptionH = h(e);
                Intrinsics.i(iOExceptionH, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionH;
            }
        } catch (Throwable th10) {
            if (0 == 0) {
                h(null);
            }
            throw th10;
        }
    }

    public final IOException g(j exchange, boolean z, boolean z3, boolean z4, boolean z6, IOException iOException) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.f(exchange, this.f314791s)) {
            synchronized (this) {
                z11 = false;
                if (z) {
                    try {
                        if (!this.f314786m) {
                            if ((z3 || !this.f314787n) && ((!z6 || !this.o) && (!z4 || !this.f314788p))) {
                                z12 = false;
                            }
                            Unit unit = Unit.f186387a;
                        }
                        if (z) {
                            this.f314786m = false;
                        }
                        if (z3) {
                            this.f314787n = false;
                        }
                        if (z6) {
                            this.o = false;
                        }
                        if (z4) {
                            this.f314788p = false;
                        }
                        boolean z29 = (this.f314786m || this.f314787n || this.o || this.f314788p) ? false : true;
                        if (z29 && !this.f314789q) {
                            z11 = true;
                        }
                        boolean z31 = z11;
                        z11 = z29;
                        z12 = z31;
                        Unit unit2 = Unit.f186387a;
                    } catch (Throwable th10) {
                        throw th10;
                    }
                } else if (z3) {
                    z12 = false;
                    Unit unit22 = Unit.f186387a;
                } else {
                    z12 = false;
                    Unit unit222 = Unit.f186387a;
                }
            }
            if (z11) {
                this.f314791s = null;
                s sVar = this.f314784j;
                if (sVar != null) {
                    synchronized (sVar) {
                        sVar.f314800n++;
                    }
                }
            }
            if (z12) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException h(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.f314789q) {
                    this.f314789q = false;
                    if (!this.f314786m && !this.f314787n && !this.o && !this.f314788p) {
                        z = true;
                    }
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket i() {
        s connection = this.f314784j;
        Intrinsics.h(connection);
        TimeZone timeZone = vlm.j.f290512a;
        ArrayList arrayList = connection.f314802q;
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((Reference) it8.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f314784j = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f314803r = System.nanoTime();
        u uVar = this.d;
        ConcurrentLinkedQueue concurrentLinkedQueue = uVar.d;
        xlm.b bVar = uVar.f314805b;
        Intrinsics.checkNotNullParameter(connection, "connection");
        TimeZone timeZone2 = vlm.j.f290512a;
        if (!connection.k) {
            bVar.d(uVar.f314806c, 0L);
            return null;
        }
        connection.k = true;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        return connection.e;
    }

    @Override // okhttp3.Call
    public final boolean isCanceled() {
        return this.f314790r;
    }

    @Override // okhttp3.Call
    public final j1 request() {
        return this.f314780b;
    }

    @Override // okhttp3.Call
    public final p timeout() {
        return this.f;
    }
}
