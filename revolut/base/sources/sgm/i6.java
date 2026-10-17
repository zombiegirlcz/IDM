package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class i6 extends AtomicReference implements fgm.l, Disposable, k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262912c;
    public final fgm.o d;
    public final ggm.b e = new ggm.b();
    public final AtomicLong f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f262913g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObservableSource f262914h;

    public i6(fgm.l lVar, long j2, TimeUnit timeUnit, fgm.o oVar, ObservableSource observableSource) {
        this.f262910a = lVar;
        this.f262911b = j2;
        this.f262912c = timeUnit;
        this.d = oVar;
        this.f262914h = observableSource;
    }

    @Override // sgm.k6
    public final void b(long j2) {
        if (this.f.compareAndSet(j2, Long.MAX_VALUE)) {
            jgm.b.a(this.f262913g);
            ObservableSource observableSource = this.f262914h;
            this.f262914h = null;
            observableSource.subscribe(new dlm.c(this.f262910a, this, 2));
            this.d.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f262913g);
        jgm.b.a(this);
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ggm.b bVar = this.e;
            bVar.getClass();
            jgm.b.a(bVar);
            this.f262910a.onComplete();
            this.d.dispose();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            jb3.l.v(th10);
            return;
        }
        ggm.b bVar = this.e;
        bVar.getClass();
        jgm.b.a(bVar);
        this.f262910a.onError(th10);
        this.d.dispose();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        AtomicLong atomicLong = this.f;
        long j2 = atomicLong.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (atomicLong.compareAndSet(j2, j3)) {
                ggm.b bVar = this.e;
                ((Disposable) bVar.get()).dispose();
                this.f262910a.onNext(obj2);
                Disposable disposableA = this.d.a(new qfm.t2(j3, this), this.f262911b, this.f262912c);
                bVar.getClass();
                jgm.b.c(bVar, disposableA);
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f262913g, disposable);
    }
}
