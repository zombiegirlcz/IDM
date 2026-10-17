package sfm;

import efm.y;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f262510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfm.f f262512c;
    public final zfm.c d = new zfm.c();
    public final rgm.d e = new rgm.d(this, 3);
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nfm.j f262513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.c f262514h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f262515j;
    public volatile boolean k;

    public e(efm.d dVar, kfm.o oVar, zfm.f fVar, int i) {
        this.f262510a = dVar;
        this.f262511b = oVar;
        this.f262512c = fVar;
        this.f = i;
    }

    public final void a() {
        efm.f fVar;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        zfm.c cVar = this.d;
        zfm.f fVar2 = this.f262512c;
        while (!this.k) {
            if (!this.i) {
                if (fVar2 == zfm.f.BOUNDARY && cVar.get() != null) {
                    this.k = true;
                    this.f262513g.clear();
                    this.f262510a.onError(zfm.h.b(cVar));
                    return;
                }
                boolean z3 = this.f262515j;
                try {
                    Object objPoll = this.f262513g.poll();
                    if (objPoll != null) {
                        Object objApply = this.f262511b.apply(objPoll);
                        mfm.f.b(objApply, "The mapper returned a null CompletableSource");
                        fVar = (efm.f) objApply;
                        z = false;
                    } else {
                        fVar = null;
                        z = true;
                    }
                    if (z3 && z) {
                        this.k = true;
                        cVar.getClass();
                        Throwable thB = zfm.h.b(cVar);
                        if (thB != null) {
                            this.f262510a.onError(thB);
                            return;
                        } else {
                            this.f262510a.onComplete();
                            return;
                        }
                    }
                    if (!z) {
                        this.i = true;
                        fVar.d(this.e);
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    this.k = true;
                    this.f262513g.clear();
                    this.f262514h.dispose();
                    cVar.getClass();
                    zfm.h.a(cVar, th10);
                    this.f262510a.onError(zfm.h.b(cVar));
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.f262513g.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        this.k = true;
        this.f262514h.dispose();
        rgm.d dVar = this.e;
        dVar.getClass();
        lfm.d.a(dVar);
        if (getAndIncrement() == 0) {
            this.f262513g.clear();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.k;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f262515j = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.d;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (this.f262512c != zfm.f.IMMEDIATE) {
            this.f262515j = true;
            a();
            return;
        }
        this.k = true;
        rgm.d dVar = this.e;
        dVar.getClass();
        lfm.d.a(dVar);
        zfm.c cVar2 = this.d;
        cVar2.getClass();
        Throwable thB = zfm.h.b(cVar2);
        if (thB != zfm.h.f322035a) {
            this.f262510a.onError(thB);
        }
        if (getAndIncrement() == 0) {
            this.f262513g.clear();
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (obj2 != null) {
            this.f262513g.offer(obj2);
        }
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f262514h, cVar)) {
            this.f262514h = cVar;
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(3);
                if (iB == 1) {
                    this.f262513g = eVar;
                    this.f262515j = true;
                    this.f262510a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f262513g = eVar;
                    this.f262510a.onSubscribe(this);
                    return;
                }
            }
            this.f262513g = new vfm.c(this.f);
            this.f262510a.onSubscribe(this);
        }
    }
}
