package hlm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import skm.e0;
import skm.k2;
import skm.l;
import zkm.t;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f153484c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f153485g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gna.i f153487b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i, int i2) {
        this.f153486a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(a0.d.n("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(a0.d.n("The number of acquired permits should be in 0..", i).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i - i2;
        this.f153487b = new gna.i(this, 29);
    }

    public final Object a(gim.c frame) {
        int andDecrement;
        do {
            andDecrement = f153485g.getAndDecrement(this);
        } while (andDecrement > this.f153486a);
        if (andDecrement > 0) {
            return Unit.f186387a;
        }
        l lVarU = e0.u(fim.h.b(frame));
        try {
            if (!c(lVarU)) {
                b(lVarU);
            }
            Object objT = lVarU.t();
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (objT == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objT != aVar) {
                objT = Unit.f186387a;
            }
            return objT == aVar ? objT : Unit.f186387a;
        } catch (Throwable th10) {
            lVarU.C();
            throw th10;
        }
    }

    public final void b(CancellableContinuation cancellableContinuation) {
        while (true) {
            int andDecrement = f153485g.getAndDecrement(this);
            if (andDecrement <= this.f153486a) {
                if (andDecrement > 0) {
                    cancellableContinuation.e(Unit.f186387a, this.f153487b);
                    return;
                } else if (c((k2) cancellableContinuation)) {
                    return;
                }
            }
        }
    }

    public final boolean c(k2 k2Var) {
        Object objD;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        f fVar = f.f;
        long j2 = andIncrement / ((long) j.f);
        loop0: while (true) {
            objD = zkm.b.d(kVar, j2, fVar);
            if (!zkm.b.h(objD)) {
                t tVarE = zkm.b.e(objD);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f323123c >= tVarE.f323123c) {
                        break loop0;
                    }
                    if (!tVarE.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarE)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (tVarE.f()) {
                                tVarE.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) zkm.b.e(objD);
        AtomicReferenceArray atomicReferenceArray = kVar2.e;
        int i = (int) (andIncrement % ((long) j.f));
        while (!atomicReferenceArray.compareAndSet(i, null, k2Var)) {
            if (atomicReferenceArray.get(i) != null) {
                cfm.c cVar = j.f153489b;
                cfm.c cVar2 = j.f153490c;
                while (!atomicReferenceArray.compareAndSet(i, cVar, cVar2)) {
                    if (atomicReferenceArray.get(i) != cVar) {
                        return false;
                    }
                }
                ((CancellableContinuation) k2Var).e(Unit.f186387a, this.f153487b);
                return true;
            }
        }
        k2Var.b(kVar2, i);
        return true;
    }

    public final int d() {
        return Math.max(f153485g.get(this), 0);
    }

    public final void e() {
        int i;
        Object objD;
        boolean zJ;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f153485g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.f153486a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153484c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j2 = andIncrement2 / ((long) j.f);
            g gVar = g.f;
            while (true) {
                objD = zkm.b.d(kVar, j2, gVar);
                if (zkm.b.h(objD)) {
                    break;
                }
                t tVarE = zkm.b.e(objD);
                while (true) {
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f323123c >= tVarE.f323123c) {
                        break;
                    }
                    if (!tVarE.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarE)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (tVarE.f()) {
                                tVarE.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                    }
                }
            }
            k kVar2 = (k) zkm.b.e(objD);
            AtomicReferenceArray atomicReferenceArray = kVar2.e;
            kVar2.b();
            zJ = false;
            if (kVar2.f323123c <= j2) {
                int i3 = (int) (andIncrement2 % ((long) j.f));
                Object andSet = atomicReferenceArray.getAndSet(i3, j.f153489b);
                if (andSet == null) {
                    int i5 = j.f153488a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (atomicReferenceArray.get(i3) == j.f153490c) {
                            zJ = true;
                            break;
                        }
                    }
                    cfm.c cVar = j.f153489b;
                    cfm.c cVar2 = j.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, cVar, cVar2)) {
                            if (atomicReferenceArray.get(i3) != cVar) {
                                break;
                            }
                        } else {
                            zJ = true;
                            break;
                        }
                    }
                    zJ = !zJ;
                } else if (andSet != j.e) {
                    if (andSet instanceof CancellableContinuation) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                        cfm.c cVarQ = cancellableContinuation.q(Unit.f186387a, this.f153487b);
                        if (cVarQ != null) {
                            cancellableContinuation.m(cVarQ);
                            zJ = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof flm.i)) {
                            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(andSet, "unexpected: "));
                        }
                        zJ = ((flm.h) ((flm.i) andSet)).j(this, Unit.f186387a);
                    }
                }
            }
        } while (!zJ);
    }

    public final boolean f() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f153485g;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.f153486a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    return true;
                }
            }
        }
    }
}
