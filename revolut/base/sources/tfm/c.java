package tfm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends bgm.b implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public efm.p f270375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Semaphore f270376c = new Semaphore(0);
    public final AtomicReference d = new AtomicReference();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        efm.p pVar = this.f270375b;
        if (pVar != null && (pVar.f125387a instanceof zfm.k)) {
            throw zfm.h.d(pVar.c());
        }
        if (pVar == null) {
            try {
                this.f270376c.acquire();
                efm.p pVar2 = (efm.p) this.d.getAndSet(null);
                this.f270375b = pVar2;
                if (pVar2.f125387a instanceof zfm.k) {
                    throw zfm.h.d(pVar2.c());
                }
            } catch (InterruptedException e) {
                dispose();
                this.f270375b = efm.p.a(e);
                throw zfm.h.d(e);
            }
        }
        return this.f270375b.d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.f270375b.f125387a;
        if (obj2 == null || (obj2 instanceof zfm.k)) {
            obj2 = null;
        }
        this.f270375b = null;
        return obj2;
    }

    @Override // efm.y
    public final void onComplete() {
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        mo3.a.m(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.d.getAndSet((efm.p) obj2) == null) {
            this.f270376c.release();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }
}
