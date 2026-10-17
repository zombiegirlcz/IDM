package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c5 extends AtomicReference implements fgm.l, Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f262742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262744c;
    public final Scheduler d;
    public final igm.g e;
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Disposable f262745g;

    public c5(ahm.c cVar, long j2, TimeUnit timeUnit, Scheduler scheduler, igm.g gVar) {
        this.f262742a = cVar;
        this.f262743b = j2;
        this.f262744c = timeUnit;
        this.d = scheduler;
        this.e = gVar;
    }

    public abstract void a();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f);
        this.f262745g.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f262745g.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        jgm.b.a(this.f);
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jgm.b.a(this.f);
        this.f262742a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        igm.g gVar;
        Object andSet = getAndSet(obj2);
        if (andSet == null || (gVar = this.e) == null) {
            return;
        }
        try {
            gVar.accept(andSet);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            jgm.b.a(this.f);
            this.f262745g.dispose();
            this.f262742a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f262745g, disposable)) {
            this.f262745g = disposable;
            this.f262742a.onSubscribe(this);
            long j2 = this.f262743b;
            jgm.b.c(this.f, this.d.e(this, j2, j2, this.f262744c));
        }
    }
}
