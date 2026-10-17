package v60;

import e8.q;
import efm.y;
import ihm.k;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import zfm.m;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object[] f286258m = new Object[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h[] f286259n = new h[0];
    public static final h[] o = new h[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f286260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f286261h;
    public final Lock i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lock f286262j;
    public final AtomicReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f286263l;

    public i() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.i = reentrantReadWriteLock.readLock();
        this.f286262j = reentrantReadWriteLock.writeLock();
        this.f286261h = new AtomicReference(f286259n);
        this.f286260g = new AtomicReference();
        this.k = new AtomicReference();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(h hVar) {
        h[] hVarArr;
        while (true) {
            AtomicReference atomicReference = this.f286261h;
            h[] hVarArr2 = (h[]) atomicReference.get();
            if (hVarArr2 == o || hVarArr2 == (hVarArr = f286259n)) {
                return;
            }
            int length = hVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (hVarArr2[i] == hVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                hVarArr = new h[length - 1];
                System.arraycopy(hVarArr2, 0, hVarArr, 0, i);
                System.arraycopy(hVarArr2, i + 1, hVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(hVarArr2, hVarArr)) {
                if (atomicReference.get() != hVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    public final void f(Object obj2) {
        Lock lock = this.f286262j;
        lock.lock();
        try {
            this.f286263l++;
            this.f286260g.lazySet(obj2);
        } finally {
            lock.unlock();
        }
    }

    @Override // efm.y
    public final void onComplete() {
        if (v1.c.D(this.k, zfm.h.f322035a)) {
            m mVar = m.COMPLETE;
            AtomicReference atomicReference = this.f286261h;
            h[] hVarArr = (h[]) atomicReference.get();
            h[] hVarArr2 = o;
            if (hVarArr != hVarArr2 && (hVarArr = (h[]) atomicReference.getAndSet(hVarArr2)) != hVarArr2) {
                f(mVar);
            }
            for (h hVar : hVarArr) {
                hVar.a(this.f286263l, mVar);
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (th10 == null) {
            th10 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!v1.c.C(this.k, th10)) {
            mo3.a.m(th10);
            return;
        }
        zfm.k kVar = new zfm.k(th10);
        AtomicReference atomicReference = this.f286261h;
        h[] hVarArr = (h[]) atomicReference.get();
        h[] hVarArr2 = o;
        if (hVarArr != hVarArr2 && (hVarArr = (h[]) atomicReference.getAndSet(hVarArr2)) != hVarArr2) {
            f(kVar);
        }
        for (h hVar : hVarArr) {
            hVar.a(this.f286263l, kVar);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (obj2 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (this.k.get() != null) {
            return;
        }
        f(obj2);
        for (h hVar : (h[]) this.f286261h.get()) {
            hVar.a(this.f286263l, obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (this.k.get() != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.r
    public final void subscribeActual(y yVar) {
        q qVar;
        h hVar = new h(yVar, this);
        yVar.onSubscribe(hVar);
        AtomicReference atomicReference = this.f286261h;
        while (true) {
            h[] hVarArr = (h[]) atomicReference.get();
            if (hVarArr == o) {
                Throwable th10 = (Throwable) this.k.get();
                if (th10 == zfm.h.f322035a) {
                    yVar.onComplete();
                    return;
                } else {
                    yVar.onError(th10);
                    return;
                }
            }
            int length = hVarArr.length;
            h[] hVarArr2 = new h[length + 1];
            System.arraycopy(hVarArr, 0, hVarArr2, 0, length);
            hVarArr2[length] = hVar;
            while (!atomicReference.compareAndSet(hVarArr, hVarArr2)) {
                if (atomicReference.get() != hVarArr) {
                    break;
                }
            }
            if (hVar.f286256g) {
                e(hVar);
                return;
            }
            if (hVar.f286256g) {
                return;
            }
            synchronized (hVar) {
                try {
                    if (hVar.f286256g) {
                        return;
                    }
                    if (hVar.f286255c) {
                        return;
                    }
                    i iVar = hVar.f286254b;
                    Lock lock = iVar.i;
                    lock.lock();
                    hVar.f286257h = iVar.f286263l;
                    Object obj2 = iVar.f286260g.get();
                    lock.unlock();
                    hVar.d = obj2 != null;
                    hVar.f286255c = true;
                    if (obj2 == null || hVar.test(obj2)) {
                        return;
                    }
                    while (!hVar.f286256g) {
                        synchronized (hVar) {
                            try {
                                qVar = hVar.e;
                                if (qVar == null) {
                                    hVar.d = false;
                                    return;
                                }
                                hVar.e = null;
                            } finally {
                            }
                        }
                        qVar.d(hVar);
                    }
                    return;
                } finally {
                }
            }
        }
    }
}
