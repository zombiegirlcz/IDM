package skm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i1 extends zkm.j implements r0, d1 {
    public r1 d;

    @Override // skm.d1
    public final v1 b() {
        return null;
    }

    @Override // skm.r0
    public final void dispose() {
        r1 r1VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r1.f264005a;
            Object obj2 = atomicReferenceFieldUpdater.get(r1VarH);
            if (obj2 instanceof i1) {
                if (obj2 != this) {
                    return;
                }
                u0 u0Var = e0.f263971j;
                while (!atomicReferenceFieldUpdater.compareAndSet(r1VarH, obj2, u0Var)) {
                    if (atomicReferenceFieldUpdater.get(r1VarH) != obj2) {
                        break;
                    }
                }
                return;
            }
            if (!(obj2 instanceof d1) || ((d1) obj2).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zkm.j.f323110a;
                Object obj3 = atomicReferenceFieldUpdater2.get(this);
                if (obj3 instanceof zkm.q) {
                    return;
                }
                if (obj3 == this) {
                    return;
                }
                Intrinsics.i(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                zkm.j jVar = (zkm.j) obj3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = zkm.j.f323112c;
                zkm.q qVar = (zkm.q) atomicReferenceFieldUpdater3.get(jVar);
                if (qVar == null) {
                    qVar = new zkm.q(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, qVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj3, qVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                        break;
                    }
                }
                jVar.d();
                return;
            }
        }
    }

    public Job getParent() {
        return h();
    }

    public final r1 h() {
        r1 r1Var = this.d;
        if (r1Var != null) {
            return r1Var;
        }
        Intrinsics.r("job");
        throw null;
    }

    public abstract boolean i();

    @Override // skm.d1
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th10);

    @Override // zkm.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.s(this) + "[job@" + e0.s(h()) + ']';
    }
}
