package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j4 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f262929c;
    public final ygm.c d;
    public final fhm.c e;
    public final AtomicReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ObservableSource f262930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f262931h;
    public final AtomicReference i;

    public j4(fgm.l lVar, fhm.c cVar, ObservableSource observableSource, int i) {
        this.f262927a = i;
        switch (i) {
            case 1:
                this.f262928b = lVar;
                this.e = cVar;
                this.f262930g = observableSource;
                this.f262929c = new AtomicInteger();
                this.d = new ygm.c();
                this.i = new i4(this, 1);
                this.f = new AtomicReference();
                break;
            default:
                this.f262928b = lVar;
                this.e = cVar;
                this.f262930g = observableSource;
                this.f262929c = new AtomicInteger();
                this.d = new ygm.c();
                this.i = new i4(this, 0);
                this.f = new AtomicReference();
                break;
        }
    }

    public final void a() {
        switch (this.f262927a) {
            case 0:
                if (this.f262929c.getAndIncrement() == 0) {
                    while (!isDisposed()) {
                        if (!this.f262931h) {
                            this.f262931h = true;
                            this.f262930g.subscribe(this);
                        }
                        if (this.f262929c.decrementAndGet() == 0) {
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.f262929c.getAndIncrement() == 0) {
                    while (!isDisposed()) {
                        if (!this.f262931h) {
                            this.f262931h = true;
                            this.f262930g.subscribe(this);
                        }
                        if (this.f262929c.decrementAndGet() == 0) {
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262927a) {
            case 0:
                jgm.b.a(this.f);
                jgm.b.a((i4) this.i);
                break;
            default:
                jgm.b.a(this.f);
                jgm.b.a((i4) this.i);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262927a) {
        }
        return jgm.b.b((Disposable) this.f.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262927a) {
            case 0:
                jgm.b.c(this.f, null);
                this.f262931h = false;
                this.e.onNext(0);
                break;
            default:
                jgm.b.a((i4) this.i);
                yoj.b.r(this.f262928b, this, this.d);
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262927a) {
            case 0:
                jgm.b.a((i4) this.i);
                yoj.b.t(this.f262928b, th10, this, this.d);
                break;
            default:
                jgm.b.c(this.f, null);
                this.f262931h = false;
                this.e.onNext(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262927a) {
            case 0:
                yoj.b.u(this.f262928b, obj2, this, this.d);
                break;
            default:
                yoj.b.u(this.f262928b, obj2, this, this.d);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262927a) {
            case 0:
                jgm.b.e(this.f, disposable);
                break;
            default:
                jgm.b.c(this.f, disposable);
                break;
        }
    }
}
