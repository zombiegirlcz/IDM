package pgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class c0 extends AtomicReference implements fgm.d, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f236012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f236013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f236014c;
    public final int d;
    public volatile boolean e;
    public volatile bhm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f236015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f236016h;

    public c0(d0 d0Var, int i, long j2) {
        this.f236012a = j2;
        this.f236013b = d0Var;
        this.d = i;
        this.f236014c = i >> 2;
    }

    public final void a(long j2) {
        if (this.f236016h != 1) {
            long j3 = this.f236015g + j2;
            if (j3 < this.f236014c) {
                this.f236015g = j3;
            } else {
                this.f236015g = 0L;
                ((dom.b) get()).a(j3);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        xgm.f.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.e(this, bVar)) {
            if (bVar instanceof bhm.d) {
                bhm.d dVar = (bhm.d) bVar;
                int iB = dVar.b(7);
                if (iB == 1) {
                    this.f236016h = iB;
                    this.f = dVar;
                    this.e = true;
                    this.f236013b.c();
                    return;
                }
                if (iB == 2) {
                    this.f236016h = iB;
                    this.f = dVar;
                }
            }
            bVar.a(this.d);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == xgm.f.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        this.e = true;
        this.f236013b.c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        lazySet(xgm.f.CANCELLED);
        d0 d0Var = this.f236013b;
        if (d0Var.f236036g.a(th10)) {
            this.e = true;
            d0Var.k.cancel();
            for (c0 c0Var : (c0[]) d0Var.i.getAndSet(d0.f236032r)) {
                c0Var.getClass();
                xgm.f.b(c0Var);
            }
            d0Var.c();
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236016h == 2) {
            this.f236013b.c();
            return;
        }
        d0 d0Var = this.f236013b;
        if (d0Var.get() == 0 && d0Var.compareAndSet(0, 1)) {
            long j2 = d0Var.f236038j.get();
            bhm.g hVar = this.f;
            if (j2 == 0 || !(hVar == null || hVar.isEmpty())) {
                if (hVar == null) {
                    hVar = new bhm.h(d0Var.d);
                    this.f = hVar;
                }
                if (!hVar.offer(obj2)) {
                    d0Var.onError(new QueueOverflowException());
                }
            } else {
                d0Var.f236033a.onNext(obj2);
                if (j2 != Long.MAX_VALUE) {
                    d0Var.f236038j.decrementAndGet();
                }
                a(1L);
            }
            if (d0Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            bhm.g hVar2 = this.f;
            if (hVar2 == null) {
                hVar2 = new bhm.h(d0Var.d);
                this.f = hVar2;
            }
            if (!hVar2.offer(obj2)) {
                d0Var.onError(new QueueOverflowException());
                return;
            } else if (d0Var.getAndIncrement() != 0) {
                return;
            }
        }
        d0Var.f();
    }
}
