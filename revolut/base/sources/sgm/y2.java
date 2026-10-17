package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class y2 extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f263294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f263295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263296c;

    /* JADX WARN: Multi-variable type inference failed */
    public y2(x2 x2Var, boolean z, int i) {
        this.f263294a = (AtomicInteger) x2Var;
        this.f263295b = z;
        this.f263296c = i;
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
        this.f263294a.e(this.f263295b, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.atomic.AtomicInteger, sgm.x2] */
    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263294a.a(th10);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.atomic.AtomicInteger, sgm.x2] */
    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (jgm.b.a(this)) {
            this.f263294a.e(this.f263295b, this);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
