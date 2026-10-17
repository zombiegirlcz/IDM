package pgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class u1 extends AtomicLong implements fgm.d, dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ghm.a f236155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f236156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f236157c;
    public final fgm.o d;
    public dom.b e;
    public final ggm.b f = new ggm.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f236158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f236159h;

    public u1(ghm.a aVar, long j2, TimeUnit timeUnit, fgm.o oVar) {
        this.f236155a = aVar;
        this.f236156b = j2;
        this.f236157c = timeUnit;
        this.d = oVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.e.cancel();
        this.d.dispose();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.e, bVar)) {
            this.e = bVar;
            this.f236155a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f236159h) {
            return;
        }
        this.f236159h = true;
        this.f236155a.onComplete();
        this.d.dispose();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236159h) {
            jb3.l.v(th10);
            return;
        }
        this.f236159h = true;
        this.f236155a.onError(th10);
        this.d.dispose();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236159h || this.f236158g) {
            return;
        }
        this.f236158g = true;
        if (get() == 0) {
            this.e.cancel();
            this.f236159h = true;
            this.f236155a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            this.d.dispose();
            return;
        }
        this.f236155a.onNext(obj2);
        xam.a.m(this, 1L);
        Disposable disposable = (Disposable) this.f.get();
        if (disposable != null) {
            disposable.dispose();
        }
        ggm.b bVar = this.f;
        Disposable disposableA = this.d.a(this, this.f236156b, this.f236157c);
        bVar.getClass();
        jgm.b.c(bVar, disposableA);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f236158g = false;
    }
}
