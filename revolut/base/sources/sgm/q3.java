package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class q3 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f263100b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rgm.d f263101c = new rgm.d(this, 5);
    public final ygm.c d = new ygm.c();
    public volatile boolean e;
    public volatile boolean f;

    public q3(fgm.l lVar) {
        this.f263099a = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f263100b);
        jgm.b.a(this.f263101c);
        this.d.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.f263100b.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        this.e = true;
        if (this.f) {
            yoj.b.r(this.f263099a, this, this.d);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jgm.b.a(this.f263101c);
        yoj.b.t(this.f263099a, th10, this, this.d);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        yoj.b.u(this.f263099a, obj2, this, this.d);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f263100b, disposable);
    }
}
