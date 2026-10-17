package kotlinx.coroutines;

import d9.t0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.e2;
import skm.i0;
import skm.l;
import skm.r0;
import skm.s0;
import skm.v0;
import skm.x0;
import skm.y0;
import skm.z0;
import zkm.n;
import zkm.z;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b extends z0 implements i0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f187933g = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f187934h = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public final void A() {
        x0 x0VarB;
        y0 y0Var = (y0) f187933g.get(this);
        if (y0Var == null || z.f323133b.get(y0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (y0Var) {
                try {
                    x0[] x0VarArr = y0Var.f323134a;
                    x0 x0Var = x0VarArr != null ? x0VarArr[0] : null;
                    if (x0Var != null) {
                        x0VarB = ((jNanoTime - x0Var.f264017a) > 0L ? 1 : ((jNanoTime - x0Var.f264017a) == 0L ? 0 : -1)) >= 0 ? B(x0Var) : false ? y0Var.b(0) : null;
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } while (x0VarB != null);
    }

    public final boolean B(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!C()) {
                if (obj2 != null) {
                    if (!(obj2 instanceof n)) {
                        if (obj2 != e0.f263968c) {
                            n nVar = new n(8, true);
                            nVar.a((Runnable) obj2);
                            nVar.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, nVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    n nVar2 = (n) obj2;
                    int iA = nVar2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        n nVarC = nVar2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, nVarC) && atomicReferenceFieldUpdater.get(this) == obj2) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean C() {
        return f187934h.get(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D() {
        /*
            r7 = this;
            kotlin.collections.ArrayDeque r0 = r7.d
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.b.f187933g
            java.lang.Object r0 = r0.get(r7)
            skm.y0 r0 = (skm.y0) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = zkm.z.f323133b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.b.f
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof zkm.n
            if (r3 == 0) goto L4f
            zkm.n r0 = (zkm.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = zkm.n.f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            cfm.c r3 = skm.e0.f263968c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.D():boolean");
    }

    public final void E(long j2, x0 x0Var) {
        int iB;
        Thread threadR;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f187933g;
        if (C()) {
            iB = 1;
        } else {
            y0 y0Var = (y0) atomicReferenceFieldUpdater.get(this);
            if (y0Var == null) {
                y0 y0Var2 = new y0();
                y0Var2.f264020c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, y0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                Intrinsics.h(obj2);
                y0Var = (y0) obj2;
            }
            iB = x0Var.b(j2, y0Var, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                y(j2, x0Var);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        y0 y0Var3 = (y0) atomicReferenceFieldUpdater.get(this);
        if (y0Var3 != null) {
            synchronized (y0Var3) {
                x0[] x0VarArr = y0Var3.f323134a;
                x0Var = x0VarArr != null ? x0VarArr[0] : null;
            }
        }
        if (x0Var != x0Var || Thread.currentThread() == (threadR = r())) {
            return;
        }
        LockSupport.unpark(threadR);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        z(runnable);
    }

    @Override // skm.i0
    public final void g(long j2, l lVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            v0 v0Var = new v0(this, j3 + jNanoTime, lVar);
            E(jNanoTime, v0Var);
            lVar.w(new s0(v0Var));
        }
    }

    public r0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        return t0.j(j2, runnable, coroutineContext);
    }

    @Override // skm.z0
    public void shutdown() {
        x0 x0VarB;
        e2.f263973a.set(null);
        f187934h.set(this, 1);
        cfm.c cVar = e0.f263968c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        loop0: while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != null) {
                if (!(obj2 instanceof n)) {
                    if (obj2 != cVar) {
                        n nVar = new n(8, true);
                        nVar.a((Runnable) obj2);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((n) obj2).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (w() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            y0 y0Var = (y0) f187933g.get(this);
            if (y0Var == null) {
                return;
            }
            synchronized (y0Var) {
                x0VarB = z.f323133b.get(y0Var) > 0 ? y0Var.b(0) : null;
            }
            if (x0VarB == null) {
                return;
            } else {
                y(jNanoTime, x0VarB);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // skm.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long w() {
        /*
            r10 = this;
            cfm.c r0 = skm.e0.f263968c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.b.f
            boolean r2 = r10.x()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.A()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof zkm.n
            if (r6 == 0) goto L3e
            r6 = r2
            zkm.n r6 = (zkm.n) r6
            java.lang.Object r7 = r6.d()
            cfm.c r8 = zkm.n.f323115g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            zkm.n r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            kotlin.collections.ArrayDeque r2 = r10.d
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof zkm.n
            if (r2 == 0) goto L8d
            zkm.n r1 = (zkm.n) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = zkm.n.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.b.f187933g
            java.lang.Object r0 = r0.get(r10)
            skm.y0 r0 = (skm.y0) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            skm.x0[] r1 = r0.f323134a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f264017a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.w():long");
    }

    public void z(Runnable runnable) {
        A();
        if (!B(runnable)) {
            a.i.z(runnable);
            return;
        }
        Thread threadR = r();
        if (Thread.currentThread() != threadR) {
            LockSupport.unpark(threadR);
        }
    }
}
