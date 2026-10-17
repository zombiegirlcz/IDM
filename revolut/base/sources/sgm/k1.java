package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class k1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262952c;
    public final fgm.o d;
    public final boolean e;
    public Disposable f;

    public k1(fgm.l lVar, long j2, TimeUnit timeUnit, fgm.o oVar, boolean z) {
        this.f262950a = lVar;
        this.f262951b = j2;
        this.f262952c = timeUnit;
        this.d = oVar;
        this.e = z;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.d.a(new j1(this, 0), this.f262951b, this.f262952c);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.d.a(new r8.d(this, th10, 4), this.e ? this.f262951b : 0L, this.f262952c);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.d.a(new r8.d(this, obj2, 5), this.f262951b, this.f262952c);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f262950a.onSubscribe(this);
        }
    }
}
