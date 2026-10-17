package gcm;

import com.google.common.base.Preconditions;
import io.grpc.StatusRuntimeException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w3 f142572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142573b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6 f142574c;
    public final w3 d;
    public int e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f142575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f142576h;
    public final e6 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f142577j;
    public c0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ecm.y f142578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f142579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f142580n;
    public volatile boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f142581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f142582q;

    public b(int i, e6 e6Var, k6 k6Var, ecm.d dVar) {
        this.f142574c = (k6) Preconditions.checkNotNull(k6Var, "transportTracer");
        w3 w3Var = new w3(this, i, e6Var, k6Var);
        this.d = w3Var;
        this.f142572a = w3Var;
        this.f142576h = 32768;
        this.f142578l = ecm.y.d;
        this.f142579m = false;
        this.i = (e6) Preconditions.checkNotNull(e6Var, "statsTraceCtx");
        dVar.getClass();
    }

    public abstract void a(int i);

    public final void b(ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var) {
        if (this.f142577j) {
            return;
        }
        this.f142577j = true;
        e6 e6Var = this.i;
        if (e6Var.f142633b.compareAndSet(false, true)) {
            for (ecm.e0 e0Var : e6Var.f142632a) {
                e0Var.p(g2Var);
            }
        }
        if (this.f142574c != null) {
            g2Var.e();
        }
        this.k.c(g2Var, b0Var, m1Var);
    }

    public abstract void c(boolean z);

    public final void d(ecm.m1 m1Var) {
        Preconditions.checkState(!this.f142581p, "Received headers on closed stream");
        for (ecm.e0 e0Var : this.i.f142632a) {
            ((ecm.n) e0Var).s(m1Var);
        }
        String str = (String) m1Var.c(p1.d);
        if (str != null) {
            ecm.x xVar = (ecm.x) this.f142578l.f124898a.get(str);
            ecm.o oVar = xVar != null ? xVar.f124892a : null;
            if (oVar == null) {
                ((hcm.o) this).m(new StatusRuntimeException(ecm.g2.f124806l.g("Can't find decompressor for ".concat(str))));
                return;
            } else if (oVar != ecm.o.f124848b) {
                w3 w3Var = this.f142572a;
                w3Var.getClass();
                Preconditions.checkState(true, "Already set full stream decompressor");
                w3Var.e = (ecm.o) Preconditions.checkNotNull(oVar, "Can't pass an empty decompressor");
            }
        }
        this.k.b(m1Var);
    }

    public final boolean e() {
        boolean z;
        synchronized (this.f142573b) {
            try {
                z = this.f && this.e < this.f142576h && !this.f142575g;
            } finally {
            }
        }
        return z;
    }

    public final void f(ecm.g2 g2Var, b0 b0Var, boolean z, ecm.m1 m1Var) throws Throwable {
        Preconditions.checkNotNull(g2Var, "status");
        Preconditions.checkNotNull(m1Var, "trailers");
        if (!this.f142581p || z) {
            this.f142581p = true;
            this.f142582q = g2Var.e();
            synchronized (this.f142573b) {
                try {
                    this.f142575g = true;
                } catch (Throwable th10) {
                    th = th10;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    }
                }
            }
            if (this.f142579m) {
                this.f142580n = null;
                b(g2Var, b0Var, m1Var);
                return;
            }
            this.f142580n = new a(this, g2Var, b0Var, m1Var, 0);
            if (z) {
                this.f142572a.close();
                return;
            }
            w3 w3Var = this.f142572a;
            if (w3Var.isClosed()) {
                return;
            }
            if (w3Var.f142922l.f142670c == 0) {
                w3Var.close();
            } else {
                w3Var.f142926q = true;
            }
        }
    }

    public final void g(ecm.g2 g2Var, boolean z, ecm.m1 m1Var) throws Throwable {
        f(g2Var, b0.PROCESSED, z, m1Var);
    }
}
