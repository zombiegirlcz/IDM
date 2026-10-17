package wgm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import xgm.f;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends AtomicInteger implements fgm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f297354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ygm.c f297355b = new ygm.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f297356c = new AtomicLong();
    public final AtomicReference d = new AtomicReference();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public d(dom.a aVar) {
        this.f297354a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (j2 > 0) {
            f.c(this.d, this.f297356c, j2);
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
        f.b(this.d);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (this.e.compareAndSet(false, true)) {
            this.f297354a.e(this);
            f.d(this.d, this.f297356c, bVar);
        } else {
            bVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f = true;
        dom.a aVar = this.f297354a;
        ygm.c cVar = this.f297355b;
        if (getAndIncrement() == 0) {
            cVar.c(aVar);
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f = true;
        dom.a aVar = this.f297354a;
        ygm.c cVar = this.f297355b;
        if (cVar.a(th10) && getAndIncrement() == 0) {
            cVar.c(aVar);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        yoj.b.v(this.f297354a, obj2, this, this.f297355b);
    }
}
