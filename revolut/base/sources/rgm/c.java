package rgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygm.c f254230a = new ygm.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f254231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ygm.f f254232c;
    public bhm.g d;
    public Disposable e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f254233g;

    public c(int i, ygm.f fVar) {
        this.f254232c = fVar;
        this.f254231b = i;
    }

    public void a() {
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f254233g = true;
        this.e.dispose();
        b();
        this.f254230a.b();
        if (getAndIncrement() == 0) {
            this.d.clear();
            a();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f254233g;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f = true;
        c();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f254230a.a(th10)) {
            if (this.f254232c == ygm.f.IMMEDIATE) {
                b();
            }
            this.f = true;
            c();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (obj2 != null) {
            this.d.offer(obj2);
        }
        c();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(7);
                if (iB == 1) {
                    this.d = bVar;
                    this.f = true;
                    d();
                    c();
                    return;
                }
                if (iB == 2) {
                    this.d = bVar;
                    d();
                    return;
                }
            }
            this.d = new bhm.i(this.f254231b);
            d();
        }
    }
}
