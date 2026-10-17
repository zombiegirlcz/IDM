package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.base.Supplier;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class k3 extends ecm.d1 implements ecm.m0 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final Logger f142706d0 = Logger.getLogger(k3.class.getName());

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final ecm.g2 f142707e0;
    public static final ecm.g2 f0;
    public static final q3 g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final s2 f142708h0;
    public static final v2 i0;
    public static final m0 j0;
    public final HashSet A;
    public LinkedHashSet B;
    public final Object C;
    public final HashSet D;
    public final s0 E;
    public final com.google.firebase.messaging.t F;
    public final AtomicBoolean G;
    public boolean H;
    public volatile boolean I;
    public final CountDownLatch J;
    public final m K;
    public final com.google.firebase.messaging.t L;
    public final t M;
    public final q N;
    public final ecm.j0 O;
    public final g3 P;
    public h3 Q;
    public q3 R;
    public final q3 S;
    public boolean T;
    public final boolean U;
    public final ecm.q V;
    public final long W;
    public final long X;
    public final boolean Y;
    public final ecm.q1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.n0 f142709a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final w1 f142710a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142711b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final e8.r f142712b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URI f142713c;
    public final x4 c0;
    public final ecm.w1 d;
    public final ecm.r1 e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f142714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i3 f142715h;
    public final Executor i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d6 f142716j;
    public final a3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a3 f142717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g6 f142718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ecm.k2 f142719n;
    public final ecm.y o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ecm.p f142720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Supplier f142721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f142722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e8.r f142723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f142724t;
    public final ecm.e u;
    public final ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public i1 f142725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f142726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b3 f142727y;
    public boolean z;

    static {
        ecm.g2 g2Var = ecm.g2.f124807m;
        g2Var.g("Channel shutdownNow invoked");
        f142707e0 = g2Var.g("Channel shutdown invoked");
        f0 = g2Var.g("Subchannel shutdown invoked");
        g0 = new q3(null, new HashMap(), new HashMap(), null, null, null);
        f142708h0 = new s2();
        i0 = new v2();
        j0 = new m0(1);
    }

    public k3(l3 l3Var, hcm.l lVar, URI uri2, ecm.w1 w1Var, m mVar, d6 d6Var, Supplier supplier, ArrayList arrayList) {
        int i;
        g6 g6Var = g6.f142663a;
        ecm.k2 k2Var = new ecm.k2(new w2(this));
        this.f142719n = k2Var;
        e8.r rVar = new e8.r();
        rVar.f123511a = new ArrayList();
        rVar.f123512b = ecm.r.IDLE;
        this.f142723s = rVar;
        this.A = new HashSet(16, 0.75f);
        this.C = new Object();
        this.D = new HashSet(1, 0.75f);
        this.F = new com.google.firebase.messaging.t(this);
        this.G = new AtomicBoolean(false);
        this.J = new CountDownLatch(1);
        this.Q = h3.NO_RESOLUTION;
        this.R = g0;
        this.T = false;
        this.V = new ecm.q(10);
        this.Z = ecm.w.d;
        z2 z2Var = new z2(this);
        this.f142710a0 = new w1(this, 1);
        e8.r rVar2 = new e8.r(this);
        this.f142712b0 = rVar2;
        String str = (String) Preconditions.checkNotNull(l3Var.i, "target");
        this.f142711b = str;
        ecm.n0 n0Var = new ecm.n0("Channel", str, ecm.n0.d.incrementAndGet());
        this.f142709a = n0Var;
        this.f142718m = (g6) Preconditions.checkNotNull(g6Var, "timeProvider");
        d6 d6Var2 = (d6) Preconditions.checkNotNull(l3Var.d, "executorPool");
        this.f142716j = d6Var2;
        Executor executor = (Executor) Preconditions.checkNotNull((Executor) c6.a(d6Var2.f142618a), "executor");
        this.i = executor;
        a3 a3Var = new a3((d6) Preconditions.checkNotNull(l3Var.e, "offloadExecutorPool"));
        this.f142717l = a3Var;
        o oVar = new o(lVar, a3Var);
        this.f142714g = oVar;
        i3 i3Var = new i3(oVar.f142787a.getScheduledExecutorService());
        this.f142715h = i3Var;
        t tVar = new t(n0Var, g6Var.a(), p.a.p("Channel for '", str, "'"));
        this.M = tVar;
        q qVar = new q(tVar, g6Var);
        this.N = qVar;
        Object obj2 = l3Var.v;
        obj2 = obj2 == null ? p1.f142815m : obj2;
        boolean z = l3Var.f142755r;
        this.Y = z;
        k kVar = new k(l3Var.f142749j);
        this.f = kVar;
        this.f142713c = (URI) Preconditions.checkNotNull(uri2, "targetUri");
        this.d = (ecm.w1) Preconditions.checkNotNull(w1Var, "nameResolverProvider");
        s5 s5Var = new s5(z, l3Var.f142752n, l3Var.o, kVar);
        hcm.m mVar2 = (hcm.m) l3Var.C.f955b;
        mVar2.getClass();
        int[] iArr = hcm.i.f151277b;
        hcm.j jVar = mVar2.f151293j;
        int i2 = iArr[jVar.ordinal()];
        if (i2 == 1) {
            i = 80;
        } else {
            if (i2 != 2) {
                throw new AssertionError(jVar + " not handled");
            }
            i = 443;
        }
        ecm.r1 r1Var = new ecm.r1(Integer.valueOf(i), (ecm.a2) Preconditions.checkNotNull(obj2), (ecm.k2) Preconditions.checkNotNull(k2Var), (s5) Preconditions.checkNotNull(s5Var), (ScheduledExecutorService) Preconditions.checkNotNull(i3Var), (ecm.g) Preconditions.checkNotNull(qVar), a3Var);
        this.e = r1Var;
        this.f142725w = l(uri2, w1Var, r1Var);
        this.k = new a3(d6Var);
        s0 s0Var = new s0(executor, k2Var);
        this.E = s0Var;
        s0Var.b(z2Var);
        this.f142724t = mVar;
        Map map = l3Var.f142757t;
        if (map != null) {
            ecm.s1 s1VarA = s5Var.a(map);
            ecm.g2 g2Var = s1VarA.f124873a;
            Preconditions.checkState(g2Var == null, "Default config is invalid: %s", g2Var);
            q3 q3Var = (q3) s1VarA.f124874b;
            this.S = q3Var;
            rVar2.f123512b = q3Var.d;
        } else {
            this.S = null;
        }
        boolean z3 = l3Var.u;
        this.U = z3;
        g3 g3Var = new g3(this, this.f142725w.a());
        this.P = g3Var;
        Preconditions.checkNotNull(g3Var, "channel");
        Iterator it8 = arrayList.iterator();
        ecm.e kVar2 = g3Var;
        while (it8.hasNext()) {
            kVar2 = new ecm.k(kVar2, (ecm.j) it8.next());
        }
        this.u = kVar2;
        this.v = new ArrayList(l3Var.f142748h);
        this.f142721q = (Supplier) Preconditions.checkNotNull(supplier, "stopwatchSupplier");
        long j2 = l3Var.f142751m;
        if (j2 == -1) {
            this.f142722r = j2;
        } else {
            Preconditions.checkArgument(j2 >= l3.F, "invalid idleTimeoutMillis %s", j2);
            this.f142722r = l3Var.f142751m;
        }
        this.c0 = new x4(new u2(this, 1), k2Var, oVar.f142787a.getScheduledExecutorService(), (Stopwatch) supplier.get());
        this.o = (ecm.y) Preconditions.checkNotNull(l3Var.k, "decompressorRegistry");
        this.f142720p = (ecm.p) Preconditions.checkNotNull(l3Var.f142750l, "compressorRegistry");
        this.X = l3Var.f142753p;
        this.W = l3Var.f142754q;
        this.K = new m(9);
        this.L = new com.google.firebase.messaging.t(10);
        ecm.j0 j0Var = (ecm.j0) Preconditions.checkNotNull(l3Var.f142756s);
        this.O = j0Var;
        if (!z3) {
            if (this.S != null) {
                qVar.a(ecm.f.INFO, "Service config look-up disabled, using default service config");
            }
            this.T = true;
        }
        synchronized (ecm.q1.class) {
            if (ecm.q1.f124862b == null) {
                ecm.q1 q1Var = new ecm.q1(0);
                new HashSet();
                ecm.q1.f124862b = q1Var;
            }
        }
    }

    public static void h(k3 k3Var) {
        k3Var.n(true);
        s0 s0Var = k3Var.E;
        s0Var.g(null);
        k3Var.N.a(ecm.f.INFO, "Entering IDLE state");
        k3Var.f142723s.c(ecm.r.IDLE);
        w1 w1Var = k3Var.f142710a0;
        Object[] objArr = {k3Var.C, s0Var};
        w1Var.getClass();
        for (int i = 0; i < 2; i++) {
            if (((Set) w1Var.f22248b).contains(objArr[i])) {
                k3Var.k();
                return;
            }
        }
    }

    public static void i(k3 k3Var) {
        if (!k3Var.I && k3Var.G.get() && k3Var.A.isEmpty() && k3Var.D.isEmpty()) {
            k3Var.N.a(ecm.f.INFO, "Terminated");
            d6 d6Var = k3Var.f142716j;
            c6.b(d6Var.f142618a, k3Var.i);
            a3 a3Var = k3Var.k;
            synchronized (a3Var) {
                Executor executor = a3Var.f142559b;
                if (executor != null) {
                    c6.b(a3Var.f142558a.f142618a, executor);
                    a3Var.f142559b = null;
                }
            }
            a3 a3Var2 = k3Var.f142717l;
            synchronized (a3Var2) {
                Executor executor2 = a3Var2.f142559b;
                if (executor2 != null) {
                    c6.b(a3Var2.f142558a.f142618a, executor2);
                    a3Var2.f142559b = null;
                }
            }
            k3Var.f142714g.close();
            k3Var.I = true;
            k3Var.J.countDown();
        }
    }

    public static i1 l(URI uri2, ecm.w1 w1Var, ecm.r1 r1Var) {
        ecm.r1 r1Var2;
        z0 z0Var;
        ((a1) w1Var).getClass();
        if ("dns".equals(uri2.getScheme())) {
            String str = (String) Preconditions.checkNotNull(uri2.getPath(), "targetPath");
            Preconditions.checkArgument(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri2);
            String strSubstring = str.substring(1);
            uri2.getAuthority();
            r1Var2 = r1Var;
            z0Var = new z0(strSubstring, r1Var2, p1.f142817p, Stopwatch.createUnstarted(), a1.f142555a);
        } else {
            r1Var2 = r1Var;
            z0Var = null;
        }
        if (z0Var == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for " + uri2);
        }
        m mVar = new m(6);
        ScheduledExecutorService scheduledExecutorService = r1Var2.e;
        if (scheduledExecutorService == null) {
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }
        ecm.k2 k2Var = r1Var2.f124869c;
        return new r5(z0Var, new l(mVar, scheduledExecutorService, k2Var), k2Var);
    }

    @Override // ecm.m0
    public final ecm.n0 a() {
        return this.f142709a;
    }

    @Override // ecm.e
    public final String e() {
        return this.u.e();
    }

    @Override // ecm.e
    public final ecm.i f(ecm.p1 p1Var, ecm.d dVar) {
        return this.u.f(p1Var, dVar);
    }

    @Override // ecm.d1
    public final void g() {
        this.f142719n.execute(new u2(this, 0));
    }

    public final void j(boolean z) {
        ScheduledFuture scheduledFuture;
        x4 x4Var = this.c0;
        x4Var.f = false;
        if (!z || (scheduledFuture = x4Var.f142963g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        x4Var.f142963g = null;
    }

    public final void k() {
        this.f142719n.d();
        if (this.G.get() || this.z) {
            return;
        }
        if (((Set) this.f142710a0.f22248b).isEmpty()) {
            m();
        } else {
            j(false);
        }
        if (this.f142727y != null) {
            return;
        }
        this.N.a(ecm.f.INFO, "Exiting idle mode");
        b3 b3Var = new b3(this);
        k kVar = this.f;
        kVar.getClass();
        b3Var.f142588a = new com.google.firebase.messaging.t(kVar, b3Var);
        this.f142727y = b3Var;
        this.f142723s.c(ecm.r.CONNECTING);
        this.f142725w.d(new c3(this, b3Var, this.f142725w));
        this.f142726x = true;
    }

    public final void m() {
        long j2 = this.f142722r;
        if (j2 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x4 x4Var = this.c0;
        x4Var.getClass();
        long nanos = timeUnit.toNanos(j2);
        Stopwatch stopwatch = x4Var.d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jElapsed = stopwatch.elapsed(timeUnit2) + nanos;
        x4Var.f = true;
        if (jElapsed - x4Var.e < 0 || x4Var.f142963g == null) {
            ScheduledFuture scheduledFuture = x4Var.f142963g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            x4Var.f142963g = x4Var.f142960a.schedule(new com.bumptech.glide.k(x4Var, 7), nanos, timeUnit2);
        }
        x4Var.e = jElapsed;
    }

    public final void n(boolean z) {
        this.f142719n.d();
        if (z) {
            Preconditions.checkState(this.f142726x, "nameResolver is not started");
            Preconditions.checkState(this.f142727y != null, "lbHelper is null");
        }
        i1 i1Var = this.f142725w;
        if (i1Var != null) {
            i1Var.c();
            this.f142726x = false;
            if (z) {
                this.f142725w = l(this.f142713c, this.d, this.e);
            } else {
                this.f142725w = null;
            }
        }
        b3 b3Var = this.f142727y;
        if (b3Var != null) {
            com.google.firebase.messaging.t tVar = b3Var.f142588a;
            ((ecm.a1) tVar.f49544c).f();
            tVar.f49544c = null;
            this.f142727y = null;
        }
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("logId", this.f142709a.f124847c).add("target", this.f142711b).toString();
    }
}
