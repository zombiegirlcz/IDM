package gcm;

import com.google.common.base.Preconditions;
import io.grpc.StatusRuntimeException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class l5 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5 f142762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f142763b;

    public l5(x2 x2Var, m5 m5Var) {
        this.f142763b = x2Var;
        this.f142762a = m5Var;
    }

    @Override // gcm.c0
    public final void a(a31.a aVar) {
        k5 k5Var = this.f142763b.o;
        boolean z = false;
        Preconditions.checkState(k5Var.f != null, "Headers should be received prior to messages.");
        if (k5Var.f == this.f142762a) {
            this.f142763b.f142942c.execute(new ch.p(18, this, z, aVar));
            return;
        }
        Logger logger = p1.f142808a;
        while (true) {
            InputStream inputStreamI = aVar.i();
            if (inputStreamI == null) {
                return;
            } else {
                p1.b(inputStreamI);
            }
        }
    }

    @Override // gcm.c0
    public final void b(ecm.m1 m1Var) {
        int i;
        int i2;
        if (this.f142762a.d > 0) {
            ecm.g1 g1Var = x2.E;
            m1Var.a(g1Var);
            m1Var.d(g1Var, String.valueOf(this.f142762a.d));
        }
        x2 x2Var = this.f142763b;
        m5 m5Var = this.f142762a;
        ecm.g1 g1Var2 = x2.E;
        z4 z4VarM = x2Var.m(m5Var);
        if (z4VarM != null) {
            x2Var.f142941b.execute(z4VarM);
        }
        if (this.f142763b.o.f == this.f142762a) {
            n5 n5Var = this.f142763b.f142947m;
            if (n5Var != null) {
                AtomicInteger atomicInteger = n5Var.d;
                do {
                    i = atomicInteger.get();
                    i2 = n5Var.f142784a;
                    if (i == i2) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i, Math.min(n5Var.f142786c + i, i2)));
            }
            this.f142763b.f142942c.execute(new ch.p(17, this, false, m1Var));
        }
    }

    @Override // gcm.c0
    public final void c(ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var) {
        Throwable th10;
        boolean z;
        i5 i5Var;
        x2 x2Var;
        b9.u uVar;
        Integer numValueOf = -1;
        synchronized (this.f142763b.i) {
            try {
                x2 x2Var2 = this.f142763b;
                x2Var2.o = x2Var2.o.d(this.f142762a);
                this.f142763b.f142948n.f122679b.add(String.valueOf(g2Var.f124809a));
            } finally {
                th = th;
                while (true) {
                    try {
                    } catch (Throwable th11) {
                        th = th11;
                    }
                }
            }
        }
        if (this.f142763b.f142951r.decrementAndGet() == Integer.MIN_VALUE) {
            this.f142763b.f142942c.execute(new ag.q(this, 17));
            return;
        }
        m5 m5Var = this.f142762a;
        if (m5Var.f142775c) {
            x2 x2Var3 = this.f142763b;
            z4 z4VarM = x2Var3.m(m5Var);
            if (z4VarM != null) {
                x2Var3.f142941b.execute(z4VarM);
            }
            if (this.f142763b.o.f == this.f142762a) {
                this.f142763b.s(g2Var, b0Var, m1Var);
            }
        } else {
            b0 b0Var2 = b0.MISCARRIED;
            if (b0Var != b0Var2 || this.f142763b.f142950q.incrementAndGet() <= 1000) {
                if (this.f142763b.o.f == null) {
                    if (b0Var == b0Var2 || (b0Var == b0.REFUSED && this.f142763b.f142949p.compareAndSet(false, true))) {
                        m5 m5VarN = this.f142763b.n(this.f142762a.d, true);
                        if (m5VarN == null) {
                            return;
                        }
                        x2 x2Var4 = this.f142763b;
                        if (x2Var4.f142944h) {
                            synchronized (x2Var4.i) {
                                x2 x2Var5 = this.f142763b;
                                x2Var5.o = x2Var5.o.c(this.f142762a, m5VarN);
                            }
                        }
                        this.f142763b.f142941b.execute(new au0.x5(18, (Object) this, false, (Object) m5VarN));
                        return;
                    }
                    if (b0Var == b0.DROPPED) {
                        x2 x2Var6 = this.f142763b;
                        if (x2Var6.f142944h) {
                            x2Var6.q();
                        }
                    } else {
                        this.f142763b.f142949p.set(true);
                        x2 x2Var7 = this.f142763b;
                        if (x2Var7.f142944h) {
                            String str = (String) m1Var.c(x2.F);
                            if (str != null) {
                                try {
                                    numValueOf = Integer.valueOf(str);
                                } catch (NumberFormatException unused) {
                                }
                            } else {
                                numValueOf = null;
                            }
                            x2 x2Var8 = this.f142763b;
                            boolean zContains = x2Var8.f142943g.f142866c.contains(g2Var.f124809a);
                            boolean z3 = (x2Var8.f142947m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !x2Var8.f142947m.a();
                            if (zContains && !z3 && !g2Var.e() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            boolean z4 = zContains && !z3;
                            if (z4) {
                                x2.l(this.f142763b, numValueOf);
                            }
                            synchronized (this.f142763b.i) {
                                try {
                                    x2 x2Var9 = this.f142763b;
                                    x2Var9.o = x2Var9.o.b(this.f142762a);
                                    if (z4) {
                                        x2 x2Var10 = this.f142763b;
                                        if (!x2Var10.r(x2Var10.o)) {
                                            if (!this.f142763b.o.d.isEmpty()) {
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            o5 o5Var = x2Var7.f;
                            long nanos = 0;
                            if (o5Var == null) {
                                i5Var = new i5(false, 0L);
                            } else {
                                boolean zContains2 = o5Var.f.contains(g2Var.f124809a);
                                String str2 = (String) m1Var.c(x2.F);
                                if (str2 != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str2);
                                    } catch (NumberFormatException unused2) {
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                boolean z6 = (x2Var7.f142947m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !x2Var7.f142947m.a();
                                if (x2Var7.f.f142798a > this.f142762a.d + 1 && !z6) {
                                    if (numValueOf == null) {
                                        if (zContains2) {
                                            nanos = (long) (x2.H.nextDouble() * x2Var7.f142955x);
                                            double d = x2Var7.f142955x;
                                            o5 o5Var2 = x2Var7.f;
                                            x2Var7.f142955x = Math.min((long) (d * o5Var2.d), o5Var2.f142800c);
                                            z = true;
                                        }
                                    } else if (numValueOf.intValue() >= 0) {
                                        nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                        x2Var7.f142955x = x2Var7.f.f142799b;
                                        z = true;
                                    }
                                    i5Var = new i5(z, nanos);
                                }
                                z = false;
                                i5Var = new i5(z, nanos);
                            }
                            if (i5Var.f142684a) {
                                m5 m5VarN2 = this.f142763b.n(this.f142762a.d + 1, false);
                                if (m5VarN2 != null) {
                                    synchronized (this.f142763b.i) {
                                        try {
                                            x2Var = this.f142763b;
                                            uVar = new b9.u(x2Var.i);
                                            x2Var.v = uVar;
                                        } finally {
                                            th = th;
                                            while (true) {
                                                try {
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                            }
                                        }
                                    }
                                    uVar.r(x2Var.d.schedule(new et0.w((Object) this, (Object) uVar, (Object) m5VarN2, false, 2), i5Var.f142685b, TimeUnit.NANOSECONDS));
                                    return;
                                }
                            }
                        }
                    }
                }
                x2 x2Var11 = this.f142763b;
                z4 z4VarM2 = x2Var11.m(this.f142762a);
                if (z4VarM2 != null) {
                    x2Var11.f142941b.execute(z4VarM2);
                }
                if (this.f142763b.o.f == this.f142762a) {
                    this.f142763b.s(g2Var, b0Var, m1Var);
                    return;
                }
                return;
            }
            x2 x2Var12 = this.f142763b;
            z4 z4VarM3 = x2Var12.m(this.f142762a);
            if (z4VarM3 != null) {
                x2Var12.f142941b.execute(z4VarM3);
            }
            if (this.f142763b.o.f == this.f142762a) {
                this.f142763b.s(ecm.g2.f124806l.g("Too many transparent retries. Might be a bug in gRPC").f(new StatusRuntimeException(g2Var)), b0Var, m1Var);
            }
        }
    }

    @Override // gcm.c0
    public final void d() {
        x2 x2Var = this.f142763b;
        if (x2Var.isReady()) {
            x2Var.f142942c.execute(new com.bumptech.glide.k(this, 9));
        }
    }
}
