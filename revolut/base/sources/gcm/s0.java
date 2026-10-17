package gcm;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public final class s0 implements s3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f142860c;
    public final ecm.k2 d;
    public q0 e;
    public q0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q0 f142861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z2 f142862h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile cpi.g f142863j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.n0 f142858a = ecm.n0.a(s0.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142859b = new Object();
    public Collection i = new LinkedHashSet();

    public s0(Executor executor, ecm.k2 k2Var) {
        Object obj2 = null;
        this.f142863j = new cpi.g(obj2, obj2, 12);
        this.f142860c = executor;
        this.d = k2Var;
    }

    @Override // ecm.m0
    public final ecm.n0 a() {
        return this.f142858a;
    }

    @Override // gcm.s3
    public final Runnable b(r3 r3Var) {
        z2 z2Var = (z2) r3Var;
        this.f142862h = z2Var;
        this.e = new q0(z2Var, 0);
        this.f = new q0(z2Var, 1);
        this.f142861g = new q0(z2Var, 2);
        return null;
    }

    @Override // gcm.s3
    public final void c(ecm.g2 g2Var) {
        q0 q0Var;
        synchronized (this.f142859b) {
            try {
                if (((ecm.g2) this.f142863j.f107955c) != null) {
                    return;
                }
                this.f142863j = new cpi.g((ecm.y0) this.f142863j.f107954b, g2Var, 12);
                this.d.b(new au0.x5(11, (Object) this, false, (Object) g2Var));
                if (!f() && (q0Var = this.f142861g) != null) {
                    this.d.b(q0Var);
                    this.f142861g = null;
                }
                this.d.a();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r4 = e(r0, r7);
     */
    @Override // gcm.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gcm.a0 d(ecm.p1 r4, ecm.m1 r5, ecm.d r6, ecm.n[] r7) {
        /*
            r3 = this;
            gcm.q4 r0 = new gcm.q4     // Catch: java.lang.Throwable -> L27
            gcm.v2 r1 = new gcm.v2     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "tracers"
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r7, r2)     // Catch: java.lang.Throwable -> L27
            ecm.n[] r2 = (ecm.n[]) r2     // Catch: java.lang.Throwable -> L27
            r0.<init>(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> L27
            cpi.g r4 = r3.f142863j     // Catch: java.lang.Throwable -> L27
        L14:
            java.lang.Object r5 = r4.f107955c     // Catch: java.lang.Throwable -> L27
            ecm.g2 r5 = (ecm.g2) r5     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L29
            gcm.c1 r4 = new gcm.c1     // Catch: java.lang.Throwable -> L27
            gcm.b0 r6 = gcm.b0.PROCESSED     // Catch: java.lang.Throwable -> L27
            r4.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L27
        L21:
            ecm.k2 r5 = r3.d
            r5.a()
            return r4
        L27:
            r4 = move-exception
            goto L60
        L29:
            java.lang.Object r5 = r4.f107954b     // Catch: java.lang.Throwable -> L27
            ecm.y0 r5 = (ecm.y0) r5     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L4c
            ecm.v0 r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = r6.e     // Catch: java.lang.Throwable -> L27
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L27
            gcm.d0 r5 = gcm.p1.f(r5, r1)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L4c
            ecm.p1 r4 = r0.f142841c     // Catch: java.lang.Throwable -> L27
            ecm.m1 r6 = r0.f142840b     // Catch: java.lang.Throwable -> L27
            ecm.d r0 = r0.f142839a     // Catch: java.lang.Throwable -> L27
            gcm.a0 r4 = r5.d(r4, r6, r0, r7)     // Catch: java.lang.Throwable -> L27
            goto L21
        L4c:
            java.lang.Object r5 = r3.f142859b     // Catch: java.lang.Throwable -> L27
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L27
            cpi.g r1 = r3.f142863j     // Catch: java.lang.Throwable -> L59
            if (r4 != r1) goto L5b
            gcm.r0 r4 = r3.e(r0, r7)     // Catch: java.lang.Throwable -> L59
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            goto L21
        L59:
            r4 = move-exception
            goto L5e
        L5b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            r4 = r1
            goto L14
        L5e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r4     // Catch: java.lang.Throwable -> L27
        L60:
            ecm.k2 r5 = r3.d
            r5.a()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.s0.d(ecm.p1, ecm.m1, ecm.d, ecm.n[]):gcm.a0");
    }

    public final r0 e(q4 q4Var, ecm.n[] nVarArr) {
        int size;
        r0 r0Var = new r0(this, q4Var, nVarArr);
        this.i.add(r0Var);
        synchronized (this.f142859b) {
            size = this.i.size();
        }
        if (size == 1) {
            this.d.b(this.e);
        }
        for (ecm.n nVar : nVarArr) {
            nVar.q();
        }
        return r0Var;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.f142859b) {
            z = !this.i.isEmpty();
        }
        return z;
    }

    public final void g(ecm.y0 y0Var) {
        q0 q0Var;
        t0 t0Var;
        synchronized (this.f142859b) {
            this.f142863j = new cpi.g(y0Var, (ecm.g2) this.f142863j.f107955c, 12);
            if (y0Var != null && f()) {
                ArrayList<r0> arrayList = new ArrayList(this.i);
                ArrayList arrayList2 = new ArrayList();
                for (r0 r0Var : arrayList) {
                    ecm.v0 v0VarA = y0Var.a(r0Var.f142849j);
                    ecm.d dVar = r0Var.f142849j.f142839a;
                    d0 d0VarF = p1.f(v0VarA, Boolean.TRUE.equals(dVar.e));
                    if (d0VarF != null) {
                        Executor executor = this.f142860c;
                        Executor executor2 = dVar.f124791b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        ecm.v vVar = r0Var.k;
                        ecm.v vVarA = vVar.a();
                        try {
                            q4 q4Var = r0Var.f142849j;
                            a0 a0VarD = d0VarF.d(q4Var.f142841c, q4Var.f142840b, q4Var.f142839a, r0Var.f142850l);
                            synchronized (r0Var) {
                                try {
                                    t0Var = null;
                                    if (r0Var.f142846c == null) {
                                        a0 a0Var = (a0) Preconditions.checkNotNull(a0VarD, "stream");
                                        a0 a0Var2 = r0Var.f142846c;
                                        Preconditions.checkState(a0Var2 == null, "realStream already set to %s", a0Var2);
                                        r0Var.f142846c = a0Var;
                                        r0Var.f142848h = System.nanoTime();
                                        c0 c0Var = r0Var.f142845b;
                                        if (c0Var == null) {
                                            r0Var.e = null;
                                            r0Var.f142844a = true;
                                        }
                                        if (c0Var != null) {
                                            Iterator it8 = r0Var.i.iterator();
                                            while (it8.hasNext()) {
                                                ((Runnable) it8.next()).run();
                                            }
                                            r0Var.i = null;
                                            r0Var.f142846c.h(c0Var);
                                            t0Var = new t0(r0Var, 1);
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (t0Var != null) {
                                executor.execute(t0Var);
                            }
                            arrayList2.add(r0Var);
                        } finally {
                            vVar.c(vVarA);
                        }
                    }
                }
                synchronized (this.f142859b) {
                    try {
                        if (f()) {
                            this.i.removeAll(arrayList2);
                            if (this.i.isEmpty()) {
                                this.i = new LinkedHashSet();
                            }
                            if (!f()) {
                                this.d.b(this.f);
                                if (((ecm.g2) this.f142863j.f107955c) != null && (q0Var = this.f142861g) != null) {
                                    this.d.b(q0Var);
                                    this.f142861g = null;
                                }
                            }
                            this.d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
