package pgm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class g1 extends AtomicInteger implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher f236062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f236063b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f236064c = new AtomicLong();
    public j1 d;

    public g1(Publisher publisher) {
        this.f236062a = publisher;
    }

    @Override // dom.b
    public final void a(long j2) {
        xgm.f.c(this.f236063b, this.f236064c, j2);
    }

    @Override // dom.b
    public final void cancel() {
        xgm.f.b(this.f236063b);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        xgm.f.d(this.f236063b, this.f236064c, bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        this.d.cancel();
        this.d.f236085h.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.d.cancel();
        this.d.f236085h.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (getAndIncrement() == 0) {
            while (this.f236063b.get() != xgm.f.CANCELLED) {
                this.f236062a.a(this.d);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
