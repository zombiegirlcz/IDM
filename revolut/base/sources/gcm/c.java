package gcm;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c extends z5 implements a0, z3 {
    public static final Logger i = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6 f142592c;
    public final j1 d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ecm.m1 f142593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f142594h;

    public c(hcm.c0 c0Var, e6 e6Var, k6 k6Var, ecm.m1 m1Var, ecm.d dVar, boolean z) {
        Preconditions.checkNotNull(m1Var, "headers");
        this.f142592c = (k6) Preconditions.checkNotNull(k6Var, "transportTracer");
        this.e = !Boolean.TRUE.equals(dVar.a(p1.f142816n));
        this.f = z;
        if (z) {
            this.d = new av0.b(this, m1Var, e6Var);
        } else {
            this.d = new a4(this, c0Var, e6Var);
            this.f142593g = m1Var;
        }
    }

    @Override // gcm.a0
    public final void a(int i2) {
        this.d.a(i2);
    }

    @Override // gcm.a0
    public final void d(e4m.f fVar) {
        fVar.b(((hcm.p) this).f151305p.f124780a.get(ecm.e0.f124795a), "remote_addr");
    }

    @Override // gcm.a0
    public final void e(int i2) {
        ((hcm.p) this).f151304n.f142572a.f142917b = i2;
    }

    @Override // gcm.a0
    public final void g() {
        hcm.p pVar = (hcm.p) this;
        if (pVar.f151304n.o) {
            return;
        }
        pVar.f151304n.o = true;
        this.d.close();
    }

    @Override // gcm.a0
    public final void h(c0 c0Var) {
        hcm.p pVar = (hcm.p) this;
        hcm.o oVar = pVar.f151304n;
        Preconditions.checkState(oVar.k == null, "Already called setListener");
        oVar.k = (c0) Preconditions.checkNotNull(c0Var, "listener");
        if (this.f) {
            return;
        }
        pVar.o.n(this.f142593g, null);
        this.f142593g = null;
    }

    @Override // gcm.a0
    public final void i(ecm.w wVar) {
        ecm.m1 m1Var = this.f142593g;
        ecm.g1 g1Var = p1.f142810c;
        m1Var.a(g1Var);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f142593g.d(g1Var, Long.valueOf(Math.max(0L, wVar.a())));
    }

    @Override // gcm.f6
    public final boolean isReady() {
        return ((hcm.p) this).f151304n.e() && !this.f142594h;
    }

    @Override // gcm.a0
    public final void j(ecm.y yVar) {
        hcm.o oVar = ((hcm.p) this).f151304n;
        Preconditions.checkState(oVar.k == null, "Already called start");
        oVar.f142578l = (ecm.y) Preconditions.checkNotNull(yVar, "decompressorRegistry");
    }

    @Override // gcm.a0
    public final void k(ecm.g2 g2Var) {
        Preconditions.checkArgument(!g2Var.e(), "Should not cancel with OK status");
        this.f142594h = true;
        ecm.q qVar = ((hcm.p) this).o;
        qVar.getClass();
        dfm.b.c();
        try {
            synchronized (((hcm.p) qVar.f124861b).f151304n.f151298x) {
                ((hcm.p) qVar.f124861b).f151304n.l(g2Var, true, null);
            }
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }

    public final void s(hcm.b0 b0Var, boolean z, boolean z3, int i2) {
        mmm.h hVar;
        Preconditions.checkArgument(b0Var != null || z, "null frame before EOS");
        ecm.q qVar = ((hcm.p) this).o;
        qVar.getClass();
        dfm.b.c();
        try {
            if (b0Var == null) {
                hVar = hcm.p.f151300r;
            } else {
                hVar = b0Var.f151250a;
                int i3 = (int) hVar.f207266b;
                if (i3 > 0) {
                    hcm.o oVar = ((hcm.p) qVar.f124861b).f151304n;
                    synchronized (oVar.f142573b) {
                        oVar.e += i3;
                    }
                }
            }
            synchronized (((hcm.p) qVar.f124861b).f151304n.f151298x) {
                hcm.o.k(((hcm.p) qVar.f124861b).f151304n, hVar, z, z3);
                k6 k6Var = ((hcm.p) qVar.f124861b).f142592c;
                if (i2 == 0) {
                    k6Var.getClass();
                } else {
                    k6Var.getClass();
                    k6Var.f142737a.a();
                }
            }
            dfm.b.f114548a.getClass();
        } catch (Throwable th10) {
            try {
                dfm.b.f114548a.getClass();
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
            }
            throw th10;
        }
    }
}
