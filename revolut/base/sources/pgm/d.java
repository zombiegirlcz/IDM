package pgm;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public abstract class d extends AtomicInteger implements fgm.d, h, dom.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f236025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f236026c;
    public final int d;
    public dom.b e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bhm.g f236027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f236028h;
    public volatile boolean i;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f236030l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f236024a = new g(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ygm.c f236029j = new ygm.c();

    public d(igm.o oVar, int i) {
        this.f236025b = oVar;
        this.f236026c = i;
        this.d = i;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.e, bVar)) {
            this.e = bVar;
            if (bVar instanceof bhm.d) {
                bhm.d dVar = (bhm.d) bVar;
                int iB = dVar.b(7);
                if (iB == 1) {
                    this.f236030l = iB;
                    this.f236027g = dVar;
                    this.f236028h = true;
                    h();
                    f();
                    return;
                }
                if (iB == 2) {
                    this.f236030l = iB;
                    this.f236027g = dVar;
                    h();
                    bVar.a(this.f236026c);
                    return;
                }
            }
            this.f236027g = new bhm.h(this.f236026c);
            h();
            bVar.a(this.f236026c);
        }
    }

    public abstract void f();

    public abstract void h();

    @Override // dom.a
    public final void onComplete() {
        this.f236028h = true;
        f();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236030l == 2 || this.f236027g.offer(obj2)) {
            f();
        } else {
            this.e.cancel();
            onError(new QueueOverflowException());
        }
    }
}
