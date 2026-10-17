package qgm;

import ce9.m;
import fgm.p;
import igm.o;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends AtomicReference implements fgm.e, fgm.b, Disposable, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.b f246372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f246373c;

    public /* synthetic */ e(fgm.b bVar, o oVar, int i) {
        this.f246371a = i;
        this.f246372b = bVar;
        this.f246373c = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f246371a) {
            case 0:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f246371a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.e
    public final void onComplete() {
        switch (this.f246371a) {
            case 0:
                this.f246372b.onComplete();
                break;
            default:
                this.f246372b.onComplete();
                break;
        }
    }

    @Override // fgm.e
    public final void onError(Throwable th10) {
        switch (this.f246371a) {
            case 0:
                this.f246372b.onError(th10);
                break;
            default:
                this.f246372b.onError(th10);
                break;
        }
    }

    @Override // fgm.e
    public final void onSubscribe(Disposable disposable) {
        switch (this.f246371a) {
            case 0:
                jgm.b.c(this, disposable);
                break;
            default:
                jgm.b.c(this, disposable);
                break;
        }
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
        switch (this.f246371a) {
            case 0:
                try {
                    Object objApply = this.f246373c.apply(obj2);
                    Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                    CompletableSource completableSource = (CompletableSource) objApply;
                    if (!isDisposed()) {
                        completableSource.c(this);
                    }
                } catch (Throwable th10) {
                    m.F(th10);
                    onError(th10);
                }
                break;
            default:
                try {
                    Object objApply2 = this.f246373c.apply(obj2);
                    Objects.requireNonNull(objApply2, "The mapper returned a null CompletableSource");
                    CompletableSource completableSource2 = (CompletableSource) objApply2;
                    if (!isDisposed()) {
                        completableSource2.c(this);
                    }
                } catch (Throwable th11) {
                    m.F(th11);
                    onError(th11);
                    return;
                }
                break;
        }
    }
}
