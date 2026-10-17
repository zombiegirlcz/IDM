package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class q5 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jgm.a f263106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5 f263107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ahm.c f263108c;
    public Disposable d;

    public q5(jgm.a aVar, r5 r5Var, ahm.c cVar) {
        this.f263106a = aVar;
        this.f263107b = r5Var;
        this.f263108c = cVar;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263107b.d = true;
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263106a.dispose();
        this.f263108c.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.d.dispose();
        this.f263107b.d = true;
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.d, disposable)) {
            this.d = disposable;
            this.f263106a.a(1, disposable);
        }
    }
}
