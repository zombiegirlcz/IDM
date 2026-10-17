package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class e1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f262791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f262793c;
    public final AtomicReference d = new AtomicReference();
    public volatile long e;
    public boolean f;

    public e1(ahm.c cVar, igm.o oVar) {
        this.f262791a = cVar;
        this.f262792b = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f262793c.dispose();
        jgm.b.a(this.d);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f262793c.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference = this.d;
        Disposable disposable = (Disposable) atomicReference.get();
        if (disposable != jgm.b.DISPOSED) {
            d1 d1Var = (d1) disposable;
            if (d1Var != null) {
                d1Var.a();
            }
            jgm.b.a(atomicReference);
            this.f262791a.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jgm.b.a(this.d);
        this.f262791a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        long j2 = this.e + 1;
        this.e = j2;
        Disposable disposable = (Disposable) this.d.get();
        if (disposable != null) {
            disposable.dispose();
        }
        try {
            Object objApply = this.f262792b.apply(obj2);
            Objects.requireNonNull(objApply, "The ObservableSource supplied is null");
            ObservableSource observableSource = (ObservableSource) objApply;
            d1 d1Var = new d1(this, j2, obj2);
            AtomicReference atomicReference = this.d;
            while (!atomicReference.compareAndSet(disposable, d1Var)) {
                if (atomicReference.get() != disposable) {
                    return;
                }
            }
            observableSource.subscribe(d1Var);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            dispose();
            this.f262791a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f262793c, disposable)) {
            this.f262793c = disposable;
            this.f262791a.onSubscribe(this);
        }
    }
}
