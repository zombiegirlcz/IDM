package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class p implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f263060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.q f263061c;
    public Collection d;
    public int e;
    public Disposable f;

    public p(fgm.l lVar, int i, igm.q qVar) {
        this.f263059a = lVar;
        this.f263060b = i;
        this.f263061c = qVar;
    }

    public final boolean a() {
        try {
            Object obj2 = this.f263061c.get();
            Objects.requireNonNull(obj2, "Empty buffer supplied");
            this.d = (Collection) obj2;
            return true;
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.d = null;
            Disposable disposable = this.f;
            fgm.l lVar = this.f263059a;
            if (disposable == null) {
                jgm.c.c(th10, lVar);
                return false;
            }
            disposable.dispose();
            lVar.onError(th10);
            return false;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        Collection collection = this.d;
        if (collection != null) {
            this.d = null;
            boolean zIsEmpty = collection.isEmpty();
            fgm.l lVar = this.f263059a;
            if (!zIsEmpty) {
                lVar.onNext(collection);
            }
            lVar.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.d = null;
        this.f263059a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        Collection collection = this.d;
        if (collection != null) {
            collection.add(obj2);
            int i = this.e + 1;
            this.e = i;
            if (i >= this.f263060b) {
                this.f263059a.onNext(collection);
                this.e = 0;
                a();
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f263059a.onSubscribe(this);
        }
    }
}
