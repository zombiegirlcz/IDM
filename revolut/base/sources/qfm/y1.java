package qfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public final class y1 extends AtomicInteger implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher f245583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f245584b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f245585c = new AtomicLong();
    public z1 d;

    public y1(Publisher publisher) {
        this.f245583a = publisher;
    }

    @Override // dom.b
    public final void a(long j2) {
        yfm.g.c(this.f245584b, this.f245585c, j2);
    }

    @Override // dom.b
    public final void cancel() {
        yfm.g.b(this.f245584b);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        yfm.g.d(this.f245584b, this.f245585c, bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        this.d.cancel();
        this.d.i.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.d.cancel();
        this.d.i.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (getAndIncrement() == 0) {
            while (this.f245584b.get() != yfm.g.CANCELLED) {
                this.f245583a.a(this.d);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
