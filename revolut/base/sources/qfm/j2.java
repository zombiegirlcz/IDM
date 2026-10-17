package qfm;

import efm.c0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class j2 extends AtomicReference implements efm.j, dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.a f245436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f245437c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final boolean e;
    public Publisher f;

    public j2(dom.a aVar, c0.a aVar2, Publisher publisher, boolean z) {
        this.f245435a = aVar;
        this.f245436b = aVar2;
        this.f = publisher;
        this.e = !z;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            AtomicReference atomicReference = this.f245437c;
            dom.b bVar = (dom.b) atomicReference.get();
            if (bVar != null) {
                b(j2, bVar);
                return;
            }
            AtomicLong atomicLong = this.d;
            com.bumptech.glide.d.a(atomicLong, j2);
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
            this.f245436b.a(new pgm.p1(bVar, j2, 1));
        }
    }

    @Override // dom.b
    public final void cancel() {
        yfm.g.b(this.f245437c);
        this.f245436b.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.e(this.f245437c, bVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet != 0) {
                b(andSet, bVar);
            }
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245435a.onComplete();
        this.f245436b.dispose();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f245435a.onError(th10);
        this.f245436b.dispose();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245435a.onNext(obj2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        Publisher publisher = this.f;
        this.f = null;
        publisher.a(this);
    }
}
