package tfm;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class m0 extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270628c;
    public final zfm.c d = new zfm.c();
    public final l0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public nfm.j f270629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.c f270630h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f270631j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f270632l;

    public m0(int i, efm.y yVar, kfm.o oVar, boolean z) {
        this.f270626a = yVar;
        this.f270627b = oVar;
        this.f270628c = i;
        this.f = z;
        this.e = new l0(yVar, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        efm.y yVar = this.f270626a;
        nfm.j jVar = this.f270629g;
        zfm.c cVar = this.d;
        while (true) {
            if (!this.i) {
                if (this.k) {
                    jVar.clear();
                    return;
                }
                if (!this.f && ((Throwable) cVar.get()) != null) {
                    jVar.clear();
                    this.k = true;
                    yVar.onError(zfm.h.b(cVar));
                    return;
                }
                boolean z = this.f270631j;
                try {
                    Object objPoll = jVar.poll();
                    boolean z3 = objPoll == null;
                    if (z && z3) {
                        this.k = true;
                        cVar.getClass();
                        Throwable thB = zfm.h.b(cVar);
                        if (thB != null) {
                            yVar.onError(thB);
                            return;
                        } else {
                            yVar.onComplete();
                            return;
                        }
                    }
                    if (!z3) {
                        try {
                            Object objApply = this.f270627b.apply(objPoll);
                            mfm.f.b(objApply, "The mapper returned a null ObservableSource");
                            efm.w wVar = (efm.w) objApply;
                            if (wVar instanceof Callable) {
                                try {
                                    Object objCall = ((Callable) wVar).call();
                                    if (objCall != null && !this.k) {
                                        yVar.onNext(objCall);
                                    }
                                } catch (Throwable th10) {
                                    m70.a.u(th10);
                                    cVar.getClass();
                                    zfm.h.a(cVar, th10);
                                }
                            } else {
                                this.i = true;
                                wVar.subscribe(this.e);
                            }
                        } catch (Throwable th11) {
                            m70.a.u(th11);
                            this.k = true;
                            this.f270630h.dispose();
                            jVar.clear();
                            cVar.getClass();
                            zfm.h.a(cVar, th11);
                            yVar.onError(zfm.h.b(cVar));
                            return;
                        }
                    }
                } catch (Throwable th12) {
                    m70.a.u(th12);
                    this.k = true;
                    this.f270630h.dispose();
                    cVar.getClass();
                    zfm.h.a(cVar, th12);
                    yVar.onError(zfm.h.b(cVar));
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.k = true;
        this.f270630h.dispose();
        l0 l0Var = this.e;
        l0Var.getClass();
        lfm.d.a(l0Var);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.k;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270631j = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.d;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.f270631j = true;
            a();
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270632l == 0) {
            this.f270629g.offer(obj2);
        }
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270630h, cVar)) {
            this.f270630h = cVar;
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(3);
                if (iB == 1) {
                    this.f270632l = iB;
                    this.f270629g = eVar;
                    this.f270631j = true;
                    this.f270626a.onSubscribe(this);
                    a();
                    return;
                }
                if (iB == 2) {
                    this.f270632l = iB;
                    this.f270629g = eVar;
                    this.f270626a.onSubscribe(this);
                    return;
                }
            }
            this.f270629g = new vfm.c(this.f270628c);
            this.f270626a.onSubscribe(this);
        }
    }
}
