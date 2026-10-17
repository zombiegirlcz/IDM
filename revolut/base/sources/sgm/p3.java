package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class p3 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f263072c;
    public final igm.q d;
    public Disposable e;

    public p3(fgm.l lVar, igm.o oVar, igm.o oVar2, igm.q qVar) {
        this.f263070a = lVar;
        this.f263071b = oVar;
        this.f263072c = oVar2;
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
        fgm.l lVar = this.f263070a;
        try {
            Object obj2 = this.d.get();
            Objects.requireNonNull(obj2, "The onComplete ObservableSource returned is null");
            lVar.onNext((ObservableSource) obj2);
            lVar.onComplete();
        } catch (Throwable th10) {
            ce9.m.F(th10);
            lVar.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        fgm.l lVar = this.f263070a;
        try {
            Object objApply = this.f263072c.apply(th10);
            Objects.requireNonNull(objApply, "The onError ObservableSource returned is null");
            lVar.onNext((ObservableSource) objApply);
            lVar.onComplete();
        } catch (Throwable th11) {
            ce9.m.F(th11);
            lVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        fgm.l lVar = this.f263070a;
        try {
            Object objApply = this.f263071b.apply(obj2);
            Objects.requireNonNull(objApply, "The onNext ObservableSource returned is null");
            lVar.onNext((ObservableSource) objApply);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            lVar.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            this.f263070a.onSubscribe(this);
        }
    }
}
