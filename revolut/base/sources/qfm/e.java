package qfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e extends AtomicInteger implements efm.j, i, dom.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f245395b;
    public dom.b e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nfm.j f245397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f245398h;
    public volatile boolean i;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f245400l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245396c = 2;
    public final int d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f245394a = new h(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zfm.c f245399j = new zfm.c();

    public e(kfm.o oVar) {
        this.f245395b = oVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.e, bVar)) {
            this.e = bVar;
            if (bVar instanceof nfm.g) {
                nfm.g gVar = (nfm.g) bVar;
                int iB = gVar.b(7);
                if (iB == 1) {
                    this.f245400l = iB;
                    this.f245397g = gVar;
                    this.f245398h = true;
                    h();
                    f();
                    return;
                }
                if (iB == 2) {
                    this.f245400l = iB;
                    this.f245397g = gVar;
                    h();
                    bVar.a(this.f245396c);
                    return;
                }
            }
            this.f245397g = new vfm.b(this.f245396c);
            h();
            bVar.a(this.f245396c);
        }
    }

    public abstract void f();

    public abstract void h();

    @Override // dom.a
    public final void onComplete() {
        this.f245398h = true;
        f();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245400l == 2 || this.f245397g.offer(obj2)) {
            f();
        } else {
            this.e.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }
}
