package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class r5 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f263128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jgm.a f263129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f263130c;
    public volatile boolean d;
    public boolean e;

    public r5(ahm.c cVar, jgm.a aVar) {
        this.f263128a = cVar;
        this.f263129b = aVar;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263129b.dispose();
        this.f263128a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263129b.dispose();
        this.f263128a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.e) {
            this.f263128a.onNext(obj2);
        } else if (this.d) {
            this.e = true;
            this.f263128a.onNext(obj2);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263130c, disposable)) {
            this.f263130c = disposable;
            this.f263129b.a(0, disposable);
        }
    }
}
