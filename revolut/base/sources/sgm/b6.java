package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class b6 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f262723b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i4 f262724c = new i4(this, 2);
    public final ygm.c d = new ygm.c();

    public b6(fgm.l lVar) {
        this.f262722a = lVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f262723b);
        jgm.b.a(this.f262724c);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.f262723b.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        jgm.b.a(this.f262724c);
        yoj.b.r(this.f262722a, this, this.d);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jgm.b.a(this.f262724c);
        yoj.b.t(this.f262722a, th10, this, this.d);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        yoj.b.u(this.f262722a, obj2, this, this.d);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f262723b, disposable);
    }
}
