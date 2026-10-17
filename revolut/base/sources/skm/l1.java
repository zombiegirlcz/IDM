package skm;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes13.dex */
public final class l1 implements d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f263989b = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f263990c = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f263991a;

    public l1(v1 v1Var, Throwable th10) {
        this.f263991a = v1Var;
        this._rootCause$volatile = th10;
    }

    public final void a(Throwable th10) {
        Throwable thC = c();
        if (thC == null) {
            f263990c.set(this, th10);
            return;
        }
        if (th10 == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 == null) {
            atomicReferenceFieldUpdater.set(this, th10);
            return;
        }
        if (!(obj2 instanceof Throwable)) {
            if (!(obj2 instanceof ArrayList)) {
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "State is "));
            }
            ((ArrayList) obj2).add(th10);
        } else {
            if (th10 == obj2) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj2);
            arrayList.add(th10);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }
    }

    @Override // skm.d1
    public final v1 b() {
        return this.f263991a;
    }

    public final Throwable c() {
        return (Throwable) f263990c.get(this);
    }

    public final boolean d() {
        return c() != null;
    }

    public final ArrayList e(Throwable th10) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        if (obj2 == null) {
            arrayList = new ArrayList(4);
        } else if (obj2 instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj2);
            arrayList = arrayList2;
        } else {
            if (!(obj2 instanceof ArrayList)) {
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "State is "));
            }
            arrayList = (ArrayList) obj2;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th10 != null && !th10.equals(thC)) {
            arrayList.add(th10);
        }
        atomicReferenceFieldUpdater.set(this, e0.f263970h);
        return arrayList;
    }

    @Override // skm.d1
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Finishing[cancelling=");
        sb6.append(d());
        sb6.append(", completing=");
        sb6.append(f263989b.get(this) == 1);
        sb6.append(", rootCause=");
        sb6.append(c());
        sb6.append(", exceptions=");
        sb6.append(d.get(this));
        sb6.append(", list=");
        sb6.append(this.f263991a);
        sb6.append(']');
        return sb6.toString();
    }
}
