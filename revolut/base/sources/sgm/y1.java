package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class y1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.e f263291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263293c;
    public long d;
    public boolean e;

    public y1(fgm.e eVar, long j2) {
        this.f263291a = eVar;
        this.f263292b = j2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263293c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263293c.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f263291a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
        } else {
            this.e = true;
            this.f263291a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        long j2 = this.d;
        if (j2 != this.f263292b) {
            this.d = j2 + 1;
            return;
        }
        this.e = true;
        this.f263293c.dispose();
        this.f263291a.onSuccess(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263293c, disposable)) {
            this.f263293c = disposable;
            this.f263291a.onSubscribe(this);
        }
    }
}
