package pgm;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public abstract class t0 extends xgm.a implements fgm.d, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.o f236144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f236145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f236146c;
    public final AtomicLong d = new AtomicLong();
    public dom.b e;
    public bhm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f236147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f236148h;
    public Throwable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f236149j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f236150l;

    public t0(fgm.o oVar, int i) {
        this.f236144a = oVar;
        this.f236145b = i;
        this.f236146c = i - (i >> 2);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this.d, j2);
            k();
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        this.f236150l = true;
        return 2;
    }

    public final boolean c(boolean z, boolean z3, dom.a aVar) {
        if (this.f236147g) {
            clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = this.i;
        if (th10 != null) {
            this.f236147g = true;
            clear();
            aVar.onError(th10);
            this.f236144a.dispose();
            return true;
        }
        if (!z3) {
            return false;
        }
        this.f236147g = true;
        aVar.onComplete();
        this.f236144a.dispose();
        return true;
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f236147g) {
            return;
        }
        this.f236147g = true;
        this.e.cancel();
        this.f236144a.dispose();
        if (this.f236150l || getAndIncrement() != 0) {
            return;
        }
        this.f.clear();
    }

    @Override // bhm.g
    public final void clear() {
        this.f.clear();
    }

    public abstract void f();

    public abstract void h();

    public abstract void i();

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    public final void k() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f236144a.b(this);
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f236148h) {
            return;
        }
        this.f236148h = true;
        k();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236148h) {
            jb3.l.v(th10);
            return;
        }
        this.i = th10;
        this.f236148h = true;
        k();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236148h) {
            return;
        }
        if (this.f236149j == 2) {
            k();
            return;
        }
        if (!this.f.offer(obj2)) {
            this.e.cancel();
            this.i = new QueueOverflowException();
            this.f236148h = true;
        }
        k();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f236150l) {
            h();
        } else if (this.f236149j == 1) {
            i();
        } else {
            f();
        }
    }
}
