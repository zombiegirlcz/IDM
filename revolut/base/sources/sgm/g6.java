package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class g6 extends AtomicLong implements fgm.l, Disposable, h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ggm.b f262864c = new ggm.b();
    public final AtomicReference d = new AtomicReference();

    public g6(fgm.l lVar, igm.o oVar) {
        this.f262862a = lVar;
        this.f262863b = oVar;
    }

    @Override // sgm.h6
    public final void a(Throwable th10, long j2) {
        if (!compareAndSet(j2, Long.MAX_VALUE)) {
            jb3.l.v(th10);
        } else {
            jgm.b.a(this.d);
            this.f262862a.onError(th10);
        }
    }

    @Override // sgm.k6
    public final void b(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            jgm.b.a(this.d);
            this.f262862a.onError(new TimeoutException());
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.d);
        ggm.b bVar = this.f262864c;
        bVar.getClass();
        jgm.b.a(bVar);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.d.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ggm.b bVar = this.f262864c;
            bVar.getClass();
            jgm.b.a(bVar);
            this.f262862a.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            jb3.l.v(th10);
            return;
        }
        ggm.b bVar = this.f262864c;
        bVar.getClass();
        jgm.b.a(bVar);
        this.f262862a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                ggm.b bVar = this.f262864c;
                Disposable disposable = (Disposable) bVar.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                fgm.l lVar = this.f262862a;
                lVar.onNext(obj2);
                try {
                    Object objApply = this.f262863b.apply(obj2);
                    Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    ObservableSource observableSource = (ObservableSource) objApply;
                    u uVar = new u(j3, this);
                    bVar.getClass();
                    if (jgm.b.c(bVar, uVar)) {
                        observableSource.subscribe(uVar);
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    ((Disposable) this.d.get()).dispose();
                    getAndSet(Long.MAX_VALUE);
                    lVar.onError(th10);
                }
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.d, disposable);
    }
}
