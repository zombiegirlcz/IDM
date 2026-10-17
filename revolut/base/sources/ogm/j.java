package ogm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends AtomicReference implements fgm.b, Disposable, Runnable, fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225225c;
    public Object d;

    public j(fgm.b bVar, Scheduler scheduler) {
        this.f225223a = 0;
        this.f225224b = bVar;
        this.f225225c = scheduler;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f225223a) {
            case 0:
                jgm.b.a(this);
                break;
            case 1:
                jgm.b.a(this);
                ggm.b bVar = (ggm.b) this.f225225c;
                bVar.getClass();
                jgm.b.a(bVar);
                break;
            default:
                jgm.b.a(this);
                ggm.b bVar2 = (ggm.b) this.f225225c;
                bVar2.getClass();
                jgm.b.a(bVar2);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f225223a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.b
    public void onComplete() {
        switch (this.f225223a) {
            case 0:
                jgm.b.c(this, ((Scheduler) this.f225225c).c(this));
                break;
            default:
                ((fgm.b) this.f225224b).onComplete();
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        switch (this.f225223a) {
            case 0:
                this.d = th10;
                jgm.b.c(this, ((Scheduler) this.f225225c).c(this));
                break;
            case 1:
                ((fgm.b) this.f225224b).onError(th10);
                break;
            default:
                ((fgm.p) this.f225224b).onError(th10);
                break;
        }
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        switch (this.f225223a) {
            case 0:
                if (jgm.b.e(this, disposable)) {
                    ((fgm.b) this.f225224b).onSubscribe(this);
                }
                break;
            case 1:
                jgm.b.e(this, disposable);
                break;
            default:
                jgm.b.e(this, disposable);
                break;
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ((fgm.p) this.f225224b).onSuccess(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f225223a) {
            case 0:
                fgm.b bVar = (fgm.b) this.f225224b;
                Throwable th10 = (Throwable) this.d;
                if (th10 == null) {
                    bVar.onComplete();
                } else {
                    this.d = null;
                    bVar.onError(th10);
                }
                break;
            case 1:
                ((Completable) this.d).c(this);
                break;
            default:
                ((Single) this.d).c(this);
                break;
        }
    }

    public j(fgm.p pVar, Single single) {
        this.f225223a = 2;
        this.f225224b = pVar;
        this.d = single;
        this.f225225c = new ggm.b();
    }

    public j(fgm.b bVar, Completable completable) {
        this.f225223a = 1;
        this.f225224b = bVar;
        this.d = completable;
        this.f225225c = new ggm.b();
    }
}
