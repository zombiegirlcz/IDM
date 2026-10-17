package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public abstract class x6 extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263280a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f263282c;
    public final TimeUnit d;
    public final int e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f263283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f263284h;
    public Disposable i;
    public volatile boolean k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final su9.c f263281b = new su9.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f263285j = new AtomicBoolean();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f263286l = new AtomicInteger(1);

    public x6(fgm.l lVar, long j2, TimeUnit timeUnit, int i) {
        this.f263280a = lVar;
        this.f263282c = j2;
        this.d = timeUnit;
        this.e = i;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    public final void d() {
        if (this.f263286l.decrementAndGet() == 0) {
            a();
            this.i.dispose();
            this.k = true;
            c();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263285j.compareAndSet(false, true)) {
            d();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263285j.get();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263283g = true;
        c();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263284h = th10;
        this.f263283g = true;
        c();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f263281b.offer(obj2);
        c();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.i, disposable)) {
            this.i = disposable;
            this.f263280a.onSubscribe(this);
            b();
        }
    }

    public void run() {
        d();
    }
}
