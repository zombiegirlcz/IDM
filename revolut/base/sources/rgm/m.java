package rgm;

import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends AtomicInteger implements fgm.l, Disposable {
    public static final l i = new l(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f254259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f254260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f254261c;
    public final ygm.c d = new ygm.c();
    public final AtomicReference e = new AtomicReference();
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f254262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f254263h;

    public m(fgm.l lVar, igm.o oVar, boolean z) {
        this.f254259a = lVar;
        this.f254260b = oVar;
        this.f254261c = z;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        l lVar = i;
        l lVar2 = (l) atomicReference.getAndSet(lVar);
        if (lVar2 == null || lVar2 == lVar) {
            return;
        }
        jgm.b.a(lVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f254259a;
        ygm.c cVar = this.d;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.f254263h) {
            if (cVar.get() != null && !this.f254261c) {
                cVar.e(lVar);
                return;
            }
            boolean z = this.f254262g;
            l lVar2 = (l) atomicReference.get();
            boolean z3 = lVar2 == null;
            if (z && z3) {
                cVar.e(lVar);
                return;
            }
            if (z3 || lVar2.f254258b == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(lVar2, null) && atomicReference.get() == lVar2) {
                }
                lVar.onNext(lVar2.f254258b);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f254263h = true;
        this.f.dispose();
        a();
        this.d.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f254263h;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f254262g = true;
        b();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d.a(th10)) {
            if (!this.f254261c) {
                a();
            }
            this.f254262g = true;
            b();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        l lVar = i;
        AtomicReference atomicReference = this.e;
        l lVar2 = (l) atomicReference.get();
        if (lVar2 != null) {
            jgm.b.a(lVar2);
        }
        try {
            Object objApply = this.f254260b.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
            MaybeSource maybeSource = (MaybeSource) objApply;
            l lVar3 = new l(this);
            while (true) {
                l lVar4 = (l) atomicReference.get();
                if (lVar4 == lVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(lVar4, lVar3)) {
                    if (atomicReference.get() != lVar4) {
                        break;
                    }
                }
                maybeSource.c(lVar3);
                return;
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f.dispose();
            atomicReference.getAndSet(lVar);
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f254259a.onSubscribe(this);
        }
    }
}
