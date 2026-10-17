package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f262889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f262890c = true;
    public boolean d = true;
    public Throwable e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f262891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f262892h;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f262888a = i;
        this.f262892h = obj2;
        this.f262891g = obj3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f262888a) {
            case 0:
                Throwable th10 = this.e;
                if (th10 != null) {
                    throw ygm.g.f(th10);
                }
                if (!this.f262890c) {
                    return false;
                }
                if (this.d) {
                    j jVar = (j) this.f262891g;
                    AtomicInteger atomicInteger = jVar.f262916c;
                    if (!this.f) {
                        this.f = true;
                        atomicInteger.set(1);
                        new a1((Observable) this.f262892h, 5).subscribe(jVar);
                    }
                    try {
                        atomicInteger.set(1);
                        fgm.f fVar = (fgm.f) jVar.f262915b.take();
                        Object obj2 = fVar.f135107a;
                        if (obj2 == null || (obj2 instanceof ygm.j)) {
                            this.f262890c = false;
                            if (obj2 == null) {
                                return false;
                            }
                            Throwable thA = fVar.a();
                            this.e = thA;
                            throw ygm.g.f(thA);
                        }
                        this.d = false;
                        if (obj2 == null || (obj2 instanceof ygm.j)) {
                            obj2 = null;
                        }
                        this.f262889b = obj2;
                    } catch (InterruptedException e) {
                        jVar.dispose();
                        this.e = e;
                        throw ygm.g.f(e);
                    }
                }
                return true;
            default:
                Throwable th11 = this.e;
                if (th11 != null) {
                    throw zfm.h.d(th11);
                }
                if (!this.f262890c) {
                    return false;
                }
                if (this.d) {
                    tfm.f fVar2 = (tfm.f) this.f262891g;
                    AtomicInteger atomicInteger2 = fVar2.f270441c;
                    if (!this.f) {
                        this.f = true;
                        atomicInteger2.set(1);
                        new tfm.x0((efm.r) this.f262892h, 3).subscribe(fVar2);
                    }
                    try {
                        atomicInteger2.set(1);
                        efm.p pVar = (efm.p) fVar2.f270440b.take();
                        boolean zD = pVar.d();
                        Object obj3 = pVar.f125387a;
                        if (!zD) {
                            this.f262890c = false;
                            if (obj3 == null) {
                                return false;
                            }
                            Throwable thC = pVar.c();
                            this.e = thC;
                            throw zfm.h.d(thC);
                        }
                        this.d = false;
                        if (obj3 == null || (obj3 instanceof zfm.k)) {
                            obj3 = null;
                        }
                        this.f262889b = obj3;
                    } catch (InterruptedException e2) {
                        fVar2.dispose();
                        this.e = e2;
                        throw zfm.h.d(e2);
                    }
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f262888a) {
            case 0:
                Throwable th10 = this.e;
                if (th10 != null) {
                    throw ygm.g.f(th10);
                }
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements");
                }
                this.d = true;
                return this.f262889b;
            default:
                Throwable th11 = this.e;
                if (th11 != null) {
                    throw zfm.h.d(th11);
                }
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements");
                }
                this.d = true;
                return this.f262889b;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f262888a) {
            case 0:
                throw new UnsupportedOperationException("Read only iterator");
            default:
                throw new UnsupportedOperationException("Read only iterator");
        }
    }
}
