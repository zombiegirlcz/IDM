package xfm;

import efm.j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yfm.g;
import zfm.h;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f305452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfm.c f305453b = new zfm.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f305454c = new AtomicLong();
    public final AtomicReference d = new AtomicReference();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public e(dom.a aVar) {
        this.f305452a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (j2 > 0) {
            g.c(this.d, this.f305454c, j2);
        } else {
            cancel();
            onError(new IllegalArgumentException(p.a.m(j2, "§3.9 violated: positive request amount required but it was ")));
        }
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f) {
            return;
        }
        g.b(this.d);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.e.compareAndSet(false, true)) {
            this.f305452a.e(this);
            g.d(this.d, this.f305454c, bVar);
        } else {
            bVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f = true;
        dom.a aVar = this.f305452a;
        zfm.c cVar = this.f305453b;
        if (getAndIncrement() == 0) {
            cVar.getClass();
            Throwable thB = h.b(cVar);
            if (thB != null) {
                aVar.onError(thB);
            } else {
                aVar.onComplete();
            }
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f = true;
        dom.a aVar = this.f305452a;
        zfm.c cVar = this.f305453b;
        cVar.getClass();
        if (!h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else if (getAndIncrement() == 0) {
            aVar.onError(h.b(cVar));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (get() == 0 && compareAndSet(0, 1)) {
            dom.a aVar = this.f305452a;
            aVar.onNext(obj2);
            if (decrementAndGet() != 0) {
                zfm.c cVar = this.f305453b;
                cVar.getClass();
                Throwable thB = h.b(cVar);
                if (thB != null) {
                    aVar.onError(thB);
                } else {
                    aVar.onComplete();
                }
            }
        }
    }
}
