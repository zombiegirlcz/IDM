package elm;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import zkm.r;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements Executor, Closeable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f127534h = AtomicLongFieldUpdater.newUpdater(e.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(e.class, "controlState$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f127535j = AtomicIntegerFieldUpdater.newUpdater(e.class, "_isTerminated$volatile");
    public static final cfm.c k = new cfm.c("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f127537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f127538c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final h e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r f127539g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public e(long j2, String str, int i2, int i3) {
        this.f127536a = i2;
        this.f127537b = i3;
        this.f127538c = j2;
        this.d = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(j6.a.l(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(a0.d.g(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(j6.a.l(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(p.a.n(j2, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.e = new h();
        this.f = new h();
        this.f127539g = new r((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
    }

    public static /* synthetic */ void g(e eVar, Runnable runnable, int i2) {
        eVar.f(runnable, false, (i2 & 4) == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elm.e.close():void");
    }

    public final int d() {
        synchronized (this.f127539g) {
            try {
                if (f127535j.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = i;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f127536a) {
                    return 0;
                }
                if (i2 >= this.f127537b) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f127539g.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i5);
                this.f127539g.c(i5, cVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = i3 + 1;
                cVar.start();
                return i6;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void f(Runnable runnable, boolean z, boolean z3) {
        k lVar;
        d dVar;
        m.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof k) {
            lVar = (k) runnable;
            lVar.f127545a = jNanoTime;
            lVar.f127546b = z;
        } else {
            lVar = new l(runnable, jNanoTime, z);
        }
        boolean z4 = lVar.f127546b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.f(cVar.f127533h, this)) {
            cVar = null;
        }
        if (cVar != null && (dVar = cVar.f127531c) != d.TERMINATED && (lVar.f127546b || dVar != d.BLOCKING)) {
            cVar.f127532g = true;
            o oVar = cVar.f127529a;
            if (z3) {
                lVar = oVar.a(lVar);
            } else {
                oVar.getClass();
                k kVar = (k) o.f127552b.getAndSet(oVar, lVar);
                lVar = kVar == null ? null : oVar.a(kVar);
            }
        }
        if (lVar != null) {
            if (!(lVar.f127546b ? this.f.a(lVar) : this.e.a(lVar))) {
                throw new RejectedExecutionException(v0.a.i(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z4) {
            if (j() || i(jAddAndGet)) {
                return;
            }
            j();
            return;
        }
        if (j() || i(atomicLongFieldUpdater.get(this))) {
            return;
        }
        j();
    }

    public final void h(c cVar, int i2, int i3) {
        while (true) {
            long j2 = f127534h.get(this);
            int i5 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i5 == i2) {
                if (i3 == 0) {
                    Object objC = cVar.c();
                    while (true) {
                        if (objC == k) {
                            i5 = -1;
                            break;
                        }
                        if (objC == null) {
                            i5 = 0;
                            break;
                        }
                        c cVar2 = (c) objC;
                        int iB = cVar2.b();
                        if (iB != 0) {
                            i5 = iB;
                            break;
                        }
                        objC = cVar2.c();
                    }
                } else {
                    i5 = i3;
                }
            }
            if (i5 >= 0) {
                if (f127534h.compareAndSet(this, j2, ((long) i5) | j3)) {
                    return;
                }
            }
        }
    }

    public final boolean i(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f127536a;
        if (i2 < i3) {
            int iD = d();
            if (iD == 1 && i3 > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        cfm.c cVar;
        int iB;
        while (true) {
            long j2 = f127534h.get(this);
            c cVar2 = (c) this.f127539g.b((int) (2097151 & j2));
            if (cVar2 == null) {
                cVar2 = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = cVar2.c();
                while (true) {
                    cVar = k;
                    if (objC == cVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    c cVar3 = (c) objC;
                    iB = cVar3.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = cVar3.c();
                }
                if (iB >= 0) {
                    if (f127534h.compareAndSet(this, j2, ((long) iB) | j3)) {
                        cVar2.g(cVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (cVar2 == null) {
                return false;
            }
            if (c.i.compareAndSet(cVar2, -1, 0)) {
                LockSupport.unpark(cVar2);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f127539g;
        int iA = rVar.a();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        for (int i22 = 1; i22 < iA; i22++) {
            c cVar = (c) rVar.b(i22);
            if (cVar != null) {
                o oVar = cVar.f127529a;
                oVar.getClass();
                int i32 = o.f127552b.get(oVar) != null ? (o.f127553c.get(oVar) - o.d.get(oVar)) + 1 : o.f127553c.get(oVar) - o.d.get(oVar);
                int i33 = b.f127528a[cVar.f127531c.ordinal()];
                if (i33 == 1) {
                    i5++;
                } else if (i33 == 2) {
                    i3++;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(i32);
                    sb6.append('b');
                    arrayList.add(sb6.toString());
                } else if (i33 == 3) {
                    i2++;
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(i32);
                    sb9.append('c');
                    arrayList.add(sb9.toString());
                } else if (i33 == 4) {
                    i6++;
                    if (i32 > 0) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(i32);
                        sb10.append('d');
                        arrayList.add(sb10.toString());
                    }
                } else {
                    if (i33 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i21++;
                }
            }
        }
        long j2 = i.get(this);
        StringBuilder sb11 = new StringBuilder();
        sb11.append(this.d);
        sb11.append('@');
        sb11.append(e0.s(this));
        sb11.append("[Pool Size {core = ");
        int i43 = this.f127536a;
        sb11.append(i43);
        sb11.append(", max = ");
        t61.a.x(sb11, this.f127537b, "}, Worker States {CPU = ", i2, ", blocking = ");
        t61.a.x(sb11, i3, ", parked = ", i5, ", dormant = ");
        t61.a.x(sb11, i6, ", terminated = ", i21, "}, running workers queues = ");
        sb11.append(arrayList);
        sb11.append(", global CPU queue size = ");
        sb11.append(this.e.b());
        sb11.append(", global blocking queue size = ");
        sb11.append(this.f.b());
        sb11.append(", Control State {created workers= ");
        sb11.append((int) (2097151 & j2));
        sb11.append(", blocking tasks = ");
        sb11.append((int) ((4398044413952L & j2) >> 21));
        sb11.append(", CPUs acquired = ");
        sb11.append(i43 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb11.append("}]");
        return sb11.toString();
    }
}
