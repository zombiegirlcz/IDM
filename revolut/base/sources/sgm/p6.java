package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class p6 extends AtomicInteger implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f263079c;
    public final int d;
    public final ArrayDeque e = new ArrayDeque();
    public final AtomicBoolean f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f263080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f263081h;
    public Disposable i;

    public p6(fgm.l lVar, long j2, long j3, int i) {
        this.f263077a = lVar;
        this.f263078b = j2;
        this.f263079c = j3;
        this.d = i;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f.compareAndSet(false, true)) {
            run();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.get();
    }

    @Override // fgm.l
    public final void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque.isEmpty()) {
                this.f263077a.onComplete();
                return;
            }
            ((fhm.f) arrayDeque.poll()).onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        while (true) {
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque.isEmpty()) {
                this.f263077a.onError(th10);
                return;
            }
            ((fhm.f) arrayDeque.poll()).onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        mgm.b bVar;
        long j2 = this.f263080g;
        long j3 = this.f263079c;
        long j5 = j2 % j3;
        AtomicBoolean atomicBoolean = this.f;
        ArrayDeque arrayDeque = this.e;
        if (j5 != 0 || atomicBoolean.get()) {
            bVar = null;
        } else {
            getAndIncrement();
            fhm.f fVarC = fhm.f.c(this.d, this);
            bVar = new mgm.b(fVarC);
            arrayDeque.offer(fVarC);
            this.f263077a.onNext(bVar);
        }
        long j16 = this.f263081h + 1;
        Iterator it8 = arrayDeque.iterator();
        while (it8.hasNext()) {
            ((fhm.f) it8.next()).onNext(obj2);
        }
        if (j16 >= this.f263078b) {
            ((fhm.f) arrayDeque.poll()).onComplete();
            if (arrayDeque.isEmpty() && atomicBoolean.get()) {
                return;
            } else {
                this.f263081h = j16 - j3;
            }
        } else {
            this.f263081h = j16;
        }
        this.f263080g = j2 + 1;
        if (bVar == null || !bVar.c()) {
            return;
        }
        ((fhm.f) bVar.f205309b).onComplete();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.i, disposable)) {
            this.i = disposable;
            this.f263077a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (decrementAndGet() == 0) {
            this.i.dispose();
        }
    }
}
