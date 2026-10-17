package tfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f270771c;
    public final Callable d;
    public ifm.c e;

    public r3(efm.y yVar, kfm.o oVar, kfm.o oVar2, Callable callable) {
        this.f270769a = yVar;
        this.f270770b = oVar;
        this.f270771c = oVar2;
        this.d = callable;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        efm.y yVar = this.f270769a;
        try {
            Object objCall = this.d.call();
            mfm.f.b(objCall, "The onComplete ObservableSource returned is null");
            yVar.onNext((efm.w) objCall);
            yVar.onComplete();
        } catch (Throwable th10) {
            m70.a.u(th10);
            yVar.onError(th10);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        efm.y yVar = this.f270769a;
        try {
            Object objApply = this.f270771c.apply(th10);
            mfm.f.b(objApply, "The onError ObservableSource returned is null");
            yVar.onNext((efm.w) objApply);
            yVar.onComplete();
        } catch (Throwable th11) {
            m70.a.u(th11);
            yVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        efm.y yVar = this.f270769a;
        try {
            Object objApply = this.f270770b.apply(obj2);
            mfm.f.b(objApply, "The onNext ObservableSource returned is null");
            yVar.onNext((efm.w) objApply);
        } catch (Throwable th10) {
            m70.a.u(th10);
            yVar.onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270769a.onSubscribe(this);
        }
    }
}
