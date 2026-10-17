package pgm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class q1 extends AtomicReference implements fgm.d, dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.o f236132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f236133c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final boolean e;
    public Publisher f;

    public q1(dom.a aVar, fgm.o oVar, Publisher publisher, boolean z) {
        this.f236131a = aVar;
        this.f236132b = oVar;
        this.f = publisher;
        this.e = !z;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            AtomicReference atomicReference = this.f236133c;
            dom.b bVar = (dom.b) atomicReference.get();
            if (bVar != null) {
                b(j2, bVar);
                return;
            }
            AtomicLong atomicLong = this.d;
            xam.a.b(atomicLong, j2);
            dom.b bVar2 = (dom.b) atomicReference.get();
            if (bVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    b(andSet, bVar2);
                }
            }
        }
    }

    public final void b(long j2, dom.b bVar) {
        if (this.e || Thread.currentThread() == get()) {
            bVar.a(j2);
        } else {
            this.f236132b.b(new p1(bVar, j2, 0));
        }
    }

    @Override // dom.b
    public final void cancel() {
        xgm.f.b(this.f236133c);
        this.f236132b.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.e(this.f236133c, bVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet != 0) {
                b(andSet, bVar);
            }
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f236131a.onComplete();
        this.f236132b.dispose();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f236131a.onError(th10);
        this.f236132b.dispose();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f236131a.onNext(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        Publisher publisher = this.f;
        this.f = null;
        publisher.a(this);
    }
}
