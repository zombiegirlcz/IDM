package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class x5 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f263278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263279c;
    public long d;

    public x5(fgm.l lVar, long j2) {
        this.f263277a = lVar;
        this.d = j2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f263279c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263279c.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263278b) {
            return;
        }
        this.f263278b = true;
        this.f263279c.dispose();
        this.f263277a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263278b) {
            jb3.l.v(th10);
            return;
        }
        this.f263278b = true;
        this.f263279c.dispose();
        this.f263277a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263278b) {
            return;
        }
        long j2 = this.d;
        long j3 = j2 - 1;
        this.d = j3;
        if (j2 > 0) {
            boolean z = j3 == 0;
            this.f263277a.onNext(obj2);
            if (z) {
                onComplete();
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263279c, disposable)) {
            this.f263279c = disposable;
            long j2 = this.d;
            fgm.l lVar = this.f263277a;
            if (j2 != 0) {
                lVar.onSubscribe(this);
                return;
            }
            this.f263278b = true;
            disposable.dispose();
            jgm.c.a(lVar);
        }
    }
}
