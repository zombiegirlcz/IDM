package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j6 extends AtomicLong implements fgm.l, Disposable, k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262940c;
    public final fgm.o d;
    public final ggm.b e = new ggm.b();
    public final AtomicReference f = new AtomicReference();

    public j6(fgm.l lVar, long j2, TimeUnit timeUnit, fgm.o oVar) {
        this.f262938a = lVar;
        this.f262939b = j2;
        this.f262940c = timeUnit;
        this.d = oVar;
    }

    @Override // sgm.k6
    public final void b(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            jgm.b.a(this.f);
            this.f262938a.onError(new TimeoutException(ygm.g.e(this.f262939b, this.f262940c)));
            this.d.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f);
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.f.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ggm.b bVar = this.e;
            bVar.getClass();
            jgm.b.a(bVar);
            this.f262938a.onComplete();
            this.d.dispose();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            jb3.l.v(th10);
            return;
        }
        ggm.b bVar = this.e;
        bVar.getClass();
        jgm.b.a(bVar);
        this.f262938a.onError(th10);
        this.d.dispose();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                ggm.b bVar = this.e;
                ((Disposable) bVar.get()).dispose();
                this.f262938a.onNext(obj2);
                Disposable disposableA = this.d.a(new qfm.t2(j3, this), this.f262939b, this.f262940c);
                bVar.getClass();
                jgm.b.c(bVar, disposableA);
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f, disposable);
    }
}
