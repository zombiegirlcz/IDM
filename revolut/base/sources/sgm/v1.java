package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes14.dex */
public final class v1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.g f263215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.g f263216c;
    public final igm.a d;
    public final igm.a e;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f263217g;

    public v1(fgm.l lVar, igm.g gVar, igm.g gVar2, igm.a aVar, igm.a aVar2) {
        this.f263214a = lVar;
        this.f263215b = gVar;
        this.f263216c = gVar2;
        this.d = aVar;
        this.e = aVar2;
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
        if (this.f263217g) {
            return;
        }
        try {
            this.d.run();
            this.f263217g = true;
            this.f263214a.onComplete();
            try {
                this.e.run();
            } catch (Throwable th10) {
                ce9.m.F(th10);
                jb3.l.v(th10);
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            onError(th11);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263217g) {
            jb3.l.v(th10);
            return;
        }
        this.f263217g = true;
        try {
            this.f263216c.accept(th10);
        } catch (Throwable th11) {
            ce9.m.F(th11);
            th10 = new CompositeException(th10, th11);
        }
        this.f263214a.onError(th10);
        try {
            this.e.run();
        } catch (Throwable th12) {
            ce9.m.F(th12);
            jb3.l.v(th12);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263217g) {
            return;
        }
        try {
            this.f263215b.accept(obj2);
            this.f263214a.onNext(obj2);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f263214a.onSubscribe(this);
        }
    }
}
