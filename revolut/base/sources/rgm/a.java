package rgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends AtomicReference implements fgm.l, fgm.b, Disposable, fgm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f254225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f254226c;

    public /* synthetic */ a(fgm.l lVar, Object obj2, int i) {
        this.f254224a = i;
        this.f254226c = obj2;
        this.f254225b = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f254224a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                break;
            default:
                ((Disposable) this.f254226c).dispose();
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f254224a) {
            case 0:
                return jgm.b.b((Disposable) get());
            case 1:
                return jgm.b.b((Disposable) get());
            default:
                return ((Disposable) this.f254226c).isDisposed();
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f254224a) {
            case 0:
                ObservableSource observableSource = (ObservableSource) this.f254226c;
                if (observableSource != null) {
                    this.f254226c = null;
                    observableSource.subscribe(this);
                } else {
                    this.f254225b.onComplete();
                }
                break;
            case 1:
                this.f254225b.onComplete();
                break;
            default:
                jgm.b.a(this);
                this.f254225b.onComplete();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f254224a) {
            case 0:
                this.f254225b.onError(th10);
                break;
            case 1:
                this.f254225b.onError(th10);
                break;
            default:
                jgm.b.a(this);
                this.f254225b.onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f254224a) {
            case 0:
                this.f254225b.onNext(obj2);
                break;
            case 1:
                this.f254225b.onNext(obj2);
                break;
            default:
                this.f254225b.onNext(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f254224a) {
            case 0:
                jgm.b.c(this, disposable);
                break;
            case 1:
                jgm.b.c(this, disposable);
                break;
            default:
                if (jgm.b.f((Disposable) this.f254226c, disposable)) {
                    this.f254226c = disposable;
                    this.f254225b.onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.e, fgm.p
    public void onSuccess(Object obj2) {
        try {
            Object objApply = ((igm.o) this.f254226c).apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
            ObservableSource observableSource = (ObservableSource) objApply;
            if (isDisposed()) {
                return;
            }
            observableSource.subscribe(this);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f254225b.onError(th10);
        }
    }

    public a(fgm.l lVar) {
        this.f254224a = 2;
        this.f254225b = lVar;
    }
}
