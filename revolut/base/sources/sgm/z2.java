package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class z2 extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f263319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f263320b;

    /* JADX WARN: Multi-variable type inference failed */
    public z2(x2 x2Var, boolean z) {
        this.f263319a = (AtomicInteger) x2Var;
        this.f263320b = z;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, sgm.x2] */
    @Override // fgm.l
    public final void onComplete() {
        this.f263319a.d(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, sgm.x2] */
    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263319a.b(th10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, sgm.x2] */
    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f263319a.c(obj2, this.f263320b);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
