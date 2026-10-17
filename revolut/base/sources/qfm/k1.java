package qfm;

import efm.c0;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k1 extends yfm.a implements efm.j, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.a f245444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f245445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245446c;
    public final AtomicLong d = new AtomicLong();
    public dom.b e;
    public nfm.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f245447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f245448h;
    public Throwable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f245449j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f245450l;

    public k1(c0.a aVar, int i) {
        this.f245444a = aVar;
        this.f245445b = i;
        this.f245446c = i - (i >> 2);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this.d, j2);
            k();
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        this.f245450l = true;
        return 2;
    }

    public final boolean c(boolean z, boolean z3, dom.a aVar) {
        if (this.f245447g) {
            clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = this.i;
        if (th10 != null) {
            this.f245447g = true;
            clear();
            aVar.onError(th10);
            this.f245444a.dispose();
            return true;
        }
        if (!z3) {
            return false;
        }
        this.f245447g = true;
        aVar.onComplete();
        this.f245444a.dispose();
        return true;
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f245447g) {
            return;
        }
        this.f245447g = true;
        this.e.cancel();
        this.f245444a.dispose();
        if (this.f245450l || getAndIncrement() != 0) {
            return;
        }
        this.f.clear();
    }

    @Override // nfm.j
    public final void clear() {
        this.f.clear();
    }

    public abstract void f();

    public abstract void h();

    public abstract void i();

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    public final void k() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f245444a.a(this);
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f245448h) {
            return;
        }
        this.f245448h = true;
        k();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f245448h) {
            mo3.a.m(th10);
            return;
        }
        this.i = th10;
        this.f245448h = true;
        k();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245448h) {
            return;
        }
        if (this.f245449j == 2) {
            k();
            return;
        }
        if (!this.f.offer(obj2)) {
            this.e.cancel();
            this.i = new MissingBackpressureException("Queue is full?!");
            this.f245448h = true;
        }
        k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f245450l) {
            h();
        } else if (this.f245449j == 1) {
            i();
        } else {
            f();
        }
    }
}
