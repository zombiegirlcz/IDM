package ogm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends AtomicReference implements fgm.b, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.b f225235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f225236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f225237c;

    public n(fgm.b bVar, igm.o oVar) {
        this.f225235a = bVar;
        this.f225236b = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.b
    public final void onComplete() {
        this.f225235a.onComplete();
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        boolean z = this.f225237c;
        fgm.b bVar = this.f225235a;
        if (z) {
            bVar.onError(th10);
            return;
        }
        this.f225237c = true;
        try {
            Object objApply = this.f225236b.apply(th10);
            Objects.requireNonNull(objApply, "The errorMapper returned a null CompletableSource");
            ((CompletableSource) objApply).c(this);
        } catch (Throwable th11) {
            ce9.m.F(th11);
            bVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        jgm.b.c(this, disposable);
    }
}
