package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class f6 extends AtomicReference implements fgm.l, Disposable, h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ggm.b f262833c = new ggm.b();
    public final AtomicLong d = new AtomicLong();
    public final AtomicReference e = new AtomicReference();
    public ObservableSource f;

    public f6(fgm.l lVar, igm.o oVar, ObservableSource observableSource) {
        this.f262831a = lVar;
        this.f262832b = oVar;
        this.f = observableSource;
    }

    @Override // sgm.h6
    public final void a(Throwable th10, long j2) {
        if (!this.d.compareAndSet(j2, Long.MAX_VALUE)) {
            jb3.l.v(th10);
        } else {
            jgm.b.a(this);
            this.f262831a.onError(th10);
        }
    }

    @Override // sgm.k6
    public final void b(long j2) {
        if (this.d.compareAndSet(j2, Long.MAX_VALUE)) {
            jgm.b.a(this.e);
            ObservableSource observableSource = this.f;
            this.f = null;
            observableSource.subscribe(new dlm.c(this.f262831a, this, 2));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.e);
        jgm.b.a(this);
        ggm.b bVar = this.f262833c;
        bVar.getClass();
        jgm.b.a(bVar);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            ggm.b bVar = this.f262833c;
            bVar.getClass();
            jgm.b.a(bVar);
            this.f262831a.onComplete();
            bVar.getClass();
            jgm.b.a(bVar);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            jb3.l.v(th10);
            return;
        }
        ggm.b bVar = this.f262833c;
        bVar.getClass();
        jgm.b.a(bVar);
        this.f262831a.onError(th10);
        bVar.getClass();
        jgm.b.a(bVar);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        AtomicLong atomicLong = this.d;
        long j2 = atomicLong.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (atomicLong.compareAndSet(j2, j3)) {
                ggm.b bVar = this.f262833c;
                Disposable disposable = (Disposable) bVar.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                fgm.l lVar = this.f262831a;
                lVar.onNext(obj2);
                try {
                    Object objApply = this.f262832b.apply(obj2);
                    Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                    ObservableSource observableSource = (ObservableSource) objApply;
                    u uVar = new u(j3, this);
                    bVar.getClass();
                    if (jgm.b.c(bVar, uVar)) {
                        observableSource.subscribe(uVar);
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    ((Disposable) this.e.get()).dispose();
                    atomicLong.getAndSet(Long.MAX_VALUE);
                    lVar.onError(th10);
                }
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.e, disposable);
    }
}
