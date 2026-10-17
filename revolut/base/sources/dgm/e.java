package dgm;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends c {
    public static final d[] d = new d[0];
    public static final d[] e = new d[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f114725b = new AtomicReference(e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f114726c;

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.f114725b.get() == d) {
            bVar.cancel();
        } else {
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        AtomicReference atomicReference;
        d[] dVarArr;
        d[] dVarArr2;
        d dVar = new d(aVar, this);
        aVar.e(dVar);
        do {
            atomicReference = this.f114725b;
            dVarArr = (d[]) atomicReference.get();
            if (dVarArr == d) {
                Throwable th10 = this.f114726c;
                if (th10 != null) {
                    aVar.onError(th10);
                    return;
                } else {
                    aVar.onComplete();
                    return;
                }
            }
            int length = dVarArr.length;
            dVarArr2 = new d[length + 1];
            System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
            dVarArr2[length] = dVar;
        } while (!t61.a.B(atomicReference, dVarArr, dVarArr2));
        if (dVar.get() == Long.MIN_VALUE) {
            t(dVar);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        AtomicReference atomicReference = this.f114725b;
        Object obj2 = atomicReference.get();
        Object obj3 = d;
        if (obj2 == obj3) {
            return;
        }
        d[] dVarArr = (d[]) atomicReference.getAndSet(obj3);
        for (d dVar : dVarArr) {
            if (dVar.get() != Long.MIN_VALUE) {
                dVar.f114723a.onComplete();
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference atomicReference = this.f114725b;
        Object obj2 = atomicReference.get();
        Object obj3 = d;
        if (obj2 == obj3) {
            mo3.a.m(th10);
            return;
        }
        this.f114726c = th10;
        d[] dVarArr = (d[]) atomicReference.getAndSet(obj3);
        for (d dVar : dVarArr) {
            if (dVar.get() != Long.MIN_VALUE) {
                dVar.f114723a.onError(th10);
            } else {
                mo3.a.m(th10);
            }
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        long j2;
        long j3;
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (d dVar : (d[]) this.f114725b.get()) {
            dom.a aVar = dVar.f114723a;
            long j5 = dVar.get();
            if (j5 != Long.MIN_VALUE) {
                if (j5 != 0) {
                    aVar.onNext(obj2);
                    do {
                        j2 = dVar.get();
                        if (j2 != Long.MIN_VALUE && j2 != Long.MAX_VALUE) {
                            j3 = j2 - 1;
                            if (j3 < 0) {
                                mo3.a.m(new IllegalStateException(p.a.m(j3, "More produced than requested: ")));
                                j3 = 0;
                            }
                        }
                    } while (!dVar.compareAndSet(j2, j3));
                } else {
                    dVar.cancel();
                    aVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    public final void t(d dVar) {
        AtomicReference atomicReference;
        d[] dVarArr;
        d[] dVarArr2;
        do {
            atomicReference = this.f114725b;
            dVarArr = (d[]) atomicReference.get();
            if (dVarArr == d || dVarArr == (dVarArr2 = e)) {
                return;
            }
            int length = dVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (dVarArr[i] == dVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                dVarArr2 = new d[length - 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                System.arraycopy(dVarArr, i + 1, dVarArr2, i, (length - i) - 1);
            }
        } while (!t61.a.B(atomicReference, dVarArr, dVarArr2));
    }
}
