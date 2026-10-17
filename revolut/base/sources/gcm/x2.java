package gcm;

import com.google.common.base.Preconditions;
import com.revolut.tracking.v3.RawEvent;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class x2 implements a0 {
    public static final ecm.g1 E;
    public static final ecm.g1 F;
    public static final ecm.g2 G;
    public static final Random H;
    public final /* synthetic */ ecm.p1 A;
    public final /* synthetic */ ecm.d B;
    public final /* synthetic */ ecm.v C;
    public final /* synthetic */ e8.r D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.p1 f142940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f142941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ecm.k2 f142942c;
    public final ScheduledExecutorService d;
    public final ecm.m1 e;
    public final o5 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s1 f142943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f142944h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ecm.q f142945j;
    public final long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f142946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n5 f142947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.f f142948n;
    public volatile k5 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f142949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicInteger f142950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicInteger f142951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public gpk.c f142952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f142953t;
    public c0 u;
    public b9.u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b9.u f142954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f142955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ecm.g2 f142956y;
    public boolean z;

    static {
        ecm.f1 f1Var = ecm.m1.d;
        BitSet bitSet = ecm.i1.d;
        E = new ecm.g1("grpc-previous-rpc-attempts", f1Var);
        F = new ecm.g1("grpc-retry-pushback-ms", f1Var);
        G = ecm.g2.f.g("Stream thrown away because RetriableStream committed");
        H = new Random();
    }

    public x2(e8.r rVar, ecm.p1 p1Var, ecm.m1 m1Var, ecm.d dVar, o5 o5Var, s1 s1Var, ecm.v vVar) {
        this.D = rVar;
        this.A = p1Var;
        this.B = dVar;
        this.C = vVar;
        k3 k3Var = (k3) rVar.f123511a;
        ecm.q qVar = k3Var.V;
        long j2 = k3Var.W;
        long j3 = k3Var.X;
        Executor executor = dVar.f124791b;
        executor = executor == null ? k3Var.i : executor;
        ScheduledExecutorService scheduledExecutorService = k3Var.f142714g.f142787a.getScheduledExecutorService();
        n5 n5Var = (n5) rVar.f123512b;
        this.f142942c = new ecm.k2(new y4());
        this.i = new Object();
        this.f142948n = new e4m.f(1, (byte) 0);
        this.o = new k5(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.f142949p = new AtomicBoolean();
        this.f142950q = new AtomicInteger();
        this.f142951r = new AtomicInteger();
        this.f142940a = p1Var;
        this.f142945j = qVar;
        this.k = j2;
        this.f142946l = j3;
        this.f142941b = executor;
        this.d = scheduledExecutorService;
        this.e = m1Var;
        this.f = o5Var;
        if (o5Var != null) {
            this.f142955x = o5Var.f142799b;
        }
        this.f142943g = s1Var;
        Preconditions.checkArgument(o5Var == null || s1Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f142944h = s1Var != null;
        this.f142947m = n5Var;
    }

    public static void l(x2 x2Var, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            x2Var.q();
            return;
        }
        synchronized (x2Var.i) {
            try {
                b9.u uVar = x2Var.f142954w;
                if (uVar == null) {
                    return;
                }
                Future futureF = uVar.f();
                b9.u uVar2 = new b9.u(x2Var.i);
                x2Var.f142954w = uVar2;
                if (futureF != null) {
                    futureF.cancel(false);
                }
                uVar2.r(x2Var.d.schedule(new au0.x5(17, (Object) x2Var, false, (Object) uVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // gcm.a0
    public final void a(int i) {
        o(new d5(i, 1));
    }

    @Override // gcm.f6
    public final void b(ecm.o oVar) {
        o(new a5(oVar, 0));
    }

    @Override // gcm.f6
    public final void c(kcm.a aVar) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // gcm.a0
    public final void d(e4m.f fVar) {
        k5 k5Var;
        synchronized (this.i) {
            fVar.b(this.f142948n, "closed");
            k5Var = this.o;
        }
        if (k5Var.f != null) {
            e4m.f fVar2 = new e4m.f(1, (byte) 0);
            k5Var.f.f142773a.d(fVar2);
            fVar.b(fVar2, "committed");
            return;
        }
        e4m.f fVar3 = new e4m.f(1, (byte) 0);
        for (m5 m5Var : k5Var.f142733c) {
            e4m.f fVar4 = new e4m.f(1, (byte) 0);
            m5Var.f142773a.d(fVar4);
            fVar3.f122679b.add(String.valueOf(fVar4));
        }
        fVar.b(fVar3, "open");
    }

    @Override // gcm.a0
    public final void e(int i) {
        o(new d5(i, 0));
    }

    @Override // gcm.f6
    public final void f() {
        o(new b5(1));
    }

    @Override // gcm.f6
    public final void flush() {
        k5 k5Var = this.o;
        if (k5Var.f142731a) {
            k5Var.f.f142773a.flush();
        } else {
            o(new b5(0));
        }
    }

    @Override // gcm.a0
    public final void g() {
        o(new c5(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0068 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:35:0x0068, B:38:0x0074), top: B:50:0x0047 }] */
    @Override // gcm.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(gcm.c0 r7) {
        /*
            r6 = this;
            r6.u = r7
            e8.r r7 = r6.D
            java.lang.Object r7 = r7.f123511a
            gcm.k3 r7 = (gcm.k3) r7
            com.google.firebase.messaging.t r7 = r7.F
            java.lang.Object r0 = r7.f49543b
            monitor-enter(r0)
            java.lang.Object r1 = r7.d     // Catch: java.lang.Throwable -> L16
            ecm.g2 r1 = (ecm.g2) r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L22
        L16:
            r7 = move-exception
            goto L98
        L19:
            java.lang.Object r7 = r7.f49544c     // Catch: java.lang.Throwable -> L16
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch: java.lang.Throwable -> L16
            r7.add(r6)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r1 = r2
        L22:
            if (r1 == 0) goto L28
            r6.k(r1)
            return
        L28:
            java.lang.Object r7 = r6.i
            monitor-enter(r7)
            gcm.k5 r0 = r6.o     // Catch: java.lang.Throwable -> L95
            java.util.List r0 = r0.f142732b     // Catch: java.lang.Throwable -> L95
            gcm.j5 r1 = new gcm.j5     // Catch: java.lang.Throwable -> L95
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L95
            r0.add(r1)     // Catch: java.lang.Throwable -> L95
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L95
            r7 = 0
            gcm.m5 r0 = r6.n(r7, r7)
            if (r0 != 0) goto L40
            return
        L40:
            boolean r1 = r6.f142944h
            if (r1 == 0) goto L91
            java.lang.Object r1 = r6.i
            monitor-enter(r1)
            gcm.k5 r3 = r6.o     // Catch: java.lang.Throwable -> L72
            gcm.k5 r3 = r3.a(r0)     // Catch: java.lang.Throwable -> L72
            r6.o = r3     // Catch: java.lang.Throwable -> L72
            gcm.k5 r3 = r6.o     // Catch: java.lang.Throwable -> L72
            boolean r3 = r6.r(r3)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L74
            gcm.n5 r3 = r6.f142947m     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L68
            java.util.concurrent.atomic.AtomicInteger r4 = r3.d     // Catch: java.lang.Throwable -> L72
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L72
            int r3 = r3.f142785b     // Catch: java.lang.Throwable -> L72
            if (r4 <= r3) goto L66
            r7 = 1
        L66:
            if (r7 == 0) goto L74
        L68:
            b9.u r2 = new b9.u     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = r6.i     // Catch: java.lang.Throwable -> L72
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r6.f142954w = r2     // Catch: java.lang.Throwable -> L72
            goto L74
        L72:
            r7 = move-exception
            goto L8f
        L74:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L91
            java.util.concurrent.ScheduledExecutorService r7 = r6.d
            au0.x5 r1 = new au0.x5
            r3 = 17
            r4 = 0
            r1.<init>(r3, r6, r4, r2)
            gcm.s1 r3 = r6.f142943g
            long r3 = r3.f142865b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r1, r3, r5)
            r2.r(r7)
            goto L91
        L8f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r7
        L91:
            r6.p(r0)
            return
        L95:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L95
            throw r0
        L98:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.x2.h(gcm.c0):void");
    }

    @Override // gcm.a0
    public final void i(ecm.w wVar) {
        o(new a5(wVar, 1));
    }

    @Override // gcm.f6
    public final boolean isReady() {
        Iterator it8 = this.o.f142733c.iterator();
        while (it8.hasNext()) {
            if (((m5) it8.next()).f142773a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // gcm.a0
    public final void j(ecm.y yVar) {
        o(new a5(yVar, 2));
    }

    @Override // gcm.a0
    public final void k(ecm.g2 g2Var) {
        m5 m5Var;
        m5 m5Var2 = new m5(0);
        m5Var2.f142773a = new b4();
        z4 z4VarM = m(m5Var2);
        if (z4VarM != null) {
            synchronized (this.i) {
                this.o = this.o.e(m5Var2);
            }
            z4VarM.run();
            s(g2Var, b0.PROCESSED, new ecm.m1());
            return;
        }
        synchronized (this.i) {
            try {
                if (this.o.f142733c.contains(this.o.f)) {
                    m5Var = this.o.f;
                } else {
                    this.f142956y = g2Var;
                    m5Var = null;
                }
                k5 k5Var = this.o;
                this.o = new k5(k5Var.f142732b, k5Var.f142733c, k5Var.d, k5Var.f, true, k5Var.f142731a, k5Var.f142735h, k5Var.e);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (m5Var != null) {
            m5Var.f142773a.k(g2Var);
        }
    }

    public final z4 m(m5 m5Var) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.i) {
            try {
                if (this.o.f != null) {
                    return null;
                }
                Collection collection = this.o.f142733c;
                k5 k5Var = this.o;
                Preconditions.checkState(k5Var.f == null, "Already committed");
                List list2 = k5Var.f142732b;
                if (k5Var.f142733c.contains(m5Var)) {
                    list = null;
                    collectionSingleton = Collections.singleton(m5Var);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.o = new k5(list, collectionSingleton, k5Var.d, m5Var, k5Var.f142734g, z, k5Var.f142735h, k5Var.e);
                ((AtomicLong) this.f142945j.f124861b).addAndGet(-this.f142953t);
                b9.u uVar = this.v;
                boolean zC = uVar != null ? uVar.c() : false;
                b9.u uVar2 = this.v;
                if (uVar2 != null) {
                    Future futureF = uVar2.f();
                    this.v = null;
                    future = futureF;
                } else {
                    future = null;
                }
                b9.u uVar3 = this.f142954w;
                if (uVar3 != null) {
                    Future futureF2 = uVar3.f();
                    this.f142954w = null;
                    future2 = futureF2;
                } else {
                    future2 = null;
                }
                return new z4(this, collection, m5Var, future, zC, future2);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final m5 n(int i, boolean z) {
        AtomicInteger atomicInteger;
        int i2;
        do {
            atomicInteger = this.f142951r;
            i2 = atomicInteger.get();
            if (i2 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i2, i2 + 1));
        m5 m5Var = new m5(i);
        f5 f5Var = new f5(new h5(this, m5Var));
        ecm.m1 m1Var = new ecm.m1();
        ecm.m1 m1Var2 = this.e;
        int i3 = m1Var2.f124844b;
        if (i3 != 0) {
            Object[] objArr = m1Var.f124843a;
            int length = objArr != null ? objArr.length : 0;
            int i5 = m1Var.f124844b;
            int i6 = length - (i5 * 2);
            if (i5 == 0 || i6 < i3 * 2) {
                m1Var.b((i3 * 2) + (i5 * 2));
            }
            System.arraycopy(m1Var2.f124843a, 0, m1Var.f124843a, m1Var.f124844b * 2, m1Var2.f124844b * 2);
            m1Var.f124844b += m1Var2.f124844b;
        }
        if (i > 0) {
            m1Var.d(E, String.valueOf(i));
        }
        ecm.d dVar = this.B;
        dVar.getClass();
        List list = dVar.d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(f5Var);
        oe.c cVarB = ecm.d.b(dVar);
        cVarB.d = Collections.unmodifiableList(arrayList);
        ecm.d dVar2 = new ecm.d(cVarB);
        ecm.n[] nVarArrC = p1.c(dVar2, m1Var, i, z);
        ecm.v vVar = this.C;
        ecm.v vVarA = vVar.a();
        try {
            a0 a0VarD = ((k3) this.D.f123511a).E.d(this.A, m1Var, dVar2, nVarArrC);
            vVar.c(vVarA);
            m5Var.f142773a = a0VarD;
            return m5Var;
        } catch (Throwable th10) {
            vVar.c(vVarA);
            throw th10;
        }
    }

    public final void o(g5 g5Var) {
        Collection collection;
        synchronized (this.i) {
            try {
                if (!this.o.f142731a) {
                    this.o.f142732b.add(g5Var);
                }
                collection = this.o.f142733c;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            g5Var.a((m5) it8.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r8.f142942c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r9.f142773a.h(new gcm.l5(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        r0 = r9.f142773a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r8.o.f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r9 = r8.f142956y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        r9 = gcm.x2.G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        r0.k(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0094, code lost:
    
        r4 = (gcm.g5) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if ((r4 instanceof gcm.j5) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        r4 = r8.o;
        r5 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        if (r4.f142734g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(gcm.m5 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.i
            monitor-enter(r4)
            gcm.k5 r5 = r8.o     // Catch: java.lang.Throwable -> L11
            gcm.m5 r6 = r5.f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L11:
            r9 = move-exception
            goto Lb2
        L14:
            boolean r6 = r5.f142734g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L38
        L1a:
            java.util.List r6 = r5.f142732b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5d
            gcm.k5 r0 = r5.e(r9)     // Catch: java.lang.Throwable -> L11
            r8.o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.isReady()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            com.bumptech.glide.k r1 = new com.bumptech.glide.k     // Catch: java.lang.Throwable -> L11
            r0 = 8
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L38:
            if (r1 == 0) goto L40
            ecm.k2 r9 = r8.f142942c
            r9.execute(r1)
            return
        L40:
            if (r2 != 0) goto L4c
            gcm.a0 r0 = r9.f142773a
            gcm.l5 r1 = new gcm.l5
            r1.<init>(r8, r9)
            r0.h(r1)
        L4c:
            gcm.a0 r0 = r9.f142773a
            gcm.k5 r1 = r8.o
            gcm.m5 r1 = r1.f
            if (r1 != r9) goto L57
            ecm.g2 r9 = r8.f142956y
            goto L59
        L57:
            ecm.g2 r9 = gcm.x2.G
        L59:
            r0.k(r9)
            return
        L5d:
            boolean r6 = r9.f142774b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L63
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L63:
            int r6 = r0 + 128
            java.util.List r7 = r5.f142732b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f142732b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L89
        L7d:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f142732b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L89:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Laf
            java.lang.Object r4 = r0.next()
            gcm.g5 r4 = (gcm.g5) r4
            r4.a(r9)
            boolean r4 = r4 instanceof gcm.j5
            if (r4 == 0) goto La2
            r2 = 1
        La2:
            gcm.k5 r4 = r8.o
            gcm.m5 r5 = r4.f
            if (r5 == 0) goto Lab
            if (r5 == r9) goto Lab
            goto Laf
        Lab:
            boolean r4 = r4.f142734g
            if (r4 == 0) goto L8e
        Laf:
            r0 = r6
            goto L4
        Lb2:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gcm.x2.p(gcm.m5):void");
    }

    public final void q() {
        Future future;
        synchronized (this.i) {
            try {
                b9.u uVar = this.f142954w;
                future = null;
                if (uVar != null) {
                    Future futureF = uVar.f();
                    this.f142954w = null;
                    future = futureF;
                }
                k5 k5Var = this.o;
                if (!k5Var.f142735h) {
                    k5Var = new k5(k5Var.f142732b, k5Var.f142733c, k5Var.d, k5Var.f, k5Var.f142734g, k5Var.f142731a, true, k5Var.e);
                }
                this.o = k5Var;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final boolean r(k5 k5Var) {
        return k5Var.f == null && k5Var.e < this.f142943g.f142864a && !k5Var.f142735h;
    }

    @Override // gcm.f6
    public final void request() {
        k5 k5Var = this.o;
        if (k5Var.f142731a) {
            k5Var.f.f142773a.request();
        } else {
            o(new c5(1));
        }
    }

    public final void s(ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var) {
        this.f142952s = new gpk.c(g2Var, b0Var, m1Var);
        if (this.f142951r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f142942c.execute(new a(this, g2Var, b0Var, m1Var, 2));
        }
    }

    public final void t(RawEvent rawEvent) {
        k5 k5Var = this.o;
        if (k5Var.f142731a) {
            k5Var.f.f142773a.c(this.f142940a.c(rawEvent));
        } else {
            o(new e5(this, rawEvent));
        }
    }
}
