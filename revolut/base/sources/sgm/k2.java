package sgm;

import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class k2 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262955c;
    public final CompositeDisposable d;
    public final AtomicInteger e;
    public final ygm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final igm.o f262956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f262957h;
    public Disposable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f262958j;

    public k2(int i, fgm.l lVar, igm.o oVar, boolean z) {
        this.f262953a = i;
        switch (i) {
            case 1:
                this.f262954b = lVar;
                this.f262956g = oVar;
                this.f262955c = z;
                this.d = new CompositeDisposable();
                this.f = new ygm.c();
                this.e = new AtomicInteger(1);
                this.f262957h = new AtomicReference();
                break;
            default:
                this.f262954b = lVar;
                this.f262956g = oVar;
                this.f262955c = z;
                this.d = new CompositeDisposable();
                this.f = new ygm.c();
                this.e = new AtomicInteger(1);
                this.f262957h = new AtomicReference();
                break;
        }
    }

    public final void a() {
        switch (this.f262953a) {
            case 0:
                fgm.l lVar = this.f262954b;
                AtomicInteger atomicInteger = this.e;
                AtomicReference atomicReference = this.f262957h;
                int iAddAndGet = 1;
                while (!this.f262958j) {
                    if (!this.f262955c && ((Throwable) this.f.get()) != null) {
                        bhm.i iVar = (bhm.i) this.f262957h.get();
                        if (iVar != null) {
                            iVar.clear();
                        }
                        this.f.e(lVar);
                        break;
                    } else {
                        boolean z = atomicInteger.get() == 0;
                        bhm.i iVar2 = (bhm.i) atomicReference.get();
                        Object objPoll = iVar2 != null ? iVar2.poll() : null;
                        boolean z3 = objPoll == null;
                        if (z && z3) {
                            this.f.e(lVar);
                            break;
                        } else if (z3) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            lVar.onNext(objPoll);
                        }
                    }
                }
                bhm.i iVar3 = (bhm.i) this.f262957h.get();
                if (iVar3 != null) {
                    iVar3.clear();
                }
                break;
            default:
                fgm.l lVar2 = this.f262954b;
                AtomicInteger atomicInteger2 = this.e;
                AtomicReference atomicReference2 = this.f262957h;
                int iAddAndGet2 = 1;
                while (!this.f262958j) {
                    if (!this.f262955c && ((Throwable) this.f.get()) != null) {
                        bhm.i iVar4 = (bhm.i) this.f262957h.get();
                        if (iVar4 != null) {
                            iVar4.clear();
                        }
                        this.f.e(lVar2);
                        break;
                    } else {
                        boolean z4 = atomicInteger2.get() == 0;
                        bhm.i iVar5 = (bhm.i) atomicReference2.get();
                        Object objPoll2 = iVar5 != null ? iVar5.poll() : null;
                        boolean z6 = objPoll2 == null;
                        if (z4 && z6) {
                            this.f.e(this.f262954b);
                            break;
                        } else if (z6) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            lVar2.onNext(objPoll2);
                        }
                    }
                }
                bhm.i iVar6 = (bhm.i) this.f262957h.get();
                if (iVar6 != null) {
                    iVar6.clear();
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f262953a) {
            case 0:
                this.f262958j = true;
                this.i.dispose();
                this.d.dispose();
                this.f.b();
                break;
            default:
                this.f262958j = true;
                this.i.dispose();
                this.d.dispose();
                this.f.b();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f262953a) {
        }
        return this.f262958j;
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262953a) {
            case 0:
                this.e.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
            default:
                this.e.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262953a) {
            case 0:
                this.e.decrementAndGet();
                if (this.f.a(th10)) {
                    if (!this.f262955c) {
                        this.d.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
            default:
                this.e.decrementAndGet();
                if (this.f.a(th10)) {
                    if (!this.f262955c) {
                        this.d.dispose();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                    }
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262953a) {
            case 0:
                try {
                    Object objApply = this.f262956g.apply(obj2);
                    Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                    MaybeSource maybeSource = (MaybeSource) objApply;
                    this.e.getAndIncrement();
                    tgm.a aVar = new tgm.a(this, 3);
                    if (!this.f262958j && this.d.a(aVar)) {
                        maybeSource.c(aVar);
                        break;
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    this.i.dispose();
                    onError(th10);
                }
                break;
            default:
                try {
                    Object objApply2 = this.f262956g.apply(obj2);
                    Objects.requireNonNull(objApply2, "The mapper returned a null SingleSource");
                    SingleSource singleSource = (SingleSource) objApply2;
                    this.e.getAndIncrement();
                    ogm.d dVar = new ogm.d(this, 4);
                    if (!this.f262958j && this.d.a(dVar)) {
                        singleSource.c(dVar);
                        break;
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    this.i.dispose();
                    onError(th11);
                    return;
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262953a) {
            case 0:
                if (jgm.b.f(this.i, disposable)) {
                    this.i = disposable;
                    this.f262954b.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.f(this.i, disposable)) {
                    this.i = disposable;
                    this.f262954b.onSubscribe(this);
                }
                break;
        }
    }
}
