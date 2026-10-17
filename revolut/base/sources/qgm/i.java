package qgm;

import fgm.p;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends AtomicReference implements fgm.e, Disposable, Runnable, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scheduler f246379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f246380c;
    public Throwable d;
    public final Object e;

    public /* synthetic */ i(Object obj2, Scheduler scheduler, int i) {
        this.f246378a = i;
        this.e = obj2;
        this.f246379b = scheduler;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f246378a) {
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
        switch (this.f246378a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.e
    public void onComplete() {
        jgm.b.c(this, this.f246379b.c(this));
    }

    @Override // fgm.e
    public final void onError(Throwable th10) {
        switch (this.f246378a) {
            case 0:
                this.d = th10;
                jgm.b.c(this, this.f246379b.c(this));
                break;
            default:
                this.d = th10;
                jgm.b.c(this, this.f246379b.c(this));
                break;
        }
    }

    @Override // fgm.e
    public final void onSubscribe(Disposable disposable) {
        switch (this.f246378a) {
            case 0:
                if (jgm.b.e(this, disposable)) {
                    ((fgm.e) this.e).onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.e(this, disposable)) {
                    ((p) this.e).onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
        switch (this.f246378a) {
            case 0:
                this.f246380c = obj2;
                jgm.b.c(this, this.f246379b.c(this));
                break;
            default:
                this.f246380c = obj2;
                jgm.b.c(this, this.f246379b.c(this));
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f246378a) {
            case 0:
                fgm.e eVar = (fgm.e) this.e;
                Throwable th10 = this.d;
                if (th10 == null) {
                    Object obj2 = this.f246380c;
                    if (obj2 == null) {
                        eVar.onComplete();
                    } else {
                        this.f246380c = null;
                        eVar.onSuccess(obj2);
                    }
                } else {
                    this.d = null;
                    eVar.onError(th10);
                }
                break;
            default:
                p pVar = (p) this.e;
                Throwable th11 = this.d;
                if (th11 == null) {
                    pVar.onSuccess(this.f246380c);
                } else {
                    pVar.onError(th11);
                }
                break;
        }
    }
}
