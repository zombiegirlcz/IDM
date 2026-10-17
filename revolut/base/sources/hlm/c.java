package hlm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.l;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends h implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f153482h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : d.f153483a;
    }

    @Override // hlm.a
    public final boolean isLocked() {
        return d() == 0;
    }

    @Override // hlm.a
    public final Object lock(Object obj2, Continuation frame) {
        if (tryLock(obj2)) {
            return Unit.f186387a;
        }
        l lVarU = e0.u(fim.h.b(frame));
        try {
            b(new b(this, lVarU, obj2));
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

    public final String toString() {
        return "Mutex@" + e0.s(this) + "[isLocked=" + isLocked() + ",owner=" + f153482h.get(this) + ']';
    }

    @Override // hlm.a
    public final boolean tryLock(Object obj2) {
        while (true) {
            boolean zF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153482h;
            if (zF) {
                atomicReferenceFieldUpdater.set(this, obj2);
                return true;
            }
            if (obj2 == null) {
                return false;
            }
            while (isLocked()) {
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                if (obj3 != d.f153483a) {
                    if (obj3 != obj2) {
                        return false;
                    }
                    throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "This mutex is already locked by the specified owner: "));
                }
            }
        }
    }

    @Override // hlm.a
    public final void unlock(Object obj2) {
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153482h;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            cfm.c cVar = d.f153483a;
            if (obj3 != cVar) {
                if (obj3 == obj2 || obj2 == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    e();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj3 + ", but " + obj2 + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
