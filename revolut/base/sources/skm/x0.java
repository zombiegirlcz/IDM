package skm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class x0 implements Runnable, Comparable, r0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f264017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f264018b = -1;

    public x0(long j2) {
        this.f264017a = j2;
    }

    public final int b(long j2, y0 y0Var, kotlinx.coroutines.b bVar) {
        synchronized (this) {
            if (this._heap == e0.f263967b) {
                return 2;
            }
            synchronized (y0Var) {
                try {
                    x0[] x0VarArr = y0Var.f323134a;
                    x0 x0Var = x0VarArr != null ? x0VarArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.b.f;
                    if (bVar.C()) {
                        return 1;
                    }
                    if (x0Var == null) {
                        y0Var.f264020c = j2;
                    } else {
                        long j3 = x0Var.f264017a;
                        if (j3 - j2 < 0) {
                            j2 = j3;
                        }
                        if (j2 - y0Var.f264020c > 0) {
                            y0Var.f264020c = j2;
                        }
                    }
                    long j5 = this.f264017a;
                    long j16 = y0Var.f264020c;
                    if (j5 - j16 < 0) {
                        this.f264017a = j16;
                    }
                    y0Var.a(this);
                    return 0;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }

    public final void c(y0 y0Var) {
        if (this._heap == e0.f263967b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = y0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        long j2 = this.f264017a - ((x0) obj2).f264017a;
        if (j2 > 0) {
            return 1;
        }
        return j2 < 0 ? -1 : 0;
    }

    @Override // skm.r0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj2 = this._heap;
                cfm.c cVar = e0.f263967b;
                if (obj2 == cVar) {
                    return;
                }
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    synchronized (y0Var) {
                        Object obj3 = this._heap;
                        if ((obj3 instanceof zkm.z ? (zkm.z) obj3 : null) != null) {
                            y0Var.b(this.f264018b);
                        }
                    }
                }
                this._heap = cVar;
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public String toString() {
        return a0.d.t(new StringBuilder("Delayed[nanos="), this.f264017a, ']');
    }
}
