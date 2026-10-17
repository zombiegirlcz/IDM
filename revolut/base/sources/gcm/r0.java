package gcm;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f142844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f142845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f142846c;
    public ecm.g2 d;
    public v0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f142847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f142848h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q4 f142849j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ecm.n[] f142850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s0 f142851m;
    public List e = new ArrayList();
    public ArrayList i = new ArrayList();
    public final ecm.v k = ecm.v.b();

    public r0(s0 s0Var, q4 q4Var, ecm.n[] nVarArr) {
        this.f142851m = s0Var;
        this.f142849j = q4Var;
        this.f142850l = nVarArr;
    }

    @Override // gcm.a0
    public final void a(int i) {
        Preconditions.checkState(this.f142845b == null, "May only be called before start");
        this.i.add(new u0(this, i, 1));
    }

    @Override // gcm.f6
    public final void b(ecm.o oVar) {
        Preconditions.checkState(this.f142845b == null, "May only be called before start");
        Preconditions.checkNotNull(oVar, "compressor");
        this.i.add(new ch.p(6, this, false, oVar));
    }

    @Override // gcm.f6
    public final void c(kcm.a aVar) {
        Preconditions.checkState(this.f142845b != null, "May only be called after start");
        Preconditions.checkNotNull(aVar, "message");
        if (this.f142844a) {
            this.f142846c.c(aVar);
        } else {
            l(new ch.p(9, this, false, aVar));
        }
    }

    @Override // gcm.a0
    public final void d(e4m.f fVar) {
        if (Boolean.TRUE.equals(this.f142849j.f142839a.e)) {
            fVar.f122679b.add("wait_for_ready");
        }
        synchronized (this) {
            try {
                if (this.f142845b == null) {
                    return;
                }
                if (this.f142846c != null) {
                    fVar.b(Long.valueOf(this.f142848h - this.f142847g), "buffered_nanos");
                    this.f142846c.d(fVar);
                } else {
                    fVar.b(Long.valueOf(System.nanoTime() - this.f142847g), "buffered_nanos");
                    fVar.f122679b.add("waiting_for_connection");
                }
            } finally {
            }
        }
    }

    @Override // gcm.a0
    public final void e(int i) {
        Preconditions.checkState(this.f142845b == null, "May only be called before start");
        this.i.add(new u0(this, i, 0));
    }

    @Override // gcm.f6
    public final void f() {
        Preconditions.checkState(this.f142845b == null, "May only be called before start");
        this.i.add(new ag.q(this, 8));
    }

    @Override // gcm.f6
    public final void flush() {
        Preconditions.checkState(this.f142845b != null, "May only be called after start");
        if (this.f142844a) {
            this.f142846c.flush();
        } else {
            l(new t0(this, 2));
        }
    }

    @Override // gcm.a0
    public final void g() {
        Preconditions.checkState(this.f142845b != null, "May only be called after start");
        l(new t0(this, 3));
    }

    @Override // gcm.a0
    public final void h(c0 c0Var) {
        ecm.g2 g2Var;
        boolean z;
        Preconditions.checkNotNull(c0Var, "listener");
        Preconditions.checkState(this.f142845b == null, "already started");
        synchronized (this) {
            try {
                g2Var = this.d;
                z = this.f142844a;
                if (!z) {
                    v0 v0Var = new v0(c0Var);
                    this.f = v0Var;
                    c0Var = v0Var;
                }
                this.f142845b = c0Var;
                this.f142847g = System.nanoTime();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (g2Var != null) {
            c0Var.c(g2Var, b0.PROCESSED, new ecm.m1());
            return;
        }
        if (z) {
            Iterator it8 = this.i.iterator();
            while (it8.hasNext()) {
                ((Runnable) it8.next()).run();
            }
            this.i = null;
            this.f142846c.h(c0Var);
        }
    }

    @Override // gcm.a0
    public final void i(ecm.w wVar) {
        Preconditions.checkState(this.f142845b == null, "May only be called before start");
        this.i.add(new ch.p(8, this, false, wVar));
    }

    @Override // gcm.f6
    public final boolean isReady() {
        if (this.f142844a) {
            return this.f142846c.isReady();
        }
        return false;
    }

    @Override // gcm.a0
    public final void j(ecm.y yVar) {
        Preconditions.checkState(this.f142845b == null, "May only be called before start");
        Preconditions.checkNotNull(yVar, "decompressorRegistry");
        this.i.add(new ch.p(7, this, false, yVar));
    }

    @Override // gcm.a0
    public final void k(ecm.g2 g2Var) {
        boolean z = false;
        boolean z3 = true;
        Preconditions.checkState(this.f142845b != null, "May only be called after start");
        Preconditions.checkNotNull(g2Var, "reason");
        synchronized (this) {
            try {
                a0 a0Var = this.f142846c;
                if (a0Var == null) {
                    b4 b4Var = b4.f142590a;
                    if (a0Var != null) {
                        z3 = false;
                    }
                    Preconditions.checkState(z3, "realStream already set to %s", a0Var);
                    this.f142846c = b4Var;
                    this.f142848h = System.nanoTime();
                    this.d = g2Var;
                } else {
                    z = true;
                }
            } finally {
            }
        }
        if (z) {
            l(new au0.x5(12, (Object) this, false, (Object) g2Var));
        } else {
            m();
            for (ecm.n nVar : this.f142850l) {
                nVar.p(g2Var);
            }
            this.f142845b.c(g2Var, b0.PROCESSED, new ecm.m1());
        }
        synchronized (this.f142851m.f142859b) {
            try {
                s0 s0Var = this.f142851m;
                if (s0Var.f142861g != null) {
                    boolean zRemove = s0Var.i.remove(this);
                    if (!this.f142851m.f() && zRemove) {
                        s0 s0Var2 = this.f142851m;
                        s0Var2.d.b(s0Var2.f);
                        if (((ecm.g2) this.f142851m.f142863j.f107955c) != null) {
                            s0 s0Var3 = this.f142851m;
                            s0Var3.d.b(s0Var3.f142861g);
                            this.f142851m.f142861g = null;
                        }
                    }
                }
            } finally {
            }
        }
        this.f142851m.d.a();
    }

    public final void l(Runnable runnable) {
        Preconditions.checkState(this.f142845b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f142844a) {
                    runnable.run();
                } else {
                    this.e.add(runnable);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r0.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.e     // Catch: java.lang.Throwable -> L50
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L52
            r0 = 0
            r6.e = r0     // Catch: java.lang.Throwable -> L50
            r1 = 1
            r6.f142844a = r1     // Catch: java.lang.Throwable -> L50
            gcm.v0 r2 = r6.f     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.f142907c     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            r2.f142907c = r0     // Catch: java.lang.Throwable -> L2d
            r2.f142906b = r1     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            goto L4d
        L2f:
            java.util.List r4 = r2.f142907c     // Catch: java.lang.Throwable -> L2d
            r2.f142907c = r3     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r4.iterator()
        L38:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L38
        L48:
            r4.clear()
            r3 = r4
            goto L1e
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L4f:
            return
        L50:
            r0 = move-exception
            goto L70
        L52:
            java.util.List r1 = r6.e     // Catch: java.lang.Throwable -> L50
            r6.e = r0     // Catch: java.lang.Throwable -> L50
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r1.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6b
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L5b
        L6b:
            r1.clear()
            r0 = r1
            goto L5
        L70:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.r0.m():void");
    }

    @Override // gcm.f6
    public final void request() {
        Preconditions.checkState(this.f142845b != null, "May only be called after start");
        if (this.f142844a) {
            this.f142846c.request();
        } else {
            l(new t0(this, 0));
        }
    }
}
