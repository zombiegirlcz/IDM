package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class o6 extends AtomicInteger implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263057c;
    public final AtomicBoolean d = new AtomicBoolean();
    public long e;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fhm.f f263058g;

    public o6(fgm.l lVar, long j2, int i) {
        this.f263055a = lVar;
        this.f263056b = j2;
        this.f263057c = i;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d.compareAndSet(false, true)) {
            run();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.get();
    }

    @Override // fgm.l
    public final void onComplete() {
        fhm.f fVar = this.f263058g;
        if (fVar != null) {
            this.f263058g = null;
            fVar.onComplete();
        }
        this.f263055a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        fhm.f fVar = this.f263058g;
        if (fVar != null) {
            this.f263058g = null;
            fVar.onError(th10);
        }
        this.f263055a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        mgm.b bVar;
        fhm.f fVarC = this.f263058g;
        if (fVarC != null || this.d.get()) {
            bVar = null;
        } else {
            getAndIncrement();
            fVarC = fhm.f.c(this.f263057c, this);
            this.f263058g = fVarC;
            bVar = new mgm.b(fVarC);
            this.f263055a.onNext(bVar);
        }
        if (fVarC != null) {
            fVarC.onNext(obj2);
            long j2 = this.e + 1;
            this.e = j2;
            if (j2 >= this.f263056b) {
                this.e = 0L;
                this.f263058g = null;
                fVarC.onComplete();
            }
            if (bVar == null || !bVar.c()) {
                return;
            }
            this.f263058g = null;
            fVarC.onComplete();
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f263055a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (decrementAndGet() == 0) {
            this.f.dispose();
        }
    }
}
