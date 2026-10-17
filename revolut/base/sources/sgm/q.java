package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends AtomicBoolean implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263084c;
    public final igm.q d;
    public Disposable e;
    public final ArrayDeque f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f263085g;

    public q(fgm.l lVar, int i, int i2, igm.q qVar) {
        this.f263082a = lVar;
        this.f263083b = i;
        this.f263084c = i2;
        this.d = qVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.f;
            boolean zIsEmpty = arrayDeque.isEmpty();
            fgm.l lVar = this.f263082a;
            if (zIsEmpty) {
                lVar.onComplete();
                return;
            }
            lVar.onNext(arrayDeque.poll());
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f.clear();
        this.f263082a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        long j2 = this.f263085g;
        this.f263085g = 1 + j2;
        long j3 = j2 % ((long) this.f263084c);
        fgm.l lVar = this.f263082a;
        ArrayDeque arrayDeque = this.f;
        if (j3 == 0) {
            try {
                Object obj3 = this.d.get();
                if (obj3 == null) {
                    throw ygm.g.b("The bufferSupplier returned a null Collection.");
                }
                q75.t tVar = ygm.g.f313672a;
                arrayDeque.offer((Collection) obj3);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                arrayDeque.clear();
                this.e.dispose();
                lVar.onError(th10);
                return;
            }
        }
        Iterator it8 = arrayDeque.iterator();
        while (it8.hasNext()) {
            Collection collection = (Collection) it8.next();
            collection.add(obj2);
            if (this.f263083b <= collection.size()) {
                it8.remove();
                lVar.onNext(collection);
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            this.f263082a.onSubscribe(this);
        }
    }
}
