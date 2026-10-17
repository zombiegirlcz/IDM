package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes14.dex */
public final class v3 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ggm.b f263222c = new ggm.b();
    public boolean d;
    public boolean e;

    public v3(fgm.l lVar, igm.o oVar) {
        this.f263220a = lVar;
        this.f263221b = oVar;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = true;
        this.f263220a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        boolean z = this.d;
        fgm.l lVar = this.f263220a;
        if (z) {
            if (this.e) {
                jb3.l.v(th10);
                return;
            } else {
                lVar.onError(th10);
                return;
            }
        }
        this.d = true;
        try {
            ObservableSource observableSource = (ObservableSource) this.f263221b.apply(th10);
            if (observableSource != null) {
                observableSource.subscribe(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th10);
            lVar.onError(nullPointerException);
        } catch (Throwable th11) {
            ce9.m.F(th11);
            lVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        this.f263220a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        ggm.b bVar = this.f263222c;
        bVar.getClass();
        jgm.b.c(bVar, disposable);
    }
}
