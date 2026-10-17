package sgm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends ahm.a implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fgm.f f262754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Semaphore f262755c = new Semaphore(0);
    public final AtomicReference d = new AtomicReference();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        fgm.f fVar = this.f262754b;
        if (fVar != null && (fVar.f135107a instanceof ygm.j)) {
            throw ygm.g.f(fVar.a());
        }
        if (fVar == null) {
            try {
                this.f262755c.acquire();
                fgm.f fVar2 = (fgm.f) this.d.getAndSet(null);
                this.f262754b = fVar2;
                if (fVar2.f135107a instanceof ygm.j) {
                    throw ygm.g.f(fVar2.a());
                }
            } catch (InterruptedException e) {
                dispose();
                this.f262754b = new fgm.f(new ygm.j(e));
                throw ygm.g.f(e);
            }
        }
        Object obj2 = this.f262754b.f135107a;
        return (obj2 == null || (obj2 instanceof ygm.j)) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj2 = this.f262754b.f135107a;
        if (obj2 == null || (obj2 instanceof ygm.j)) {
            obj2 = null;
        }
        this.f262754b = null;
        return obj2;
    }

    @Override // fgm.l
    public final void onComplete() {
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.d.getAndSet((fgm.f) obj2) == null) {
            this.f262755c.release();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read-only iterator.");
    }
}
