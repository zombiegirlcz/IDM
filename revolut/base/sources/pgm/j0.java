package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j0 extends AtomicInteger implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f236080b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final igm.o f236082g;
    public dom.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f236084j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f236081c = new AtomicLong();
    public final CompositeDisposable d = new CompositeDisposable();
    public final ygm.c f = new ygm.c();
    public final AtomicInteger e = new AtomicInteger(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f236083h = new AtomicReference();

    public j0(dom.a aVar, igm.o oVar, int i) {
        this.f236079a = aVar;
        this.f236082g = oVar;
        this.f236080b = i;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this.f236081c, j2);
            if (getAndIncrement() == 0) {
                c();
            }
        }
    }

    public final void b() {
        bhm.i iVar = (bhm.i) this.f236083h.get();
        if (iVar != null) {
            iVar.clear();
        }
    }

    public final void c() {
        dom.a aVar = this.f236079a;
        AtomicInteger atomicInteger = this.e;
        AtomicReference atomicReference = this.f236083h;
        int iAddAndGet = 1;
        do {
            long j2 = this.f236081c.get();
            long j3 = 0;
            while (true) {
                if (j3 == j2) {
                    break;
                }
                if (this.f236084j) {
                    b();
                    return;
                }
                if (((Throwable) this.f.get()) != null) {
                    b();
                    this.f.c(this.f236079a);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                bhm.i iVar = (bhm.i) atomicReference.get();
                Object objPoll = iVar != null ? iVar.poll() : null;
                boolean z3 = objPoll == null;
                if (z && z3) {
                    this.f.c(aVar);
                    return;
                } else {
                    if (z3) {
                        break;
                    }
                    aVar.onNext(objPoll);
                    j3++;
                }
            }
            if (j3 == j2) {
                if (this.f236084j) {
                    b();
                    return;
                }
                if (((Throwable) this.f.get()) != null) {
                    b();
                    this.f.c(aVar);
                    return;
                }
                boolean z4 = atomicInteger.get() == 0;
                bhm.i iVar2 = (bhm.i) atomicReference.get();
                boolean z6 = iVar2 == null || iVar2.isEmpty();
                if (z4 && z6) {
                    this.f.c(aVar);
                    return;
                }
            }
            if (j3 != 0) {
                xam.a.m(this.f236081c, j3);
                if (this.f236080b != Integer.MAX_VALUE) {
                    this.i.a(j3);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // dom.b
    public final void cancel() {
        this.f236084j = true;
        this.i.cancel();
        this.d.dispose();
        this.f.b();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.i, bVar)) {
            this.i = bVar;
            this.f236079a.e(this);
            int i = this.f236080b;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    public final bhm.i f() {
        AtomicReference atomicReference = this.f236083h;
        bhm.i iVar = (bhm.i) atomicReference.get();
        if (iVar != null) {
            return iVar;
        }
        bhm.i iVar2 = new bhm.i(Flowable.f163113a);
        while (!atomicReference.compareAndSet(null, iVar2)) {
            if (atomicReference.get() != null) {
                return (bhm.i) atomicReference.get();
            }
        }
        return iVar2;
    }

    @Override // dom.a
    public final void onComplete() {
        this.e.decrementAndGet();
        if (getAndIncrement() == 0) {
            c();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.e.decrementAndGet();
        if (this.f.a(th10)) {
            this.d.dispose();
            if (getAndIncrement() == 0) {
                c();
            }
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f236082g.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
            SingleSource singleSource = (SingleSource) objApply;
            this.e.getAndIncrement();
            ogm.d dVar = new ogm.d(this, 2);
            if (this.f236084j || !this.d.a(dVar)) {
                return;
            }
            singleSource.c(dVar);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.i.cancel();
            onError(th10);
        }
    }
}
